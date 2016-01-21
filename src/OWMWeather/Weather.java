package OWMWeather;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Wetterklasse erweitert OpenWeatherMap zur Verwaltung der Wetterdaten
 * @author amk
 *
 */
public class Weather extends OpenWeatherMap
{
	private String location;
	private float tempmin;
	private float tempmax;
	private float temp;
	private String description;
	private Date lastrefresh;
	private static String apikeyString = "XYXYXY";
	private JSONObject jo;
	private JSONArray ja;
	CurrentWeather current;
	private String raw;
	private int descriptionID;
	private float wind;

	/**
	 * Kontruktor zur Repräsentation des aktuellen Wetters
	 * 
	 * @param location Ort
	 * @throws JSONException
	 * @throws IOException
	 */
	public Weather(String location) throws JSONException, IOException
	{
		super(apikeyString);
		this.location = location;
		this.refresh();
	}

	/**
	 * aktuelles Wetter als String ausgeben. Ausgabe: ORT + Temperatur + Beschreibung
	 * @return schöner String
	 * @throws IOException
	 * @throws JSONException
	 */
	public String getCurrentWeather() throws JSONException, IOException
	{
		refresh();
		return getLocation() + ": " + temp + "°C" + " " + getDescription();
	}
	
	/**
	 * Return the Weather as nice String. Output: Location + TempInC + Description
	 * @return String
	 * @throws JSONException
	 * @throws IOException
	 */
	public String getCurrentWeatherUS() throws JSONException, IOException
	{
		refresh();
		return getLocation() + ": " + temp + "°C" + " " + getDescriptionUS();
	}

	/**
	 * aktualisiert die Wetterdaten
	 * @throws IOException 
	 * @throws JSONException 
	 */
	public void refresh() throws JSONException, IOException
	{
		current = this.currentWeatherByCityName(location);
		tempmin = toCelsius(current.getMainInstance().getMinTemperature());
		tempmax = toCelsius(current.getMainInstance().getMaxTemperature());
		temp = toCelsius(current.getMainInstance().getTemperature());
		wind = current.getWindInstance().getWindSpeed(); //wrong value??
		lastrefresh = current.getDateTime();
		raw = current.getRawResponse();
		jo = new JSONObject(raw);
		ja = jo.getJSONArray("weather");
		for(int i = 0; i < ja.length(); i++)
		{
			JSONObject explrObject = ja.getJSONObject(i);
			description = explrObject.getString("description");
			descriptionID = explrObject.getInt("id");
		}
	}

	/**
	 * Gibt den letzten Aktualisierungszeitpunkt aus
	 * 
	 * @return Date:lastrefresh
	 */
	public Date getLastRefresh()
	{
		return lastrefresh;
	}

	/**
	 * Konvertiert von Fahrenheit zu Celsius
	 * 
	 * @param value
	 *          Fahrenheit-Wert
	 * @return Celsius-Wert
	 */
	private float toCelsius(float value)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		float val = (value - 32) * 5 / 9;
		val = Float.parseFloat(df.format(val));
		return val;
	}

	/**
	 * Konvertiert von Celsius zu Fahrenheit
	 * @param value
	 * @return
	 */
	float toFahrenheit(float value)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		float val = value * (9 / 5) + 32 ;
		val = Float.parseFloat(df.format(val));
		return val;
	}

	/**
	 * Gibt den aktuell festgelegten Ort aus
	 * 
	 * @return Ort
	 */
	public String getLocation()
	{
		return location;
	}

	/**
	 * Setzt einen neuen Ort
	 * 
	 * @param location
	 *          Ort
	 * @throws JSONException
	 * @throws IOException
	 */
	public void setLocation(String location) throws JSONException, IOException
	{
		this.location = location;
		refresh();
	}

	/**
	 * APIKey ausgeben
	 * 
	 * @return Apikey
	 */
	public static String getApikeyString()
	{
		return apikeyString;
	}

	/**
	 * neuen APIKey setzen
	 * 
	 * @param apikeyString
	 *          neuer API-Key
	 */
	public static void setApikeyString(String apikeyString)
	{
		Weather.apikeyString = apikeyString;
	}

	/**
	 * minimale Temperatur auslesen
	 * 
	 * @return min. Temperatur
	 */
	public float getTempmin()
	{
		return tempmin;
	}

	/**
	 * maximale Temperatur auslesen
	 * 
	 * @return max. Temperatur
	 */
	public float getTempmax()
	{
		return tempmax;
	}

	/**
	 * Durchschnittstemperatur holen
	 * 
	 * @return Durchschnittstemperatur
	 */
	public float getTemp()
	{
		return temp;
	}
	
	public String getTempString()
	{
		return temp + "°C";
	}
	
	/**
	 * Beschreibung holen
	 * @return Beschreibung
	 */
	public String getDescriptionUS()
	{
		return description;
	}
	
	public String getDescription()
	{
		String temp = ToGer.getString(getDescriptionID());
		return temp;
	}

	/**
	 * RohenString holen um in mithilfe von JSON weiterzuarbeiten
	 * @return Raw
	 */
	public String getRaw()
	{
		return current.getRawResponse();
	}
	
	/**
	 * holt die ID der aktuellen Wetterlage
	 * @return descriptionID
	 */
	public int getDescriptionID()
	{
		return descriptionID;
	}
	
	public float getWind()
	{
		return wind;
	}
	
	public String getWindString()
	{
		return wind + " mph";
	}
}

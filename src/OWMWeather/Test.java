package OWMWeather;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;

/**
 * Eine Testklasse zum Testen der Wetterfunktion
 * 
 * @author amk
 *
 */
public class Test
{
	public static void main(String[] args) throws IOException, MalformedURLException, JSONException
	{
		// Objekt erstellen
		Weather w = new Weather("Mallorca");
		Weather w2 = new Weather("Rom");
		Weather w3 = new Weather("Hannover, DE");
		Weather w4 = new Weather("Helsinki");
		Weather w5 = new Weather("Tokyo");
		Weather w6 = new Weather("San Francisco");
		Weather w7 = new Weather("Machu Pichu");
		Weather w8 = new Weather("Moscow");
		Weather w9 = new Weather("Cairo");

		// Werte aktualisieren
		// w.refresh();
		// Neue Location setzen
		// Gewöhnliche Ausgabe
		System.out.println(w.getCurrentWeather());
		System.out.println(w2.getCurrentWeather());
		System.out.println(w3.getCurrentWeather());
		System.out.println(w4.getCurrentWeather());
		System.out.println(w5.getCurrentWeather());
		System.out.println(w6.getCurrentWeather());
		System.out.println(w7.getCurrentWeather());
		
		System.out.println(w8.getCurrentWeather()+" "+w8.getWindString());
		System.out.println(w9.getLocation() + ": " + w9.getTempString() + " " + w9.getDescription() + " " + w9.getWindString());
		System.out.println(w9.getCurrentWeatherUS());
		// System.out.println(w9.getCurrentWeatherUS());

		// System.out.println(w2.getWind());

		// System.out.println(w.getRaw());
		// Einzelne Werte erreichen
		// System.out.println("Minimal: " +w.getTempmin());
		// System.out.println("Maximal: " +w.getTempmax());
		// System.out.println("Temperatur: "+w.getTemp());
		// System.out.println(w.getDescription());
		// System.out.println(w.getDescriptionID());
		// Zugriff auf API-Key
		// System.out.println(w.getApiKey());
		// Zugriff auf Location
		// System.out.println(w.getLocation());
	}
}

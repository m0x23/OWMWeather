#OWMWeather

OWMWeather is an Easy-To-Use OpenWeatherMapAPI class to access weather information from OpenWeatherMap.org.

With German translation

#!!IMPORTANT!! API-Key

!!Your own APIKey is required!!

Please edit the APIKey to your personal APIkey.

You can get your personal APIKey at http://openweathermap.org/

Edit the "private static String apikeyString="XYXYXY";" and replace XYXYXY with your APIKey

#Installation
- get APIKey at http://openweathermap.org/

#Dependencies
- owm-japis-2.5.0.3.jar (included)
- Java required

#Usage

Just create a new Weather-Object. The constructor parameter is the location itself as String.

German:

-> Use Weatherobject.getCurrentWeather() to get a nice german String, including location, temperatures and description of the weather.

English:

-> Use Weatherobject.getCurrentWeahterUS() to get the english version String.



You can also use getters to get separated values to work with them and build your own Output and usage

-	String location
-	float tempmin
-	float tempmax
-	float temp
-	String description
-	Date lastrefresh
-	static String apikeyString
-	String raw
-	int descriptionID

Methods are:

-	String getCurrentWeather()
-	String getCurrentWeatherUS() 
-	void refresh()
-	float toCelsius
-	float toFahrenheit
-	String getDescription()
-	String getDescriptionUS()
	
	


#Credits

Created by m0x23

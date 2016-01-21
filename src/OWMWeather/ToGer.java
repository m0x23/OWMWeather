package OWMWeather;

import java.util.HashMap;


/**
 * Enthält Strings für Wetterinformationen.
 * @author F.S.(P.)
 * @verison 1.0
 */

public class ToGer
{
    /* HashMaps: */

    private static HashMap<Integer, String> strings = new HashMap<Integer, String>();    //Strings mit IDs.


    ////////////////////////
    // STATIC INITIALIZER //
    ////////////////////////

    static
    {
        //Group 2xx: Thunderstorm
        strings.put(200, "Gewitter mit leichtem Regen");
        strings.put(201, "Gewitter mit Regen");
        strings.put(202, "Gewitter mit starkem Regen");
        strings.put(210, "Leichtes Gewitter");
        strings.put(211, "Gewitter");
        strings.put(212, "Schweres Gewitter");
        strings.put(221, "Kleines Gewitter");
        strings.put(230, "Gewitter mit leichtem Nieselregen");
        strings.put(231, "Gewitter mit Nieselregen");
        strings.put(232, "Gewitter mit starkem Nieselegen");

        //Group 3xx: Drizzle
        strings.put(300, "Leichtes Nieseln");
        strings.put(301, "Nieseln");
        strings.put(302, "Starkes Nieseln");
        strings.put(310, "Leichter Nieselregen");
        strings.put(311, "Nieselregen");
        strings.put(312, "Starker Nieselregen");
        strings.put(313, "Regenschauer und Nieseln");
        strings.put(314, "Schwerer Regenschauer und Nieseln");
        strings.put(321, "Nieselschauer");

        //Group 5xx: Rain
        strings.put(500, "Leichter Regen");
        strings.put(501, "Mäßiger Regen");
        strings.put(502, "Starker Regen");
        strings.put(503, "Sehr starker Regen");
        strings.put(504, "Extrem starker Regen");
        strings.put(511, "Eisregen");
        strings.put(520, "Leichter Regenschauer");
        strings.put(521, "Regenschauer");
        strings.put(522, "Heftiger Regenschauer");
        strings.put(531, "Kleiner Regenschauer");

        //Group 6xx: Snow
        strings.put(600, "Leichter Schnee");
        strings.put(601, "Schnee");
        strings.put(602, "Heftiger Schneefall");
        strings.put(611, "Graupeln");
        strings.put(612, "Graupelschauer");
        strings.put(615, "Leichter Schneeregen");
        strings.put(616, "Schneeregen");
        strings.put(620, "Leichter Schneeschauer");
        strings.put(621, "Schneeschauer");
        strings.put(622, "Starker Schneeschauer");

        //Group 7xx: Atmosphere
        strings.put(701, "Trüb");
        strings.put(711, "Leichter Nebel");
        strings.put(721, "Leichter Dunst");
        strings.put(731, "Sandsturm und Staubwirbel");
        strings.put(741, "Nebel");
        strings.put(751, "Sandsturm");
        strings.put(761, "Staubwirbel");
        strings.put(762, "Vulkanasche");
        strings.put(771, "Sturmböen");
        strings.put(781, "Tornado");

        //Group 800: Clear
        strings.put(800, "Klarer Himmel");

        //Group 8xx: Clouds
        strings.put(801, "Ein paar Wolken");
        strings.put(802, "Vereinzelt bewölkt");
        strings.put(803, "Überwiegend bewölkt");
        strings.put(804, "Bedeckt");

        //Group 90x: Extreme
        strings.put(900, "Tornado");
        strings.put(901, "Tornadosturm");
        strings.put(902, "Hurrikan");
        strings.put(903, "Kalt");
        strings.put(904, "Heiß");
        strings.put(905, "Windig");
        strings.put(906, "Hagel");

        //Group 9xx: Additional
        strings.put(951, "Ruhig");
        strings.put(952, "Leichte Brise");
        strings.put(953, "Angenehme Brise");
        strings.put(954, "Mäßige Brise");
        strings.put(955, "Frische Brise");
        strings.put(956, "Starke Brise");
        strings.put(957, "Starker Wind");
        strings.put(958, "Sehr starker Wind");
        strings.put(959, "Heftiger Wind");
        strings.put(960, "Sturm");
        strings.put(961, "Brutaler Sturm");
        strings.put(962, "Hurrikan");
    }



    ///////////////////////
    // GETTER UND SETTER //
    ///////////////////////

    /**
     * Holt einen String.
     * @param id Zugehörige ID.
     * @return String der ID.
     */
    public static String getString(int id)
    {
        return strings.get(id);
    }
}

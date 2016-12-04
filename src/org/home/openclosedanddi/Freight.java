package org.home.openclosedanddi;

public class Freight {

    public double deliverTo(String city) {
        if("Wellington".equals(city.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}

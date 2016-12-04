package org.home.openclosedanddi;

public class Freight implements DeliveryService{

    @Override
    public double to(String city) {
        if("Wellington".equals(city.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}

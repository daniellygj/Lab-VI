package service;

import Model.Detection;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RadarImpl implements Radar {

    public Boolean checkInfraction(Detection detection) {
        if (checkPlate(detection.getPlate())) {
            boolean hasInfraction = detection.getSpeed() > detection.getAllowedSpeed();

            if (hasInfraction) {
                System.out.println("The vehicle has exceeded the speed limit");
            }

            return hasInfraction;
        }
        System.out.println("The vehicle license plate is invalid");
        return false;
    }

    public Boolean checkPlate(String plate) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
        Matcher matcher = pattern.matcher(plate);

        return matcher.matches();
    }
}
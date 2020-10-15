package service;

import Model.Detection;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RadarImpl implements Radar {

    public Boolean checkInfraction(Detection detection) throws IOException {
        return detection.getSpeed() > detection.getAllowedSpeed();
    }

    public Boolean checkPlate(String plate) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
        Matcher matcher = pattern.matcher(plate);

        return matcher.matches();
    }
}
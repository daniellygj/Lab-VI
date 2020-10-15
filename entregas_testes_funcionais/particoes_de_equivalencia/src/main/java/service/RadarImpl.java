package service;

import Model.Detection;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RadarImpl implements Radar {

    public Boolean checkInfraction(Detection detection) throws IOException {
        return false;
    }

    public Boolean checkPlate(String plate) {
        return false;
    }
}
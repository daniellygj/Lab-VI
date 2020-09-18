package service;

import Model.Detection;

public class RadarImpl implements Radar {

    public Boolean checkSpeed(Detection detection){
        return detection.getSpeed() > detection.getAllowedSpeed();
    }
}

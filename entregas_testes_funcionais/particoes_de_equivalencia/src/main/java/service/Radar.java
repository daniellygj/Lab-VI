package service;

import Model.Detection;

import java.io.IOException;

public interface Radar {

    Boolean checkInfraction(Detection detection) throws IOException;

    Boolean checkPlate(String plate);
}

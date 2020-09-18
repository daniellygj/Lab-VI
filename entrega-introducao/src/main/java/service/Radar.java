package service;

import Model.Detection;

import java.io.IOException;

public interface Radar {

    Boolean checkSpeed(Detection detection) throws IOException;
}

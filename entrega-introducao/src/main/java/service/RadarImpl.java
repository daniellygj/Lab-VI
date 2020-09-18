package service;

import Model.Detection;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class RadarImpl implements Radar {

    public Boolean checkSpeed(Detection detection) throws IOException {
        boolean hasInfraction = detection.getSpeed() > detection.getAllowedSpeed();

        if (hasInfraction) {
            System.out.println("The vehicle has exceeded the speed limit");
        }

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(detection);

        // finge que está enviando pro rabbit
        System.out.println(json);

        return hasInfraction;
    }
}

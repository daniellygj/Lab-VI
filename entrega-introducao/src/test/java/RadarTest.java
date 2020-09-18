import Model.Detection;
import org.junit.Test;
import service.Radar;
import service.RadarImpl;

import java.io.IOException;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class RadarTest {

    private Radar radar;

    public RadarTest() {
        this.radar = new RadarImpl();
    }

    // Teste que verifica se o método está verificando corretamente as infrações corretamente - caso que contem infração
    @Test
    public void hasSpeedInfraction_test() throws IOException {
        Detection detection = new Detection("123456", 120, 100);

        boolean infraction = radar.checkSpeed(detection);

        assertTrue(infraction);
    }

    // Teste que verifica se o método está verificando corretamente as infrações corretamente - caso que não contem infração
    @Test
    public void hasNoSpeedInfraction_test() throws IOException {
        Detection detection = new Detection("123456", 80, 100);

        boolean infraction = radar.checkSpeed(detection);


        assertFalse(infraction);
    }

}

import Model.Detection;
import org.junit.jupiter.api.Test;
import service.Radar;
import service.RadarImpl;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    partições:
        - placa invalida:
            - Os primeiros três digitos devem ser letras [A .. Z]
            - os proximos digitos devem ser alfanuméricos [0 .. 9]
        - velocidade: [0..... x]
        - velocidade permitida: [0..... x]
        - contramão: [0..... 2]
 */

public class RadarTest {

    private Radar radar;

    public RadarTest() {
        this.radar = new RadarImpl();
    }

    // Teste que valida se o método está verificando corretamente as infrações corretamente - caso que contem infração
    @Test
    public void hasSpeedInfraction_test() throws IOException {
        Detection detection = new Detection("MVU-1069", 120, 100, false);

        boolean infraction = radar.checkInfraction(detection);

        assertTrue(infraction);
    }

    // Teste que valida se o método está verificando corretamente as infrações corretamente - caso que não contem infração
    @Test
    public void hasNoInfraction_test() throws IOException {
        Detection detection = new Detection("MVU-1069", 80, 100, false);

        boolean infraction = radar.checkInfraction(detection);

        assertFalse(infraction);
    }

    // Teste que valida se o metodo está verificqando corretamente se o motorista está ou não na contramão
    @Test
    public void isWrongWay_test() throws IOException {
        Detection detection = new Detection("MVU-1069", 80, 100, true);

        boolean infraction = radar.checkInfraction(detection);
        assertFalse(infraction);
    }

    // Teste que valida se o metodo está verificqando corretamente se a placa do veiculo foi informada corretamente
    @Test
    public void invalidPlate_test() throws IOException {
        boolean validPlate = radar.checkPlate("123456");
        assertFalse(validPlate);
    }

    // Teste que valida se o metodo está verificqando corretamente se a placa do veiculo foi informada corretamente
    @Test
    public void validPlate_test() throws IOException {
        boolean validPlate = radar.checkPlate("MVU-1069");
        assertTrue(validPlate);
    }
}

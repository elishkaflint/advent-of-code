package DayThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricTest {

    @Test
    void calculate() throws Exception {
        Fabric fabric = new Fabric("claims-inputs.csv");
        int calc = fabric.calculate();
        assertEquals(4, calc);
    }
}
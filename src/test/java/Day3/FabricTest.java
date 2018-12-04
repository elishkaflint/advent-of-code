package Day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricTest {

    @Test
    void calculate() throws Exception {
        Fabric fabric = new Fabric("day3-test1");
        int calc = fabric.part1();
        assertEquals(4, calc);
    }

    @Test
    void findPatch() throws Exception {
        Fabric fabric = new Fabric("day3-test1");
        String claim = fabric.part2();
        assertEquals("#3 @ 5,5: 2x2", claim);
    }
}
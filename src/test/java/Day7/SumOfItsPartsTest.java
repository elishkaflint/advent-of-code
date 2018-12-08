package Day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfItsPartsTest {

    @Test
    void part1() throws Exception {
        SumOfItsParts sum = new SumOfItsParts("day7-test1");
        assertEquals("CABDFE", sum.part1());
    }

    @Test
    void part2() {
    }
}
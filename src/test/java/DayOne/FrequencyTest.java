package DayOne;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    public void calculateSumTest() throws Exception {
        Frequency frequency = new Frequency("part1test.csv");
        int calc = frequency.calculateSum();
        assertEquals(3, calc);
    }

    @Test
    public void calculateDoublesTest() throws Exception {
        Frequency frequency = new Frequency("part2test.csv");
        int calc = frequency.calculateDoubles();
        assertEquals(14, calc);
    }

}
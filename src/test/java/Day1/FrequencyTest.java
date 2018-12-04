package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    public void calculateSumTest() throws Exception {
        Frequency frequency = new Frequency("day1-test1");
        int calc = frequency.calculateSum();
        assertEquals(3, calc);
    }

    @Test
    public void calculateDoublesTest() throws Exception {
        Frequency frequency = new Frequency("day1-test2");
        int calc = frequency.calculateDoubles();
        assertEquals(14, calc);
    }

}
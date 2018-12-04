package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    public void calculateSumTest() throws Exception {
        Frequency frequency = new Frequency("frequency-test1.csv");
        int calc = frequency.calculateSum();
        assertEquals(3, calc);
    }

    @Test
    public void calculateDoublesTest() throws Exception {
        Frequency frequency = new Frequency("frequency-test2.csv");
        int calc = frequency.calculateDoubles();
        assertEquals(14, calc);
    }

}
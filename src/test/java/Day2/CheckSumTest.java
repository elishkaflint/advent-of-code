package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSumTest {

    @Test
    void generate() throws Exception {
        CheckSum checkSum = new CheckSum("checkSum-test1.csv");
        int calc = checkSum.generate();
        assertEquals(12, calc);
    }

    @Test
    void findCommonLetters() throws Exception {
        CheckSum checkSum = new CheckSum("checkSum-test2.csv");
        String calc = checkSum.findCommonLetters();
        assertEquals("fgij", calc);
    }
}
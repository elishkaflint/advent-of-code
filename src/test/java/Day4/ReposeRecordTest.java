package Day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReposeRecordTest {

    @Test
    void part1() throws Exception {
        ReposeRecord reposeRecord = new ReposeRecord("day4-test1");
        int calc = reposeRecord.part1();
        assertEquals(240, calc);
    }
}
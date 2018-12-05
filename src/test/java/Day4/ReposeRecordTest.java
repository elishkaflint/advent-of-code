package Day4;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReposeRecordTest {

    @Test
    void getMaxSleeper() throws Exception {
        ReposeRecord reposeRecord = new ReposeRecord("day4-test1");
        Map<Integer, Integer> sleepingTimes = reposeRecord.getSleeperTimes();
        int maxSleeper = reposeRecord.getMaxSleeper(sleepingTimes);
        assertEquals(10, maxSleeper);
    }

    @Test
    void part1() throws Exception {
        ReposeRecord reposeRecord = new ReposeRecord("day4-test1");
        int calc = reposeRecord.part1();
        assertEquals(240, calc);
    }
}
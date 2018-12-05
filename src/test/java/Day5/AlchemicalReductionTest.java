package Day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlchemicalReductionTest {

    @Test
    void compare() {
        AlchemicalReduction alc = new AlchemicalReduction();
        assertTrue(alc.compare("P", "p"));
        assertTrue(alc.compare("p", "P"));
        assertFalse(alc.compare("p", "p"));
    }
}
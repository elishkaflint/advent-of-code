import org.junit.jupiter.api.Test;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    private final static Logger LOG = Logger.getLogger(FrequencyTest.class.getName());

    @Test
    public void calculateSumTest() throws Exception {
        Frequency frequency = new Frequency();
        int calc = frequency.calculateSum();
        LOG.info( "Total sum: " + calc );
        assertNotNull(calc);
    }

}
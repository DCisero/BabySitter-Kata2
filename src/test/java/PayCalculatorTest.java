import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTest {

    @Test
    public void workZeroHours_PayIsZero(){
        PayCalculator payCalculator = new PayCalculator();

        assertEquals(0, payCalculator.calculate(0));
    }
}

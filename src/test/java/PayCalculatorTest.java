import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTest {

    @Test
    public void workZeroHours_PayIsZero(){
        PayCalculator payCalculator = new PayCalculator(new FamilyA());

        assertEquals(0, payCalculator.calculate(Hour.fivePM(), Hour.fivePM()));
    }

    @Test
    public void familyA_works5to4_payIs190() {
        PayCalculator payCalculator = new PayCalculator(new FamilyA());

        assertEquals(190, payCalculator.calculate(Hour.fivePM(), Hour.fourAM()));
    }
}

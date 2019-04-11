import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTest {

    @Test
    public void workZeroHours_PayIsZero(){
        PayCalculator payCalculator = new PayCalculator(new FamilyA());

        assertEquals(0, payCalculator.calculate(Hour.fivePM(), Hour.fivePM()));
    }

    @Test
    public void familyA_works5To4_payIs190() {
        PayCalculator payCalculator = new PayCalculator(new FamilyA());

        assertEquals(190, payCalculator.calculate(Hour.fivePM(), Hour.fourAM()));
    }

    @Test
    public void familyB_works5To4_payIs140() {
        PayCalculator payCalculator = new PayCalculator(new FamilyB());

        assertEquals(140, payCalculator.calculate(Hour.fivePM(), Hour.fourAM()));
    }

    @Test
    public void familyC_works5To4_payIs189() {
        PayCalculator payCalculator = new PayCalculator(new FamilyC());

        assertEquals(189, payCalculator.calculate(Hour.fivePM(), Hour.fourAM()));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyCTest {

    private Family family;

    @Before
    public void instantiateFamily() {
        family = new FamilyC();
    }

    @Test
    public void works5To9_payIs21Dollars() {
        int expectedRate = 21;

        assertEquals(expectedRate, family.cost(Hour.fivePM()));
        assertEquals(expectedRate, family.cost(Hour.sixPM()));
        assertEquals(expectedRate, family.cost(Hour.sevenPM()));
        assertEquals(expectedRate, family.cost(Hour.eightPM()));
    }

    @Test
    public void works9to4_payIs15Dollars() {
        int expectedRate = 15;

        assertEquals(expectedRate, family.cost(Hour.ninePM()));
        assertEquals(expectedRate, family.cost(Hour.tenPM()));
        assertEquals(expectedRate, family.cost(Hour.elevenPM()));
        assertEquals(expectedRate, family.cost(Hour.twelveAM()));
        assertEquals(expectedRate, family.cost(Hour.oneAM()));
        assertEquals(expectedRate, family.cost(Hour.twoAM()));
        assertEquals(expectedRate, family.cost(Hour.threeAM()));
    }
}

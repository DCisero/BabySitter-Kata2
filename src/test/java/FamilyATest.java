import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyATest {
    private Family family;

    @Before
    public void instantiateFamily() {
        family = new Family();
    }

    @Test
    public void fiveToEleven_is15Dollars() {
        int expectedRate = 15;

        assertEquals(expectedRate, family.cost(Hour.fivePM()));
        assertEquals(expectedRate, family.cost(Hour.sixPM()));
        assertEquals(expectedRate, family.cost(Hour.sevenPM()));
        assertEquals(expectedRate, family.cost(Hour.eightPM()));
        assertEquals(expectedRate, family.cost(Hour.ninePM()));
        assertEquals(expectedRate, family.cost(Hour.tenPM()));
    }

    @Test
    public void elevenToFour_is20Dollars() {
        int expectedRate = 20;

        assertEquals(expectedRate, family.cost(Hour.elevenPM()));
        assertEquals(expectedRate, family.cost(Hour.twelveAM()));
        assertEquals(expectedRate, family.cost(Hour.oneAM()));
        assertEquals(expectedRate, family.cost(Hour.twoAM()));
        assertEquals(expectedRate, family.cost(Hour.threeAM()));
    }
}

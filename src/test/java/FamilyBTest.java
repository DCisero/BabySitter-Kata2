import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBTest {

    private Family family;

    @Before
    public void instantiateFamily(){
        family = new FamilyB();
    }
    @Test
    public void works5to10_payIs12Dollars() {
        int expectedRate = 12;

        assertEquals(expectedRate, family.cost(Hour.fivePM()));
        assertEquals(expectedRate, family.cost(Hour.sixPM()));
        assertEquals(expectedRate, family.cost(Hour.sevenPM()));
        assertEquals(expectedRate, family.cost(Hour.eightPM()));
        assertEquals(expectedRate, family.cost(Hour.ninePM()));
    }

    @Test
    public void works10to12_payIs8Dollars(){
        int expectedRate = 8;

        assertEquals(expectedRate,family.cost(Hour.tenPM()));
        assertEquals(expectedRate,family.cost(Hour.elevenPM()));
    }

    @Test
    public void works12to4_payIs16Dollars(){
        int expectedRate = 16;

        assertEquals(expectedRate,family.cost(Hour.twelveAM()));
        assertEquals(expectedRate,family.cost(Hour.oneAM()));
        assertEquals(expectedRate,family.cost(Hour.twoAM()));
        assertEquals(expectedRate,family.cost(Hour.threeAM()));
    }
}

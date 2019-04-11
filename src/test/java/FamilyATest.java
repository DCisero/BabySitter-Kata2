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

        assertEquals(expectedRate, family.cost(5));
        assertEquals(expectedRate, family.cost(6));
        assertEquals(expectedRate, family.cost(7));
        assertEquals(expectedRate, family.cost(8));
        assertEquals(expectedRate, family.cost(9));
        assertEquals(expectedRate, family.cost(10));
    }

    @Test
    public void elevenToFour_is20Dollars() {
        assertEquals(20, family.cost(11));
    }
}

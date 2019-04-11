import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyATest {

    @Test
    public void fiveToEleven_is15Dollars() {
        Family family = new Family();

        assertEquals(15, family.cost(5));
    }

    @Test
    public void elevenToFour_is20Dollars() {
        Family family = new Family();

        assertEquals(20, family.cost(11));
    }
}

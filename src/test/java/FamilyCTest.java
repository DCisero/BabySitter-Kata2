import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyCTest {
    @Test
    public void works5To9_payIs21Dollars() {
        Family family = new FamilyC();
        int expectedRate = 21;

        assertEquals(expectedRate, family.cost(Hour.fivePM()));
        assertEquals(expectedRate, family.cost(Hour.sixPM()));
        assertEquals(expectedRate, family.cost(Hour.sevenPM()));
        assertEquals(expectedRate, family.cost(Hour.eightPM()));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBTest {
    @Test
    public void works5to10_payIs12Dollars() {
        Family familyB = new FamilyB();
        int expectedRate = 12;

        assertEquals(expectedRate, familyB.cost(Hour.fivePM()));
        assertEquals(expectedRate, familyB.cost(Hour.sixPM()));
        assertEquals(expectedRate, familyB.cost(Hour.sevenPM()));
        assertEquals(expectedRate, familyB.cost(Hour.eightPM()));
        assertEquals(expectedRate, familyB.cost(Hour.ninePM()));
    }

}

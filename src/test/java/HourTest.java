import org.junit.Test;

import static org.junit.Assert.*;

public class HourTest {

    @Test
    public void sixIsBetweenFiveAndSeven_true() {
        assertTrue(Hour.sixPM().isBetween(Hour.fivePM(), Hour.sevenPM()));
    }

    @Test
    public void sixIsBetweenSevenAndEight_false() {
        assertFalse(Hour.sixPM().isBetween(Hour.sevenPM(), Hour.eightPM()));
    }

    @Test
    public void nextHourFromFiveIsSix() {
        Hour hour = Hour.fivePM();
        hour.next();

        assertEquals(hour, Hour.sixPM());
    }

    @Test
    public void fourAMIsLastHour() {
        Hour hour = Hour.fourAM();
        hour.next();

        assertEquals(Hour.fourAM(), hour);
    }
}

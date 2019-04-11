import java.util.Objects;

public class Hour {

    private int hour;

    private Hour(int hour) {
        this.hour = hour;

    }

    public boolean isBetween(Hour start, Hour end) {
        return start.hour <= this.hour && this.hour < end.hour;
    }

    public void next() {
        if (this.hour < 16) {
            this.hour++;
        }
    }

    public static Hour fivePM() {
        return new Hour(5);
    }

    public static Hour sixPM() {
        return new Hour(6);
    }

    public static Hour sevenPM() {
        return new Hour(7);
    }

    public static Hour eightPM() {
        return new Hour(8);
    }

    public static Hour ninePM() {
        return new Hour(9);
    }

    public static Hour tenPM() {
        return new Hour(10);
    }

    public static Hour elevenPM() {
        return new Hour(11);
    }

    public static Hour twelveAM() {
        return new Hour(12);
    }

    public static Hour oneAM() {
        return new Hour(13);
    }

    public static Hour twoAM() {
        return new Hour(14);
    }

    public static Hour threeAM() {
        return new Hour(15);
    }

    public static Hour fourAM() {
        return new Hour(16);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour1 = (Hour) o;
        return hour == hour1.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour);
    }

    @Override
    public String toString() {
        return "Hour = " + this.hour;
    }
}

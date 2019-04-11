public class FamilyA implements Family {

    @Override
    public int cost(Hour hour) {
        if (hour.isBetween(Hour.fivePM(),Hour.elevenPM())) {
            return 15;
        }

        return 20;
    }
}

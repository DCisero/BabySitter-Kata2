public class FamilyC implements Family {

    @Override
    public int cost(Hour hour) {
        if (hour.isBetween(Hour.fivePM(),Hour.ninePM())) {
            return 21;
        }

        return 15;
    }
}

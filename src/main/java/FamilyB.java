public class FamilyB implements Family {

    @Override
    public int cost(Hour hour) {
        if (hour.isBetween(Hour.fivePM(),Hour.tenPM())){
            return 12;
        } else if (hour.isBetween(Hour.tenPM(),Hour.twelveAM())){
            return 8;
        }

        return 16;
    }
}

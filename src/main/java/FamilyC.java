public class FamilyC implements Family {
    @Override
    public int cost(int hour) {
        if (hour < Hour.ninePM()) {
            return 21;
        }

        return 15;
    }
}

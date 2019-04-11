public class FamilyA implements Family {

    @Override
    public int cost(int hour) {
        if (hour < 11) {
            return 15;
        } else {
            return 20;
        }
    }
}

public class FamilyB implements Family {

    @Override
    public int cost(int hour) {
        if (hour < 10){
            return 12;
        }
        return 8;
    }
}

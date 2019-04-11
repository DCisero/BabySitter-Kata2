public class FamilyB implements Family {

    @Override
    public int cost(int hour) {
        if (hour < 10){
            return 12;
        } else if (hour < 12){
            return 8;
        }
        return 16;
    }
}

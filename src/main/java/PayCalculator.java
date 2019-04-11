public class PayCalculator {
    private Family family;

    public PayCalculator(Family family) {
        this.family = family;
    }

    public int calculate(Hour startTime, Hour endTime) {
        int totalCost = 0;

        while (startTime.isBetween(startTime,endTime)) {
            totalCost += family.cost(startTime);
            startTime.next();
        }

        return totalCost;
    }
}

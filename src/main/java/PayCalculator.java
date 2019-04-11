public class PayCalculator {
    private Family family;

    public PayCalculator(Family family) {
        this.family = family;
    }

    public int calculate(int startTime, int endTime) {
        int totalCost = 0;
        while (startTime < endTime) {
            totalCost += family.cost(startTime);
            startTime++;
        }
        return totalCost;
    }
}

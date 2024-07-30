package WEEK1_DSA.FinancialForecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        if (years <= 0) {
            return initialValue;
        }
        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Starting amount
        double growthRate = 0.05; // 5% growth rate
        int years = 10; // Number of years

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value: $" + futureValue);
    }
}

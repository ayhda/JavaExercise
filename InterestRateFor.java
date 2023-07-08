public class InterestRateFor {
    public static void main(String[] args) {
        for(double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculaterate(100, rate);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculaterate(double money, double rate) {
        return (money * (rate / 100));
    }
}
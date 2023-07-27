public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(-4);
        printFactors(3);
        printFactors(17);
        printFactors(2020);
    }

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= number; i++) {
            if((number % i) == 0) {
                System.out.println(i);
            }
        }
    }
}
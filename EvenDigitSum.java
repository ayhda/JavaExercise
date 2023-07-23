public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-42));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(4));
        System.out.println(getEvenDigitSum(5));
        System.out.println(getEvenDigitSum(16));
        System.out.println(getEvenDigitSum(2112));
        System.out.println(getEvenDigitSum(422572));

    }

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int remainder = number % 10;
            number /= 10;
            if(remainder % 2 == 0) {
                sum += remainder;
            }
        } return sum;
    }
}
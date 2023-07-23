public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(9));
        System.out.println(sumFirstAndLastDigit(14));
        System.out.println(sumFirstAndLastDigit(-5));
        System.out.println(sumFirstAndLastDigit(155));
        System.out.println(sumFirstAndLastDigit(7530));
        System.out.println(sumFirstAndLastDigit(75323434));

        System.out.println(sumFirstLastDigit(5));
        System.out.println(sumFirstLastDigit(9));
        System.out.println(sumFirstLastDigit(14));
        System.out.println(sumFirstLastDigit(-5));
        System.out.println(sumFirstLastDigit(155));
        System.out.println(sumFirstLastDigit(7530));
        System.out.println(sumFirstLastDigit(75323434));
    }

    //Using For
    public static int sumFirstAndLastDigit(int number) {
        
        if(number >= 0) {
        int FirstDigit = 0;
        int lastDigit = number % 10;

        while(number > 9) {
            number = number / 10;
        }
        FirstDigit = number;
        int total = FirstDigit + lastDigit;
        return total;
        }
        return -1;
    }

    //Using For
    public static int sumFirstLastDigit( int number ) {
 
        if (number >= 0) {
            int sum = 0;
            for (int i = number; i != 0; i /= 10) {
                int lastNumber = number % 10;
                sum = lastNumber + i;
            }
            return sum;
        }
        return -1;
    }
}

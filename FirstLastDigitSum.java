public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(9));
        System.out.println(sumFirstAndLastDigit(14));
        System.out.println(sumFirstAndLastDigit(-5));
        System.out.println(sumFirstAndLastDigit(155));
        System.out.println(sumFirstAndLastDigit(7530));
        System.out.println(sumFirstAndLastDigit(75323434));
    }

    public static int sumFirstAndLastDigit(int number) {
        
        if(number < 0) {
            return -1;
        } 

        int lastDigit;
        int FirstDigit = 0;
        int total;
        
        lastDigit = number % 10;

        while(number > 9) {
            number = number / 10;
        }
        FirstDigit = number;

        total = FirstDigit + lastDigit;
        return total;
    }
}
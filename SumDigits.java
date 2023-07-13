public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-2));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(17));
        System.out.println(sumDigits(211));
        System.out.println(sumDigits(1239));
    }

    public static int sumDigits(int number) {
        
        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
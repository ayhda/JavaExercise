public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {

        if(number < 1) {
            return false;
        }

        int sum = 0;
        for(int i = 1; i < number; i++) {
            if((number % i) == 0) {
                sum += i;
            }
        }

        if(sum == number) {
            return true;
        } else {
            return false;
        }
    }

    //Another awesome solution
    /*
    public static boolean isPerfectNumber(int number) {
 
    int sumOfProperDivisors = 0;
    int increment = (number % 2 == 0) ? 1 : 2;
 
    for (int i = 1; i <= number / 2; i += increment)
        if (number % i == 0)
            sumOfProperDivisors += i;
 
    return sumOfProperDivisors == number && number > 1;
    }
    */
}

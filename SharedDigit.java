public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(31, 93));
    }

    //Using For
    public static boolean hasSharedDigit(int num1, int num2) {

        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int digit1;
        int digit2;

        for(int i = num1; i != 0; i /= 10) {
            digit1 = i % 10;
            int tempNum2 = num2;
            for(int j = tempNum2; j != 0; j /= 10) {
                digit2 = j % 10;
                if(digit1 == digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    //Using While
    /* public static boolean hasSharedDigit(int num1, int num2) {
        
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int digit1;
        int digit2;

        while(num1 > 0) {
            digit1 = num1 % 10;
            int tempNum2 = num2;
            while(tempNum2 > 0) {
                digit2 = tempNum2 % 10;
                if(digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    } */
}
public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(9,99, 19));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if(isValid(num1) && isValid(num2) && isValid(num3)) {
        int remainderNum1;
        int remainderNum2;
        int remainderNum3;

        remainderNum1 = num1 % 10;
        remainderNum2 = num2 % 10;
        remainderNum3 = num3 % 10;

        if(remainderNum1 == remainderNum2 || remainderNum1 == remainderNum3 || remainderNum2 == remainderNum3) {
            return true;
        } else {
            return false;
        }
        }
        return false;
    }

    public static boolean isValid(int number) {

        if(number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
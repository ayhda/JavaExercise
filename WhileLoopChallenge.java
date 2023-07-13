public class WhileLoopChallenge {

    public static void main (String[] args) {

        int number = 5;
        int totalEven = 0;
        int totalOdd = 0;

        while(number >= 5 && number <= 20) {
            if(isEvenNumber(number)) {
                System.out.println(number + " is even number");
                totalEven++;
            } else {
                totalOdd++;
            }
            number++;

            if(totalEven == 5) {
                System.out.println("Total even number = " + totalEven);
                System.out.println("Total odd number = " + totalOdd);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {

        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
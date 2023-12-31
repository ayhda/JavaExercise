public class NumberInWord {
    
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(11);
        printNumberInWord(-16);
        printNumberInWord(1001);
        printNumberInWord(-21);

        printNumberInWordIfElse(0);
        printNumberInWordIfElse(1);
        printNumberInWordIfElse(2);
        printNumberInWordIfElse(3);
        printNumberInWordIfElse(4);
        printNumberInWordIfElse(5);
        printNumberInWordIfElse(6);
        printNumberInWordIfElse(7);
        printNumberInWordIfElse(8);
        printNumberInWordIfElse(9);
        printNumberInWordIfElse(11);
        printNumberInWordIfElse(-16);
        printNumberInWordIfElse(1001);
        printNumberInWordIfElse(-21);
    }

    //Using Traditional Switch Statement
    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    //Using If-Else Statement
    public static void printNumberInWordIfElse(int number) {
        if(number == 0) {
            System.out.println("ZERO");
        } else if(number == 1) {
            System.out.println("ONE");
        } else if(number == 2) {
            System.out.println("TWO");
        } else if(number == 3) {
            System.out.println("THREE");
        } else if(number == 4) {
            System.out.println("FOUR");
        } else if(number == 5) {
            System.out.println("FIVE");
        } else if(number == 6) {
            System.out.println("SIX");
        } else if(number == 7) {
            System.out.println("SEVEN");
        } else if(number == 8) {
            System.out.println("EIGHT");
        } else if(number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }
}
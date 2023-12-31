public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(18000));
        System.out.println(getDigitCount(234));
        System.out.println(getDigitCount(-132));
        
        System.out.println(reverse(234));
        System.out.println(reverse(18000));
        System.out.println(reverse(-231));

        numberToWords(234);
        numberToWords(18000);
        numberToWords(0);
        numberToWords(30514);
    }

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        if(number == 0) {
            System.out.println("Zero");
        }

        int reversedNumber = reverse(number);
        while(reversedNumber > 0) {
            int remainder = reversedNumber % 10;
            switch(remainder) {
                case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
                case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
                case 6:
                System.out.println("Six");
                break;
                case 7:
                System.out.println("Seven");
                break;
                case 8:
                System.out.println("Eight");
                break;
                case 9:
                System.out.println("Nine");
                break;
                default:
                System.out.println("Zero");
            }
            reversedNumber /= 10;
        }

        if(getDigitCount(reverse(number)) < getDigitCount(number)) {
            for(int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number) {

        int reverseNumber = 0;
        for(; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        int digitCount = 0;
        while(number > 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    //Another Great Solution
    /*
    public static void numberToWords(int number) {
 
        if (number < 0) {
            System.out.println("Invalid Value");
        }
     
        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
     
            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }
     
        System.out.println();
    }
     
    public static int reverse(int number) {
     
        int reverseNumber = 0;
     
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }
     
    public static int getDigitCount(int number) {
     
        if (number < 0) {
            return -1;
        }
     
        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
    */
}

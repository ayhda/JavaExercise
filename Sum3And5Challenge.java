public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int total = 0;
        
        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided by both 3 and 5");
                sum += i;
                total++;
            }
            if(total == 5) {
                break;
            }
        }
        System.out.println("Sum of all the number is " + sum);
    }

    //Alternative solution: Using method to solve the problem

    /*public static boolean isDivided3And5(int i) {

        if((i % 3 == 0) && (i % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }*/
}
public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(15, 25));
        System.out.println(getGreatestCommonDivisor(132, 1573));
        System.out.println(getGreatestCommonDivisor(36, 120));
        System.out.println(getGreatestCommonDivisor(1155, 1089));
        System.out.println(getGreatestCommonDivisor(-11, 121));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10) {
            return -1;
        }

        int gcd = 0;
        for(int i = 1; i <= first; i++) {
            if((first % i) == 0) {
                for(int j = 1; j <= second; j++) {
                    if((second % j) == 0) {
                        if(i == j) {
                        gcd = i;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return gcd;
    }
}
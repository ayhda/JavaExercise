public class EqualSumChecker {
    public static  void main (String[] args) {
    System.out.println(hasEqualSum(1, 1, 1));
    System.out.println(hasEqualSum(1, 1, 2));
    System.out.println(hasEqualSum(1, -1, 0));
    System.out.println(hasEqualSum(2, 0, 2));
    
 } 
 
 public static boolean hasEqualSum (int FirstNum, int SecondNum, int ThirdNum) {
     if (FirstNum + SecondNum == ThirdNum) {
         return true;
     } else {
         return false;
     }
 }
}
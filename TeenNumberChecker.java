public class TeenNumberChecker {
 public static  void main (String[] args) {
    System.out.println(hasTeen(9, 99, 19));
    System.out.println(hasTeen(23, 15, 42));
    System.out.println(hasTeen(22, 23, 34));
    System.out.println(isTeen(9));
    System.out.println(isTeen(13));    
    
 } 

 public static boolean hasTeen (int num1, int num2, int num3) {
     if ((num1 >= 13 && num1 <= 19)|| (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
         return true;
     } else {
         return false;
     }
 }
 
 public static boolean isTeen (int firstNum) {
     if (firstNum >= 13 && firstNum <= 19) {
         return true;
     } else {
         return false;
     }
 }
}
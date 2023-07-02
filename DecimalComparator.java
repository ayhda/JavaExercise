public class DecimalComparator{

 public static  void main (String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.176));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    System.out.println(areEqualByThreeDecimalPlaces(-3.176, 3.176));
 }   
 
 public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
     int num1Check = (int) (num1 * 1000);
     int num2Check = (int) (num2 * 1000);
     
     if (num1Check == num2Check) {
         return true;
     } else {
         return false;
     }
 }
}
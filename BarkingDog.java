public class BarkingDog {
    public static void main (String[] args) {
        System.out.println(shouldWakeUp(false, -5));
        System.out.println(shouldWakeUp(false, 24));
        System.out.println(shouldWakeUp(false, 6));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 44));
        System.out.println(shouldWakeUp(true, 44));
        System.out.println(shouldWakeUp(true, 4));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 7));
        System.out.println(shouldWakeUp(true, 0));
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            if (barking == true && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23)) {
                return true;
            } else {
                return false;
            }
    }
}
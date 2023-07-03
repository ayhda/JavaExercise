public class MinutesToYearsDaysCalculator {
    public static void main (String[] args) {
        
        printYearsAndDays(-525600);
        printYearsAndDays(0);
        printYearsAndDays(525600);
        printYearsAndDays(561600);
        printYearsAndDays(3152160);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long remainderDay = day % 365;
        System.out.println(minutes + " min = " + year + " y and " + remainderDay + " d");
        
        }
    }
}
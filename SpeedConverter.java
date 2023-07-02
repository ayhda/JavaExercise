public class SpeedConverter {
    public static void main (String[] args) {
        printConversion(-2);
        printConversion(-25);
        printConversion(0);
        printConversion(1.25);
        printConversion(100.4);
        printConversion(10.25);

    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            long rounded = Math.round(milesPerHour);
            return rounded;
        }
    }
    
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            toMilesPerHour(kilometersPerHour);
            long MilesPerHour = Math.round(toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");
        }
    }
}
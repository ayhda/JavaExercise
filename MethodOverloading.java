public class MethodOverloading {

    public static void main(String[] args) {
        convertToCentimeters(5);
        convertToCentimeters(5, 9);
    }

    public static double convertToCentimeters (int heightInInches) {
        double centimeters;

        centimeters = heightInInches * 2.54;
        System.out.println(heightInInches + " inches equals " + centimeters + " centimeters");
        return centimeters;
        
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches) {
        int feetToInches;
        int totalInches;
        double result;

        feetToInches = heightInFeet * 12;
        totalInches = feetToInches + heightInInches;
        result = convertToCentimeters(totalInches);
        return result;
    }
}
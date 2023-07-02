public class SecondsAndMinutesChallenge {

    public static void main (String[] args) {
        System.out.println(getDurationString(50));
        System.out.println(getDurationString(5253));
        System.out.println(getDurationString(-2));
        System.out.println(getDurationString(5, 61));
        System.out.println(getDurationString(84, 32));
    }

    public static String getDurationString (int seconds) {
        int minutes;
        int remainderSeconds;
        if (seconds >= 0) {
            minutes = seconds / 60;
            remainderSeconds = seconds % 60;
            return getDurationString (minutes, remainderSeconds);
        } else {
            return "Please try again! You inserted negative number.";
        }
    }

    public static String getDurationString (int minutes, int seconds) {
        int hour;
        int remainderMinutes;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            hour = minutes / 60;
            remainderMinutes = minutes % 60;
            return "'" + hour + "h " + remainderMinutes + "m " + seconds + "s'";
        } else {
            return "Please try again! You inserted the wrong number.";
        }
    }
}
public class MegaBytesConverter {
    public static void main (String[] args) {
        printMegaBytesAndKiloBytes(-20);
        printMegaBytesAndKiloBytes(1026);
        printMegaBytesAndKiloBytes(50000);
        printMegaBytesAndKiloBytes(100);
        printMegaBytesAndKiloBytes(785443);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
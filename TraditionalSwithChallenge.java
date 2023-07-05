public class TraditionalSwithChallenge {

    public static void main(String[] args) {
        char char1 = 'D';

        switch(char1) {
            case 'A':
                System.out.println("NATO's standardized word for " + char1 + " is Able");
                break;
            case 'B':
                System.out.println("NATO's standardized word for " + char1 + " is Baker");
                break;
            case 'C':
                System.out.println("NATO's standardized word for " + char1 + " is Charlie");
                break;
            case 'D':
                System.out.println("NATO's standardized word for " + char1 + " is Dog");
                break;
            case 'E':
                System.out.println("NATO's standardized word for " + char1 + " is Easy");
                break;
            default:
                System.out.println("not found");
        }
    }
}


public class solution7_11 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "R":
                System.out.println("Rouge");
                break;

            case "G":
                System.out.println("Vert");
                break;

            case "B":
                System.out.println("Bleu");
                break;

            default:
                System.out.println("Inconnu");
                break;
        }
    }
}

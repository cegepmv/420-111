import java.util.Scanner;
public class solution12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");

        String prenom = scanner.nextLine();

        System.out.println("Bonjour, " + prenom + " !");
    }
}

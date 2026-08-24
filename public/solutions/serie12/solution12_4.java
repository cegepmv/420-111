import java.util.Scanner;
public class solution12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = "";

        while (phrase.trim().equals("")) {
            System.out.print("Entrez une phrase : ");
            phrase = scanner.nextLine();
        }
        System.out.println(phrase);
    }
}

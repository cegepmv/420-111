import java.util.Scanner;

public class solution12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre un nombre décimal : ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Ce n’est pas un nombre décimal !");
            System.out.println();
            System.out.print("Entre un nombre décimal : ");
            
            scanner.next();
        }

        double valeur = scanner.nextDouble();
        System.out.printf("%.2f\n", valeur);
    }
}


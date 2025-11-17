import java.util.Scanner;
public class solution12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez 2 entiers : ");
        
        int entier1 = scanner.nextInt();
        int entier2 = scanner.nextInt();

        System.out.println("La somme est de " + (entier1 + entier2));

    }
}

import java.util.Scanner;
public class solution12_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez une année : ");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                int annee = sc.nextInt();
                if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                    System.out.println("Année bissextile");
                }
                else {
                    System.out.println("Année non bissextile");
                }
                break;
            } else {
                System.out.println("Entrée une valeur valide.\n");

                sc.nextLine();

                System.out.print("Entrez une année : ");


            }

        }
    }
}

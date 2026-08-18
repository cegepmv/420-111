import java.util.Scanner;
public class solution12_9 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. Ajouter un nombre au tableau");
            System.out.println("2. Afficher le tableau ");
            System.out.println("3. Quitter ");
            System.out.print("Entrez votre choix : ");
         
            String choix = sc.nextLine();

            if (choix.equals("1")) {
                if (tab.length > 4) {
                    System.out.println("Impossible d'ajouter plus d'élément");
                    continue;
                }
                System.out.print("Entrez le nombre à ajouter au tableau : ");
                if (sc.hasNextInt()) {
                    tab[indice] = sc.nextInt();
                    indice++;
                    sc.nextLine();
                } else {
                    sc.nextLine();
                    continue;
                }
            } else if (choix.equals("2")) {
                System.out.print("[");
                for (int i = 0; i < indice - 1; i++) {
                    System.out.print(tab[i] + ", ");
                }
                if (indice > 0) {
                    System.out.print(tab[indice - 1]);
                }
                System.out.println("]");

            } else if (choix.equals("3")) {
                break;
            } else {
                System.out.println("Erreur entrée invalide");
                continue;
            }
        }
            

    }
}

import java.util.Scanner;
 
public class solution12_10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
        float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
        boolean[] estCommande = {false, false, false, false, false};
 
        while (true) {
 
           
            System.out.println("Menu :");
            System.out.println("1. Ajouter un item");
            System.out.println("2. Retirer un item");
            System.out.println("3. Afficher le reçu");
            System.out.println("4. Terminer la transaction");
            System.out.printf("Total de la facture actuelle : %.2f$\n\n", montantFacture(prix, estCommande));
 
 
            System.out.print("Entrez votre choix : ");
 
            String choix = sc.nextLine();
 
            if (choix.equals("1")) {
                actionAjouter(plats, prix, estCommande, sc);
            } else if (choix.equals("2")) {
                actionRetirer(plats, prix, estCommande, sc);
            } else if (choix.equals("3")) {
                actionAfficheRecu(plats, prix, estCommande, sc);
            } else if (choix.equals("4")) {
                actionAfficheRecu(plats, prix, estCommande, sc);
                System.out.println("Merci de votre visite!");
                sc.close();
                return;
            } else {
 
            }
            sc.nextLine();
        }
    }
 
    public static void actionAfficheRecu(String[] plats, float[] prix, boolean[] estCommande, Scanner sc) {
 
       
        System.out.println("\nReçu :");
        System.out.println("");
 
        for (int i = 0; i < estCommande.length; i++) {
            if (estCommande[i]) {
                System.out.printf("%-15s%11.2f$\n", plats[i], prix[i]);
            }
        }
 
        System.out.println("---------------------------");
        System.out.printf("Total           %10.2f$\n\n\n", montantFacture(prix, estCommande));
    }
    public static void actionAjouter(String[] plats, float[] prix, boolean[] estCommande, Scanner sc) {
       
        System.out.println("Choisissez un item à ajouter :");
 
        for (int i = 0; i < estCommande.length; i++) {
            if (!estCommande[i]) {
                System.out.printf("%d. %-15s%7.2f$\n", (i + 1), plats[i], prix[i]);
            }
        }
 
        System.out.print("\nEntrez le numéro de l'item : ");
 
        if (!sc.hasNextInt()) {
            System.out.println("Erreur entrée invalide");
            sc.nextLine();
            return;
        }
 
        int choix = sc.nextInt() - 1;
        sc.nextLine();
 
        if (!(choix >= 0 && choix < estCommande.length && !estCommande[choix])) {
            System.out.println("Erreur entrée invalide");
            return;
        }
       
        // Commande le plat
        estCommande[choix] = true;
        // plat choisi:
        System.out.println("Plat ajouté : " + plats[choix]);
        System.out.printf("Total de la facture actuelle : %.2f$\n\n", montantFacture(prix, estCommande));
 
    }
 
    public static void actionRetirer(String[] plats, float[] prix, boolean[] estCommande, Scanner sc) {
        System.out.println("Choisissez un item à retirer :");
 
        for (int i = 0; i < estCommande.length; i++) {
            if (estCommande[i]) {
                System.out.printf("%d. %-15s%7.2f$\n", (i + 1), plats[i], prix[i]);
            }
        }
 
        System.out.print("\nEntrez le numéro de l'item : ");
 
        if (!sc.hasNextInt()) {
            System.out.println("Erreur entrée invalide");
            return;
        }
 
        int choix = sc.nextInt() - 1;
        sc.nextLine();
       
        if (!(choix >= 0 && choix < estCommande.length && estCommande[choix])) {//tester
            System.out.println("Erreur entrée invalide");
            return;
        }
       
        // Retirer le plat
        estCommande[choix] = false;
        // plat choisi:
        System.out.println("Plat retirer : " + plats[choix]);
        System.out.printf("Total de la facture actuelle : %.2f$\n\n", montantFacture(prix, estCommande));
 
    }
    public static float montantFacture(float[] prix, boolean[] estCommande) {
        float montantTotal = 0;
        for (int i = 0; i < estCommande.length; i++) {
            if (estCommande[i]) {
                montantTotal += prix[i];
            }
        }
        return montantTotal;
    }
}
 
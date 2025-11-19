import java.util.Scanner;
public class solution12_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
        float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
        boolean[] estVoulu = {false, false, false, false, false};
    
        while (true) {

            afficheMenu(calculTotal(prix, estVoulu));
            
            System.out.print("Entrez votre choix : ");
            String choix = sc.nextLine();
            
            if (choix.equals("1")) {
                if (ajouterElement(plats, estVoulu, prix, sc)) {
                    System.out.printf("Total de la facture actuelle : %.2f$\n", calculTotal(prix, estVoulu));
                }

            } else if (choix.equals("2")) {
                if (retirerElement(plats, estVoulu, prix, sc)) {
                    System.out.printf("Total de la facture actuelle : %.2f$\n", calculTotal(prix, estVoulu));
                }
            } else if (choix.equals("3")) {
                afficheRecu(plats, estVoulu, prix, sc);
            } else if (choix.equals("4")) {
                afficheRecu(plats, estVoulu, prix, sc);

                System.out.println("\nMerci pour votre visite !");
                break;

            } else {
                System.out.println("Erreur, entrée invalide");
                sc.nextLine();
                continue;
            }
        }
    }

    public static void afficheMenu(double total) {
        System.out.println("1. Ajouter un item");
        System.out.println("2. Retirer un item");
        System.out.println("3. Afficher le reçu");
        System.out.println("4. Terminer la transaction");
        System.out.printf("Total de la facture actuelle : %.2f$\n", total);
    }

    public static double calculTotal(float[] prix, boolean[] estVoulu) {
        double somme = 0;

        for (int i = 0; i < estVoulu.length; i++) {
            if (estVoulu[i]) {
                somme += prix[i];
            }
        }
        
        return somme;
    }

    public static boolean ajouterElement(String[] plats, boolean[] estVoulu, float[] prix, Scanner sc) {
        System.out.println("Choisissez un item à ajouter :");

        for (int i = 0; i < estVoulu.length; i++) {
            if (!estVoulu[i]) {
                System.out.printf(i + ". %-20s%10.2f$\n", plats[i], prix[i]);
            }
        }

        System.out.println();

        System.out.print("Entrez le numéro de l'item : ");
        int choix = -1;
        if (sc.hasNextInt()) {
            choix = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Erreur, entrée invalide");
            sc.nextLine();
            sc.nextLine();
            return false;
        }

        if (choix < 0 || choix > plats.length || estVoulu[choix]){
            System.out.println("Erreur, entrée invalide");
            sc.nextLine();
            return false;
        } else {
            estVoulu[choix] = true;
            System.out.print("Plat ajouté : " + plats[choix]);
            return true;
        }
    }

    public static boolean retirerElement(String[] plats, boolean[] estVoulu, float[] prix, Scanner sc) {
        System.out.println("Choisissez un item à retirer :");

        for (int i = 0; i < estVoulu.length; i++) {
            if (estVoulu[i]) {
                System.out.printf(i + ". %-20s%10.2f$\n", plats[i], prix[i]);
            }
        }

        System.out.println();

        System.out.print("Entrez le numéro de l'item : ");
        int choix = -1;
        if (sc.hasNextInt()) {
            choix = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Erreur, entrée invalide");
            sc.nextLine();
            sc.nextLine();
            return false;
        }

        if (choix < 0 || choix > plats.length || !estVoulu[choix]){
            System.out.println("Erreur, entrée invalide");
            sc.nextLine();
            return false;
        } else {
            estVoulu[choix] = false;
            System.out.print("Plat retiré : " + plats[choix]);
            return true;
        }
    }

    public static void afficheRecu(String[] plats, boolean[] estVoulu, float[] prix, Scanner sc) {


        for (int i = 0; i < estVoulu.length; i++) {
            if (estVoulu[i]) {
                System.out.printf("%-20s%7.2f$\n", plats[i], prix[i]);
            }
        }
        System.out.println("---------------------------");

        System.out.printf("%-18s%9.2f$\n", "Total", calculTotal(prix, estVoulu));
    }


}

package cours420111.solutions.serie7;

public class solution7_14 {
    public static void main(String[] args) {
        String choix = "B";

        switch (choix) {
            case ("A"):
                System.out.println("Accueil");
                break;
            case ("B"):
                System.out.println("Profil");
                break;
            case ("C"):
                System.out.println("Déconnexion");
                break;
            default:
                System.out.println("Option inconnue");
                break;
        }
    }
}

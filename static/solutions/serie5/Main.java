public class Main {
    public static void main(String[] args) {
        //Q1
        String mot = "Programmation";
        int n = 12;

        System.out.printf("Le mot \"%s\" contient %d lettres\n", mot, mot.length());
        System.out.printf("Le mot contient au moins 10 lettres : %b\n", mot.length() >= 10);
        System.out.printf("Le mot a un nombre de lettres pair : %b\n", mot.length() % 2 == 0);
        System.out.printf("La longueur du mot est égale au nombre  : %b\n", mot.length() == n);



        //Q2
        short nbEleveMV = 3885;
        byte age = 111;
        boolean aimeLesPommes = true;
        float masseAtomeHydrogene = 1.00784f;
        final byte nbPlanete = 8;
        
        long distanceEntreEtoile = 9461000000000L;
        String slogan = "Bonjour, humain.";

        //Q3
        String prenom = "Sophie";
        String nom = "Lefebvre";
        String anneeNaissance = "1988";

        System.out.printf("%s_%c%s\n", nom.toUpperCase(), prenom.charAt(0), anneeNaissance.substring(anneeNaissance.length() - 2));
    }
}

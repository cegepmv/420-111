

public class solution4_3 {
    public static void main(String[] args) {
        String mot = "Bonjour";

        System.out.println("Le mot \"" + mot + "\" contient " + mot.length() + " lettres");
        
        System.out.println("Le mot contient au moins 5 lettres : " + (mot.length() > 5));

        System.out.println("Le mot a un nombre de lettres différent de 7 : " + (mot.length() != 7));
    }
}

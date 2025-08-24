package cours420111.solutions.serie7;

public class solution7_15 {
    public static void main(String[] args) {
        switch(args[0]){
            case("start"):
                System.out.println("Lancement du programme");
                break;
            case("stop"):
                System.out.println("Arrêt demandé");
                break;
            case("reset"):
                System.out.println("Réinitialisation");
                break;
            default:
                System.out.println("Commande inconnue");
                break;

        }
    }
}

package cours420111.solutions.serie3;

public class solution3_7 {
    public static void main(String[] args) {
        String prenom = "julie";
        String nom = "martin";
        int age = 28;
        String ville = "paris";

        System.out.printf("""
            Nom complet  : %s    
            Âge          : %d    
            Ville        : %s    
            """,
                prenom.substring(0, 1).toUpperCase() + prenom.substring(1) + " " + nom.toUpperCase(),
                age,
                ville.substring(0, 1).toUpperCase() + ville.substring(1));
    }
}

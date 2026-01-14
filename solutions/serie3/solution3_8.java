

public class solution3_8 {
    public static void main(String[] args) {
        String prenom = "Harry";
        String nom = "Morin";
        String anneeNaissance = "1995";

        String identifiant = nom.toUpperCase() + "_" + prenom.toLowerCase() + anneeNaissance.substring(anneeNaissance.length()-2);
        System.out.println("Identifiant généré : " + identifiant);
    }
}

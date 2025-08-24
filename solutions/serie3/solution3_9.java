package cours420111.solutions.serie3;

public class solution3_9 {
    public static void main(String[] args) {
        String client = "Nora";
        String produit = "Casque audio";
        int quantite = 2;
        double prixUnitaire = 59.99;

        System.out.printf("""
                Facture
                Client        : %s
                Produit       : %s
                Quantité      : %d
                Prix unitaire : %.2f $
                Total HT      : %.2f $
                """,
                    client,
                    produit,
                    quantite,
                    prixUnitaire,
                    quantite * prixUnitaire);
    }
}

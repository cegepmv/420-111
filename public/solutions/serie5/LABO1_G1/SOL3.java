public class SOL3 {
    public static void main(String[] args) {
        String client = "Nora";
        String produit = "Casque audio";
        int quantite = 2;
        double prixUnitaire = 59.99;


        //4 pts
        
        System.out.printf("Facture\n");
        System.out.printf("Client        :%15s\n", client);
        System.out.printf("Produit       :%15s\n", produit);
        System.out.printf("Quantité      :%15d\n", quantite);
        System.out.printf("Prix unitaire :%14.2f$\n", prixUnitaire);
        System.out.printf("Total HT      :%14.2f$\n", quantite * prixUnitaire);
    }
}

public class MatriceStats {
    public static void main(String[] args) {
        double[][] matrice = {
            {32.25, 7520.1},
            {0, -2250}
        };

        System.out.println("Produit total : " + (matrice[0][0] * matrice[0][1] * matrice[1][0]  *matrice[1][1]));

        int calcul = ((int) matrice[0][0] + (int) matrice[0][1]) * ((int) matrice[1][0] + (int) matrice[1][1]);
        System.out.println((calcul % 2 == 0) ? "Résultat pair" : "Résultat impair");

        if (matrice[0][0] > 5000 || matrice[0][1] > 5000 || matrice[1][0]  > 5000 ||matrice[1][1] > 5000) {
            System.out.println("Un des élément est plus grand que 5000");
        } else {
            System.out.println("Aucun élément n'est plus grand que 5000");
        }

        double min = matrice[0][0];
        if (matrice[0][1] < min) {
            min = matrice[0][1];
        }
        if (matrice[1][0] < min) {
            min = matrice[1][0];
        }
        if (matrice[1][1] < min) {
            min = matrice[1][1];
        }

        System.out.println("Minimum : " + min);
    }
}

package cours420111.solutions.serie10;

public class solution10_10 {

    public static void main(String[] args) {
        affichageTableauEsthétique(tableauRandom(5)); 
    }

    public static int[] tableauRandom(int nbElement){
        int[] tableau = new int[nbElement];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        return tableau;
    }

    public static void affichageTableauEsthétique(int[] tab){
        System.out.print("[");

        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ",");
        }

        System.out.println(tab[tab.length - 1] + "]");

    }

}

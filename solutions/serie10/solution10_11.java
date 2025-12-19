

public class solution10_11 {
    public static void main(String[] args) {

        int[] tab = tableauRandom(5);

        affichageTableauEsthétique(tab);

        System.out.println("Le maximum est : " + findMax(tab)); 
        System.out.println("Le minimum est : " + findMin(tab)); 
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

    public static int findMax(int[] tableau){
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] > maxVal){
                maxVal = tableau[i];
            }
        }
        return maxVal;
    }
    public static int findMin(int[] tableau){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] < minValue){
                minValue = tableau[i];
            }
        }
        return minValue;
    }
}

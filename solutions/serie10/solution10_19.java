package cours420111.solutions.serie10;

public class solution10_19 {
    public static void main(String[] args) {
        exo19(5);
    }

    public static void exo19(int n) {
        int[] tableau = new int[n];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        afficherTableau(tableau);
        
        int mem;
        for(int i = 0; i < tableau.length/2; i++){
            mem = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = mem;
        }

        afficherTableau(tableau);
    
    }
    public static void afficherTableau(int[] tableau){
        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
        }
        System.out.print(tableau[tableau.length-1]);

        System.out.println("]");
    }
}

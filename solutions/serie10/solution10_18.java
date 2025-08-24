package cours420111.solutions.serie10;

public class solution10_18 {
    public static void main(String[] args) {
        int[] tab1 = {1 , 2 , 3};
        int[] tab2 = {4 , 5 , 6};
        int[] tab3;

        tab3 = fusionTab(tab1, tab2);
        afficherTableau(tab3);
    }

    

    public static int[] fusionTab(int[] tab1, int[] tab2) {

        int[] tab3 = new int[tab1.length + tab2.length];

        for(int i = 0 ; i < tab1.length ; i++){
            tab3[i] = tab1[i];
        }
        for(int i = 0 ; i < tab1.length ; i++){
            tab3[i + tab1.length] = tab2[i];
        }
        return tab3;

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

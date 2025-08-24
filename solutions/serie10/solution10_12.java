package cours420111.solutions.serie10;

public class solution10_12 {
    public static void main(String[] args) {
        int[] tab1 = new int[] {5,1,2,2,1,4,5,6,6,7};
        int[] tab2 = new int[] {5,1,2,2,1,4,5,6,6,7};
        int[] tab3 = new int[] {5,1,2,2,0,4,5,6,6,7};

        compareTableau(tab1, tab2);
        compareTableau(tab1, tab3);
    }

    public static void compareTableau(int[] tab1, int[] tab2){
        
        affichageTableauEsthétique(tab1);
        affichageTableauEsthétique(tab2);

        if(tab1.length != tab2.length){
            System.out.println("Différent");   
        }
        else{
            for (int i = 0; i < tab2.length; i++) {
                if(tab1[i] != tab2[i]){
                    System.out.println("Différent");   
                    return;
                }
            }
        }

        System.out.println("Identique");
    }

    public static void affichageTableauEsthétique(int[] tab){
        System.out.print("[");

        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ",");
        }

        System.out.println(tab[tab.length - 1] + "]");

    }
}

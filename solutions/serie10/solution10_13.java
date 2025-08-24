package cours420111.solutions.serie10;

public class solution10_13 {
    public static void main(String[] args) {
        char[] tableau = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
        compterVoyelle(tableau);
    }

    public static void compterVoyelle(char[] tableau){
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};

        int nbVoyelles = 0;
        for(int i = 0 ; i < tableau.length ; i++){
            for( int j = 0 ; j < voyelles.length ; j++){
                if(tableau[i] == voyelles[j]){
                    nbVoyelles += 1;
                    break;
                }
            }
        }

        System.out.printf("Il y a %d voyelles dans le tableau\n", nbVoyelles);
    }
}

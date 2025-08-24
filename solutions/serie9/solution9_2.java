package cours420111.solutions.serie9;

public class solution9_2 {
    public static void main(String[] args) {
        int[] nombres = {4, 7, 2, 9};

        int somme = 0; 

        for(int i = 0 ; i < nombres.length ; i++){
            somme += nombres[i];
        }

        System.out.println("Somme des éléments : " + somme);
    }
}

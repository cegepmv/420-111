package cours420111.solutions.serie10;

public class solution10_9 {
    public static void main(String[] args) {
        for (int element : tableauRandom(5)) {
            System.out.println(element);
        }   
    }

    public static int[] tableauRandom(int nbElement){
        int[] tableau = new int[nbElement];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        return tableau;
    }
}

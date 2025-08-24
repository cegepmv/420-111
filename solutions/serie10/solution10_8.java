package cours420111.solutions.serie10;

public class solution10_8 {
    public static void main(String[] args) {
        System.out.println(maxTableau(new int[]{3, 9, 2, 14, 5}));
    }

    public static int maxTableau(int[] tab){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > max){
                max = tab[i];
            }
        }

        return max;
    }
}

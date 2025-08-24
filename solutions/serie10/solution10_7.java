package cours420111.solutions.serie10;

public class solution10_7 {
    public static void main(String[] args) {
        System.out.println(inverse("java"));
    }
    public static String inverse(String chaine){
        String inverse = "";

        for (int i = chaine.length() - 1; i >= 0 ; i--) {
            inverse += chaine.charAt(i);
        }

        return inverse;
    }
}

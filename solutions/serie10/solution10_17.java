

public class solution10_17 {
    public static void main(String[] args) {
        System.out.println(compteCharInString("hello world", 'o'));
    }

    public static int compteCharInString(String mot, char findCarac){
        int somme = 0;
        for (char carac : mot.toCharArray()) {
            if(carac == findCarac){
                somme++;
            }
        }

        return somme;
    }
}

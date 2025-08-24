package cours420111.solutions.serie9;

public class solution9_13 {
    public static void main(String[] args) {
        String mot = "Java";

        int i = 0;

        do{
            System.out.println("Lettre " + i + " : " + mot.charAt(i));
            i++;
        }while(i < mot.length());
    }
}

package cours420111.solutions.serie9;

public class solution9_10 {
    public static void main(String[] args) {
        int i = 0;

        int somme = 0;

        while(i < args.length){
            somme += Integer.parseInt(args[i]);
            i++;
        }

        System.out.println("Somme : " + somme);
    }
}

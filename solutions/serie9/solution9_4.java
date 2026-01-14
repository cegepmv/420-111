

public class solution9_4 {
    public static void main(String[] args) {
        int somme = 0;


        System.out.print("Nombres reçus : ");

        for(int i = 0 ; i < args.length ; i++){
            System.out.print(" " + args[i]);
            somme += Integer.parseInt(args[i]);
        }

        System.out.println("\nMoyenne : " + (somme / (double) args.length));
    }
}

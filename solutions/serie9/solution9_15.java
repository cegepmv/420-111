package cours420111.solutions.serie9;

public class solution9_15 {
    public static void main(String[] args) {
        int[] nombres = {3, 6, 9, 12};

        int somme = 0;

        for (int nombre : nombres) {
            somme += nombre;
        }

        System.out.println("Somme des éléments : " + somme);
    }
}

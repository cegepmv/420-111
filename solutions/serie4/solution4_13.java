package cours420111.solutions.serie4;

public class solution4_13 {
    public static void main(String[] args) {
        int a = 5;
        double b = 3.7;

        int sommeEntier = a + (int) b;
        double sommeDecimal = (double) a + b; //Ici le cast n'est pas obligatoire, car il peut être implicite
    
        System.out.println(sommeEntier);
        System.out.println(sommeDecimal);
    }
}

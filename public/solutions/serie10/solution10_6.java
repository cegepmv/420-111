

public class solution10_6 {
    public static void main(String[] args) {
        System.out.println(factorielle(5));
    }

    public static int factorielle(int nombre){
        int factorielle = nombre;
        for(int i = nombre - 1 ; i > 1 ; i--){
            factorielle *= i;
        }

        return factorielle;
    }
}

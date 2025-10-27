public class Egaux {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int c = 33;
        int d = 43;

        if (a == b && a == c && a == d) {
            System.out.println("Tous égaux");
        } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("Certains sont égaux");
        } else {
            System.out.println("Il n'y a pas de doublons");
        }
    }
}



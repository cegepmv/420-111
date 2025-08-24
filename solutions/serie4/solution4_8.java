package cours420111.solutions.serie4;

public class solution4_8 {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 25;

        System.out.println((a > b && b < c) || (a == c)); // true
        System.out.println(!(a < c && b != 15)); // true
    }
}

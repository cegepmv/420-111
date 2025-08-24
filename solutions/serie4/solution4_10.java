package cours420111.solutions.serie4;

public class solution4_10 {
    public static void main(String[] args) {
        int x = 6;
        int y = 4;
        int z = 3;

        System.out.println(x + y * z);          //18
        System.out.println((x + y) % z);        //1
        System.out.println(x * y > z + 10);     //true
        System.out.println((x > y) && (y > z)); //true
    }
}

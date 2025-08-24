

public class solution9_20 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-8s",args[i * 3 + j]);
            }
            System.out.println();
        }
    }
}

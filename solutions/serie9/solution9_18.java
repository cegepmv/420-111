package cours420111.solutions.serie9;

public class solution9_18 {
    public static void main(String[] args) {
        int nbEspaceMax = 4;
     
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(" ".repeat(nbEspaceMax - i) + "*".repeat(1 + i));
        }
    }
}

package cours420111.solutions.serie7;

public class solution7_8 {
    public static void main(String[] args) {
        String[] mots = {"bonjour", "test", "interdit"};

        if (mots[0].equals("interdit") 
            || 
            mots[1].equals("interdit") 
            || 
            mots[2].equals("interdit")
            )
        {
            System.out.println("Attention : mot interdit détecté.");
            
        }
    }
}

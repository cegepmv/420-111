package cours420111.solutions.serie7;

public class solution7_2 {
    public static void main(String[] args) {
        int n = 7;
        String reponse;

        if((n % 2) == 0){
            reponse = "pair";
        }
        else{
            reponse = "impair";
        }
        
        System.out.printf("Le nombre %d est %s\n", n, reponse);
    }
}

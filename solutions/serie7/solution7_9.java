package cours420111.solutions.serie7;

public class solution7_9 {
    public static void main(String[] args) {
        System.out.println("Mot : " + args[0]);

        System.out.println("Longueur : " + args[0].length());

        if(args[0].length() < 5){
            System.out.println("Mot moyen");
        }
        else if(args[0].length() <= 7){
            System.out.println("Mot moyen");
        }
        else{
            System.out.println("Mot long");
        }
    }
}

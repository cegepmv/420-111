package cours420111.solutions.serie7;

public class solution7_10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        if(a == b && a == c){
            System.out.println("Triangle équilatéral");
        }
        else if((a == b) || (a == c) || (b == c)){
            System.out.println("Triangle isocèle");
        }
        else{
            System.out.println("Triangle scalène");
        }
    }
}

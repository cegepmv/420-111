package cours420111.solutions.serie4;

public class solution4_9 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programmation";

        System.out.println("La chaîne s1 \"" + s1 + "\" contient " + s1.length() + " caractères");
        System.out.println("La chaîne s2 \"" + s2 + "\" contient " + s2.length() + " caractères");

        System.out.println("s1 est plus court que s2 : " + (s1.length() < s2.length()));
        System.out.println("Les deux chaînes font exactement 4 caractères : " + (s1.length() == 4 && s2.length() == 4));
    }   
}

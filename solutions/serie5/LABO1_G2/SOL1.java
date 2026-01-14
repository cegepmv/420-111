public class SOL1 {
    public static void main(String[] args) {
        String phrase = "Le chat et la souris ne sont que très rarement amis.";
        int chiffre = 143;
        //0.5
        System.out.println("Le nombre de caractères dans la phrase est de : " + phrase.length());
        //1
        System.out.println(phrase.length() + " est un chiffre pair : " + (phrase.length() % 2 == 0));
        //0.5
        System.out.println(chiffre + " est positif : " + (chiffre >= 0));
        //1
        System.out.println(phrase.length() + " entre " + (chiffre / phrase.length()) + " fois dans " + chiffre); 

    }
}

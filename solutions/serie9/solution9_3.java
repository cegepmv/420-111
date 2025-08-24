package cours420111.solutions.serie9;

public class solution9_3 {
    public static void main(String[] args) {
        String[] mots = {"Java", "Programmation", "Code", "Tableau", "if"};

        int somme = 0;

        for(int i = 0 ; i < mots.length ; i++){
            if(mots[i].length() >= 5){
                somme++;
            }
        }

        System.out.println("Mots de 5 lettres ou plus : " + somme);
    }
}

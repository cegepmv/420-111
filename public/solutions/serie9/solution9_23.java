

public class solution9_23 {
    public static void main(String[] args) {
        String[] mots = {"chat", "chien", "", "oiseau"};

        for (int i = 0; i < mots.length; i++) {
            if(mots[i].equals("")){
                System.out.println("Première chaîne vide à l'indice : " + i);
                break;
            }
        }

    }
}

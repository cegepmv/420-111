public class SOL1 {

    //3 pts max


    public static void main(String[] args) {
        String mot = "Programmation";
        int n = 12;


        //0.6
        System.out.printf("Le mot \"%s\" contient %d lettres\n", mot, mot.length());
        //0.6
        System.out.printf("Le mot contient plus de 12 lettres : %b\n", mot.length() > 12);
        //0.6
        System.out.printf("Le mot a un nombre de lettres impair : %b\n", mot.length() % 2 == 1);
        //0.6
        System.out.printf("Le mot contient la chaine am : %b\n", mot.contains("am"));
        //0.6
        System.out.printf("La longueur du mot est égale au nombre : %b\n", mot.length() == n);
        
    }
}

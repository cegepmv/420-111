import java.util.Scanner;

public class solution12_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notes = new double[3];
        System.out.print("Entrez 3 notes sur la même ligne : ");
        for (int i = 0; i < notes.length; i++) {
            if (sc.hasNextDouble()) {
                notes[i] = sc.nextDouble();
            }  
        }
        
        System.out.println("Moyenne : " + ((notes[0] + notes[1] + notes[2]) / 3));
    }
}

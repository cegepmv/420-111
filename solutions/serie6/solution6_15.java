package cours420111.solutions.serie6;

public class solution6_15 {
    public static void main(String[] args) {
        double[][] notes = {
            {12.5, 13.5},
            {14.0, 10.0}
        };

        double moyenne = (notes[0][0] + notes[0][1] + notes[1][0] + notes[1][1]) / 4; 
        
        System.out.println("Moyenne : " + moyenne);


    }
}

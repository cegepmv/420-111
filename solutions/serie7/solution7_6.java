package cours420111.solutions.serie7;

public class solution7_6 {
    public static void main(String[] args) {
        byte note1 = Byte.parseByte(args[0]);
        byte note2 = Byte.parseByte(args[1]);
        byte note3 = Byte.parseByte(args[2]);
        byte note4 = Byte.parseByte(args[3]);

        float moyenne =  (float) ((note1 + note2 + note3 + note4) / 4.0);

        if(moyenne >= 12){
            System.out.println("Réussite");
        }
        else{
            System.out.println("Échec");
        }
    }
}

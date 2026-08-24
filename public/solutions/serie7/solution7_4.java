

public class solution7_4 {
    public static void main(String[] args) {
        byte note = Byte.parseByte(args[0]);

        if(note >= 16){
            System.out.println("Excellent");
        }
        else if(note >= 14){
            System.out.println("Bien");
        }
        else if(note >= 12){
            System.out.println("Passable");
        }
        else{
            System.out.println("Échec");
        }
    }
}

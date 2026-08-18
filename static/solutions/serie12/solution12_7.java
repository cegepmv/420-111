import java.util.Scanner;
public class solution12_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doLoop = true;
        while (doLoop) {
            System.out.println("1. Dire bonjour");
            System.out.println("2. Dire au revoir");
            System.out.println("3. Quitter");

            
            switch (sc.nextLine().trim()) {
                case "1":
                    System.out.println("Bonjour");
                    break;
                case "2":
                    System.out.println("Au revoir");
                    break;
                case "3":
                    doLoop = false;
                    break;
            
                default:
                    System.out.println("Entrée invalide");
                    break;
            }
            if (doLoop) {
                sc.nextLine();
            }
            
        }
    }
}

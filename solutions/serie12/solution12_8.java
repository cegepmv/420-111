import java.util.Scanner;
public class solution12_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doLoop = true;
        int entier1 = 0;
        int entier2 = 0;
        while (true) {
            

            System.out.println("+ Addition ");
            System.out.println("- Soustraction");
            System.out.println("x Mutiplication");
            System.out.println("/ Division");
            System.out.println("q Quitter");

            
            String operateur = sc.nextLine().trim();

            if (!(operateur.equals("+") || operateur.equals("-") || operateur.equals("x") || operateur.equals("/"))) {
                if (operateur.equals("q")) {
                    break;
                } else {
                    System.out.println("Erreur");
                    sc.nextLine();
                    continue;
                }
            }
            
            while (doLoop) {
                System.out.print("Entrez 2 nombres : ");
                if (!sc.hasNextInt()) {
                    sc.nextLine();
                    continue;
                }

                entier1 = sc.nextInt();

                if (!sc.hasNextInt()) {
                    sc.nextLine();
                    continue;
                }

                entier2 = sc.nextInt();
                break;
            }

            
            System.out.print(entier1 + " " + operateur + " " + entier2);
        
            switch (operateur) {
                case "+":
                    System.out.println(" = " + (entier1 + entier2));
                    break;
                case "-":
                    System.out.println(" = " + (entier1 - entier2));
                    
                    break;
                case "x":
                    System.out.println(" = " + (entier1 * entier2));
                    
                    break;
                case "/":
                    if (entier2 != 0) {

                        System.out.println(" = " + (entier1 / entier2));
                    } else {
                        System.out.println(" Division par 0 impossible");
                    }
                    
                    break;

            
                default:
                    break;
            }
            sc.nextLine();
            
            
        }
    }
}

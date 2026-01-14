public class Calculatrice {
    public static void main(String[] args) {
      double nombre1 = Double.valueOf(args[0]);
      String operateur = args[1];
      double nombre2 = Double.valueOf(args[2]);
      

      switch (operateur) {
         case "+":
            System.out.println("Résultat : " + (nombre1 + nombre2));
            break;
            
         case "-":
            System.out.println("Résultat : " + (nombre1 - nombre2));
            break;

         case "x":
            System.out.println("Résultat : " + (nombre1 * nombre2));
            break;

         case "/":
            if(nombre2 == 0) {
               System.out.println("Il est impossible de diviser par 0");
            } else {
               System.out.println("Résultat : " + (nombre1 / nombre2));
            }
            break;
            
         default:
            System.out.println("Opérateur invalide");
            break;
      }
   }
}

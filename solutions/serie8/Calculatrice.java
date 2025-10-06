/*
## 🧮 **Exercice 2 — Calculatrice simple** (  /4)

**Concepts** : `switch`, opérateurs arithmétiques, conversion, arguments.

### Énoncé

Crée un programme `Calculatrice.java` qui :

1. Reçoit **trois arguments** :

   * le premier nombre
   * un opérateur (`+`, `-`, `*`, `/`)
   * le deuxième nombre
2. Utilise un **switch** pour effectuer l’opération.
3. Affiche le résultat.
4. Gère la division par zéro avec un message d’erreur. (Car il n'est pas possible de divier par 0)

### Exemple

```
> java Calculatrice 8 * 3
Résultat : 24
```

---
 */
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

         case "*":
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

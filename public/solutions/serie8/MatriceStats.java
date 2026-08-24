/*
## 🔢 **Exercice 3 — Statistiques sur un tableau 2D**(  /5)

**Concepts** : `tableau`, `matrice`, `if-else`, opérateurs logiques/comparaison.

### Énoncé

Écris un programme `MatriceStats.java` qui :

1. Déclare une **matrice d’entiers** 2x2 contenant les valeurs suivantes :
    3  7
    0 -2
2. Calcule et affiche la somme totale des éléments
   
3. Si la somme est **paire**, affiche `"Somme paire"`, sinon `"Somme impaire"`.
4. Si **tous les éléments sont positifs**, affiche `"Tous positifs"`, sinon `"Il y a des valeurs négatives"`.
5. Affiche le maximum sans hardcoder (Difficile)(2 pts)

*Vous pouvez assumer que vous aurez toujours une 2x2


### Exemple

```java
int[][] mat = {
  {3, 7},
  {0, -2},
  
};

Sortie attendue :

```
Somme : 8
Somme pair
Il y a des valeurs négatives
Max : 7
```

```
 */
public class MatriceStats {
  public static void main(String[] args) {
    int[][] mat = {
        {3, 7},
        {0, -2}
    };

    int somme = mat[0][0] + mat[0][1] + mat[1][0] + mat[1][1];
    System.out.println("Somme : " + somme);

    if (somme % 2 == 0) {
      System.out.println("Somme pair");
    } else {
      System.out.println("Somme impair");
    }

    if (mat[0][0] < 0 || mat[0][1] < 0 || mat[1][0] < 0 || mat[1][1] < 0) {
      System.out.println("Il y a des valeurs négatives");
    } else {
      System.out.println("Il n'y a pas de valeurs négatives");
    }

    int max = mat[0][0];

    if(mat[0][0] > max) {
      max = mat[0][0];
    }
    if(mat[0][1] > max) {
      max = mat[0][1];
    }
    if(mat[1][0] > max) {
      max = mat[1][0];
    }
    if(mat[1][1] > max) {
      max = mat[1][1];
    }

    System.out.println("Max : " + max);
  }
}

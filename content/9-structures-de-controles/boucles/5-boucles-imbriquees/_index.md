+++
date = '2025-09-19T12:03:31-04:00'
weight = 5
title = 'Boucles Imbriquees'
+++


---

## 🔁🔁 Les boucles **imbriquées** en Java

Une **boucle imbriquée** (ou **boucle dans une boucle**) permet de **répéter un ensemble d’instructions à l’intérieur d’une autre boucle**. C’est très utile pour travailler avec des **tableaux à plusieurs dimensions**, **afficher des grilles**, ou **répéter des structures complexes**.

---

## 🧱 Structure d’une boucle imbriquée

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        // Instructions exécutées à chaque combinaison de i et j
    }
}
```

💡 Ici, pour **chaque valeur de `i`**, la boucle `j` **s’exécute complètement**.

---

## 🔂 Exemple : afficher une grille

```java
for (int ligne = 0; ligne < 3; ligne++) {
    for (int col = 0; col < 5; col++) {
        System.out.print("* ");
    }
    System.out.println(); // retour à la ligne
}
```

🔎 Résultat :

```
* * * * *  
* * * * *  
* * * * *  
```

---

## 💡 Comment ça marche ?

| `ligne` | `col` | Affichage   |
| ------- | ----- | ----------- |
| 0       | 0→4   | `* * * * *` |
| 1       | 0→4   | `* * * * *` |
| 2       | 0→4   | `* * * * *` |

👉 La **boucle intérieure** se termine **à chaque tour** de la boucle extérieure.

---

## 🎯 Quand utiliser des boucles imbriquées ?

Utilise-les pour :

* Parcourir des **tableaux à deux dimensions**
* Créer des **formes**, **grilles** ou **tableaux**
* Effectuer des **comparaisons multiples** ou des **comptages croisés**

---

## 🔁 Exemple : tableau à 2 dimensions

```java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
    }
    System.out.println();
}
```

🔎 Affiche :

```
1 2 3  
4 5 6
```

---

## ⚠️ Attention

* Les boucles imbriquées **peuvent être coûteuses** en performance si trop profondes (ex : triple ou quadruple boucle).
* Toujours bien **nommer tes variables** (`i`, `j`, `k`, etc.) pour garder ton code lisible.
* Ne pas oublier les **retours à la ligne** (`System.out.println()`) si tu fais de l'affichage.

---

## 🧠 À retenir

* Une **boucle imbriquée** est une boucle **dans une autre boucle**.
* La boucle **intérieure s'exécute entièrement à chaque tour de la boucle extérieure**.
* Très utile pour les **grilles**, **matrices**, et **structures répétitives**.

---


### 🔹 **Exercice 1 : Grille de `*` avec deux `for`**

Utilise **deux boucles `for` imbriquées** pour afficher une grille de 4 lignes et 6 colonnes remplie de `*`.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Boucle extérieure : lignes
        for (int i = 0; i < 4; i++) {
            // Boucle intérieure : colonnes
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Retour à la ligne
        }
    }
}
```

### Sortie attendue

```
* * * * * *  
* * * * * *  
* * * * * *  
* * * * * *  
```

---

### 🔹 **Exercice 2 : Afficher une matrice de nombres**

Crée une **matrice 2D d'entiers** et affiche son contenu ligne par ligne avec deux boucles imbriquées.

```java
public class Exo2 {
    public static void main(String[] args) {
        int[][] matrice = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        // Parcours de la matrice
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Sortie attendue

```
10 20  
30 40  
50 60
```

---

### 🔹 **Exercice 3 : Triangle d’étoiles croissant**

Utilise des boucles imbriquées pour afficher un **triangle d’étoiles**. La première ligne contient 1 étoile, la deuxième 2, etc.

```java
public class Exo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

### Sortie attendue

```
*  
**  
***  
****  
*****
```

---

### 🧩 **Défi visuel : Dessiner un damier `#` et `.`**

Affiche un **damier de 6 lignes par 6 colonnes**, avec des `#` et `.` en alternance (comme un échiquier).

```java
public class DefiDamier {
    public static void main(String[] args) {
        for (int ligne = 0; ligne < 6; ligne++) {
            for (int col = 0; col < 6; col++) {
                if ((ligne + col) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println(); // Retour à la ligne
        }
    }
}
```

### Sortie attendue

```
# . # . # .  
. # . # . #  
# . # . # .  
. # . # . #  
# . # . # .  
. # . # . #  
```

---

## 🎯 Objectif

* Utiliser **deux boucles imbriquées**
* Alterner les symboles selon la **position dans la grille**
* S'appuyer sur l'expression `(ligne + col) % 2` pour alterner


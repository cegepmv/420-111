+++
date = '2025-09-19T10:11:03-04:00'
title = 'Tableaux 2D'
+++


---

## 🧮 Les tableaux 2D en Java

Un **tableau 2D** permet de stocker des **valeurs dans un tableau de tableaux** — comme un **tableau à double entrée**, ou **matrice**.

C’est très utile pour représenter des **grilles**, **tableaux de données**, **plateaux de jeu**, etc.

---

## 🏗️ Déclaration et création

### ✏️ Déclarer un tableau 2D

```java
int[][] matrice;
```

### 🛠️ Créer un tableau 2D

```java
matrice = new int[3][4];  // 3 lignes, 4 colonnes
```

Ou tout en une ligne :

```java
int[][] matrice = new int[3][4];
```

💡 Tous les éléments sont initialisés à 0 (ou à la valeur par défaut du type).

---

## 🧊 Accès aux éléments

On accède à un élément avec **2 indices** : `[ligne][colonne]`

```java
matrice[0][2] = 7;                   // Affecte 7 à la ligne 0, colonne 2
System.out.println(matrice[0][2]);  // Affiche 7
```

❌ Hors limites ? → `ArrayIndexOutOfBoundsException`

---

## 🪞 Initialisation rapide

On peut remplir un tableau 2D directement :

```java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

---

## 📏 Taille d’un tableau 2D

| Expression          | Signification                    |
| ------------------- | -------------------------------- |
| `matrice.length`    | Nombre de **lignes**             |
| `matrice[0].length` | Nombre de **colonnes** (ligne 0) |

⚠️ Les tableaux 2D peuvent être **irréguliers** (pas le même nombre de colonnes partout).

---

## 🧪 Exemples simples

```java
int[][] grille = new int[2][3];

grille[0][0] = 1;
grille[1][2] = 9;

System.out.println(grille[1][2]);   // 9
System.out.println(grille.length); // 2 lignes
System.out.println(grille[0].length); // 3 colonnes
```

---

## 🔥 À retenir

* Un tableau 2D est un **tableau de tableaux**.
* On accède à une case avec **\[ligne]\[colonne]**.
* `.length` fonctionne à chaque niveau (`matrice.length`, `matrice[i].length`).
* Attention aux **indices hors limites** et aux **lignes irrégulières**.

---

---

### 🔹 **Exercice 1 : Matrice de `int`**

Crée un tableau 2D `matrice` de 2 lignes et 3 colonnes, et affecte les valeurs suivantes :

```
1  2  3  
4  5  6
```

Puis affiche l'élément qui contient un 5.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Déclaration et création
        
        // Affectation manuelle
        

        // Affichage d’un élément
       
    }
}
```

### Sortie attendue

```
Élément : 5
```

---

### 🔹 **Exercice 2 : Grille de `String`**

Initialise directement un tableau 2D `mots` avec les valeurs suivantes :

```
"Bonjour"  "le"  
"monde"    "!"
```

Puis affiche le mot **"monde"** à l’aide de ses indices.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Initialisation rapide
        

        // Affichage du mot "monde"
        
    }
}
```

### Sortie attendue

```
Mot : monde
```

---

### 🔹 **Exercice 3 : Tableau 2D de `boolean` et `.length`**

Un tableau `cases` indique si certaines cases d’un jeu sont accessibles (`true`) ou bloquées (`false`).
Initialise le tableau suivant :

```java
{
  {true, false, true},
  {true, true, false}
}
```

Puis affiche :

* Le **nombre de lignes**
* Le **nombre de colonnes** de la première ligne
* L’état de la dernière case de la premier ligne

```java
public class Exo3 {
    public static void main(String[] args) {
        // Initialisation du tableau
        

        // Affichage des informations
       
    }
}
```

### Sortie attendue

```
Lignes : 2  
Colonnes : 3  
Dernière case de la première ligne accessible ? true
```

---



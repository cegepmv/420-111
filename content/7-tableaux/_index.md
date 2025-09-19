+++
title = "Tableaux"
type = "chapter"
weight = 7
+++


---

## 📦 Les tableaux 1D en Java

Un **tableau (array)** permet de **stocker plusieurs valeurs** dans une **même variable**, toutes du **même type** (int, double, etc.).

Les **tableaux à une dimension (1D)** sont comme une **liste ordonnée** de valeurs, accessibles grâce à leur **indice**.

---

## 🏗️ Déclaration et création

### ✏️ Déclarer un tableau

```java
int[] notes;     // déclaration
```

### 🛠️ Créer un tableau

```java
notes = new int[5];  // tableau de 5 entiers (tous à 0)
```

Ou, préférablement, tout en une ligne :

```java
int[] notes = new int[5];
```

💡 Tous les éléments sont **automatiquement initialisés** :

| Type      | Valeur par défaut |
| --------- | ----------------- |
| `int`     | `0`               |
| `double`  | `0.0`             |
| `boolean` | `false`           |
| `String`  | `null`            |

---

## 🧊 Accès aux éléments

Un tableau utilise **des indices** qui commencent à **0** !

```java
notes[0] = 17;           // affecte 17 au premier élément
System.out.println(notes[0]);  // affiche 17
```

💥 Accéder à un **indice hors-limites** provoque une **erreur** :

```java
notes[5] = 20; // ❌ Erreur : IndexOutOfBoundsException
```

---

## 🪞 Initialisation rapide

On peut directement donner des valeurs au moment de la création :

```java
int[] jours = {31, 28, 31, 30, 31, 30};
```

---

## 📏 La propriété `.length`

Chaque tableau possède une propriété spéciale :

```java
int taille = notes.length;  // ici : 5
```

❗ Ce n’est **pas une méthode** (pas de parenthèses !)

---

## 🧪 Exemples simples

```java
int[] valeurs = {10, 20, 30};
System.out.println(valeurs[1]);   // 20
System.out.println(valeurs.length); // 3

valeurs[2] = 40;
System.out.println(valeurs[2]);   // 40
```

---

## 🧠 À retenir

* Un tableau **stocke plusieurs valeurs** du même type.
* Les **indices commencent à 0**.
* `.length` donne le **nombre d’éléments** du tableau.
* Ne jamais dépasser les **bornes** du tableau !

---

Très bien ! Voici une nouvelle version des **3 exercices** sur les **tableaux 1D en Java**, cette fois avec **différents types de données** (`int`, `double`, `String`, `boolean`) comme dans la matière vue.

---

### 🔹 **Exercice 1 : Tableaux de `double`**

Crée un tableau `temperatures` qui contient 4 températures mesurées : 22.5, 19.8, 21.0, 23.3
Puis affiche la première et la dernière température.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Création avec initialisation directe
        

        // Affichage
 
    }
}
```
### Sortie attendue

```
Première : 22.5
Dernière : 23.3
```
---

### 🔹 **Exercice 2 : Tableaux de `String`**

Déclare un tableau `jours` de 7 chaînes (`String`) pour stocker les jours de la semaine.
Affecte les valeurs manuellement, puis affiche l'avant dernier jour : (`samedi`).

```java
public class Exo2 {
    public static void main(String[] args) {
        // Déclaration et initialisation

        // Affectation manuelle
 

        // Affichage du jour du week-end
       
    }
}
```
### Sortie attendue

```
Avant dernier jours : samedi
```

---

### 🔹 **Exercice 3 : Tableau de `boolean` et `.length`**

Un tableau `reponses` contient les réponses à un QCM (true si bonne réponse, false sinon).

1. Initialise un tableau de 3 réponses : `true, false, true`
2. Affiche le nombre total de réponses et la 2e réponse.

```java
public class Exo3 {
    public static void main(String[] args) {
        boolean[] reponses = _______________________________________;

        System.out.println("Nombre de réponses : " + ___________________);
        System.out.println("Deuxième réponse : " + ______________________);
    }
}
```

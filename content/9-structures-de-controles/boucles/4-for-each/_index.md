+++
date = '2025-09-19T12:03:12-04:00'
weight = 4
title = 'For Each'
+++


---

## 🔁 La boucle `for-each` en Java

La boucle **`for-each`** (ou **boucle améliorée `for`**) permet de **parcourir facilement les éléments d’un tableau ou d’une collection**, **sans se soucier des indices**.

Elle est plus **lisible** et **plus sûre** que la boucle `for` classique quand tu n’as pas besoin de manipuler les indices manuellement.

---

## 🧱 Structure d’une boucle `for-each`

```java
for (Type element : collection) {
    // instructions à exécuter pour chaque élément
}
```

| Élément      | Rôle                                                  |
| ------------ | ----------------------------------------------------- |
| `Type`       | Le type des éléments (ex : `int`, `String`)           |
| `element`    | Une variable temporaire pour chaque valeur            |
| `collection` | Un tableau (`array`) ou une collection (`List`, etc.) |

---

## 🔂 Exemple simple avec un tableau

```java
int[] notes = {12, 15, 8, 17};

for (int note : notes) {
    System.out.println("Note : " + note);
}
```

🔎 Ce code affiche :

```
Note : 12  
Note : 15  
Note : 8  
Note : 17
```

💡 À chaque tour, la variable `note` prend la **valeur d’un élément du tableau**, dans l’ordre.

---

## 🧑‍🏫 Exemple avec des chaînes de caractères

```java
String[] prenoms = {"Alice", "Bob", "Claire"};

for (String nom : prenoms) {
    System.out.println("Bonjour " + nom + " !");
}
```

---

## 🎯 Quand utiliser `for-each` ?

Utilise `for-each` quand :

* Tu veux **parcourir tous les éléments d’un tableau ou d’une liste**
* Tu **n’as pas besoin de connaître l’indice** actuel
* Tu veux du code **plus clair** et **moins sujet aux erreurs**

---

## ⚠️ Limitations

* Tu **ne peux pas modifier les éléments d’un tableau** directement avec `for-each`.
* Tu **n’as pas accès à l’indice** (`i`) de l’élément courant.
* Pas adapté si tu as besoin de **parcourir partiellement** une structure ou de **sauter des éléments**.

---

## 🔁 Comparaison avec la boucle `for` classique

```java
// Boucle for classique
for (int i = 0; i < notes.length; i++) {
    System.out.println(notes[i]);
}

// Boucle for-each
for (int note : notes) {
    System.out.println(note);
}
```

✅ Même résultat, mais **code plus lisible avec for-each** (s’il n’y a pas besoin de `i`).

---

## 🧠 À retenir

* La boucle `for-each` est **idéale pour lire** les éléments d’un tableau ou d’une collection.
* Elle est **plus concise et plus sûre** qu’une boucle `for` classique.
* À éviter si tu as besoin de **l’indice** ou de **modifier** les éléments.

---


### 🔹 **Exercice 1 : Afficher les éléments d’un tableau**

Déclare un tableau `fruits` contenant les éléments suivants :
`"Pomme"`, `"Banane"`, `"Cerise"`, `"Date"`.

Utilise une boucle `for-each` pour afficher chaque fruit.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        
        // Parcours avec for-each et affichage
        
    }
}
```

### Sortie attendue

```
Pomme  
Banane  
Cerise  
Date
```

---

### 🔹 **Exercice 2 : Somme des valeurs d’un tableau**

Déclare un tableau `nombres` avec les valeurs :
`5, 8, 12, 20`.

Calcule la somme des éléments en utilisant une boucle `for-each` puis affiche le résultat.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Initialisation du tableau
        
        // Calcul de la somme avec for-each
        
        // Affichage de la somme
        
    }
}
```

### Sortie attendue

```
Somme : 45
```

---

### 🔹 **Exercice 3 : Compter les mots**

Déclare un tableau `mots` contenant :
`"chat"`, `"chien"`, `"oiseau"`, `"poisson"`, `"chat"`.

Utilise une boucle `for-each` pour compter le nombre de fois que le mot `"chat"` apparaît, puis affiche ce nombre.

```java
public class Exo3 {
    public static void main(String[] args) {
        // Initialisation du tableau
        
        // Compteur et boucle for-each pour compter "chat"
        
        // Affichage du résultat
        
    }
}
```

### Sortie attendue

```
Le mot "chat" apparaît 2 fois.
```

---

### 🔹 **Exercice 4 : Afficher un tableau**


Utilise une boucle `for-each` pour afficher le tableau suivant : {43,256,3,796,35,67}

```java
public class Exo3 {
    public static void main(String[] args) {
        // Compte à rebours
       
    }
}
```

### Sortie attendue

```
43
256
3
796
35
67
```

---

### 🔹 **Exercice 5 : Afficher un tableau sexy**


Utilise une boucle `for-each` pour afficher le tableau suivant : {43,256,3,796,35,67}

```java
public class Exo3 {
    public static void main(String[] args) {
        // Compte à rebours
       
    }
}
```

### Sortie attendue

```
[43,256,3,796,35,67]
```

---
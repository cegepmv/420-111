+++
date = '2025-09-01T18:18:28-04:00'
title = 'String'
weight = 3
+++


---

# Les chaînes de caractères

🍥 [Lien vers la classe String de l'API Java](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html)

---

## Les Strings c’est quoi?

En Java, une **chaîne de caractères** (ou *String*) est un objet qui représente une **séquence de caractères**.
Contrairement à certains langages où les chaînes sont simplement des tableaux de caractères (`char[]`), en Java, elles sont des **objets** de la classe `String`.

Exemple :

```java
String message = "Bonjour !";
```
---

## Utilisation simple

Créer une chaîne :

```java
String nom = "Alice";

//Afficher une chaîne :

System.out.println(nom);
```

Connaître la longueur :

```java
int longueur = nom.length(); // renvoie 5
```

---

## Concaténation

La **concaténation** permet de **combiner plusieurs chaînes** en une seule.

### Utilisation de l’opérateur `+` :

```java
String prenom = "Alice";
String message = "Bonjour, " + prenom + " !";
System.out.println(message); // Bonjour, Alice !
```

### Concaténation avec des nombres :

```java
int age = 20;
String info = "Elle a " + age + " ans.";
System.out.println(info); // Elle a 20 ans.
```

Voici un exercice adapté à ton cours sur les chaînes de caractères en Java :

---

### 🧠 **Exercice – Manipulation de chaînes de caractères**

#### 🎯 Objectif :

Utiliser les notions de création de chaînes, longueur, concaténation, et affichage en Java.

---

#### 📝 Consigne :

Écris un programme Java qui fait les étapes suivantes :

1. Crée deux variables `String` : une pour un prénom et une pour un nom de famille (par exemple : `"Alice"` et `"Durand"`).
2. Concatène ces deux chaînes pour former le **nom complet**, séparé par un espace.
3. Affiche le message :
   `"Bonjour, [nom complet] !"`,
   en utilisant la concaténation.
4. Affiche ensuite la **longueur du nom complet** (en incluant l’espace).
5. Affiche enfin cette phrase :
   `"Votre nom complet contient [X] caractères."`
   (où `X` est le nombre de caractères).

---

#### 🧪 Exemple attendu (si `prenom = "Alice"` et `nom = "Durand"`) :

```
Bonjour, Alice Durand !
Votre nom complet contient 12 caractères.
```

---

#### 🧩 Astuces :

* Utilise `+` pour concaténer.
* La méthode `.length()` fonctionne sur les objets de type `String`.

---


## 🔎 À quoi sert `String.format()` ?

`String.format()` permet de **formater des chaînes de caractères de façon précise**, en insérant des variables dans un modèle (*template*) à l’aide de **spécificateurs** (`%s`, `%d`, `%f`, etc.).

C’est très utile pour :

* éviter les concaténations multiples avec `+`
* générer du texte **proprement aligné**
* **formater des nombres** (arrondis, alignements, unités)

---

## ✍️ Syntaxe de base

```java
String prenom = "Mathieu";
int points = 42;

String message = String.format("Joueur : %s | Score : %d", prenom, points);
System.out.println(message);
// Affiche : Joueur : Mathieu | Score : 42
```

---

## 📚 Spécificateurs de format les plus utilisés

| Spécificateur | Signification        | Exemple                 |
| ------------- | -------------------- | ----------------------- |
| `%s`          | Chaîne de caractères | `"Nom : %s"`            |
| `%d`          | Entier décimal       | `"Score : %d"`          |
| `%f`          | Nombre décimal       | `"Poids : %.2f kg"`     |
| `%%`          | Pourcentage littéral | `"Progression : 100%%"` |

---

## 🔧 Formatage avancé

### 📌 Arrondir un `double` à 2 décimales

```java
double note = 15.6789;
String resultat = String.format("Note finale : %.2f / 20", note);
System.out.println(resultat); // Note finale : 15.68 / 20
```

---

### 📌 Aligner proprement des colonnes (facture ou tableau)

```java
String ligne = String.format("%-12s %5d %10.2f", "Stylo", 10, 2.5);
System.out.println(ligne);
// Stylo          10       2.50
```

> 🧩 Explications :

* `%-12s` : chaîne alignée à gauche sur 12 caractères
* `%5d` : entier aligné à droite sur 5 caractères
* `%10.2f` : nombre flottant avec 2 décimales sur 10 caractères (à droite)

---

## 🧠 **Exercice – Formatage de profil utilisateur**

### 🎯 Objectif :

Utiliser `String.format()` pour construire une sortie propre et lisible à partir de plusieurs données.

---

### 📝 Consignes :

Crée les variables suivantes :

```java
String nom = "Julie";
String ville = "Toulouse";
int age = 27;
double taille = 1.72;
```

Affiche ce message formaté :

```
Nom    : Julie
Ville  : Toulouse
Âge    : 27 ans
Taille : 1.72 m
```

> Utilise **`String.format()`** pour aligner les libellés (colonne de gauche) et les valeurs.

---

### 🧩 Astuces :

* `%s` pour les chaînes
* `%d` pour les entiers
* `%.2f` pour un `double` avec deux décimales
* `%-7s` pour aligner les libellés proprement à gauche

---



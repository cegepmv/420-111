+++
date = '2025-09-19T11:20:56-04:00'
weight = 2
title = 'Ternaire'
+++


---

## ❓ L’opérateur ternaire en Java

L’opérateur **ternaire** est une **forme abrégée du `if...else`**, qui permet d’**écrire des conditions simples en une seule ligne**.

Il est souvent utilisé pour **rendre le code plus concis**, surtout lorsqu’on veut **affecter une valeur selon une condition**.

---

## 🧰 Syntaxe de base

```java
(condition) ? valeurSiVrai : valeurSiFaux;
```

C’est comme dire :
**"Si la condition est vraie, retourne ceci ; sinon, retourne cela."**

---

## 📦 Exemple simple

```java
int âge = 20;
String statut = (âge >= 18) ? "Majeur" : "Mineur";

System.out.println(statut);  // Affiche : Majeur
```

✳️ C’est équivalent à :

```java
String statut;
if (âge >= 18) {
    statut = "Majeur";
} else {
    statut = "Mineur";
}
```

---

## ⚙️ Utilisation typique

L’opérateur ternaire est **très utilisé pour affecter une valeur** selon une condition :

```java
double note = 85;
String résultat = (note >= 60) ? "Réussi" : "Échoué";
```

On peut aussi l’utiliser directement dans un `System.out.println()` :

```java
System.out.println((note >= 90) ? "Excellent" : "À améliorer");
```

---

## 🛑 À éviter pour les cas complexes

Même si l'opérateur ternaire est pratique, il **devient illisible si la condition ou les valeurs sont longues** :

```java
// Trop compliqué !
String grade = (score >= 90) ? "A" : (score >= 75) ? "B" : "C";
// 🤯 Difficile à lire et à maintenir
```

➡️ Dans ces cas-là, préfère une structure `if...else` classique.

---

## 🔥 À retenir

* L’opérateur ternaire est une **forme courte de `if...else`**.
* Il s’écrit : `(condition) ? valeurSiVrai : valeurSiFaux;`
* Très utile pour **initialiser une variable** selon une condition.
* À **éviter** si la logique devient trop complexe ou trop imbriquée.
* Rends le code **plus compact**, mais pas toujours plus clair.

---


### 🔹 **Exercice 1 : Adulte ou non**

Crée une variable `int age` et utilise l’opérateur ternaire pour initialiser une variable `String statut` :

* `"Majeur"` si l’âge est supérieur ou égal à 18
* `"Mineur"` sinon

Puis affiche la variable `statut`.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Déclaration de l’âge
        

        // Utilisation du ternaire pour déterminer le statut
        

        // Affichage
       
    }
}
```

### Sortie attendue (si `age = 15`)

```
Mineur
```

---

### 🔹 **Exercice 2 : Résultat de l’élève**

Crée une variable `int note`, et utilise un opérateur ternaire pour afficher :

* `"Réussi"` si la note est supérieure ou égale à 60
* `"Échoué"` sinon

**Astuce** : Tu peux afficher directement dans le `System.out.println()`.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Déclaration de la note
        

        // Affichage immédiat avec ternaire
       
    }
}
```

### Sortie attendue (si `note = 72`)

```
Réussi
```

---

### 🔹 **Exercice 3 : Nombre pair ou impair**

Crée une variable `int nombre`, puis utilise un ternaire pour afficher :

* `"Pair"` si le nombre est divisible par 2
* `"Impair"` sinon

```java
public class Exo3 {
    public static void main(String[] args) {
        // Déclaration du nombre
        

        // Affichage avec ternaire
       
    }
}
```

### Sortie attendue (si `nombre = 7`)

```
Impair
```

---


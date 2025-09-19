+++
date = '2025-09-19T11:13:13-04:00'
weight = 1
title = 'If Else'
+++

## 🧩 Les conditions `if`, `else if` et `else` en Java

Les structures conditionnelles permettent de **prendre des décisions dans le programme** : on peut **exécuter certains blocs de code uniquement si une condition est vraie**.

C’est fondamental pour écrire des programmes intelligents, interactifs et dynamiques !

---

## ❓ La structure `if`

La condition `if` permet de **tester si l'expression qui est entre parenthèse est vraie (`true`)**. Si c’est le cas, **le bloc de code associé est exécuté**.

```java
if (âge >= 18) {
    System.out.println("Majeur");
}
```

📌 Si la condition est **fausse (`false`)**, le code dans les `{}` est **ignoré**.

---

## 🔀 Ajouter une alternative : `else`

On peut ajouter un `else` pour **exécuter un autre bloc si la condition est fausse**.

```java
if (note >= 60) {
    System.out.println("Réussi");
} else {
    System.out.println("Échoué");
}
```

---

## 🔁 Plusieurs cas : `else if`

Quand on veut **tester plusieurs conditions différentes**, on utilise `else if`.

```java
if (note >= 90) {
    System.out.println("Excellent");
} else if (note >= 75) {
    System.out.println("Très bien");
} else if (note >= 60) {
    System.out.println("Passable");
} else {
    System.out.println("Échec");
}
```

💡 Le programme s’arrête dès qu’une condition est vraie. Les blocs suivants ne sont **pas évalués**.

---

## ⚠️ Syntaxe à respecter

```java
if (condition) {
    // Bloc 1
} else if (autreCondition) {
    // Bloc 2
} else {
    // Bloc 3
}
```

### ✅ Toujours :

* Des **parenthèses** autour de la condition.
* Des **accolades `{}`** autour du bloc de code (même si une seule ligne, c’est plus clair et plus sûr !).

---

## 🧠 Exemples simples

```java
int age = 17;

if (age >= 18) {
    System.out.println("Adulte");
} else {
    System.out.println("Mineur");
}
```

```java
int score = 82;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("Échec");
}
```

---

## 🔥 À retenir

* `if` teste une condition : si elle est **vraie**, le bloc est exécuté.
* `else` permet d’exécuter un bloc si la condition est **fausse**.
* `else if` permet d’enchaîner plusieurs **cas différents**.
* Une seule **branche est exécutée**, même si plusieurs conditions sont vraies.
* N’oublie pas les **accolades `{}`** et les **parenthèses `()`** !

---

### 🔹 **Exercice 1 : Majeur ou mineur**

Crée une variable `age`, puis affiche `"Majeur"` si la personne a **18 ans ou plus**, sinon affiche `"Mineur"`.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Déclaration de l’âge
        

        // Vérification de la majorité
       
    }
}
```

### Sortie attendue (si `age = 17`)

```
Mineur
```

---

### 🔹 **Exercice 2 : Résultat d’un examen**

Crée une variable `note`, puis affiche :

* `"Excellent"` si la note ≥ 90
* `"Très bien"` si la note ≥ 75
* `"Passable"` si la note ≥ 60
* `"Échec"` sinon

```java
public class Exo2 {
    public static void main(String[] args) {
        // Déclaration de la note
        

        // Conditions selon la note
       
    }
}
```

### Sortie attendue (si `note = 78`)

```
Très bien
```

---

### 🔹 **Exercice 3 : Type de personnage**

Crée une variable `niveau`, puis affiche :

* `"Débutant"` si le niveau < 10
* `"Intermédiaire"` si le niveau est entre 10 et 19
* `"Avancé"` si le niveau est entre 20 et 29
* `"Maître"` à partir de 30

```java
public class Exo3 {
    public static void main(String[] args) {
        // Déclaration du niveau
        

        // Classification du personnage
       
    }
}
```

### Sortie attendue (si `niveau = 25`)

```
Avancé
```

---


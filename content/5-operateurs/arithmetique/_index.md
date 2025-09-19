+++
date = '2025-09-03T14:50:02-04:00'
title = " 🧮 Les opérateurs arithmétiques en Java"
linkTitle = "Arithmétique"
weight = 1
+++


---



Les **opérateurs arithmétiques** permettent d’effectuer des **calculs mathématiques** de base sur des **valeurs numériques** (`int`, `double`, etc.).

Ils sont très souvent utilisés pour manipuler les **nombres entiers ou à virgule**, que ce soit pour additionner des scores, calculer des moyennes, ajuster des quantités, etc.

---

## ✋ Les opérateurs de base

Voici les **5 opérateurs arithmétiques principaux** :

| Opérateur | Nom            | Exemple | Résultat (si `a = 10`, `b = 3`) |
| --------- | -------------- | ------- | ------------------------------- |
| `+`       | Addition       | `a + b` | `13`                            |
| `-`       | Soustraction   | `a - b` | `7`                             |
| `*`       | Multiplication | `a * b` | `30`                            |
| `/`       | Division       | `a / b` | `3` (**entier !**)              |
| `%`       | Modulo         | `a % b` | `1` (reste de la division)      |

💡 En Java :

* Si les deux opérandes sont des **entiers**, la division (`/`) **retourne un entier**.
* Pour avoir un résultat **décimal**, **au moins un des deux nombres doit être un `float` ou un `double`**.

```java
int a = 10;
int b = 3;
System.out.println(a / b); // 3

double x = 10;
double y = 3;
System.out.println(x / y); // 3.333333...
```

---

## ⛏️ Modulo : C’est quoi ce truc `%` ?

L’opérateur **modulo** `%` donne le **reste** d’une division.

```java
int reste = 15 % 8; // 7
```

Très utile pour :

* Vérifier si un nombre est **pair** ou **impair** : `n % 2 == 0`
* Créer des cycles (`i % 5` retourne un nombre de 0 à 4)


---

## 🔄 Raccourcis utiles

Tu peux combiner une opération avec une **affectation** grâce à ces raccourcis :

| Opération normale | Version raccourcie |
| ----------------- | ------------------ |
| `x = x + 1;`      | `x += 1;`          |
| `x = x - 5;`      | `x -= 5;`          |
| `x = x * 3;`      | `x *= 3;`          |
| `x = x / 2;`      | `x /= 2;`          |
| `x = x % 4;`      | `x %= 4;`          |

💡 Ces raccourcis rendent le code plus compact et plus clair.

---

## 🔁 Incrémentation et décrémentation

Java propose aussi deux **opérateurs spéciaux** pour **ajouter ou soustraire 1** :

| Opérateur | Nom            | Exemple        | Effet             |
| --------- | -------------- | -------------- | ----------------- |
| `++`      | Incrémentation | `x++` ou `++x` | Ajoute 1 à `x`    |
| `--`      | Décrémentation | `x--` ou `--x` | Soustrait 1 à `x` |

⚠️ La différence entre `x++` et `++x` est subtile et ne compte qu’en contexte d’expression :

```java
int x = 5;
int y = x++; // y = 5, x devient 6

int a = 5;
int b = ++a; // a devient 6, b = 6
```

---

## 🧪 Exemples simples

```java
int a = 8;
int b = 5;

int somme = a + b;      // 13
int produit = a * b;    // 40
int quotient = a / b;   // 1 (car division entière)
int reste = a % b;      // 3
```

---

## 🔥 À retenir

* `/` fait une **division entière** si les deux opérandes sont entiers.
* `%` donne le **reste** de la division.
* Les raccourcis `+=`, `-=`, etc., simplifient l’écriture du code.
* Pour des calculs précis avec des **nombres décimaux**, utilise `double` ou `float`.

---

### 🔢 **Exercice – Calculette Java**

#### 🎯 Objectif :

S'entraîner à utiliser les opérateurs arithmétiques, le modulo, les raccourcis et l'incrémentation.

---

### 📝 Consignes :

Écris un programme Java qui fait les étapes suivantes :

---

### 🧩 Partie 1 : Opérations de base

1. Crée deux entiers `a = 17` et `b = 4`.
2. Calcule et affiche :

   * La **somme**
   * La **différence**
   * Le **produit**
   * Le **quotient entier**
   * Le **reste (modulo)**

---

### 🧩 Partie 2 : Utilisation des raccourcis

1. Déclare une variable `x = 10`.
2. Applique successivement :

   * `x += 5;`
   * `x *= 2;`
   * `x %= 7;`
3. Affiche `x` après chaque étape.

---

### 🧩 Partie 3 : Incrémentation et décrémentation

1. Crée une variable `int n = 5;`
2. Applique et affiche les résultats :

   * `int a = n++;`
   * `int b = ++n;`
   * Affiche les valeurs de `a`, `b` et `n`.

---

### 🧪 Exemple de sortie attendue (abrégée) :

```
Somme : 21
Différence : 13
Produit : 68
Quotient entier : 4
Reste : 1

x après += 5 : 15
x après *= 2 : 30
x après %= 7 : 2

a = 5
b = 7
n = 7
```

---

+++
date = '2025-08-20T19:02:39-04:00'
title = 'Série 4'
weight = 4
+++

# 🟡 NIVEAU 4 — LES OPÉRATEURS EN ACTION

### 📜 Histoire

*Additions, multiplications, restes de division... les opérateurs sont tes outils de calcul. Maîtrise-les pour résoudre des problèmes numériques!*

💎 Points : ⭐⭐ Difficulté : intermédiaire

---

# 🔢 **Exercices – Opérateurs en Java**

### 🧪 **Exercice 1 – Opérations simples**

Déclare deux entiers `a = 12` et `b = 5`.
Affiche :

* La somme
* La différence entre `a` et `b`
* Le produit
* Le quotient entier de la division de `b` par `a`
* Le reste de la division de `a` par `b`

### Sortie attendue

```
La somme de 12 et 5 est  : 17
La différence entre 12 et 5 : 7
Le produit de 12 et 5 est  : 60
Le quotient entier de la division de b par a est de  0
Le reste de la division de a par b est de  2
```

---

### 🧪 **Exercice 2 – Comparaisons simples**

Déclare :

```java
int x = 15;
int y = 10;
```

Détermine mentalement les résultats (booléens) des expressions suivantes :

* `x > y`
* `x == y`
* `x <= y`


---

### 🧪 **Exercice 3 – Longueur d’un mot et comparaison**

Déclare :

```java
String mot = "Bonjour";
```

Affiche :

* Le nombre de lettres dans le mot
* Si ce nombre est **supérieur ou égal à 5**
* Si ce nombre est **différent de 7**

### Sortie attendue

```
Le mot "Bonjour" contient 7 lettres
Le mot contient au moins 5 lettres : true
Le mot a un nombre de lettres différent de 7 : false
```
---

### 🧪 **Exercice 4 – Nombres pairs et impairs**

Déclare un entier `n = 9`.
Affiche :

* Si ce nombre est pair

### Sortie attendue

```
Le reste de 9 divisé par 2 est : 1
Le nombre 9 est pair : false
```

---

### 🧪 **Exercice 5 – Logique simple**

Déclare :

```java
int a = 8;
int b = 12;
```

Calcule mentalement les résultats suivants :

* `a < 10 && b > 10`
* `a > 10 || b > 10`
* `!(a == b)`


---

### 🧪 **Exercice 6 – Comparaison de deux sommes**

Déclare :

```java
int a = 5 + 4;
int b = 3 * 3;
```

Affiche :

* Les deux résultats
* Si les deux résultats sont égaux (`a == b`)

### Sortie attendue

```
La valeur de a est : 9
La valeur de b est : 9
Les deux valeurs sont égales : true
```

---

### 🧪 **Exercice 7 – Priorité des opérations**

Calcule mentalement la valeur de chaque expression suivante :

```java
int x = 4 + 2 * 3;
int y = (4 + 2) * 3;
```

---

### 🧪 **Exercice 8 – Expression logique complexe**

Calcule mentalement la valeur de chaque expression suivante :

```java
int a = 20;
int b = 15;
int c = 25;
```



* Le résultat de : `(a > b && b < c) || (a == c)`
* Le résultat de : `!(a < c && b != 15)`


---



### 🧪 **Exercice 9 – Chaînes et longueurs**

Déclare deux chaînes :

```java
String s1 = "Java";
String s2 = "Programmation";
```

Affiche :

* La longueur de chaque chaîne
* Si `s1` est plus court que `s2`
* Si les deux chaînes font exactement 4 caractères

### Sortie attendue

```
La chaîne s1 "Java" contient 4 caractères
La chaîne s2 "Programmation" contient 13 caractères
s1 est plus court que s2 : true
Les deux chaînes font exactement 4 caractères : false
```


---

### 🧪 **Exercice 10 – Expressions combinées**


```java
int x = 6;
int y = 4;
int z = 3;
```


Calcule mentalement la valeur de chaque expression suivante :

* `x + y * z`
* `(x + y) % z`
* `x * y > z + 10`
* `(x > y) && (y > z)`

---


# 🔁 **Conversions de type & arguments**

---

### 🧪 **Exercice 11 – Conversion implicite (promotion automatique)**

Déclare une variable `int x = 10;`
Assigne-la à une variable `double` et affiche-la.

### ➕ Objectif :

Comprendre qu’un `int` peut être converti en `double` sans cast explicite.

---

### 🧪 **Exercice 12 – Conversion explicite (cast)**

Déclare une variable `double x = 12.9;`
Convertis-la en `int` en forçant le cast, puis affiche la valeur.

### ➕ Objectif :

Observer que la partie décimale est perdue.

---

### 🧪 **Exercice 13 – Addition avec cast**

Déclare :

```java
int a = 5;
double b = 3.7;
```

Calcule leur somme **en entier**, puis **en décimal** (2 versions avec cast explicite).

---

### 🧪 **Exercice 14 – Conversion de String vers int**

Déclare :

```java
String texte = "42";
```

Convertis `texte` en `int`, puis multiplie-le par 2 et affiche le résultat.


---

### 🧪 **Exercice 15 – Conversion de String vers double**

Déclare :

```java
String prix = "19.99";
```

Convertis cette chaîne en `double`, ajoute-lui `5.50`, puis affiche le total.

---

### 🧪 **Exercice 16 – Conversion de int vers String**

Déclare un entier `x = 75;`
Convertis-le en `String`, puis concatène-le avec `" kg"` et affiche le résultat.


---

### 🧪 **Exercice 17 – Lire un argument en ligne de commande**

Utilise :

```java
public static void main(String[] args)
```

Récupère le premier argument `args[0]` supposé être un prénom, et affiche :
`"Bonjour, [prénom]!"`

---

### 🧪 **Exercice 18 – Addition d’arguments numériques**

Récupère deux arguments en ligne de commande (`args[0]` et `args[1]`)
Supposés être des entiers.
Additionne-les et affiche le résultat.


---

### 🧪 **Exercice 19 – Moyenne de trois notes passées en arguments**

Attends 3 arguments (`args[0]`, `args[1]`, `args[2]`), chacun une note sur 20.
Affiche la moyenne des 3 notes (en `double`, arrondie à 2 décimales).

---

### 🧪 **Exercice 20 – Vérification d’un âge avec argument**

Le programme reçoit un argument `args[0]`, supposé être un âge.
Affiche :

```text
Âge saisi : [valeur]
Est-ce un majeur ? : true/false
```

> 🧩 Convertir l’argument en `int` et tester avec `>= 18`
> (sans `if`, juste afficher l'expression booléenne)

---


{{% solutions-link "4" %}}




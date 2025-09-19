+++
date = '2025-09-03T15:01:45-04:00'
title = "⛏️ Le modulo `%` : Le reste utile"
linkTitle = 'Modulo'
weight = 2
+++


---

L’opérateur **modulo** (`%`) calcule le **reste** d’une division entière.

```java
int reste = 10 % 3; // Résultat : 1
```

Pourquoi ?
👉 Parce que **10 ÷ 3 = 3**, reste **1**.
Le modulo, c’est donc ce qui **reste après la division entière**.

---

### 📘 Comment il faut le lire

```java
int var = a % b;
```

Cela renvoie le **reste** de la division de `a` par `b`.

---


## 🔍 Le modulo côté mathématique

### 📐 1. Définition formelle

En mathématiques, pour deux entiers **a** (le dividende) et **b ≠ 0** (le diviseur), on peut écrire la **division euclidienne** ainsi :

$$
a = b \times q + r
$$

où :

* `q` est le **quotient entier** de la division (`a / b`)
* `r` est le **reste**, c’est ce que **`a % b` retourne**
* avec la contrainte :

$$
0 \le r < |b|
$$

Donc le **modulo** est ce **reste r** après avoir enlevé autant de fois que possible des multiples de `b`.

---

### 🧮 2. Exemples concrets

#### Exemple 1 : `17 % 5`

On cherche combien de fois on peut mettre **5** dans **17**, sans dépasser.

$$
17 = 5 \times 3 + 2
$$

Donc :

* Quotient `q = 3`
* Reste `r = 2` → **17 % 5 = 2**

---

#### Exemple 2 : `-13 % 4`

Java retourne un **reste qui a le même signe que le numérateur** (ici `-13`), donc :

$$
-13 = 4 \times (-4) + 3 \Rightarrow \text{mais Java dira} \quad -13 % 4 = -1
$$

Car :

$$
-13 = 4 \times (-3) + (-1)
$$

Java choisit `q = -3`, `r = -1`

---

## 🧠 Pourquoi c’est utile ?

Le concept de modulo est **fondamental en arithmétique**, mais il est aussi omniprésent en informatique :

| Domaine             | Exemple d’usage                          |
| ------------------- | ---------------------------------------- |
| **Horloges**        | Heure actuelle : `(heure + durée) % 24`  |
| **Couleurs**        | Alterner 3 couleurs : `index % 3`        |
| **Cryptographie**   | Chiffrement modulaire (`a^b mod n`)      |
| **Maths discrètes** | Nombres premiers, congruences, théorèmes |
| **Programmation**   | Boucles cycliques, alternance, etc.      |

---

## 📌 Résumé mathématique

| Terme        | Signification                                                                                       | 
| ------------ | ----------------------------------------------------------------------------------------------------| 
| Division     | Trouver combien de fois `b` entre dans `a`                                                          | 
| Quotient `q` | Partie entière de la division                                                                       | 
| Reste `r`    | Ce qu’il reste après avoir soustrait `q × b` à `a`                                                  | 
| Modulo       | Le reste `r` → toujours entre `0` et `b - 1` en math (Java va donner négatif ou 0 si a est négatif) |


---

### 🎯 Cas concrets d’utilisation

Le modulo peut paraître mystérieux au début, mais il est **super utile** dans beaucoup de cas pratiques :

---

### ✅ 1. Savoir si un nombre est **pair ou impair**

Un **nombre pair** donne un reste de **0** lorsqu’il est divisé par 2.

```java
int n = 12;
if (n % 2 == 0) {
    System.out.println("Nombre pair");
} else {
    System.out.println("Nombre impair");
}
```

---

### 🔁 2. Créer des **cycles / boucles périodiques**

Le modulo est parfait pour **revenir à 0 après un certain nombre**.

Exemple : afficher les jours de la semaine (`0` à `6`) en boucle :

```java
int i = 0;
for (int tour = 0; tour < 10; tour++) {
    System.out.println("Jour : " + (i % 7));
    i++;
}
```

➡️ Affiche : `0, 1, 2, 3, 4, 5, 6, 0, 1, 2`

---

### 🧮 3. Découper en **groupes** ou **colonnes**

Exemple : afficher les éléments d’un tableau **3 par 3** sur chaque ligne :

```java
for (int i = 0; i < 9; i++) {
    System.out.print(i + " ");
    if ((i + 1) % 3 == 0) {
        System.out.println(); // sauter à la ligne
    }
}
```

➡️ Affiche :

```
0 1 2  
3 4 5  
6 7 8  
```

---

### 🧩 4. Alterner une action un coup sur deux

```java
for (int i = 0; i < 6; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " → visible");
    } else {
        System.out.println(i + " → caché");
    }
}
```

---

## ❗ À savoir : Modulo avec nombres négatifs

En Java, le **signe du résultat** du modulo suit le **premier opérande** (le numérateur).

```java
System.out.println( 10 % 3); // 1
System.out.println(-10 % 3); // -1
System.out.println( 10 % -3); // 1
System.out.println(-10 % -3); // -1
```

👉 Cela peut avoir un impact si tu utilises `%` pour des positions dans un tableau ou des cycles — il faut parfois **ajuster** :

```java
int mod = ((-1 % 7) + 7) % 7; // renvoie 6 au lieu de -1
```

---

## 🧪 Exemples à tester

```java
System.out.println(15 % 4); // 3
System.out.println(20 % 5); // 0
System.out.println(13 % 10); // 3
```

---

# Exercices

1. Quelle est la solution à ce calcul : `45 % 12`?

1. Quelle est la solution à ce calcul : `234 % 33`?

1. Quelle est la solution à ce calcul : `2345765432 % 3242`?

1. Mentalement, faites le calcul suivant : `1234123536432435646734235523532 % 2` 

1. Réaliser un programme qui écrit tous les chiffres non divisible par 6 entre 1 et 100
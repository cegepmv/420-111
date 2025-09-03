+++
date = '2025-09-03T14:55:47-04:00'
title = '🍯 Les opérateurs de comparaison en Java'
linkTitle = 'Comparaison'
weight = 2
+++


---

Les **opérateurs de comparaison** permettent de **comparer deux valeurs** pour savoir si elles sont **égales**, **différentes**, **plus grandes**, etc.

🎯 Ils sont **essentiels dans les conditions** (`if`, `while`, etc.) car ils renvoient toujours un **résultat de type `boolean`** (`true` ou `false`).

---

## 🧪 Les 6 opérateurs de comparaison de base

| Opérateur | Signification       | Exemple (`a = 5`, `b = 8`) | Résultat |
| --------- | ------------------- | -------------------------- | -------- |
| `==`      | Égal à              | `a == b`                   | `false`  |
| `!=`      | Différent de        | `a != b`                   | `true`   |
| `<`       | Inférieur à         | `a < b`                    | `true`   |
| `>`       | Supérieur à         | `a > b`                    | `false`  |
| `<=`      | Inférieur ou égal à | `a <= b`                   | `true`   |
| `>=`      | Supérieur ou égal à | `a >= b`                   | `false`  |

---

### 🧠 Important à retenir

* **`==`** ne signifie **pas** "affecter une valeur", mais **"comparer l'égalité"**.
* Ne confonds pas **`=`** (affectation) et **`==`** (comparaison).

```java
int x = 10;        // OK : on donne la valeur 10 à x
if (x == 10) {     // OK : on teste si x est égal à 10
    System.out.println("x vaut 10 !");
}
```

---

## 🧠 Comparaison entre différents types

Tu peux comparer :

* Deux `int`, `double`, `char`, etc.
* Un `int` avec un `double` → Java fait une **conversion automatique**.

```java
int a = 5;
double b = 5.0;

System.out.println(a == b); // true
```

---

## 💡 Comparaison de `char`

Les `char` peuvent aussi être comparés : en fait, ils sont traités comme des **nombres Unicode**.

```java
char a = 'A';
char b = 'B';

System.out.println(a < b); // true (car 'A' = 65, 'B' = 66)
```

---

## 🚫 Comparer des objets (comme `String`) avec `==` ❌

⚠️ En Java, **`==` compare les adresses mémoire** pour les objets. Il ne faut **jamais** l’utiliser pour comparer des **chaînes de caractères (`String`)**.

Utilise plutôt **`.equals()`** :

```java
String nom = "Java";
System.out.println(nom == "Java");       // ⚠️ parfois true, parfois false
System.out.println(nom.equals("Java"));  // ✅ toujours true si les textes sont égaux
```

---

## 🧪 Exemples concrets

```java
int age = 18;

if (age >= 18) {
    System.out.println("Tu peux voter !");
} else {
    System.out.println("Trop jeune 😅");
}

int a = 10;
int b = 15;

boolean test1 = a != b;      // true
boolean test2 = a == 10;     // true
boolean test3 = a > b;       // false
```

---

## 🔍 Résumé visuel

| Symbole | Teste si...              | Résultat `boolean` |
| ------- | ------------------------ | ------------------ |
| `==`    | Deux valeurs sont égales | `true` ou `false`  |
| `!=`    | Différentes              | `true` ou `false`  |
| `<`     | Inférieure               | `true` ou `false`  |
| `>`     | Supérieure               | `true` ou `false`  |
| `<=`    | Inférieure ou égale      | `true` ou `false`  |
| `>=`    | Supérieure ou égale      | `true` ou `false`  |

---

## 🎯 Astuce

💡 En Java, toute comparaison renvoie un `boolean`, ce qui permet de l’utiliser directement dans une condition :

```java
if (score >= 60) {
    System.out.println("Réussi !");
}
```
---

# 🧠 **Exercices – Les opérateurs de comparaison en Java**

---

## 📘 Partie 1 : Théorie – Vrai ou Faux ?

> **Consigne** : Indique si chaque expression retourne `true` ou `false` en Java.

---

1. `7 == 7` → ❓
2. `5 != 10` → ❓
3. `4 > 9` → ❓
4. `12 <= 12` → ❓
5. `3.0 == 3` → ❓
6. `'A' < 'Z'` → ❓
7. `'a' == 'A'` → ❓


---

## 🧠 Partie 2 : Lecture de code

> **Consigne** : Que va afficher ce programme ?

```java
char c1 = 'B';
char c2 = 'b';

System.out.println(c1 < c2);
```
---



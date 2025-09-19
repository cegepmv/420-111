+++
date = '2025-09-19T13:17:15-04:00'
weight = 2
title = 'return'
+++
---

## 🔙 Le mot-clé `return` en Java

Le mot-clé **`return`** permet à une méthode de **renvoyer une valeur** à l’endroit où elle a été appelée.

Il est **essentiel** dans les fonctions qui **calculent un résultat** ou **transmettent une information**.

---

## 🧱 Syntaxe de base

```java
typeRetour nomDeLaMéthode(...) {
    // instructions
    return valeur;
}
```

💡 Le **type de la valeur renvoyée** doit **correspondre** à celui indiqué dans la déclaration de la méthode.

---

## ✋ Exemple simple

```java
public static int carre(int x) {
    return x * x;
}
```

Ici, la méthode `carre()` **renvoie un `int`** (le carré du nombre passé en paramètre).

---

## 🧪 Utilisation

```java
int resultat = carre(5);
System.out.println(resultat); // Affiche 25
```

➡️ Le mot-clé `return` permet de **"sortir" le résultat de la méthode** pour l’utiliser ailleurs.

---

## ❌ Si on ne veut rien renvoyer ?

On utilise le mot-clé **`void`** pour indiquer que la méthode **ne retourne rien** :

```java
public static void direBonjour() {
    System.out.println("Bonjour !");
}
```

⚠️ Une méthode `void` **ne peut pas contenir** de `return` avec une valeur.

---

## 🛑 `return` termine la méthode

Le mot-clé `return` **interrompt immédiatement l’exécution** de la méthode.

```java
public static void test() {
    System.out.println("Début");
    return;
    // Cette ligne ne sera jamais exécutée :
    System.out.println("Fin");
}
```

---

## 🎯 Règles importantes

✅ Le **type retourné** doit correspondre au **type indiqué dans la déclaration**
✅ Une méthode **non-`void`** doit obligatoirement contenir au moins un `return`
✅ On peut utiliser plusieurs `return` dans une méthode, selon des conditions

---

## 🔁 Exemple avec condition

```java
public static boolean estPair(int n) {
    if (n % 2 == 0) {
        return true;
    }
    return false;
}
```

Ici, `return` permet de **renvoyer des résultats différents** selon la logique du programme.

---

## 🔥 À retenir

* `return` sert à **renvoyer une valeur** depuis une méthode
* Il **met fin immédiatement à la méthode**
* Le **type de retour** doit **correspondre** à ce qui est attendu
* Les méthodes `void` **n'ont pas de valeur de retour**

---

# 🔍 Rechercher une valeur dans un tableau

Un **algorithme de recherche** permet de **vérifier si une valeur est présente** dans un tableau.

La **recherche linéaire** (ou **séquentielle**) est la plus simple : on **parcourt chaque élément** du tableau **jusqu’à trouver ce qu’on cherche**.

---

## 🧱 Méthode de recherche simple

```java
public static boolean contient(int[] tableau, int valeur) {
    for (int element : tableau) {
        if (element == valeur) {
            return true; // Trouvé !
        }
    }
    return false; // Pas trouvé après avoir tout parcouru
}
```

---

## 🔎 Exemple d’utilisation

```java
int[] notes = {12, 15, 8, 17};

System.out.println(contient(notes, 15)); // true
System.out.println(contient(notes, 20)); // false
```

---

## 💡 Comment ça marche ?

* On **parcourt chaque élément** du tableau avec une boucle `for-each`
* Si on trouve la valeur recherchée → `return true`
* Sinon, une fois la boucle terminée → `return false`

---

## 🎯 Pourquoi `return` est utile ici ?

✅ Il permet de **sortir directement** de la méthode dès qu’on trouve ce qu’on cherche
✅ Il rend le code **plus lisible** et **plus efficace**

---

## ✏️ Exercice – Retrouver une note

👉 Complète cette méthode pour dire si une **note est présente** dans un tableau :

```java
public static boolean contientNote(int[] notes, int noteRecherchee) {
    // Parcourir le tableau
    // Retourner true si trouvée, sinon false
}
```

🔹 Exemple :

```java
int[] notes = {10, 14, 18};

System.out.println(contientNote(notes, 14)); // true
System.out.println(contientNote(notes, 9));  // false
```

---

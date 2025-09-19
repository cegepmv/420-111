+++
date = '2025-09-19T11:20:49-04:00'
weight = 3
title = 'Switch'
+++


---

## 🎛️ Les instructions `switch` en Java

L’instruction **`switch`** permet de **tester la valeur d’une variable** et d’exécuter **différents blocs de code** selon son **contenu exact**.

C’est une **alternative plus claire aux chaînes de `if...else if`** quand on compare **une même variable** à **plusieurs valeurs possibles**.

---

## 🧰 Syntaxe de base

```java
switch (variable) {
    case valeur1:
        // Code si variable == valeur1
        break;

    case valeur2:
        // Code si variable == valeur2
        break;

    default:
        // Code si aucune des valeurs ne correspond
}
```

### 🧱 Éléments clés :

| Mot-clé   | Rôle                                    |
| --------- | --------------------------------------- |
| `case`    | Spécifie une **valeur à tester**        |
| `break`   | Termine le `switch`, évite les "chutes" |
| `default` | (optionnel) Bloc exécuté **par défaut** |

---

## 📦 Exemple simple

```java
int jour = 3;

switch (jour) {
    case 1:
        System.out.println("Lundi");
        break;
    case 2:
        System.out.println("Mardi");
        break;
    case 3:
        System.out.println("Mercredi");
        break;
    default:
        System.out.println("Jour inconnu");
}
```

➡️ Affichera : `Mercredi`

---

## ⚠️ Le `break` est important !

Sans le `break`, le programme **continue dans les cases suivantes**, même si elles ne correspondent pas :

```java
int x = 2;

switch (x) {
    case 1:
        System.out.println("Un");
    case 2:
        System.out.println("Deux");
    case 3:
        System.out.println("Trois");
}
```

➡️ Affichera :

```
Deux  
Trois
```

---

## 🧠 Le bloc `default`

Le mot-clé `default` permet de **gérer les cas non prévus** :

```java
char lettre = 'z';

switch (lettre) {
    case 'a':
        System.out.println("Voyelle A");
        break;
    case 'e':
        System.out.println("Voyelle E");
        break;
    default:
        System.out.println("Autre lettre");
}
```

---

## 🔁 Compatibilité du `switch`

En Java, tu peux utiliser `switch` avec les types suivants :

| Type autorisé                  | Exemples           |
| ------------------------------ | ------------------ |
| `int`, `short`, `byte`, `char` | `switch (entier)`  |
| `String` (depuis Java 7)       | `switch (nom)`     |
| `enum`                         | `switch (couleur)` |

❌ Pas compatible avec `float`, `double`, `boolean`, ni avec des expressions complexes.

---

## 🔥 À retenir

* `switch` est pratique pour **tester des cas précis**.
* Utilise `break` pour **éviter les exécutions non désirées**.
* Le bloc `default` est **optionnel** mais utile.
* Compatible avec **`int`, `char`, `String`, `enum`**, etc.
* Plus lisible que plusieurs `else if` quand on compare **la même variable**.

---


### 🔹 **Exercice 1 : Jour de la semaine**

Crée une variable `int jour`, puis utilise une instruction `switch` pour afficher le nom du jour correspondant :

* `1` → `"Lundi"`
* `2` → `"Mardi"`
* `3` → `"Mercredi"`
* Autre → `"Jour inconnu"`

```java
public class Exo1 {
    public static void main(String[] args) {
        // Déclaration du jour
        

        // Switch selon le jour
       
    }
}
```

### Sortie attendue (si `jour = 2`)

```
Mardi
```

---

### 🔹 **Exercice 2 : Type de boisson**

Crée une variable `String choix`, qui peut valoir `"café"`, `"thé"` ou `"jus"`.
Utilise `switch` pour afficher :

* `"Vous avez choisi du café"`
* `"Vous avez choisi du thé"`
* `"Vous avez choisi du jus"`
* Sinon : `"Boisson inconnue"`

```java
public class Exo2 {
    public static void main(String[] args) {
        // Déclaration de la boisson
        

        // Switch sur le choix
       
    }
}
```

### Sortie attendue (si `choix = "thé"`)

```
Vous avez choisi du thé
```

---

### 🔹 **Exercice 3 : Note en lettre**

Crée une variable `char note` qui peut être `'A'`, `'B'`, `'C'` ou une autre lettre.
Utilise `switch` pour afficher :

* `'A'` → `"Excellent"`
* `'B'` → `"Très bien"`
* `'C'` → `"Bien"`
* Autre → `"Note invalide"`

```java
public class Exo3 {
    public static void main(String[] args) {
        // Déclaration de la note
        

        // Switch sur la note
       
    }
}
```

### Sortie attendue (si `note = 'B'`)

```
Très bien
```

---

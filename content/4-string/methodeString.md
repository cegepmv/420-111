+++
date = '2025-09-01T18:19:26-04:00'
title = 'Méthodes de String'
+++



🍥 [Lien vers la classe String de l'API Java](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html)

### 1. **Méthodes Statistiques de la classe `String`**

Les méthodes **statiques** de la classe `String` ne nécessitent pas de créer une instance de `String` pour les utiliser. Vous les appelez directement sur la classe elle-même. Voici quelques exemples de méthodes statiques courantes :


#### Exemple 1 : `String.format()`
Cette méthode statique permet de formater une chaîne de caractères en utilisant des espaces réservés (placeholders).

```java
public class ExempleStringStatic {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String formattedString = String.format("Nom : %s, Âge : %d", name, age);
        System.out.println(formattedString);
    }
}
```

**Sortie attendue** :
```
Nom : Alice, Âge : 30
```

<!-- 

#### Exemple 2 : `String.valueOf()`
Cette méthode statique est utilisée pour convertir des types primitifs en chaînes de caractères.

```java
public class ExempleStringStatic {
    public static void main(String[] args) {
        int number = 123;
        String str = String.valueOf(number);  // Convertit un int en String
        System.out.println("La chaîne de caractères est : " + str);
    }
}
```

**Sortie attendue** :
```
La chaîne de caractères est : 123
``` 

#### Exemple 3 : `String.join()`
Cette méthode statique est utilisée pour joindre plusieurs éléments de type `String` avec un délimiteur.

```java
public class ExempleStringStatic {
    public static void main(String[] args) {
        String[] words = {"Java", "est", "génial"};
        String sentence = String.join(" ", words);  // Joindre avec un espace
        System.out.println(sentence);
    }
}
```

**Sortie attendue** :
```
Java est génial
```

#### Exemple 4 : `String.copyValueOf()`
Cette méthode statique permet de créer une nouvelle chaîne à partir d'un tableau de caractères (`char[]`).

```java
public class ExempleStringStatic {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str = String.copyValueOf(chars);
        System.out.println(str);
    }
}
```

**Sortie attendue** :
```
Hello
```
-->
---

### 2. **Méthodes Non Statiques de la classe `String`**

Les méthodes **non-statiques** nécessitent une instance de la classe `String` pour être utilisées. Vous devez créer un objet `String` pour appeler ces méthodes. Voici quelques exemples :

#### Exemple 1 : `length()`
Cette méthode retourne la longueur (nombre de caractères) de la chaîne de caractères.

```java
public class ExempleStringNonStatic {
    public static void main(String[] args) {
        String message = "Bonjour";
        int length = message.length();  // Appel de la méthode non statique
        System.out.println("La longueur de la chaîne est : " + length);
    }
}
```

**Sortie attendue** :
```
La longueur de la chaîne est : 7
```

#### Exemple 2 : `charAt()`
Cette méthode retourne le caractère situé à une position spécifiée dans la chaîne.

```java
public class ExempleStringNonStatic {
    public static void main(String[] args) {
        String message = "Java";
        char character = message.charAt(2);  // Récupère le caractère à l'indice 2
        System.out.println("Le caractère à l'indice 2 est : " + character);
    }
}
```

**Sortie attendue** :
```
Le caractère à l'indice 2 est : v
```

#### Exemple 3 : `substring()`
Cette méthode retourne une sous-chaîne de la chaîne principale en fonction des indices donnés.

```java
public class ExempleStringNonStatic {
    public static void main(String[] args) {
        String message = "Bienvenue";
        String substring = message.substring(3, 7);  // Extrait de l'indice 3 à 6
        System.out.println("Sous-chaîne : " + substring);
    }
}
```

**Sortie attendue** :
```
Sous-chaîne : nven
```

#### Exemple 4 : `toLowerCase()` et `toUpperCase()`
Ces méthodes convertissent tous les caractères de la chaîne en minuscules ou en majuscules.

```java
public class ExempleStringNonStatic {
    public static void main(String[] args) {
        String message = "Java Programming";
        String lower = message.toLowerCase();  // Convertir en minuscules
        String upper = message.toUpperCase();  // Convertir en majuscules
        System.out.println("En minuscules : " + lower);
        System.out.println("En majuscules : " + upper);
    }
}
```

**Sortie attendue** :
```
En minuscules : java programming
En majuscules : JAVA PROGRAMMING
```

#### Exemple 5 : `contains()`
Cette méthode permet de vérifier si une chaîne contient une sous-chaîne spécifiée.

```java
public class ExempleStringNonStatic {
    public static void main(String[] args) {
        String message = "Java est génial!";
        boolean contains = message.contains("génial");  // Vérifie si "génial" est dans la chaîne
        System.out.println("La chaîne contient 'génial' ? " + contains);
    }
}
```

**Sortie attendue** :
```
La chaîne contient 'génial' ? true
```

---
<!-- 
### Méthode `concat()` :

```java
String a = "Hello";
String b = "World";
String c = a.concat(" ").concat(b);
System.out.println(c); // Hello World
```
 -->


### Résumé des différences entre les méthodes statiques et non-statiques :

- **Méthodes statiques** : 
  - Appelées sur la classe elle-même, **pas besoin d'instance**.
  - Exemples : `String.valueOf()`, `String.format()`, `String.join()`.
  
- **Méthodes non-statiques** : 
  - Appelées sur une instance de la classe `String`.
  - Exemples : `length()`, `charAt()`, `substring()`, `toLowerCase()`.

---
<!-- 
### 💡 **Exercice – Statique ou non ? Manipule les chaînes !**

#### 🎯 Objectif :

Utiliser correctement les **méthodes statiques et non-statiques** de la classe `String`.

---

#### 📝 Consignes :

Écris un programme Java qui réalise les étapes suivantes :

---

### 🧩 Partie 1 : Méthodes **statiques**

1. Crée un tableau de `String` contenant les mots suivants : `"Java"`, `"est"`, `"puissant"`.
2. Utilise `String.join()` pour créer une phrase complète à partir de ces mots, séparés par un espace.
3. Utilise `String.format()` pour afficher :
   `"Phrase formatée : [la phrase] (longueur : [X] caractères)"`
   *(où X est la longueur de la phrase)*

---

### 🧩 Partie 2 : Méthodes **non-statiques**

1. À partir de la phrase obtenue ci-dessus :

   * Affiche-la en **majuscules**.
   * Affiche-la en **minuscules**.
   * Récupère le caractère à l’indice 5 et affiche-le.
   * Extrait une **sous-chaîne** allant de l’indice 5 à 11 (non inclus).
   * Vérifie si la chaîne contient le mot `"puissant"`.

---

#### 🧪 Exemple de sortie attendue (en abrégé) :

```
Phrase formatée : Java est puissant (longueur : 17 caractères)
MAJUSCULES : JAVA EST PUISSANT
minuscules : java est puissant
Caractère à l’indice 5 : e
Sous-chaîne (5 à 11) : est pu
Contient "puissant" ? true
```

---

#### ✅ Bonus :

Utilise `String.valueOf()` pour convertir un `double` (ex : `3.14`) en `String` et affiche :

```
La valeur PI convertie en chaîne est : 3.14
```

---
 -->

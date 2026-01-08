+++
date = '2025-08-26T14:39:35-04:00'
title = 'Locale/Instance/Classe'
weight = 2
+++


---


En Java, il existe **trois grands types de variables** qu’on peut rencontrer dans une classe :

* Les **variables d’instance**
* Les **variables de classe**
* Les **variables locales** (dans les méthodes)

---

## 👤 Variables d’instance(Sera vue dans le cours de programmation orientée objet)

<details>
    <summary>Voir la théorie quand même</summary>

Une **variable d’instance** est propre à **chaque objet** créé à partir d’une classe.
Elle est déclarée **dans la classe**, mais **en dehors des méthodes**.

```java
public class Voiture {
    int vitesse;  // Variable d’instance
}
```

### ➕ Caractéristiques :

* Chaque objet a sa **propre copie**.
* Sert à stocker des **caractéristiques propres à un objet**.
* Accessible dans la classe avec `this.vitesse`.
</details>



---

## 🏛️ Variables de classe

Une **variable de classe** est partagée par **tous les objets** d’une classe.
Elle est déclarée avec le mot-clé `static`.

```java
public class Voiture {
    static int nombreDeVoitures = 0;  // Variable de classe
}
```

### ➕ Caractéristiques :

* Une seule copie partagée entre tous les objets.
* Sert à des **valeurs communes** à toute la classe.
* Accessible avec `NomDeLaClasse.nomDeLaVariable`.




---

## 🧪 Variables locales (dans une méthode)

Une **variable locale** est déclarée **à l’intérieur d’une méthode**.
Elle **n’existe que pendant l’exécution** de cette méthode.

```java
public class Exemple {
    public static void main(String[] args) {
        int x = 5; // Variable locale
        System.out.println(x);
    }
}
```

### ➕ Caractéristiques :

* Elle **n’est accessible que dans la méthode** où elle est déclarée.
* Elle **n’est pas connue** du reste de la classe.
* Elle est **créée** quand la méthode s’exécute, puis **supprimée** à la fin.

---

## 🔍 Comparatif complet

| Type de variable | Où ?             | Mots-clés | Accessible par | Durée de vie                      |
| ---------------- | ---------------- | --------- | -------------- | --------------------------------- |
| Instance         | Dans la classe   | *(aucun)* | l’objet        | Tant que l’objet existe           |
| Classe           | Dans la classe   | `static`  | la classe      | Tant que le programme tourne      |
| Locale (méthode) | Dans une méthode | *(aucun)* | la méthode     | Pendant l’exécution de la méthode |

---

## 🎯 Exercice 1

🔧 **Consigne** :

1. Crée une classe `Compteur`.
2. Ajoute une **variable de classe** `total` de type `int`.
3. Dans `main` :

   * Déclare une **variable locale** `total` et donne-lui la valeur `5`,
   * Affiche cette variable locale,
   * Puis affiche la **variable de classe** en utilisant `Compteur.total`.

📝 **Exemple attendu à l'écran** :

```
5
0
```

<details>
    <summary>Réponse</summary>

```java
public class Compteur {
    static int total = 0;  // variable de classe

    public static void main(String[] args) {
        int total = 5;  // variable locale

        System.out.println(total);         // locale
        System.out.println(Compteur.total); // de classe
    }
}
```

</details>

---

## 🎯 Exercice 2

🔧 **Consigne** :

1. Crée une classe `Compteur`.
2. Ajoute une **variable de classe** `nombreAppels` de type `int`.
3. Écris une méthode `compter()` qui :

   * déclare une **variable locale** `appel` de type `int` et l’initialise à `0`,
   * incrémente `appel` et `nombreAppels`,
   * affiche les deux variables.
4. Appelle `compter()` deux fois depuis `main`.

📝 **Exemple attendu à l'écran** :

```
appel = 1
nombreAppels = 1
appel = 1
nombreAppels = 2
```

<details>
    <summary>Réponse</summary>

```java
public class Compteur {
    static int nombreAppels = 0;  // variable de classe

    public static void compter() {
        int appel = 0;   // variable locale : recréée à chaque appel
        appel++;
        nombreAppels++;
        System.out.println("appel = " + appel);
        System.out.println("nombreAppels = " + nombreAppels);
    }

    public static void main(String[] args) {
        compter();
        compter();
    }
}
```

</details>
---

## 🎯 Exercice 3

🔧 **Consigne** :

1. Crée une classe `Score`.
2. Déclare une **variable de classe** `points` de type `int`, initialisée à `10`.
3. Dans `main`, déclare une **variable locale** qui porte le **même nom** : `points`, et initialise-la à `50`.
4. Affiche d’abord la variable locale, puis la variable de classe.

📝 **Exemple attendu à l'écran** :

```
50
10
```

<details>
    <summary>Réponse</summary>

```java
public class Score {
    static int points = 10;  // variable de classe

    public static void main(String[] args) {
        int points = 50;  // variable locale qui masque celle de classe

        System.out.println(points);         // affiche 50 (locale)
        System.out.println(Score.points);   // affiche 10 (de classe)
    }
}
```

</details>

---

🧠 **À retenir** : Quand une variable locale a le **même nom** qu'une variable de classe, elle **la masque** dans le bloc où elle est déclarée. Pour accéder à la variable de classe malgré tout, on doit utiliser le nom de la classe (`Score.points` ici).

---

## 🧪 **Exercice 1 : Utilitaire `static` pour afficher un tableau**

Crée une méthode `static` qui prend un tableau d’entiers en paramètre et l’affiche ligne par ligne.

```java
public class Exo1 {
   
    public static void main(String[] args) {
        int[] valeurs = {43, 256, 3, 796, 35, 67};
        afficherTableau(valeurs);
    }
}
```

### ✅ Objectif

* Comprendre comment appeler une méthode `static` sans créer d’objet.
* Utiliser une boucle `for`.

### 🎯 Sortie attendue

```
43
256
3
796
35
67
```

---


## 🧪 Exercice 1 (nouveau) : Variable `static` et calcul de moyenne

Crée une classe avec :

* Une variable de classe `static int total` initialisée à 0,
* Une variable de classe `static int compte` initialisée à 0,
* Une méthode `static` `ajouterNote(int note)` qui ajoute la note à `total`, incrémente `compte`,
* Une méthode `static` `afficherMoyenne()` qui calcule la moyenne (total / compte) et l’affiche avec deux décimales.

```java
public class Exercice1 {

    // Déclare total et compte ici

    public static void ajouterNote(int note) {
        // Ajoute note à total, incrémente compte
    }

    public static void afficherMoyenne() {
        // Calcule et affiche la moyenne avec deux décimales
    }

    public static void main(String[] args) {
        ajouterNote(12);
        ajouterNote(15);
        ajouterNote(18);
        afficherMoyenne();  // Affiche : Moyenne : 15.00
    }
}
```

---

## 🧪 Exercice 2 (nouveau) : Variable locale dans une méthode `static` — calcul de la puissance

Complète la méthode `static` `calculerPuissance(int base, int exposant)` qui calcule la puissance en utilisant une variable locale `resultat` initialisée à 1, et une boucle `for`.

```java
public class Exercice2 {

    public static void calculerPuissance(int base, int exposant) {
        // Déclare resultat = 1
        // Utilise une boucle for pour multiplier resultat par base exposant fois
        // Affiche le résultat
    }

    public static void main(String[] args) {
        calculerPuissance(2, 3);  // Affiche : 8
        calculerPuissance(5, 4);  // Affiche : 625
    }
}
```

---


## 🧪 Exercice 3 : Variable `static` pour stocker un compteur d’appels

Dans cette classe, crée une variable `static` qui compte le nombre de fois où la méthode `direBonjour` est appelée.

* La méthode `direBonjour` affiche `"Bonjour !"` puis affiche le nombre d’appels effectués.

```java
public class Exercice3 {

    // Déclare la variable compteur ici

    public static void direBonjour() {
        // Incrémente compteur, affiche "Bonjour !" et le nombre d'appels
    }

    public static void main(String[] args) {
        direBonjour();  // Affiche Bonjour ! Nombre d’appels : 1
        direBonjour();  // Affiche Bonjour ! Nombre d’appels : 2
        direBonjour();  // Affiche Bonjour ! Nombre d’appels : 3
    }
}
```

---


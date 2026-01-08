+++
date = '2025-09-19T13:17:31-04:00'
weight = 11
title = 'Scanner'
+++

🍥 [Lien vers la classe Scanner de l'API Java](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Scanner.html)


---

# 📥 Lire des données avec `Scanner` en Java

La classe **`Scanner`** permet de **lire des données** saisies par l’utilisateur dans la **console** (ou d’autres sources).

Très utile pour créer des programmes **interactifs**, qui **posent des questions** à l’utilisateur !

---

## 📦 Importer `Scanner`

Avant d’utiliser `Scanner`, tu dois l’**importer** :

```java
import java.util.Scanner;
```

---

## 🧱 Créer un objet `Scanner`

```java
Scanner sc = new Scanner(System.in);
```

➡️ `System.in` signifie : lire depuis la **console (clavier)**

---

## 🔍 Lire différents types de données

| Méthode         | Lit…                             | Exemple de saisie  |
| --------------- | -------------------------------- | ------------------ |
| `nextLine()`    | une **ligne** complète (String)  | `Bonjour le monde` |
| `next()`        | un **mot** (jusqu’au 1er espace) | `Bonjour`          |
| `nextInt()`     | un **entier** (`int`)            | `42`               |
| `nextDouble()`  | un **décimal** (`double`)        | `3.14`             |
| `nextBoolean()` | un **booléen** (`true/false`)    | `true`             |

---

## 🧪 Exemple simple

```java
import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quel est ton nom ? ");
        String nom = sc.nextLine();

        System.out.print("Quel âge as-tu ? ");
        int age = sc.nextInt();

        System.out.println("Bonjour " + nom + ", tu as " + age + " ans !");
    }
}
```

---

## ⚠️ Attention : mélange `nextLine()` / `nextInt()`

💥 Si tu utilises `nextInt()` **puis** `nextLine()`, il peut y avoir un **bug de saut de ligne** !

```java
int age = sc.nextInt();
sc.nextLine(); // vide le saut de ligne restant
String nom = sc.nextLine(); // fonctionne maintenant
```

---

## 🧼 Fermer le scanner

Une fois terminé, **ferme le scanner** pour libérer les ressources :

```java
sc.close();
```

---

## 🧠 À retenir

* `Scanner` permet de **lire des entrées clavier**
* Il faut **importer** `java.util.Scanner`
* Utilise des méthodes comme `nextInt()`, `nextLine()`, etc.
* ⚠️ Fais attention aux **sauts de ligne** après `nextInt()`
* N’oublie pas de **fermer** ton scanner avec `close()`


---

### 🎯 Exercice 1 : Mot secret

**Objectif :** Vérifie si l’utilisateur a saisi le bon mot secret.

🧾 **Consignes :**

* Demande un mot à l’utilisateur avec `next()`
* Si le mot est `"java"`, affiche `"Accès autorisé"`
* Sinon, affiche `"Mot incorrect"`

🔧 Méthode : `next()`

---

### 🧮 **Exercice 2 (corrigé) : Multiplication surprise**

**Objectif :** Lire un entier, le multiplier par un nombre fixe, et afficher le résultat.

🧾 **Consignes :**

* Demande à l’utilisateur un nombre entier avec `nextInt()`
* Multiplie ce nombre par **7**
* Affiche le résultat dans une phrase

🖥️ **Exemple :**

```
Tape un nombre : 4  
Résultat : 28
```

🔧 Méthode : `nextInt()`

---

### ✅ Exercice 3 : Confirmation de participation

**Objectif :** Lire un booléen (`true` / `false`) et réagir.

🧾 **Consignes :**

* Demande : “Participes-tu à l’événement ? (true/false)”
* Si `true`, affiche : “À bientôt !”
* Si `false`, affiche : “Dommage, une prochaine fois.”

🔧 Méthode : `nextBoolean()`

---

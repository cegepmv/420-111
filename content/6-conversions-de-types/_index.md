+++
title = "Conversions De Types"
type = "chapter"
weight = 6
+++


---

## 🔄 Conversion implicite vs explicite en Java

La conversion permet de changer le type d’une donnée pour l’adapter à une autre variable ou expression.

---

## 1. Conversion implicite (promotion automatique)

* Java effectue **automatiquement** la conversion quand il n’y a **pas de risque de perte de données**.
* Se produit souvent quand on passe d’un type **plus petit** à un type **plus grand**.

### Exemples classiques :

| De     | Vers     | Exemple         |
| ------ | -------- | --------------- |
| `int`  | `double` | `double d = 5;` |
| `byte` | `int`    | `int x = 10;`   |

```java
int a = 10;
double b = a;  // Conversion implicite
```

---

## 2. Conversion explicite (casting)

* Nécessaire quand il y a un **risque de perte de données** ou **incompatibilité**.
* Le programmeur doit forcer la conversion avec un **cast** `(type)`.

### Exemples classiques :

| De       | Vers  | Exemple                  |
| -------- | ----- | ------------------------ |
| `double` | `int` | `int x = (int) 9.99;`    |
| `long`   | `int` | `int y = (int) 100000L;` |

```java
double x = 9.99;
int y = (int) x;  // Conversion explicite, décimale perdue
```

---

## 3. Différences clés

| Aspect                 | Conversion implicite        | Conversion explicite           |
| ---------------------- | --------------------------- | ------------------------------ |
| Nécessite une action ? | Non, automatique            | Oui, cast obligatoire `(type)` |
| Risque de perte        | Non                         | Oui                            |
| Sens                   | Du plus petit au plus grand | Du plus grand au plus petit    |
| Exemples               | `int` → `double`            | `double` → `int`               |

---

## 4. En résumé

* **Conversion implicite** = sûre, automatique, du type petit vers grand.
* **Conversion explicite** = risquée, forcée, du type grand vers petit.
* Utilise toujours le casting explicite pour éviter les erreurs de compilation.

---

## 🧠 À retenir

* Java convertit **tout seul** quand c’est sûr.
* Pour tout ce qui peut perdre des infos, il faut **caster** manuellement.
* Sois vigilant avec les conversions explicites, elles peuvent tronquer ou modifier la valeur.




# Conversion_des_types

Le terme le plus utilisé pour la technique de conversion est « Casting ».


#### Cas 1

##### Conversion 1 : String vers les numériques
<img src="/420-111/images/rencontre4/1.png">

##### Conversion 2 : Les numériques vers une String en utilisant la méthode valueOf()
<img src="/420-111/images/rencontre4/2.png">

##### Conversion 3 : Les numériques vers une String en utilisant la méthode toString()
<img src="/420-111/images/rencontre4/3.png">

##### Conversion 4 : String vers les primitifs
<img src="/420-111/images/rencontre4/4.png">

##### Conversion 5 : Primitifs vers String
<img src="/420-111/images/rencontre4/5.png">

##### Conversion 6 : Les primitifs vers une String en utilisant la méthode valueOf()
<img src="/420-111/images/rencontre4/6.png">





### Automatique vs manuelle

Conversion automatique : il s’agit d’une conversion d'un type plus petit en un type plus grand

byte -> short -> char -> int -> long -> float -> double

<img src="/420-111/images/rencontre4/7.png">

#### Cas 2

Conversion manuelle : 

il s’agit de la conversion d'un type plus grand en un type de taille plus petite. Il suffit de rajouter le casting du type voulu à droite.

double -> float -> long -> int -> char -> short -> byte
double d = 2000.23;
float f = (float)d;
long l = (long) f;

Quand on diminue la taille il y a parfois une perte d'information comme si l'on passe de float à int:
```java
    float a = 4.53F;
    System.out.println((int) a);
        
    //4
```
### Pour résumer : 

- Dans le cas d’une conversion de petit vers grand ➔ on ne fait rien.
- Dans le cas d’une conversion d’un grand vers un petit ➔ il faut « Caster » la partie droite en type du petit.


---

### 🧪 **Exercice 1 : Fusion de types**

**Objectif :** Comprendre la promotion automatique des types.

🧾 **Consignes :**

* Crée une variable `byte` avec une valeur (ex. `byte b = 10;`)
* Crée une variable `int` et affecte-lui la valeur de `b` (sans cast)
* Affiche la valeur de l’int
* Explique dans un commentaire pourquoi ça fonctionne sans cast

🔧 Concepts : conversion **implicite** `byte → int`

---

### ✂️ **Exercice 2 : Tronquage d’un flottant**

**Objectif :** Observer la perte de données lors d’un cast.

🧾 **Consignes :**

* Déclare une variable `double` avec une valeur décimale (ex. `double d = 123.456;`)
* Caste-la en `int` et stocke le résultat dans une nouvelle variable
* Affiche les deux valeurs
* Constate la perte des décimales

🔧 Concepts : conversion **explicite** `double → int`

---

### 🔁 **Exercice 3 : Enchaînement de cast**

**Objectif :** Appliquer plusieurs conversions manuelles successives.

🧾 **Consignes :**

* Déclare une variable `double` avec une valeur (ex. `double x = 1000.99;`)
* Convertis-la en `float`, puis en `long`, puis en `int`
* Affiche chaque étape
* Observe l’évolution de la donnée à chaque cast

🔧 Concepts : conversion **explicite** en chaîne : `double → float → long → int`

---


---

# 📥 Passage d'arguments par la ligne de commande en Java

---

## 1. 🔍 Qu’est-ce que c’est ?

En Java, on peut passer des **valeurs à un programme** au moment de son **exécution**, directement **depuis la ligne de commande**.

Ces valeurs sont appelées **arguments** et sont transmis au programme via le **tableau `String[] args`** de la méthode `main`.

---

## 2. 📌 Syntaxe

### ✅ Déclaration classique

```java
public class MonProgramme {
    public static void main(String[] args) {
        // args est un tableau de chaînes
    }
}
```

---

### ✅ Exécution (en ligne de commande)

```bash
java MonProgramme argument1 argument2 argument3
```

> Ces `argument1`, `argument2`, etc. seront accessibles dans le tableau `args`.

---

## 3. 🧪 Exemple simple

```java
public class ExempleArgs {
    public static void main(String[] args) {
        System.out.println("Premier argument : " + args[0]);
        System.out.println("Deuxième argument : " + args[1]);
    }
}
```

### ⚠️ Important

* `args[0]` = premier argument
* `args[1]` = deuxième argument
* `args.length` = nombre total d’arguments

---

## 4. 🛑 Gestion des erreurs

Il faut **toujours vérifier la taille du tableau** `args` pour éviter les erreurs :

```java
if (args.length < 2) {
    System.out.println("Erreur : il faut au moins 2 arguments.");
    return;
}
```

---

## 5. 🔄 Conversion de type

Les arguments sont des **chaînes de caractères (`String`)** par défaut. Pour utiliser des nombres :

```java
int age = Integer.parseInt(args[0]);    // Convertit en int
double taille = Double.parseDouble(args[1]); // Convertit en double
```

> ⚠️ Attention aux erreurs si l’utilisateur entre des valeurs non numériques.

---

## 6. 🎯 Utilisation typique

* Fournir des **paramètres** (nom, âge, etc.) à un programme.
* Contrôler le **comportement** du programme (mode test, options, etc.).
* Éviter de coder en dur des valeurs.

---

## 7. 📦 Exemple complet

```java
public class BonjourNom {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java BonjourNom <nom>");
            return;
        }
        System.out.println("Bonjour " + args[0] + " !");
    }
}
```

---

## 🧠 À retenir

| Élément         | Détail                                                       |
| --------------- | ------------------------------------------------------------ |
| `String[] args` | Tableau contenant les arguments                              |
| `args.length`   | Nombre d’arguments passés                                    |
| `args[i]`       | iᵉ argument (indexé à partir de 0)                           |
| Conversion      | Utiliser `Integer.parseInt()`, `Double.parseDouble()`, etc.  |
| Bonne pratique  | Vérifier la longueur du tableau avant d'accéder aux éléments |

---

### 🧩 **Exercice 1 : Convertisseur Celsius → Fahrenheit**

**🎯 Objectif :** Lire une température en degrés Celsius en argument, et afficher sa conversion en Fahrenheit.

#### 🔧 Consigne :

1. Le programme prend **un seul argument numérique**.
2. Il affiche :

   ```
   <valeur>°C équivaut à <valeur_fahrenheit>°F
   ```
3. Utilise la formule : `F = C × 9/5 + 32`

#### 📝 Exemple attendu :

```bash
java Convertisseur 25
```

```
25°C équivaut à 77.0°F
```

> 🛑 Ajoute une vérification si aucun argument n’est donné ou si l’entrée n’est pas un nombre.

---

### 🧮 **Exercice 2 : Nombre pair ou impair**

**🎯 Objectif :** Vérifier si un nombre entier donné en argument est pair ou impair.

#### 🔧 Consigne :

1. Le programme prend **un entier** en argument.
2. Il affiche :

   * "`Nombre pair`" si divisible par 2
   * "`Nombre impair`" sinon

#### 📝 Exemple attendu :

```bash
java Parite 41
```

```
Nombre impair
```

> 🛑 Ajoute une gestion d’erreur si l’argument est absent ou non entier.

---

### 📚 **Exercice 3 : Compteur de mots**

**🎯 Objectif :** Compter le nombre total de mots passés en argument.

#### 🔧 Consigne :

1. Le programme prend **n'importe quel nombre de mots** (chaînes) en arguments.
2. Il affiche :

   ```
   Nombre de mots : X
   ```

#### 📝 Exemple attendu :

```bash
java Compteur Bonjour à tous les étudiants
```

```
Nombre de mots : 5
```

> 🛡️ Gère le cas où aucun mot n’est fourni (afficher un message).

---


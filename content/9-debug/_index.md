+++
date = '2025-09-19T13:16:44-04:00'
weight = 9
title = 'Debug'
+++

---

## 🐞 Utiliser le **débogueur Java** dans **VSCode**

Le **débogueur** est un outil **essentiel pour comprendre ce que fait ton programme**, repérer des erreurs et analyser le **comportement du code pas à pas**.

Dans **Visual Studio Code**, tu peux facilement **déboguer du Java** avec l’extension adéquate.

---

## 🧰 Prérequis

Avant de commencer :

✔️ Avoir **Java installé** (JDK 11+ recommandé)
✔️ Avoir **VSCode** installé
✔️ Avoir installé l’extension **Java Extension Pack** ou au minimum :

* **Debugger for Java**
* **Language Support for Java**

---

## 🛠️ Démarrer une session de débogage

1. **Ouvre ton fichier `.java`**
2. Place un **point d’arrêt** (🔴) en cliquant à gauche d’une ligne de code
3. Clique sur ▶️ **"Run and Debug"** dans la barre latérale (ou `F5`)
4. VSCode **exécute ton programme** et **s’arrête au point d’arrêt**

---

## 📍 Point d’arrêt : c’est quoi ?

Un **point d’arrêt** (`breakpoint`) permet de **stopper l’exécution** à une ligne précise.
Tu peux ensuite **analyser les variables**, **exécuter ligne par ligne**, etc.

---

## 🎛️ Outils de contrôle

Une fois arrêté sur un point d’arrêt, tu as accès à :

| Icône | Nom         | Fonction                                                     |
| ----- | ----------- | ------------------------------------------------------------ |
| ▶️    | *Continue*  | Continue l’exécution jusqu’au prochain arrêt                 |
| ⏭️    | *Step Over* | Exécute **la ligne en cours**, sans entrer dans les méthodes |
| 🔽    | *Step Into* | Entre dans la méthode appelée à cette ligne                  |
| 🔼    | *Step Out*  | Termine la méthode actuelle et revient à l’appelant          |
| ⏹️    | *Stop*      | Arrête complètement le programme                             |

---

## 🔍 Visualiser les variables

Pendant le débogage, tu peux voir :

✅ Les **valeurs des variables**
✅ Le **contenu des tableaux / objets**
✅ Le **call stack** (pile des appels de fonctions)

Tu peux aussi **survoler une variable** avec la souris pour voir sa valeur.

---

## ✍️ Exemple d’utilisation

```java
public class Exemple {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int resultat = division(a, b);
        System.out.println("Résultat : " + resultat);
    }

    public static int division(int x, int y) {
        return x / y;
    }
}
```

💥 Ce programme va provoquer une **erreur (division par zéro)**.
Avec le **débogueur**, tu peux **voir les valeurs de `x` et `y` avant le crash** !

---

## 🔧 Astuce : Modifier des valeurs pendant le débogage

Tu peux parfois **changer la valeur d’une variable** en cours d’exécution directement depuis l’onglet "Variables" → clic droit → **Set Value**.

---

## 🔁 Recommandation : fichier `launch.json` (optionnel)

Pour des projets plus complexes, tu peux créer un fichier `.vscode/launch.json` pour configurer le comportement du débogueur (fichier à lancer, arguments, etc.).

---

## 🧠 À retenir

* Le **débogueur** permet de **comprendre ton programme pas à pas**
* Tu peux :

  * Placer des **points d’arrêt**
  * Suivre l’exécution **ligne par ligne**
  * **Voir et modifier** les variables en temps réel
* C’est un outil **puissant pour apprendre, tester et corriger ton code**

---

### 🔹 **Exercice 1 : Observer les variables**

Crée un programme avec 3 variables entières. Calcule leur somme dans une 4e variable.
Ajoute un **point d’arrêt** sur la ligne du calcul pour observer les valeurs.

```java
public class Exo1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 3;

        int somme = a + b + c; // ← Place ton point d’arrêt ici

        System.out.println("Somme : " + somme);
    }
}
```

### 🎯 Objectif

* Lancer le **débogueur** (`F5`)
* Vérifier les valeurs de `a`, `b`, `c` et `somme` dans l’onglet **Variables**

---

### 🔹 **Exercice 2 : Suivre une boucle pas à pas**

Utilise une **boucle `for`** pour additionner des nombres.
Observe à chaque tour comment la variable `total` évolue.

```java
public class Exo2 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total += i; // ← Mets un point d’arrêt ici
        }

        System.out.println("Résultat final : " + total);
    }
}
```

### 🎯 Objectif

* Utiliser **Step Over** (⏭️) pour avancer ligne par ligne
* Observer **l’évolution de `total`** dans le **debug panel**

---

### 🔹 **Exercice 3 : Comprendre une erreur**

Ce programme va planter à l’exécution. Utilise le débogueur pour comprendre pourquoi.

```java
public class Exo3 {
    public static void main(String[] args) {
        int[] nombres = {1, 2, 3};

        for (int i = 0; i <= 3; i++) {
            System.out.println(nombres[i]); // ← Mets un point d’arrêt ici
        }
    }
}
```

### 🎯 Objectif

* Repérer **la cause de l’erreur**
* Utiliser le débogueur pour voir **la valeur de `i`** au moment du crash
* Corriger l’erreur (indice : attention à l’indice `3`)

---


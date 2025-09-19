+++
date = '2025-09-19T12:02:52-04:00'
weight = 1
title = 'For'
+++
---

# 🔁 Les boucles `for` en Java

La **boucle `for`** est utilisée pour **répéter une série d’instructions** un certain nombre de fois. C’est un outil fondamental pour parcourir des suites de valeurs, des tableaux, ou exécuter du code un nombre précis de fois.

---

## 🧱 Structure d’une boucle `for`

```java
for (initialisation; condition; incrémentation) {
    // instructions à répéter
}
```

| Partie           | Rôle                                             |
| ---------------- | ------------------------------------------------ |
| `initialisation` | Déclare et initialise une variable de boucle     |
| `condition`      | Détermine si la boucle continue ou s’arrête      |
| `incrémentation` | Modifie la variable de boucle à chaque itération |

---

## 🔂 Exemple de base

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i vaut : " + i);
}
```

🔎 Ce code va afficher :

```
i vaut : 0  
i vaut : 1  
i vaut : 2  
i vaut : 3  
i vaut : 4  
```

💡 Ici :

* `int i = 0;` → On commence à 0
* `i < 5;` → Tant que `i` est **strictement inférieur** à 5
* `i++` → On **incrémente** `i` de 1 à chaque tour

---

## 🎯 Quand utiliser une boucle `for` ?

Utilise `for` quand :

* Le **nombre d’itérations est connu à l’avance**
* Tu veux **parcourir** une suite de valeurs
* Tu veux **répéter une action** un nombre précis de fois

---

## 🔁 Boucles décroissantes

Tu peux faire une boucle **en sens inverse** :

```java
for (int i = 5; i > 0; i--) {
    System.out.println("Compte à rebours : " + i);
}
```

---

## 🔎 Exemples pratiques

### 🔢 Afficher les nombres de 1 à 10

```java
for (int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
// Résultat : 1 2 3 4 5 6 7 8 9 10
```

### 🟰 Afficher uniquement les nombres pairs

```java
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
```

---

## ⚠️ Attention aux pièges

* Si tu oublies de mettre à jour la variable de boucle (`i++`), tu risques une **boucle infinie**.
* La **condition** est évaluée à chaque tour. Dès qu’elle est fausse, la boucle s’arrête.

---

## 🧠 À retenir

* La boucle `for` est idéale pour les **répétitions contrôlées**.
* Elle comporte **3 parties** : initialisation, condition, incrémentation.
* Elle est souvent utilisée avec des **compteurs**, des **indices de tableaux**, ou pour **générer des suites**.

---

### 🔹 **Exercice 1 : Afficher les entiers de 1 à 5**

Utilise une boucle `for` pour afficher les nombres **de 1 à 5**, chacun sur une nouvelle ligne.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Boucle de 1 à 5
       
    }
}
```

### Sortie attendue

```
1  
2  
3  
4  
5
```

---

### 🔹 **Exercice 2 : Nombres pairs entre 0 et 10**

Utilise une boucle `for` pour afficher uniquement les **nombres pairs** de **0 à 10**.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Boucle pour les nombres pairs
       
    }
}
```

### Sortie attendue

```
0  
2  
4  
6  
8  
10
```

---

### 🔹 **Exercice 3 : Compte à rebours**

Utilise une boucle `for` pour faire un **compte à rebours** de **5 à 1**, puis affiche `"Go !"` à la fin.

```java
public class Exo3 {
    public static void main(String[] args) {
        // Compte à rebours
       
    }
}
```

### Sortie attendue

```
5  
4  
3  
2  
1  
Go !
```

---

### 🔹 **Exercice 4 : Afficher un tableau**


Utilise une boucle `for` pour afficher le tableau suivant : {43,256,3,796,35,67}

```java
public class Exo3 {
    public static void main(String[] args) {
        // Compte à rebours
       
    }
}
```

### Sortie attendue

```
43
256
3
796
35
67
```

---

### 🔹 **Exercice 5 : Afficher un tableau sexy**


Utilise une boucle `for` pour afficher le tableau suivant : {43,256,3,796,35,67}

```java
public class Exo3 {
    public static void main(String[] args) {
        // Compte à rebours
       
    }
}
```

### Sortie attendue

```
[43,256,3,796,35,67]
```

---
+++
date = '2025-09-19T12:03:05-04:00'
weight = 3
title = 'Do While'
+++


---

## 🔁 La boucle `do-while` en Java

La boucle **`do-while`** permet de **répéter une série d’instructions au moins une fois**, puis **tant qu’une condition est vraie**.

C’est la **seule boucle en Java** où la condition est testée **après** l’exécution du bloc.

---

## 🧱 Structure d’une boucle `do-while`

```java
do {
    // instructions à exécuter
} while (condition);
```

| Élément      | Rôle                                                |
| ------------ | --------------------------------------------------- |
| bloc de code | S’exécute **au moins une fois**, puis à chaque tour |
| `condition`  | Est **testée après** chaque itération               |

---

## 🔂 Exemple simple

```java
int i = 0;

do {
    System.out.println("i vaut : " + i);
    i++;
} while (i < 5);
```

🔎 Ce code va afficher :

```
i vaut : 0  
i vaut : 1  
i vaut : 2  
i vaut : 3  
i vaut : 4
```

💡 Même si la condition est fausse dès le départ, **le bloc s'exécute au moins une fois** :

```java
int i = 10;

do {
    System.out.println("Exécuté !");
} while (i < 5);
```

➡️ Résultat : `Exécuté !`

---

## 🎯 Quand utiliser `do-while` ?

Utilise `do-while` quand :

* Tu veux **forcer au moins une exécution**
* Tu veux **demander une action**, puis **vérifier si elle doit être répétée**
* C’est utile pour les **menus**, **saisies utilisateur**, etc.

---

## 🔁 Exemple pratique : demander un mot de passe

```java
Scanner scanner = new Scanner(System.in);
String motDePasse;

do {
    System.out.print("Entrez le mot de passe : ");
    motDePasse = scanner.nextLine();
} while (!motDePasse.equals("secret123"));
```

---

## ⚠️ Attention

* Comme dans `while`, **si la condition reste vraie**, la boucle **ne s’arrête jamais**.
* Bien penser à **modifier les variables** qui influencent la condition.

---

## 🧠 À retenir

* La boucle `do-while` **s'exécute toujours au moins une fois**.
* Elle teste la condition **après** chaque tour.
* Idéale pour les **saisies utilisateur**, les **menus interactifs**, etc.

---

### 🔹 **Exercice 1 : Afficher les nombres de 1 à 5**

Utilise une boucle `do-while` pour afficher les nombres de **1 à 5**.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Initialisation de la variable
        
        // Boucle do-while de 1 à 5
        
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

### 🔹 **Exercice 2 : Compte à rebours**

Utilise une boucle `do-while` pour afficher un **compte à rebours de 5 à 1**, puis affiche `"Go !"`.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Initialisation de la variable
        

        // Boucle do-while de décompte
       
        // Affichage final "Go !"
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

### 🔹 **Exercice 3 : Somme croissante**

Utilise une boucle `do-while` pour additionner des valeurs de 2 en 2, en partant de 0,
et affiche la somme à chaque étape, tant que la somme est **inférieure ou égale à 10**.

```java
public class Exo3 {
    public static void main(String[] args) {
        // Initialisation de la somme
        

        // Boucle do-while d’addition
       
    }
}
```

### Sortie attendue

```
Somme : 2  
Somme : 4  
Somme : 6  
Somme : 8  
Somme : 10
```

---

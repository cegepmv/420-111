+++
date = '2025-09-19T12:02:57-04:00'
weight = 2
title = 'While'
+++


---

## 🔁 La boucle `while` en Java

La boucle **`while`** permet de **répéter des instructions tant qu'une condition est vraie**. C’est une structure de contrôle très utile quand **on ne connaît pas à l’avance le nombre d’itérations**.

---

## 🧱 Structure d’une boucle `while`

```java
while (condition) {
    // instructions à exécuter
}
```

| Élément      | Rôle                                           |
| ------------ | ---------------------------------------------- |
| `condition`  | Tant qu’elle est **vraie**, la boucle continue |
| bloc de code | Ce qui est exécuté à **chaque tour**           |

---

## 🔂 Exemple simple

```java
int i = 0;

while (i < 5) {
    System.out.println("i vaut : " + i);
    i++;
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

💡 La **condition est testée avant chaque itération**. Dès qu’elle devient fausse, la boucle s’arrête.

---

## 🎯 Quand utiliser une boucle `while` ?

Utilise `while` quand :

* Tu ne sais **pas à l’avance combien de fois** tu vas répéter l’action
* Tu veux **réagir à une condition dynamique**, par exemple une **entrée utilisateur**
* Tu veux **attendre** qu’une certaine situation se produise

---

## ⚠️ Attention à la condition !

Si la **condition ne devient jamais fausse**, la boucle tourne **à l’infini** :

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    // i++; ← Oublié ! Boucle infinie
}
```

🧯 Toujours vérifier que la **condition peut devenir fausse à un moment donné**.

---

## 🔁 Exemples pratiques

### 🧮 Lire jusqu’à ce que l’utilisateur tape 0

```java
Scanner scanner = new Scanner(System.in);
int n = -1;

while (n != 0) {
    System.out.print("Entrez un nombre (0 pour arrêter) : ");
    n = scanner.nextInt();
}
```

### ⏳ Boucle d’attente

```java
boolean telechargeFini = false;

while (!telechargeFini) {
    // Vérifie l'état du téléchargement
    // ...
}
```

---

## 🧠 À retenir

* La boucle `while` **teste la condition avant** chaque tour.
* Elle est parfaite pour les **répétitions indéterminées**.
* Toujours s’assurer qu’un **élément fait évoluer la condition**, sinon boucle infinie !

---


### 🔹 **Exercice 1 : Compter jusqu’à 5**

Utilise une boucle `while` pour afficher les nombres de **1 à 5**.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Initialisation de la variable
        
        // Boucle while de 1 à 5
       
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

Utilise une boucle `while` pour afficher un **compte à rebours de 5 à 1**, puis affiche `"Go !"`

```java
public class Exo2 {
    public static void main(String[] args) {
        // Initialisation de la variable
        

        // Boucle de décompte
       
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


### 🔹 **Exercice 3 : Somme cumulée jusqu’à un seuil**

Utilise une boucle `while` pour additionner des nombres jusqu’à ce que la **somme dépasse 20**.
À chaque tour, **ajoute 5** et affiche la somme actuelle.

```java
public class Exo3 {
    public static void main(String[] args) {
        // Initialisation de la somme
        

        // Boucle tant que la somme est ≤ 20
       
    }
}
```

### Sortie attendue

```
Somme : 5  
Somme : 10  
Somme : 15  
Somme : 20  
Somme : 25
```

---

### 🔹 **Exercice 4 : Afficher un tableau**


Utilise une boucle `while` pour afficher le tableau suivant : {43,256,3,796,35,67}

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


Utilise une boucle `while` pour afficher le tableau suivant : {43,256,3,796,35,67}

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
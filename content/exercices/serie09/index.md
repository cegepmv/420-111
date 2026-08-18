+++
date = '2025-08-20T19:02:55-04:00'
title = 'Série 9'
weight = 9
+++

# 🔴 NIVEAU 9 — LES BOUCLES FOR

### 📜 Histoire

*Pourquoi répéter du code manuellement quand une boucle peut le faire pour toi? Découvre la boucle `for`, l'un des outils les plus puissants de Java!*

💎 Points : ⭐⭐⭐⭐ Difficulté : experte

---

# 🔁 **Exercices – Boucles `for` en Java avec `args[]` et tableaux**

---

### 🧪 **Exercice 1**

💡 Utilise une boucle `for` pour afficher tous les arguments passés à l'exécution.

> Exécution :

```bash
java Main Alice Bob Carla
```
 
### Objectif :
 
Afficher :

```
Argument 0 : Alice  
Argument 1 : Bob  
Argument 2 : Carla
```

---

### 🧪 **Exercice 2**

```java
int[] nombres = {4, 7, 2, 9};
```

Utilise une boucle `for` pour calculer et afficher la somme des éléments.

### Sortie attendue

```
Somme des éléments : 22
```

---

### 🧪 **Exercice 3**

```java
String[] mots = {"Java", "Programmation", "Code", "Tableau", "if"};
```

Utilise une boucle `for` et `if` pour compter combien de mots ont une longueur ≥ 5.

### Sortie attendue

```
Mots de 5 lettres ou plus : 2
```

---

### 🧪 **Exercice 4**

Exécution :

```bash
java Main 10 15 20
```

Convertis chaque argument en `int` et calcule la moyenne avec une boucle `for`.

### Sortie attendue

```
Nombres reçus : 10 15 20  
Moyenne : 15.0
```

---

### 🧪 **Exercice 5**

```java
int[][] matrice = {
  {1, 2, 3},
  {4, 5, 6}
};
```

Utilise deux `for` pour afficher tous les éléments ligne par ligne.

### Sortie attendue

```
1 2 3  
4 5 6
```

---

# 🔁 **Exercices – Boucle `while` en Java**

---

### 🧪 **Exercice 6**

Utilise une boucle `while` pour afficher les entiers de 1 à 5.

### Sortie attendue

```
1
2
3
4
5
```

---

### 🧪 **Exercice 7**

Exécution :

```bash
java Main Bonjour stop Encore
```

Utilise `while` pour afficher chaque mot de `args[]` **jusqu'à** ce que le mot `"stop"` soit rencontré.

> Ne pas afficher `"stop"` lui-même.

### Sortie attendue

```
Argument 0 : Bonjour
```

---

### 🧪 **Exercice 8**

```java
int[] notes = {12, 15, 9};
```

Utilise `while` pour afficher chaque note.

### Sortie attendue

```
Note 0 : 12
Note 1 : 15
Note 2 : 9
```

---

### 🧪 **Exercice 9**

```java
int a = 3;
int b = 10;
```

Utilise `while` pour afficher les entiers **pairs uniquement** entre `a` et `b` inclus.

### Sortie attendue

```
Nombre pair : 4
Nombre pair : 6
Nombre pair : 8
Nombre pair : 10
```

---

### 🧪 **Exercice 10**

Exécution :

```bash
java Main 2 4 6 8
```

Utilise `while` pour convertir chaque `args[i]` en `int` et calculer leur somme.

### Sortie attendue

```
Somme : 20
```

---



### 🧪 **Exercice 11**

Utilise une boucle `do...while` pour afficher les entiers de 1 à 5.

### Sortie attendue

```
1
2
3
4
5
```

---

### 🧪 **Exercice 12**

```java
int[] nombres = {10, 20, 30};
```

Utilise une boucle `do...while` pour afficher tous les éléments du tableau.

### Sortie attendue

```
Élément 0 : 10  
Élément 1 : 20  
Élément 2 : 30
```

---


### 🧪 **Exercice 13**

```java
String mot = "Java";
```

Utilise une boucle `do...while`

### Sortie attendue

```
Lettre 0 : J  
Lettre 1 : a  
Lettre 2 : v  
Lettre 3 : a
```

---


# 🔁 **Exercices – Boucles `for-each` en Java**

---

### 🧪 **Exercice 14**

Exécution :

```bash
java Main ChatGPT OpenAI Java
```

Affiche tous les arguments avec une boucle `for-each`.

### Sortie attendue

```
Argument : ChatGPT
Argument : OpenAI
Argument : Java
```

---

### 🧪 **Exercice 15**

```java
int[] nombres = {3, 6, 9, 12};
```

Utilise `for-each` pour calculer et afficher la somme.

### Sortie attendue

```
Somme des éléments : 30
```

---

### 🧪 **Exercice 16**

```java
String mot = "Hello";
```

Utilise une boucle `for-each` (sur un tableau de `char`) pour afficher chaque lettre.

### Sortie attendue

```
H
e
l
l
o
```

---

### 🧪 **Exercice 17 – Table de multiplication**

Affiche la table de multiplication de 1 à 5.

Utilise deux boucles `for` imbriquées.

### Sortie attendue

```
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
```

---

### 🧪 **Exercice 18**

Affiche un escalier  (`*`).



### Sortie attendue

```
    *
   **    
  ***    
 ****    
*****    
```

---

### 🧪 **Exercice 19**

```java
int[][] A = {
  {1, 2},
  {3, 4}
};
int[][] B = {
  {5, 6},
  {7, 8}
};
```

Utilise des boucles imbriquées pour additionner A et B élément par élément, puis affiche la matrice résultat.

### Sortie attendue

```
6  8 
10 12 
```

---

### 🧪 **Exercice 20**

Suppose que `args[]` contient 6 mots.

Affiche les mots en **grille 2 lignes x 3 colonnes**, chaque colonne fait 8 espaces de large.

Exécution :

```bash
java Main un deux trois quatre cinq six
```

### Sortie attendue

```
un      deux    trois 
quatre  cinq    six 
```

---



### 🧪 **Exercice 21 **

Utilise une boucle `for` et un `break` pour afficher les nombres de 1 à 10, mais arrête la boucle dès que le nombre atteint 6.

### Sortie attendue

```
1
2
3
4
5
6
```

---

### 🧪 **Exercice 22**

Utilise une boucle `for` et un `continue` pour afficher les nombres de 1 à 10, mais saute le nombre 5 (ne l’affiche pas).

### Sortie attendue

```
1
2
3
4
6
7
8
9
10
```

---

### 🧪 **Exercice 23**

```java
String[] mots = {"chat", "chien", "", "oiseau"};
```

Parcours le tableau avec une boucle `for`. Affiche la position du premier mot vide (`""`) et arrête la boucle grâce à `break`.

### Sortie attendue

```
Première chaîne vide à l’indice : 2
```

---

### 🧪 **Exercice 24 **

```java
String[] mots = {"arbre", "Grizzly", "chat", "animal", "chien"};
```

Utilise `continue` dans une boucle `for` pour n’afficher que les mots qui ne contiennent pas la lettre `'a'`.

### Sortie attendue

```
Grizzly
chien
```

---

### 🧪 **Exercice 25**

À partir de l’adresse suivante :

```java
String email = "alexandre.durand@example.com"
```

Affiche une version "masquée" :

```text
a***************@example.com
```

{{% solutions-link "9" %}}

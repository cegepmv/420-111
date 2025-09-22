+++
date = '2025-08-20T19:03:03-04:00'
title = 'Série 10'
weight = 10
+++


### 🧪 **Exercice 1**

Crée une fonction `saluer` qui prend un paramètre `String nom` et affiche :
`Bonjour [nom]!`

---

### 🧪 **Exercice 2**

Crée une fonction `somme` qui prend deux entiers en paramètres et retourne leur somme.
Affiche le résultat de `somme(5, 7)`.
 
--- 

### 🧪 **Exercice 3**

Crée une fonction `max` qui prend deux entiers et retourne le plus grand.
Teste-la avec les valeurs `8` et `12`.


---

### 🧪 **Exercice 4**

Crée une fonction `moyenne` qui prend trois `double` et retourne leur moyenne.
Affiche la moyenne de `12.5, 15.0, 17.5`.

---

### 🧪 **Exercice 5**

Crée une fonction `estPair` qui prend un entier et retourne `true` si le nombre est pair, sinon `false`.
Teste-la avec le nombre `11`.

---

### 🧪 **Exercice 6**

Crée une fonction `factorielle` qui calcule la factorielle d’un entier positif (exemple : `factorielle(5)` = 120).
Affiche la factorielle de 5.

---

### 🧪 **Exercice 7**

Crée une fonction `inverse` qui prend une chaîne `String` en paramètre et retourne la chaîne inversée.
Teste-la avec `"Java"`.



---

### 🧪 **Exercice 8**

Crée une fonction `maxTableau` qui prend un tableau d’entiers et retourne la valeur maximale.
Teste-la avec `{3, 9, 2, 14, 5}`.

---

Voici une reformulation plus claire et fluide de l'exercice :

---

### **Exercice 9**

1. Écrivez une fonction qui prend en paramètre un entier `nbElement` et retourne un tableau contenant `nbElement` entiers aléatoires compris entre 0 et 100 (inclus).
   *(Astuce : utilisez [Math.random](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random))*.

2. Dans la fonction principale (`main`), appelez cette fonction pour générer un tableau avec `nbElement` valeurs, puis affichez chaque valeur du tableau sur une ligne différente.

---

### **Exemple de sortie attendue pour `nbElement = 5` :**

```
45
30
56
77
34
```

---

# Exo_10


**Exercice** :  

Faites une fonction pour afficher le tableau généré à la question précédente sous un format plus esthétique

**Exemple de sortie attendue** :
```
[45,30,56,77,34]
```

---

# Exo_11

**Exercice** :  

Reprenez le code de la question précédente.

- Trouvez le maximum et le minimum du tableau, puis affichez-les. Utiliser 2 méthodes (findMax et findMin)

**Exemple de sortie attendue** :
```
[45,30,56,77,34]
Le maximum est : 77
Le minimum est : 30
```

--------------------------



# Exo_12 - Utilisation du return


**Exercice** :

Écrivez une méthode qui reçoit 2 tableaux d’entiers en paramètre. Il affiche les 2 tableaux. Il affiche ensuite identique si les 2 tableaux ont le même nombre d’éléments et que tous les éléments au même index sont égaux, sinon il affiche différent.

```
[5,1,2,2,1,4,5,6,6,7]
[5,1,2,2,1,4,5,6,6,7]
Identique
```
```
[5,1,2,2,1,4,5,6,6,7]
[5,1,2,2,0,4,5,6,6,7]
Différent
```

# Exo_13


**Exercice** :

Créez une méthode pour compter combien de voyelles (`a, e, i, o, u, y`) il y a dans un tableau de caractères passée en paramètre.

- Créez un tableau de caractères : `['a', 'b', 'e', 'f', 'i', 'o', 'u', 'p']`.
- Utilisez une boucle pour compter combien de voyelles il y a dans le tableau et affichez le résultat.

**Exemple de sortie attendue** :
```
Il y a 5 voyelles dans le tableau.
```

# Exo_14


 Faites une méthode qui vérifie et retourne un booléen si un mots est un palindrome (le mot est identique lorsqu'il est lu de gauche à droite ou de droite à gauche). (Ex: laval)


**Exemple de sortie attendue** :
```java
true  //Laval 
false // Patate
```
---

# Exo_15


**Exercice** :

 - Faites une méthode qui prend en paramètre un tableau de int et un int.
 - Renvoi true si le 2e paramètre est dans le tableau.

**Exemple de sortie attendue** :
```
true
```


# Exo_16


**Exercice** :

Remplacer une lettre donnée dans une chaîne par une autre lettre.

- Créez une chaîne de caractères.
- Remplacez toutes les occurrences d'un caractère spécifique par un autre caractère.

**Exemple de chaîne** : `"banana"`  
**Remplacer `'a'` par `'o'`**

**Exemple de sortie attendue** :
```
La chaîne après remplacement est : bonono
```

# Exo_17

Niveau : 3 ⭐ 

Compter combien de fois un caractère apparaît dans une chaîne.

**Exercice** :
- Faites une méthode qui prend en paramètre une chaîne de caractères.
- Comptez et affichez combien de fois un caractère spécifique (par exemple `'o'`) apparaît dans la chaîne.

**Exemple de chaîne** : `"Hello World"`

**Exemple de sortie attendue** :
```
2
```

---
# Exo_18

**Exercice** :  
```java
 public static int[] fusionTab(int[] tab1, int[] tab2) {

 }
```
Fusionner deux tableaux dans un seul tableau.
 
```java
public static void main(String[] args) {
    int[] tab1 = {1 , 2 , 3};
    int[] tab2 = {4 , 5 , 6};
    int[] tab3;

    tab3 = fusionTab(tab1, tab2);
    afficherTableau(tab3);
}
```
**Exemple de sortie attendue** :



```
Tableau fusionné : [1, 2, 3, 4, 5, 6]
```

---


# Exo_19


**Exercice** :  
Créez une méthode qui reçois l'entier n.
- Créez un tableau d'entiers de taille n. Remplissez le de n nombres aléatoires entre 0 et 100. 
- Affichez le
- Inverser l'ordre des éléments du tableau.
- Affichez le

**Exemple de sortie attendue** :
```
[45,30,56,77,34]
[34,77,56,30,45]
```


<a href="https://github.com/cegepmv/420-111/tree/main/soltions/serie10">Solutions</a>

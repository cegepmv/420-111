+++
title = "Solutionnaire"
weight = 1
hidden = true
+++

# Solutionnaire des exercices

Voici une proposition de solution pour chaque exercice. Il existe souvent **plusieurs bonnes façons** d'écrire un même script : compare ta solution avec celle-ci, mais ne t'inquiète pas si ton script est différent tant qu'il fonctionne correctement!

---

### Exo 1 — Programme de calcul

```
demander "Choisis un nombre entier" et attendre
mettre [résultat] à (réponse)
mettre [résultat] à ((résultat) * 4)
mettre [résultat] à ((résultat) - 1)
mettre [résultat] à ((résultat) * 2)
mettre [résultat] à ((résultat) + 7)
dire (résultat)
```

Pour obtenir 77, il faut résoudre : (n×4 − 1)×2 + 7 = 77, donc n = 9.

---

### Exo 2 — Deux variables

Avec une seule variable, on perdrait la valeur du **nombre de départ** dès qu'on la remplacerait par le résultat intermédiaire — impossible ensuite de faire "résultat × nombre de départ". Il faut donc conserver les deux valeurs séparément :

```
demander "Nombre de départ ?" et attendre
mettre [nombre de départ] à (réponse)
mettre [résultat] à ((nombre de départ) + 2)
mettre [résultat] à ((résultat) * (nombre de départ))
mettre [résultat] à ((résultat) + 1)
dire (résultat)
```

---

### Exo 3 — La dernière lettre d'un mot

```
demander "Quel est le mot ?" et attendre
mettre [mot] à (réponse)
dire (lettre (longueur de (mot)) de (mot))
```

---

### Exo 4 — La lettre du milieu

```
demander "Quel est le mot ?" et attendre
mettre [mot] à (réponse)
si ((longueur de (mot)) mod 2) = 1 alors
    dire (lettre (arrondi de ((longueur de (mot)) / 2)) de (mot))
sinon
    dire "Ce mot a un nombre pair de lettres, il n'y a pas de lettre du milieu unique"
```

Avec un mot de longueur paire, il y a deux lettres "du milieu" (par exemple pour un mot de 6 lettres, ce sont les lettres 3 et 4). Il faudrait ajouter un `sinon` qui affiche les deux lettres centrales plutôt qu'une seule.

---

### Exo 5 — Dessiner un triangle

```
quand [drapeau vert] cliqué
lever le stylo
aller à x:(0) y:(0)
s'orienter à (90)
mettre le stylo en position d'écriture
avancer de (200) pas
tourner ↻ de (90) degrés
avancer de (150) pas
s'orienter à (135)
avancer de (250) pas
lever le stylo
```

(La longueur du dernier côté, l'hypoténuse, se calcule avec le théorème de Pythagore : √(200² + 150²) = 250.)

---

### Exo 6 — La somme de 1 à 100

```
mettre [somme] à 0
mettre [i] à 1
répéter (100) fois
    mettre [somme] à ((somme) + (i))
    mettre [i] à ((i) + 1)
dire (somme)
```

---

### Exo 7 — La somme des nombres impairs

```
mettre [somme] à 0
mettre [i] à 1
répéter (500) fois
    mettre [somme] à ((somme) + (i))
    mettre [i] à ((i) + 2)
dire (somme)
```

---

### Exo 8 — Compter les 6

```
mettre [compteur] à 0
répéter (20) fois
    si (nombre aléatoire entre (1) et (6)) = 6 alors
        mettre [compteur] à ((compteur) + 1)
dire (compteur)
```

Le résultat change à chaque exécution car les lancers sont **aléatoires** : chaque tirage a une probabilité indépendante de tomber sur 6.

---

### Exo 9 — La somme de deux dés

```
mettre [dé1] à (nombre aléatoire entre (1) et (6))
mettre [dé2] à (nombre aléatoire entre (1) et (6))
dire ((dé1) + (dé2))
```

On ne peut jamais obtenir 0, car chaque dé donne au minimum 1 (le minimum possible est donc 2).

Pour 100 lancers, on ajoute une boucle `répéter (100) fois` autour du script — les résultats se concentrent surtout autour de 7 (la somme la plus probable avec deux dés à 6 faces).

---

### Exo 10 — Différence entre deux nombres

```
demander "Premier nombre ?" et attendre
mettre [n1] à (réponse)
demander "Deuxième nombre ?" et attendre
mettre [n2] à (réponse)
si (n1) > (n2) alors
    dire ((n1) - (n2))
sinon
    dire ((n2) - (n1))
```

---

### Exo 11 — Racine carrée

```
demander "Quel est le nombre ?" et attendre
mettre [nombre] à (réponse)
si (nombre) > 0 alors
    dire (racine carrée de (nombre))
sinon
    dire "Il fallait entrer un nombre positif"
```

---

### Exo 12 — Le plus grand de trois nombres

```
demander "Nombre 1 ?" et attendre
mettre [n1] à (réponse)
demander "Nombre 2 ?" et attendre
mettre [n2] à (réponse)
demander "Nombre 3 ?" et attendre
mettre [n3] à (réponse)
mettre [max] à (n1)
si (n2) > (max) alors
    mettre [max] à (n2)
si (n3) > (max) alors
    mettre [max] à (n3)
dire (max)
```

---

### Exo 13 — Triangle rectangle

```
demander "Petit côté a ?" et attendre
mettre [a] à (réponse)
demander "Côté moyen b ?" et attendre
mettre [b] à (réponse)
demander "Grand côté c ?" et attendre
mettre [c] à (réponse)

si (a) + (b) > (c) alors
    dire "Ces longueurs forment bien un triangle"
    si (((a)*(a)) + ((b)*(b))) = ((c)*(c)) alors
        dire "Ce triangle est rectangle"
    sinon
        dire "Ce triangle n'est pas rectangle"
sinon
    dire "Ces longueurs ne forment pas un triangle"
```

---

### Exo 14 — Le jeu du dé

```
demander "Choisis un nombre entre 1 et 6" et attendre
mettre [choix] à (réponse)
mettre [dé] à (nombre aléatoire entre (1) et (6))
si (dé) = (choix) alors
    dire "Bravo, tu as gagné !"
sinon
    dire (assembler "Perdu ! Le dé a affiché " (dé))
```

---

### Exo 15 — Pair ou impair (division)

```
demander "Quel est le nombre ?" et attendre
mettre [nombre] à (réponse)
si ((nombre) mod 2) = 0 alors
    dire ((nombre) / 2)
sinon
    dire (((nombre) - 1) / 2)
```

---

### Exo 16 — Conversion d'unités

```
demander "Mesure en mètres ?" et attendre
mettre [mètres] à (réponse)
demander "Convertir en cm ou mm ? (tape cm ou mm)" et attendre
si (réponse) = "cm" alors
    dire (assembler ((mètres) * 100) " cm")
sinon
    dire (assembler ((mètres) * 1000) " mm")
```

---

### Exo 17 — Petite calculatrice

```
demander "Premier nombre ?" et attendre
mettre [n1] à (réponse)
demander "Deuxième nombre ?" et attendre
mettre [n2] à (réponse)
demander "Opération ? (A, M ou S)" et attendre
mettre [code] à (réponse)

si (code) = "A" alors
    dire ((n1) + (n2))
sinon
    si (code) = "M" alors
        dire ((n1) * (n2))
    sinon
        si (code) = "S" alors
            dire ((n1) - (n2))
```

Pour ajouter la **division**, il faudrait vérifier que `n2` n'est pas égal à 0, sinon le calcul serait impossible (division par zéro).

---

### Exo 18 — Calcul en chaîne

```
demander "Choisis un nombre" et attendre
mettre [résultat] à (réponse)
mettre [résultat] à ((résultat) * 2)
mettre [résultat] à ((résultat) + 11)
mettre [résultat] à ((résultat) * 10)
dire (résultat)
```

---

### Exo 19 — Prix réduit

```
demander "Quel est le prix ?" et attendre
mettre [prix] à (réponse)
demander "Quel est le taux de réduction (%) ?" et attendre
mettre [taux] à (réponse)
mettre [réduction] à (((prix) * (taux)) / 100)
dire (assembler "Réduction : " (réduction))
dire (assembler "Prix réduit : " ((prix) - (réduction)))
```

---

### Exo 20 — Produit moins 10

```
demander "Premier nombre ?" et attendre
mettre [n1] à (réponse)
demander "Deuxième nombre ?" et attendre
mettre [n2] à (réponse)
mettre [résultat] à (((n1) * (n2)) - 10)
```

---

### Exo 21 — Augmenter de la moitié

```
demander "Quel est le nombre ?" et attendre
mettre [nombre] à (réponse)
mettre [résultat] à ((nombre) + ((nombre) / 2))
```

---

### Exo 22 — Somme puis produit

```
demander "Premier nombre ?" et attendre
mettre [n1] à (réponse)
demander "Deuxième nombre ?" et attendre
mettre [n2] à (réponse)
demander "Troisième nombre ?" et attendre
mettre [n3] à (réponse)
mettre [résultat] à (((n1) + (n2)) * (n3))
```

---

### Exo 23 — Le carré d'une différence

```
demander "Premier nombre ?" et attendre
mettre [n1] à (réponse)
demander "Deuxième nombre ?" et attendre
mettre [n2] à (réponse)
mettre [résultat] à (((n1) - (n2)) * ((n1) - (n2)))
```

---

### Exo 24 — Carré moins double

```
demander "Quel est le nombre ?" et attendre
mettre [nombre] à (réponse)
mettre [résultat] à (((nombre) * (nombre)) - ((nombre) * 2))
```

---

### Exo 25 — Une seule variable

**Avec trois variables :**

```
demander "Nombre 1 ?" et attendre
mettre [n1] à (réponse)
demander "Nombre 2 ?" et attendre
mettre [n2] à (réponse)
demander "Nombre 3 ?" et attendre
mettre [n3] à (réponse)
mettre [Total] à ((n1) + (n2) + (n3))
```

**Avec une seule variable** (on additionne directement chaque réponse à `Total` au fur et à mesure) :

```
mettre [Total] à 0
demander "Nombre 1 ?" et attendre
mettre [Total] à ((Total) + (réponse))
demander "Nombre 2 ?" et attendre
mettre [Total] à ((Total) + (réponse))
demander "Nombre 3 ?" et attendre
mettre [Total] à ((Total) + (réponse))
dire (Total)
```

---

### Exo 26 — L'hypoténuse

```
demander "Premier côté ?" et attendre
mettre [a] à (réponse)
demander "Deuxième côté ?" et attendre
mettre [b] à (réponse)
dire (racine carrée de (((a)*(a)) + ((b)*(b))))
```

---

### Exo 27 — Table de multiplication

```
demander "Quel est le nombre ?" et attendre
mettre [nombre] à (réponse)
supprimer tout de [table]
mettre [i] à 1
répéter (10) fois
    ajouter ((nombre) * (i)) à [table]
    mettre [i] à ((i) + 1)
```

---

### Exo 28 — Somme des entiers jusqu'à N

```
demander "Jusqu'à quel nombre ?" et attendre
mettre [n] à (réponse)
mettre [somme] à 0
mettre [i] à 1
répéter jusqu'à ce que (i) > (n)
    mettre [somme] à ((somme) + (i))
    mettre [i] à ((i) + 1)
dire (somme)
```

---

### Exo 29 — Moyenne de notes

**Version 1 (nombre de notes connu à l'avance) :**

```
supprimer tout de [notes]
demander "Combien de notes ?" et attendre
mettre [nb] à (réponse)
mettre [i] à 1
répéter (nb) fois
    demander "Entre une note :" et attendre
    ajouter (réponse) à [notes]
    mettre [i] à ((i) + 1)

mettre [somme] à 0
mettre [i] à 1
répéter (longueur de [notes]) fois
    mettre [somme] à ((somme) + (élément (i) de [notes]))
    mettre [i] à ((i) + 1)
dire ((somme) / (longueur de [notes]))
```

**Version 2 (arrêt avec -1) :**

```
supprimer tout de [notes]
demander "Entre une note (-1 pour arrêter) :" et attendre
répéter jusqu'à ce que (réponse) = -1
    ajouter (réponse) à [notes]
    demander "Entre une note (-1 pour arrêter) :" et attendre

mettre [somme] à 0
mettre [i] à 1
répéter (longueur de [notes]) fois
    mettre [somme] à ((somme) + (élément (i) de [notes]))
    mettre [i] à ((i) + 1)
dire ((somme) / (longueur de [notes]))
```

---

### Exo 30 — Croissance d'une population

```
mettre [population] à 100
répéter (5) fois
    mettre [population] à (arrondi de ((population) * 1.1))
dire (population)
```

---

### Exo 31 — Quatre dés

```
mettre [somme] à 0
répéter (4) fois
    mettre [somme] à ((somme) + (nombre aléatoire entre (1) et (6)))
dire (somme)
```

---

### Exo 32 — Lancers successifs

```
mettre [somme] à 0
mettre [lancers] à 0
répéter jusqu'à ce que (somme) > 25
    mettre [somme] à ((somme) + (nombre aléatoire entre (1) et (6)))
    mettre [lancers] à ((lancers) + 1)
dire (assembler "Nombre de lancers : " (lancers))
```

---

### Exo 33 — La suite de Fibonacci

```
mettre [terme1] à 1
mettre [terme2] à 1
répéter (8) fois
    mettre [terme3] à ((terme1) + (terme2))
    mettre [terme1] à (terme2)
    mettre [terme2] à (terme3)
dire (terme2)
```

(On répète 8 fois pour obtenir le 10e terme, puisque les termes 1 et 2 sont déjà donnés au départ.)

---

### Exo 34 — La division euclidienne

```
demander "Dividende ?" et attendre
mettre [dividende] à (réponse)
demander "Diviseur ?" et attendre
mettre [diviseur] à (réponse)

mettre [quotient] à 0
mettre [reste] à (dividende)
répéter jusqu'à ce que (reste) < (diviseur)
    mettre [reste] à ((reste) - (diviseur))
    mettre [quotient] à ((quotient) + 1)

dire (assembler "Quotient : " (quotient))
dire (assembler "Reste : " (reste))
```

---

### Exo 35 — Maximum et étendue

```
supprimer tout de [série]
répéter (5) fois
    demander "Entre un nombre :" et attendre
    ajouter (réponse) à [série]

mettre [max] à (élément (1) de [série])
mettre [min] à (élément (1) de [série])
mettre [i] à 2
répéter (4) fois
    si (élément (i) de [série]) > (max) alors
        mettre [max] à (élément (i) de [série])
    si (élément (i) de [série]) < (min) alors
        mettre [min] à (élément (i) de [série])
    mettre [i] à ((i) + 1)

dire (assembler "Maximum : " (max))
dire (assembler "Étendue : " ((max) - (min)))
```

*Défi (sans liste)* : on peut utiliser cinq variables `n1` à `n5` et comparer chaque variable une à une avec `si...alors` pour trouver le maximum et le minimum, sans jamais utiliser de liste.

---

### Exo 36 — La somme est-elle petite?

```
mettre [somme] à 0
répéter (4) fois
    mettre [somme] à ((somme) + (nombre aléatoire entre (1) et (6)))

si (somme) < 11 alors
    dire (assembler "La somme " (assembler (somme) " est inférieure à 11"))
sinon
    dire (assembler "La somme " (assembler (somme) " n'est pas inférieure à 11"))
```

---

### Exo 37 — Sommes particulières

```
demander "Quelle valeur de n ?" et attendre
mettre [n] à (réponse)
demander "1 = impairs, 2 = pairs, 3 = multiples de 3 ?" et attendre
mettre [choix] à (réponse)

mettre [somme] à 0
mettre [i] à 0
mettre [compteur] à 0

si (choix) = 1 alors
    mettre [i] à 1
    répéter (n) fois
        mettre [somme] à ((somme) + (i))
        mettre [i] à ((i) + 2)
sinon
    si (choix) = 2 alors
        mettre [i] à 0
        répéter (n) fois
            mettre [somme] à ((somme) + (i))
            mettre [i] à ((i) + 2)
    sinon
        mettre [i] à 0
        répéter (n) fois
            mettre [somme] à ((somme) + (i))
            mettre [i] à ((i) + 3)

dire (somme)
```

---

### Exo 38 — La somme des carrés

```
mettre [somme] à 0
mettre [i] à 1
répéter (100) fois
    mettre [somme] à ((somme) + ((i) * (i)))
    mettre [i] à ((i) + 1)
dire (somme)
```

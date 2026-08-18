+++
date = '2025-08-20T19:02:49-04:00'
title = 'Série 7'
weight = 7
+++

# 🟠 NIVEAU 7 — LES DÉCISIONS (IF/ELSE)

### 📜 Histoire

*Un vrai programme sait prendre des décisions! Maîtrise `if`, `else` et les conditions imbriquées pour donner de l'intelligence à ton code.*

💎 Points : ⭐⭐⭐ Difficulté : avancée

---

# 🔀 **Exercices – Structures de contrôle conditionnelles (if/else) en Java**

---

### 🧪 **Exercice 1**

Déclare un entier `int x = -3;`
Affiche s’il est positif ou négatif avec un message correspondant au résultat.


### Sortie attendue

```
Le nombre est négatif.
```

---

### 🧪 **Exercice 2**

Déclare `int n = 7;`
Affiche si le nombre est pair ou impair.

### Sortie attendue

```
Le nombre 7 est impair.
```

---

### 🧪 **Exercice 3**

Déclare :

```java
int a = 12;
int b = 20;
```

Affiche lequel est le plus grand. Affiche a et b sont égaux si c'est le cas.

### Sortie attendue

```
b est plus grand que a.
```

---

### 🧪 **Exercice 4**

Reçois une note en argument.

Affiche :

* "Excellent" si `note >= 16`
* "Bien" si `note >= 14`
* "Passable" si `note >= 12`
* "Échec" sinon

### Sortie attendue

```
Excellent
```

---

### 🧪 **Exercice 5**

Exécution :

```bash
java Main admin 1234
```

Si le nom est `"admin"` et le mot de passe est `"1234"`, affiche "Bienvenue admin", sinon "Identifiants incorrects".

### Sortie attendue

```
Bienvenue admin
```

---

```
L'année est bissextile.
```

---

### 🧪 **Exercice 6 **

Exécution :

```bash
java Main 12 16 10 12
```

Si la moyenne des 4 notes est supérieure ou égale à 12, affiche "Réussite", sinon "Échec".

### Sortie attendue

```
Réussite
```

---


### 🧪 **Exercice 7**

Exécution :

```bash
java Main bonjour bonjour
```

Compare les deux arguments (`args[0]` et `args[1]`) et affiche s’ils sont identiques.

Indice : Le if-else est-il vraiment nécessaire ici?

### Sortie attendue

```
bonjour et bonjour sont identiques : true
```


---

### 🧪 **Exercice 8**

```java
String[] mots = {"bonjour", "test", "interdit"};
```

Si un des éléments du tableau est `"interdit"`, affiche "Attention : mot interdit détecté."


### Sortie attendue

```
Attention : mot interdit détecté.
```

---


### 🧪 **Exercice 9**


Exécution :

```bash
java Main unMot
```

affiche :

* "Mot court" si < 5 lettres
* "Mot moyen" si ≤ 7 lettres
* "Mot long" sinon

### Sortie attendue

```
Mot : unMot
Longueur : 5
Mot moyen
```

---

---

### 🧪 **Exercice 10**

```java
int a = 5;
int b = 5;
int c = 5;
```

Affiche :

* "Équilatéral" si les 3 côtés sont égaux
* "Isocèle" si 2 côtés sont égaux
* "Scalène" sinon

### Sortie attendue

```
Triangle équilatéral
```

---

### 🧪 **Exercice 11 – Couleur selon code**

Exécution :

```bash
java Main G
```

Utilise `switch` pour :

* `"R"` → Rouge
* `"G"` → Vert
* `"B"` → Bleu
* Autre → Inconnu


### Sortie attendue

```
Code : G
Couleur : Vert
```

---

# 🎯 **Exercices – `if` ternaire (`?:`) en Java**

---

### 🧪 **Exercice 12 – Pair ou impair (ternaire)**
En une seule ligne de code determine si n est pair et affiche-le.

```java
int n = 7;
```

### Sortie attendue

```
Le nombre 7 est impair
```

---

### 🧪 **Exercice 13**

Exécution :

```bash
java Main 12
```

En une ligne de code affiche si l'âge entré en argument est considéré comme mineur ou majeur au Qc.

### Sortie attendue

```
Mineur
```

---

# 🧠 **Exercices – `switch` en Java**

---

### 🧪 **Exercice 14 – Menu utilisateur**

```java
String choix = "B";
```

Affiche selon :

* "A" → Accueil
* "B" → Profil
* "C" → Déconnexion
* Sinon → Option inconnue

### Sortie attendue

```
Profil
```

---

### 🧪 **Exercice 15 – Commande depuis les arguments**

Exécution :

```bash
java Main start
```


 
Utilise `switch` pour :

* "start" → Lancement du programme
* "stop" → Arrêt demandé
* "reset" → Réinitialisation
* Sinon → Commande inconnue

### Sortie attendue

```
Lancement du programme
```

---
{{% solutions-link "7" %}}

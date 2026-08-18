+++
date = '2025-08-20T19:02:35-04:00'
title = 'Série 3'
weight = 3
+++

# 🟢 NIVEAU 3 — LE TEXTE DÉMYSTIFIÉ

### 📜 Histoire

*Les chaînes de caractères cachent bien des secrets : longueur, lettres, morceaux... Deviens un·e expert·e de la classe `String`!*

💎 Points : 5 défis — ⭐ Difficulté : facile

---

### 🧪 **Exercice 1**

Déclare une chaîne de caractères :

```
Programmation Java.
```

1. Trouve le nombre de caractères dans la chaîne.
2. Affiche :

   ```text
   "La phrase contient 19 caractères"
   ```

   *(sans compter manuellement !)*

---

### 🧪 **Exercice 2**

À partir de :

```
ordinateur
```

1. Affiche le premier caractère
2. Affiche le dernier caractère 
3. Affiche le caractère à l'index 3

---

```text
o
r
i
```

---

### 🧪 **Exercice 3**

Déclare :

```
Bienvenue dans le monde Java
```

1. Extrais et affiche "Bienvenue"
2. Extrais et affiche "monde Java"
3. Extrais les 5 premiers caractères de la phrase et affiche-les

---
```
Bienvenue
monde Java
Bienv
```

---

### 🧪 **Exercice 4**

Déclare :

```
Bonjour Le Monde
```

1. Affiche le texte entièrement en majuscules
2. Affiche le texte entièrement en minuscules

---

### 🧪 **Exercice 5**

Crée les variables suivantes :

```java
Léa
23
```

Utilise `String.format()` ou `System.out.printf()` pour générer cette phrase (sans utiliser `+`) :

```text
"Léa a 23 ans."
```

Puis affiche-la.

---

### 🧪 **Exercice 6**
Déclare :

```
Disque dur
129.995678
```

Utilise `String.format()` pour afficher :

```text
Le produit Disque dur coûte 130.00$
```

> ⚠️ Arrondir à **2 chiffres après la virgule**.

---

### 🧪 **Exercice 7**

Déclare :

```java
String prenom = "julie";
String nom = "martin";
int age = 28;
String ville = "paris";
```

Affiche le message suivant, avec formatage correct :

```text
Nom complet : Julie MARTIN
Âge         : 28 ans
Ville       : Paris
```

> Contraintes :

* Première lettre du prénom en majuscule, le reste en minuscule
* Nom en majuscules
* Ville avec première lettre en majuscule
* Utilise **`String.format()`** pour aligner le tout


---

### 🧪 **Exercice 8**

À partir des données suivantes :

```java
String prenom = "Harry";
String nom = "Morin";
String anneeNaissance = "1995";
```

Génère un identifiant unique sous cette forme :

```text
Identifiant généré : MORIN_harry95
```

> Contraintes :

* Nom en majuscules
* Prénom en minuscules
* Les **deux derniers chiffres** de l’année de naissance


---

### 🧪 **Exercice 9 – Formater une facture**

Déclare les variables suivantes :

```java
String client = "Nora"
String produit = "Casque audio"
int quantite = 2;
double prixUnitaire = 59.99;
```

Affiche une facture formatée :

```
Facture
Client        : Nora
Produit       : Casque audio
Quantité      : 2
Prix unitaire : 59.99 $
Total HT      : 119.98 $
```

> Contraintes :

* Calcule le total avec `quantite * prixUnitaire`
* Affiche le total avec **2 décimales seulement**

{{% solutions-link "3" %}}

+++
date = '2025-08-21T20:52:37-04:00'
title = 'Règles/conventions'
+++

***

---

## 🟨 Règles de base en Java

🔤 **Sensibilité à la casse**
→ Java distingue **majuscules et minuscules**.
`nom` ≠ `Nom` ≠ `NOM`.

🧱 **Délimitation des blocs**
→ Tout bloc de code (classe, méthode, boucle, condition, etc.) est entouré par **accolades `{}`**.

🔚 **Fin des instructions**
→ Chaque ligne d’instruction se termine par un **point-virgule `;`**.

💬 **Commentaires dans le code :**

| Type                    | Syntaxe     | Usage                          |
| ----------------------- | ----------- | ------------------------------ |
| Commentaire une ligne   | `//`        | Pour un commentaire bref       |
| Commentaire multi-ligne | `/* ... */` | Pour expliquer un bloc de code |

```java
// Ceci est un commentaire simple

/* Ceci est
   un commentaire
   sur plusieurs lignes */
```

---

## 🟦 Nomenclature Java

* ✅ Une **fonction dans une classe** = une **méthode**.
* Elle appartient à **la classe dans laquelle elle est définie**.

---

## 🟩 Conventions de nommage (cours)

| Élément                    | Convention         | Exemple                     | Technique utilisée |
| -------------------------- | ------------------ | --------------------------- | ------------------ |
| **Classe**                 | Majuscule initiale | `Animal`, `VoitureBleue`    | PascalCase         |
| **Méthode**                | Minuscule initiale | `afficherNom()`             | camelCase          |
| **Variable**               | Minuscule initiale | `nomClient`, `ageMoyen`     | camelCase          |
| **Constante**              | MAJUSCULE + `_`    | `TAUX_DE_TAXE`              | SNAKE\_CASE        |
| **Variable locale simple** | Lettre courte      | `i`, `j` (dans les boucles) | — |


Les variables à une seule lettre sont permises uniquement pour un usage local (dans une boucle for, par exemple) par exemple i ou j. Toutes les autres variables doivent avoir un nom significatif. Les tableau doivent avoir un nom qui sous-entend la pluralité.

---

## 🟧 Indentation et lisibilité

✏️ L’indentation ne change pas le comportement du code, mais elle :

* rend le code **plus lisible**,
* montre la **structure logique** du programme.

### 📌 Règles :

1. **Indentation = tabulation** (ou 4 espaces selon le style).
2. Chaque bloc (`{}`) **augmente** le niveau d’indentation.
3. Respecter la **cohérence** : ne pas mélanger tabulations et espaces.
4. Bien **aligner les blocs imbriqués** : boucles, conditions, classes, etc.

#### Exemple :

```java
public class Exemple {

    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("Majeur");
        } else {
            System.out.println("Mineur");
        }
    }

}
```

---

### ✅ Résumé

| Élément           | Exemple             | Rappel           |
| ----------------- | ------------------- | ---------------- |
| Classe            | `MaClasse`          | PascalCase       |
| Méthode           | `afficherProfil()`  | camelCase        |
| Variable          | `ageUtilisateur`    | camelCase        |
| Constante         | `TAUX_DE_TVA`       | MAJUSCULES + `_` |
| Commentaire       | `//` ou `/* ... */` | pour documenter  |
| Bloc de code      | `{ ... }`           | avec indentation |
| Fin d'instruction | `;`                 | obligatoire      |


---

## 🟨 Conventions d’espacement en Java

Les **espaces** sont essentiels pour la **lisibilité du code**, mais doivent être utilisés de manière **cohérente**.

---

### 📌 1. Autour des opérateurs

✅ Toujours mettre **un espace** **avant et après** les opérateurs :

```java
int total = a + b - c * 2;
```

🚫 Mauvais :

```java
int total=a+b-c*2;
```

---

### 📌 2. Après les virgules

✅ Un espace **après chaque virgule**, pas avant :

```java
System.out.println(nom, age, ville);
```

🚫 Mauvais :

```java
System.out.println(nom,age,ville);
```

---

### 📌 3. Après les mots-clés (`if`, `for`, `while`, etc.)

✅ Mettre **un espace** entre le mot-clé et la parenthèse ouvrante :

```java
if (age >= 18) {
    System.out.println("Majeur");
}
```

🚫 Mauvais :

```java
if(age>=18){
```

---

### 📌 4. Entre les parenthèses et le contenu

✅ **Aucun espace** juste après `(` ou juste avant `)` :

```java
System.out.println(nom);
```

🚫 Mauvais :

```java
System.out.println( nom );
```

---

### 📌 5. Autour des accolades `{ }`

✅ L’accolade ouvrante est généralement **placée à la fin de la ligne de déclaration**, puis le bloc est indenté :

```java
public class Exemple {
    public static void main(String[] args) {
        if (x > 0) {
            System.out.println("Positif");
        }
    }
}
```

🚫 Mauvais :

```java
public class Exemple
{
    public static void main(String[] args)
    {
        if(x>0)
        {
            System.out.println("Positif");
        }
    }
}
```

*Note : Certaines équipes préfèrent les accolades sur une ligne séparée, mais **l’important est d’être cohérent dans tout le projet**.*

---

### 📌 6. Pas d’espace avant un point `.`

✅ Éviter tout espace avant ou après un point utilisé pour accéder aux membres :

```java
utilisateur.getNom();
```

🚫 Mauvais :

```java
utilisateur . getNom ();
```

---

## ✅ Résumé des règles d’espacement

| Cas                           | Bonne pratique               |
| ----------------------------- | ---------------------------- |
| Opérateurs                    | `a + b`, `x == y`, etc.      |
| Après une virgule             | `f(x, y)`                    |
| Mots-clés (`if`, `for`, etc.) | `if (` et non `if(`          |
| Parenthèses                   | `(x + 1)` et non `( x + 1 )` |
| Accès à un membre (`.`)       | `objet.methode()`            |
| Accolade ouvrante `{`         | Sur la **même ligne**        |

---




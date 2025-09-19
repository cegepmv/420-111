+++
date = '2025-09-19T13:17:08-04:00'
weight = 1
title = 'Parametres'
+++

---

## 📦 Les **paramètres** & le passage **par valeur** / **par référence** en Java

Quand tu appelles une **méthode**, tu peux lui **transmettre des informations** : ce sont les **paramètres**.

Mais comment sont-ils transmis ? Est-ce que la méthode peut **modifier les variables d’origine** ? C’est là qu’interviennent les notions de **passage par valeur** et **passage par référence**.

---

## 🎁 Définir et utiliser des paramètres

Une méthode peut recevoir **un ou plusieurs paramètres** :

```java
public static void direBonjour(String nom) {
    System.out.println("Bonjour, " + nom + " !");
}
```

🧪 Utilisation :

```java
direBonjour("Alice"); // Bonjour, Alice !
```

---

## 🔁 Passage de paramètres : **par valeur**

En **Java**, les **paramètres sont toujours passés par valeur**.
Mais attention : cela ne signifie **pas toujours** la même chose selon le **type** de la donnée.

---

### 1. 📌 Types **primitifs** (int, double, boolean, etc.)

✅ Le **contenu** de la variable est copié.
⛔ La méthode ne peut **pas modifier la variable d’origine**.

```java
public static void doubler(int x) {
    x = x * 2;
}

int a = 5;
doubler(a);
System.out.println(a); // Affiche 5 (pas 10)
```

➡️ `x` est une **copie** de `a`. Modifier `x` **n’affecte pas** `a`.

---

### 2. 📦 Objets (tableaux, String\[], ArrayList, classes…)

✅ La **référence vers l’objet** est copiée.
⚠️ Donc la méthode peut **modifier le contenu de l’objet**, mais pas **changer l’objet lui-même**.

```java
public static void changerPremier(int[] t) {
    t[0] = 99;
}

int[] tableau = {1, 2, 3};
changerPremier(tableau);
System.out.println(tableau[0]); // Affiche 99
```

➡️ On a **modifié l’objet pointé**, mais pas remplacé `tableau`.

---

### ❌ Remplacer un objet (impossible)

```java
public static void remplacer(int[] t) {
    t = new int[]{9, 9, 9};
}

int[] monTab = {1, 2, 3};
remplacer(monTab);
System.out.println(monTab[0]); // Toujours 1
```

➡️ `t` reçoit une **nouvelle référence**, mais **monTab ne change pas**.

---

## 🧠 Résumé : valeur ou référence ?

| Type                         | Passage par…       | Peut modifier l’original ?         |
| ---------------------------- | ------------------ | ---------------------------------- |
| `int`, `double`…             | Valeur             | ❌ Non                              |
| `String[]`, `int[]`, `List`… | Référence (copiée) | ✅ Oui (contenu), ❌ Non (référence) |

---

## 💬 Astuce avec `String`

Même si `String` est un **objet**, il est **immuable (immutable)**.
Tu ne peux **pas le modifier**, seulement **le remplacer**.

```java
public static void modifier(String s) {
    s = s + " modifié";
}

String texte = "Bonjour";
modifier(texte);
System.out.println(texte); // Affiche "Bonjour"
```

➡️ `s` est une copie de la référence. Le contenu n’est **pas modifié** dans l’objet d’origine.

---

## 🔥 À retenir

* En Java, **tout est passé par valeur** (même les objets).
* Pour les types primitifs : **la valeur est copiée** → aucun effet sur l’original.
* Pour les objets : **la référence est copiée** → on peut modifier le **contenu**, mais pas la **référence**.

---

## ✅ **Exemple 1 : Type primitif (`int`) – aucun changement**

```java
public class Exemple1 {
    public static void ajouterUn(int n) {
        n = n + 1;
        System.out.println("Dans la méthode : " + n); // Affiche 6
    }

    public static void main(String[] args) {
        int x = 5;
        ajouterUn(x);
        System.out.println("Après la méthode : " + x); // Affiche 5
    }
}
```

🧠 **Analyse** : `n` est une **copie** de `x`. Modifier `n` ne change **pas** `x`.

---

## ✅ **Exemple 2 : Tableau (`int[]`) – contenu modifiable**

```java
public class Exemple2 {
    public static void mettreZero(int[] tab) {
        tab[1] = 0;
    }

    public static void main(String[] args) {
        int[] valeurs = {10, 20, 30};
        mettreZero(valeurs);
        System.out.println(valeurs[1]); // Affiche 0
    }
}
```

🧠 **Analyse** : la **référence** au tableau est copiée, donc on peut **modifier le contenu** du tableau d’origine.

---

## ✅ **Exemple 3 : Tableau – tentative de remplacement (échoue)**

```java
public class Exemple3 {
    public static void changerTableau(int[] tab) {
        tab = new int[]{99, 99, 99};
    }

    public static void main(String[] args) {
        int[] donnees = {1, 2, 3};
        changerTableau(donnees);
        System.out.println(donnees[0]); // Affiche 1
    }
}
```

🧠 **Analyse** : ici, on change **la référence locale `tab`**, mais cela **n’affecte pas** la variable `donnees` dans `main`.

---

## ✅ **Exemple 4 : `String` – pas modifié car immuable**

```java
public class Exemple4 {
    public static void ajouterSuffixe(String texte) {
        texte = texte + " ajouté";
    }

    public static void main(String[] args) {
        String message = "Bonjour";
        ajouterSuffixe(message);
        System.out.println(message); // Affiche "Bonjour"
    }
}
```

🧠 **Analyse** : `String` est un objet **immuable**. La méthode modifie une **copie de la référence**, mais pas le contenu.

---

## ✅ **Exemple 5 : `String[]` – modifiable car tableau**

```java
public class Exemple5 {
    public static void modifier(String[] mots) {
        mots[0] = "Salut";
    }

    public static void main(String[] args) {
        String[] phrases = {"Bonjour", "tout le monde"};
        modifier(phrases);
        System.out.println(phrases[0]); // Affiche "Salut"
    }
}
```

🧠 **Analyse** : Comme avec les tableaux `int[]`, le **contenu** du tableau `String[]` peut être modifié, car on passe une **copie de la référence**.

---


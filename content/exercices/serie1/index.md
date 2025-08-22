+++
date = '2025-08-20T19:02:22-04:00'
title = 'Serie 1'
weight = 1
+++

## 📘 Exercices – Semaine 1 : Introduction à Java

---

### 🟢 **Exercice 1 – Mon premier programme**

**Objectif** : Créer un programme Java qui affiche ton nom, ton âge et ta ville sur 3 lignes différentes.

➡️ *Exemple attendu* :

```
Nom : Alice
Âge : 23
Ville : Toulouse
```

**Instructions** :

* Utilise **`System.out.println()`**.
* Respecte **l’indentation**.
* Le nom du fichier doit être **`Profil.java`**.
* N’oublie pas le point-virgule `;` à chaque ligne.

---

### 🟢 **Exercice 2 – Affichage sur une seule ligne**

**Objectif** : Reproduis le même affichage que l'exercice 1, mais sur une **seule ligne**.

➡️ *Exemple attendu* :

```
Nom : Alice | Âge : 23 | Ville : Toulouse
```

**Instructions** :

* Utilise **`System.out.print()`** (sans `println()`).
* Utilise `\n` si besoin.
* Respecte les **espaces** entre les mots (convention d'espacement).

---

### 🟢 **Exercice 3 – Utilisation des caractères d’échappement**

**Objectif** : Créer un programme qui affiche les lignes suivantes :

```
Nom : "Alice"
Chemin du fichier : C:\Users\Alice
```

**Instructions** :

* Utilise **`System.out.println()`**.
* Utilise les caractères `\"` et `\\`.

---

### 🟠 **Exercice 4 – Rappel sur les conventions**

**Question écrite** (pas de code) :

Dans le programme ci-dessous, relève **5 erreurs de convention de nommage ou d’espacement**, puis corrige-les.

```java
public class profilUtilisateur{
public static void main(String[]args){
int AgeUtilisateur=25;
System.out.println( "Age :"+AgeUtilisateur );
}
}
```

---

### 🟠 **Exercice 5 – Indentation et lisibilité**

Réécris proprement le programme suivant avec **une indentation correcte**, sans modifier le code fonctionnel :

```java
public class Bonjour{
public static void main(String[]args){
System.out.println("Bonjour");
if(true){
System.out.println("Ceci est un test");
}
}
}
```

---

### 🔵 **Exercice 6 – Compilation et exécution (manuel)**

**Objectif** : Créer et compiler ton fichier Java dans ton terminal (Notepad++ + commande).

1. Crée un fichier nommé `Bienvenue.java`.
2. Écris un programme qui affiche :

```
Bienvenue dans le monde de Java !
```

3. Compile avec :

```bash
javac Bienvenue.java
```

4. Exécute avec :

```bash
java Bienvenue
```

---

### 🔵 **Exercice 7 – Formatage avec `printf`**

**Objectif** : Affiche un profil formaté et aligné grâce à `System.out.printf()` :

* Utilise une chaîne **multiligne (`"""`)** 

➡️ *Exemple attendu* :

```
Nom complet  : Julie MARTIN
Âge          : 28
Ville        : Lyon
```

**Instructions** :

* Utilise `printf()` avec `%s`.
* Applique les règles de **mise en majuscule ou capitalisation** sur le nom et la ville.

---

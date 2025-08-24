+++
date = '2025-08-20T19:02:22-04:00'
title = 'Série 1'
weight = 1
+++



---

### Exo 1

**Objectif** : Créer un programme Java qui affiche ceci.

➡️ *Sortie attendu* :

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

### Exo 2

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

### Exo 3

**Objectif** : Créer un programme qui affiche les lignes suivantes :

```
Nom : "Alice"
Chemin du fichier : C:\Users\Alice
```

**Instructions** :

* Utilise **`System.out.println()`**.
* Utilise les caractères `\"` et `\\`.



---

### Exo 4

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

### Exo 5

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

### Exo 6

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

### Exo 7

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


<a href="">Solutions</a>

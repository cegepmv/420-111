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



➡️ *Exemple attendu* :

```
Nom complet  : Julie MARTIN
Âge          : 28
Ville        : Lyon
```

**Instructions** :

* Utilise une chaîne **multiligne (`"""`)** 

---

# Exo 8

Réécris proprement le programme suivant

```java
import java.util.Scanner;

public class solution1_8{
/*
* 0 1 2
* 3 4 5
* 6 7 8
*/


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
char curPlayer ='y';
int nbTours = 0;
char[][] grille ={
{' ', ' ', ' '},
{' ', ' ', ' '},
{' ', ' ', ' '}
};



while (!checkIfCharWon(curPlayer, grille)&& nbTours < 9){
afficherGrille(grille);

if (curPlayer == 'x') {
curPlayer= 'o';
}
else{
curPlayer = 'x';
}
System.out.println("C'est au tour de : "+curPlayer);
System.out.print("Choisissez une case : ");
int choix = scan.nextInt();
scan.nextLine();

grille[choix/3][choix % 3] = curPlayer;

nbTours++;
}
afficherGrille(grille);
if (checkIfCharWon(curPlayer, grille)){
System.out.println("Le gagnant est  : " + curPlayer);

}
else {
System.out.println("Draw");
}


}

public static void afficherGrille(char[][] grille) {
System.out.println();
for (int i= 0; i < grille.length; i++) {
for (int j = 0; j<grille.length; j++) {
System.out.print(" " + grille[i][j]);
if (j % 3 != 2) {
System.out.print(" |");
}
else{
System.out.print("\n");
}
}
if(i % 3 != 2){
System.out.println("-----------");
}
}
System.out.println();
}

public static boolean checkIfCharWon(char joueur, char[][] grille) {
int somme;
for (int i = 0; i < grille.length; i++) {
somme = 0;
for (int j = 0; j < grille.length; j++) {
if (grille[i][j] == joueur){
somme++;
}
}
if (somme == 3) {
return true;
}
}
for (int i = 0; i < grille.length; i++) {
somme = 0;
for (int j = 0; j < grille.length; j++) {
if (grille[j][i]==joueur){
somme ++;
}
}
if(somme == 3) {
return true;
}
}

if (grille[0][0] == joueur && grille[1][1] == joueur && grille[2][2] == joueur){
return true;
}

if (grille[2][0] == joueur && grille[1][1]==joueur && grille[0][2] == joueur) {
return true;
}
return false;
}
}

```

---

# Exo 9 

Écris un code, sans copier-coller de nulle part, qui affiche `Hello World`. Idéalement, ne regarde pas les notes de cours.



<a href="https://github.com/cegepmv/420-111/tree/main/solutions/serie1">Solutions</a>


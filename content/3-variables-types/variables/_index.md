+++
date = '2025-08-24T16:51:03-04:00'
weight = 1
title = 'Variables'
+++


---

Une **variable**, c’est comme une boîte dans laquelle on range une valeur. Elle a toujours **trois éléments essentiels** :

👉 `type nom = valeur;`

Par exemple : 

```java
int var1 = 42;
```

Ici :

* 🧾 `int` → le type de la variable (entier)
* 🏷️ `var1` → le nom de la variable
* 🎁 `42` → la valeur qu’elle contient

---

## 📢 Afficher une variable

Tu peux afficher une variable comme tu afficherais n’importe quelle valeur :

```java
int var1 = 42;

System.out.println(var1); // affiche 42
```

---

## 🛠️ Déclaration & Initialisation

Quand on écrit `int var1 = 42;`, on fait deux choses :

* ✅ **Déclaration** (on dit que `var1` existe et qu’elle est de type `int`)
* ✅ **Initialisation** (on lui donne la valeur `42`) -> L'initialisation c'est la `première` attribution d'une valeur à une variable. C'est ce qui rend une variable déclarée utilisable.

Mais on peut aussi **déclarer d’abord**, et **initialiser plus tard** :

```java
//Déclaration
int var1;

//initialisation
var1 = 3;

System.out.println(var1); // affiche 3
```

---

## ⚠️ Attention à l'utilisation avant l'initialisation

Si tu déclares une variable mais que tu essaies de l'utiliser **sans lui avoir donné de valeur**, Java ne sera pas content :

```java
int var1;

System.out.println(var1);
```

🔴 Résultat :

```
error: variable var1 might not have been initialized
        System.out.println(var1);
                           ^
1 error
```

Java exige que chaque variable soit initialisée **avant** son utilisation. Sinon, il refusera de compiler le programme.

---

## 🎯 Exercice 1 

🔧 **Consigne** :

1. Déclare trois variables **entières** :

   * `age`
   * `taille`
   * `anneeNaissance`

2. Initialise-les avec  `16`, `170` et `2008` respectivement.

3. Affiche chaque variable avec `System.out.println`.

📝 **Exemple attendu à l'écran**  :

```
16
170
2008
```

<details>
    <summary>Réponse</summary>
    
```java
int age = 16;
int taille = 170;
int anneeNaissance = 2008;

System.out.println(age);
System.out.println(taille);
System.out.println(anneeNaissance);
```
</details>


---










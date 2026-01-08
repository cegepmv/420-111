+++
date = '2025-09-19T12:03:59-04:00'
weight = 3
title = 'Break Continue'
+++


---

## 🛑 `break` & `continue` en Java

Les instructions **`break`** et **`continue`** permettent de **contrôler le déroulement des boucles** (`for`, `while`, etc.).

Elles sont très utiles pour **interrompre une boucle plus tôt** ou **sauter certaines itérations**.

---

## 🚪 `break` : sortir d’une boucle immédiatement

L’instruction `break` permet de **quitter immédiatement** la boucle en cours, **même si la condition est encore vraie**.

---

### 🔂 Exemple simple avec `break`

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("i = " + i);
}
```

🔎 Résultat :

```
i = 0  
i = 1  
i = 2  
i = 3  
i = 4
```

💡 Dès que `i == 5`, la boucle est **interrompue**.

---

### 🎯 Quand utiliser `break` ?

Utilise `break` quand :

* Tu veux **arrêter une boucle prématurément**
* Tu as **trouvé ce que tu cherches** dans un tableau
* Tu veux **échapper à une boucle infinie** dans certaines conditions

---

## ⏭️ `continue` : passer à l’itération suivante

L’instruction `continue` permet de **sauter le reste du code** dans la boucle **et passer directement à l’itération suivante**.

---

### 🔂 Exemple simple avec `continue`

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }
    System.out.println("i = " + i);
}
```

🔎 Résultat :

```
i = 0  
i = 1  
i = 3  
i = 4
```

💡 L’itération où `i == 2` est **ignorée**.

---

### 🎯 Quand utiliser `continue` ?

Utilise `continue` quand :

* Tu veux **ignorer certaines valeurs**
* Tu veux **passer un tour** dans une boucle
* Tu veux **filtrer des cas particuliers**

---

## 🔁 Exemple combiné

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
        continue; // ignore les nombres impairs
    }

    if (i > 6) {
        break; // arrête dès que i > 6
    }

    System.out.println(i);
}
```

🔎 Résultat :

```
2  
4  
6
```

---

## ⚠️ Attention

* `break` sort **entièrement** de la boucle.
* `continue` ne fait que **passer à l’itération suivante**.
* Ne pas en abuser : un excès de `break` ou `continue` peut **rendre ton code difficile à lire**.

---

## 🧠 À retenir

| Mot-clé    | Effet                                   |
| ---------- | --------------------------------------- |
| `break`    | **Quitte complètement** la boucle       |
| `continue` | **Ignore le reste du tour** et continue |

Ces instructions rendent tes boucles **plus souples et plus efficaces**, à condition d’être bien utilisées.

---

### 🔹 **Exercice 1 : Arrêt à une valeur précise**

Parcours les nombres de 1 à 10 avec une boucle `for`.
Dès que tu atteins le nombre 6, **arrête la boucle avec `break`**.

```java
public class Exo1 {
    public static void main(String[] args) {
        // Boucle for de 1 à 10
        // Interrompre si i == 6
    }
}
```

### Sortie attendue

```
1  
2  
3  
4  
5
```

---

### 🔹 **Exercice 2 : Ignorer les multiples de 3**

Utilise une boucle `for` de 1 à 10.
Affiche tous les nombres **sauf ceux divisibles par 3**, en utilisant `continue`.

```java
public class Exo2 {
    public static void main(String[] args) {
        // Boucle for de 1 à 10
        // Utiliser continue pour ignorer les multiples de 3
    }
}
```

### Sortie attendue

```
1  
2  
4  
5  
7  
8  
10
```

---

### 🔹 **Exercice 3 : Parcours d’un tableau et arrêt à un mot**

Déclare un tableau `animaux` contenant :
`"chat", "chien", "souris", "lion", "tigre"`.

Utilise une boucle `for-each` pour parcourir ce tableau,
et **arrête la boucle dès que tu rencontres `"lion"`**.

```java
public class Exo3 {
    public static void main(String[] args) {
        // Déclaration du tableau
        
        // Boucle for-each avec break quand "lion"
    }
}
```

### Sortie attendue

```
chat  
chien  
souris
```

---


+++
date = '2025-08-24T16:52:12-04:00'
weight = 2
title = 'Types Primitifs'
+++


---


En Java, les types de données sont divisés en deux grandes familles :

* 🧱 **Les types primitifs** (8 types)
* 🧩 **Les types références** (classes comme `String`, `Scanner`, etc.)

Les types **primitifs** sont les **briques de base** de tout programme Java. Ils permettent de représenter les informations simples : **nombres, caractères, booléens**.

![Types primitifs](/420-111/images/variables/dimType.png)


---

## 🎁 Pourquoi différents types de "boîtes" ?

En Java (et dans la plupart des langages), il existe plusieurs types de variables — ou "boîtes" — pour **deux raisons principales** :

### 🧬 1. L'encodage est différent selon le contenu

Un **nombre entier** (`int`, `long`, etc.) et un **nombre à virgule** (`float`, `double`) sont encodés **différemment en mémoire**.

* Par exemple, un `int` **ne peut pas stocker de virgule**, car son encodage ne prévoit que des nombres entiers.
* Un `float` ou un `double`, eux, utilisent un encodage spécial (norme IEEE 754) pour **stocker les parties entière et décimale**.

👉 Tu ne peux donc pas mettre un **nombre à virgule** dans une boîte faite pour des **entiers** — ça reviendrait à mettre de la soupe dans une boîte avec des trous : ça ne marche pas 😄.

---

### 📦 2. La taille de la boîte varie selon les besoins

Chaque type occupe une **taille différente en mémoire** (1, 2, 4 ou 8 octets). C’est important car :

* Plus la boîte est **grosse**, plus elle prend de place 🏋️‍♂️
* Plus elle est **petite**, plus tu peux en stocker dans la mémoire 🪶

---

### 💡 Un exemple simple

Imaginons que tu disposes de **128 bits de mémoire**.

Voici quelques façons de les remplir :

| Combinaison                                               | Total utilisé |
| --------------------------------------------------------- | ------------- |
| 2 `long` (2 × 64 bits)                                    | 128 bits      |
| 1 `long` (64) + 2 `int` (2 × 32)                          | 128 bits      |
| 3 `int` (3 × 32) + 1 `short` (16) + 16 `boolean` (16 × 1) | 128 bits      |

Tu choisis donc le type selon :

* 🧠 Ce que tu veux **représenter**
* 💾 Et **l’espace mémoire** que tu veux ou peux utiliser

---





1. **Nombres entiers** :

   * `byte`, `short`, `int`, `long`

2. **Nombres à virgule flottante** (Des approximations des Réels ou chiffres à virgules) :

   * `float`, `double`

3. **Caractères** :

   * `char` (représente un caractère Unicode sur 16 bits)

4. **Booléens** :

   * `boolean` (valeurs `true` ou `false`)
---

## 🧮 1. Les nombres entiers

Ils servent à stocker des **valeurs sans virgule**, positives ou négatives. Chaque type utilise un certain nombre d’octets et a une plage de valeurs définie :

| Type    | Taille (bits / octets) | Valeur minimale            | Valeur maximale           | Exemple           |
| ------- | ---------------------- | -------------------------- | ------------------------- | ----------------- |
| `byte`  | 8 bits (1 octet)       | -128                       | 127                       | `byte b = 10;`    |
| `short` | 16 bits (2 octets)     | -32 768                    | 32 767                    | `short s = 1000;` |
| `int`   | 32 bits (4 octets)     | -2 147 483 648             | 2 147 483 647             | `int i = 42;`     |
| `long`  | 64 bits (8 octets)     | -9 223 372 036 854 775 808 | 9 223 372 036 854 775 807 | `long l = 100L;`  |

🧠 Il existe des **constantes** utiles comme `Integer.MAX_VALUE` ou `Long.MIN_VALUE` pour obtenir ces limites sans les retenir.

### ➕ Exemples de codage (positifs) :

| Décimal | Binaire (16 bits) | Hexadécimal |
| ------- | ----------------- | ----------- |
| 1       | 00000000 00000001 | 0001        |
| 2       | 00000000 00000010 | 0002        |
| 127     | 00000000 01111111 | 007F        |
| 255     | 00000000 11111111 | 00FF        |

---

## 🌊 2. Les nombres à virgule (flottants)

Ils permettent de représenter des **valeurs décimales** (≈ des réels), avec une approximation en base 2.

| Type     | Taille (bits / octets) | Précision                      | Valeur min / max         | Exemple             |
| -------- | ---------------------- | ------------------------------ | ------------------------ | ------------------- |
| `float`  | 32 bits (4 octets)     | \~7 chiffres significatifs     | ±1.4×10⁻⁴⁵ → ±3.4×10³⁸   | `float f = 3.14f;`  |
| `double` | 64 bits (8 octets)     | \~15-16 chiffres significatifs | ±4.9×10⁻³²⁴ → ±1.8×10³⁰⁸ | `double d = 2.718;` |

💡 En Java, **les littéraux décimaux sont des `double` par défaut**. Pour un `float`, on ajoute un **`f`** à la fin.

---

## 🔤 3. Le caractère

Le type `char` représente **un seul caractère Unicode** (lettre, symbole, emoji, etc.) :

| Type   | Taille (bits) | Plage Unicode                | Exemple         |
| ------ | ------------- | ---------------------------- | --------------- |
| `char` | 16 bits       | 0 à 65 535 (U+0000 à U+FFFF) | `char c = 'A';` |

🎨 Les caractères sont entourés de **quotes simples** (`'A'`) et peuvent contenir aussi des caractères spéciaux ou emojis :

```java
char emoji = '💡';
char lettre = 'f';
```

---

## 🔘 4. Le booléen

Un `boolean` est un type logique qui représente **vrai ou faux**, souvent utilisé dans les conditions :

| Type      | Valeurs possibles | Exemple                  |
| --------- | ----------------- | ------------------------ |
| `boolean` | `true` ou `false` | `boolean actif = false;` |

💬 Très utile pour représenter des états binaires : activé/désactivé, visible/caché, connecté/non connecté...

```java
char estPret = true;
char estFini = false;
```
---

## ✨ Récap visuel

| Catégorie     | Types                          | Rôle principal                         |
| ------------- | ------------------------------ | -------------------------------------- |
| 🧮 Entiers    | `byte`, `short`, `int`, `long` | Stocker des nombres sans virgule       |
| 🌊 Flottants  | `float`, `double`              | Représenter des valeurs décimales      |
| 🔤 Caractères | `char`                         | Représenter un caractère Unicode       |
| 🔘 Booléens   | `boolean`                      | Représenter une valeur vraie ou fausse |

---



## 🎯 Exercice 1 

🔧 **Consigne** :

Créer et afficher les variables avec le meilleur type possible

        

1. Variable contenant l'âge d'une personne (moins de 123)

1. Population du cégep Marie-Victorin (Environ 7 500)

1. Variable comptant la population au Qc (Environ 9 millions)

1. Variable pour calculer le revenu d'un individu normal 

1. Nombre de gouttes d'eau dans une piscine (environ 960 000 000 gouttes).

1. Une variable qui se rappelle si le prof était bon ou pas (true?)

1. Note en lettre qu'un étudiant obtient au cours (A)

📝 **Exemple attendu à l'écran**  :

```
32
7512
8905430
45000.25
960540388
true
A
```

<details>
<summary>Réponse</summary>

1.  
    ```java
    byte age = 12;
    ```
1.  
    ```java
    short populationMV = 7512;
    ```

1.  
    ```java
    int populationQC = 8_905_430;
    ```
1.  
    ```java
    float revenu = 45000.25;
    ```
1.  
    ```java
    int nbGoutteEau = 960_540_388 //Un argument pourrait être fait pour utiliser un long en suggérant que la piscine pourrait possiblement être beaucoup plus grande et un long pourrait être plus sécuritaire.
    ```
1.  
    ```java
    boolean leProfEstBon = true;
    ```
1.  
    ```java
    char noteEleve = 'A';
    ```

</details>


---

## 🎯 Exercice 2

🔧 **Consigne** :

Créer et afficher les variables avec le **meilleur type possible**

1. Âge d'un chat domestique (environ 8 ans)

2. Nombre d'étudiants dans une petite école secondaire (environ 420)

3. Nombre d’habitants à Montréal (environ 1.7 million)

4. Salaire annuel d’un développeur junior (\~52 000.75 \$)

5. Nombre de grains de sable dans un seau (\~25 000 000)

6. Une variable indiquant si une lumière est allumée (`false`)

7. La lettre de la section d’un cours (par exemple `B`)

📝 **Exemple attendu à l'écran** :

```
8
420
1700000
52000.75
25000000
false
B
```

<details>
<summary>Réponse</summary>

1. ```java
   byte ageChat = 8;
   ```

2. ```java
   short nbElevesEcole = 420;
   ```

3. ```java
   int populationMontreal = 1_700_000;
   ```

4. ```java
   float salaireAnnuel = 52000.75f;
   ```

5. ```java
   int nbGrainsSable = 25_000_000;
   ```

6. ```java
   boolean lumiereAllumee = false;
   ```

7. ```java
   char sectionCours = 'B';
   ```

</details>









---

## 🎯 Exercice 3

🔧 **Consigne** :

Créer et afficher les variables avec le **meilleur type primitif possible**, dans l’ordre ci-dessous :

1. Une lettre qui représente une réponse à un quiz (par exemple `C`)
2. Est-ce que l’alarme est activée (`true`) ?
3. Le nombre d'habitants dans un petit village (environ 1 200)
4. Âge d'un enfant (environ 5 ans)
5. Le revenu annuel d’un dentiste (\~98 500.95 \$)
6. Le nombre d’étoiles visibles à l’œil nu (\~6 000)
7. Estimation du nombre de cellules dans un corps humain (environ 37 000 000 000 000)

📝 **Exemple attendu à l'écran** :

```
C
true
1200
5
98500.95
6000
37000000000000
```

<details>
<summary>Réponse</summary>

1. ```java
   char reponseQuiz = 'C';
   ```

2. ```java
   boolean alarmeActivee = true;
   ```

3. ```java
   short populationVillage = 1200;
   ```

4. ```java
   byte ageEnfant = 5;
   ```

5. ```java
   float revenuDentiste = 98500.95f;
   ```

6. ```java
   short nbEtoilesVisibles = 6000;
   ```

7. ```java
   long nbCellulesHumain = 37_000_000_000_000L;
   ```

</details>



---


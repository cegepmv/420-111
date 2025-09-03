+++
date = '2025-09-03T14:55:41-04:00'
title = "⚙️ Les opérateurs logiques en Java"
linkTitle = 'Logique'
weight = 3
+++


---

Les **opérateurs logiques** permettent de **combiner des conditions**. Ils sont essentiels pour construire des expressions **complexes** dans les structures comme `if`, `while`, etc.

Ils s’appliquent **sur des booléens** (`true` ou `false`) et **renvoient eux-mêmes un booléen**.

---

## 🧪 Les 3 opérateurs logiques principaux

| Opérateur | Nom         | Fonction principale                                      | Exemple        | Résultat                                     |        |   |         |        |
| --------- | ----------- | -------------------------------------------------------- | -------------- | -------------------------------------------- | ------ | - | ------- | ------ |
| `&&`      | ET logique  | Vrai **seulement si les deux conditions sont vraies**    | `true && true` | `true`                                       |        |   |         |        |
| `\|\|` | OU logique     | Vrai **si au moins une condition est vraie** | `true \|\| false` | `true` |
| `!`    | NON logique | **Inverse** la valeur (vrai devient faux, et vice-versa) | `!true`        | `false`                                      |        |   |         |        |

---

### 🧠 Tableau de vérité

#### 1. `&&` (ET logique)

| A     | B     | A && B |
| ----- | ----- | ------ |
| true  | true  | true   |
| true  | false | false  |
| false | true  | false  |
| false | false | false  |

#### 2. `||` (OU logique)

| A     | B     | A \|\| B |
| ----- | ----- | -------- |
| true  | true  | true     |
| true  | false | true     |
| false | true  | true     |
| false | false | false    |

#### 3. `!` (NON logique)

| A     | !A    |
| ----- | ----- |
| true  | false |
| false | true  |

---

## 💬 Exemples simples

```java
int age = 20;
boolean citoyen = true;

// Vrai seulement si les deux conditions sont vraies
if (age >= 18 && citoyen) {
    System.out.println("Tu peux voter !");
}
```

```java
boolean pluie = true;
boolean parapluie = false;

if (pluie && !parapluie) {
    System.out.println("Tu vas être mouillé !");
}
```

---

## ⚠️ Attention à la priorité des opérateurs

| Priorité (ordre d’évaluation) | Opérateur |
| ----------------------------- | --------- |
| Haute                         | `!`       |
| Moyenne                       | `&&`      |
| Basse                         | `\|\|`    |

Tu peux utiliser des **parenthèses** pour forcer l’ordre :

```java
if ((age > 18 || citoyen) && !malade) {
    // ...
}
```

---

## 📦 Utilisation typique : combiner plusieurs conditions

Exemple :

```java
int note = 85;

if (note >= 60 && note <= 100) {
    System.out.println("Réussi !");
}
```

---

## 🔍 Résumé visuel

| Symbole | Nom | Utilité principale                        |    |                                     |
| ------- | --- | ----------------------------------------- | -- | ----------------------------------- |
| `&&`    | ET  | Toutes les conditions doivent être vraies |    |                                     |
| `\|\|`  | OU | Une seule condition doit être vraie |
| `!`     | NON | Inverse une condition                     |    |                                     |

---

## 🎯 Astuce logique

Tu peux **combiner plusieurs opérateurs** :

```java
if ((age >= 18 && citoyen) || estMajeurEmancipe) {
    System.out.println("Tu es légalement un adulte.");
}
```

---

## 🧪 Mini quiz (mental)

```java
boolean a = true;
boolean b = false;

System.out.println(a && b);   // ?
System.out.println(a || b);   // ?
System.out.println(!a);       // ?
```

<details>
<summary>Réponses</summary>

```
false
true
false
```

</details>

---

## 🟢 **Exercice 1 – Vrai ou faux ? (Quiz rapide)**

```java
boolean a = true;
boolean b = false;

System.out.println(a && b);     // ?
System.out.println(!b);         // ?
System.out.println(a || b);     // ?
System.out.println(!(a && b));  // ?
```

> ✏️ **Question :** Indique ce qui s’affiche à chaque ligne.

---

## 🟡 **Exercice 2 – Peut-il conduire ?**

Écris une comparaison qui vérifie si une personne peut conduire en fonction de son age et si elle a le permis.

Critères pour pouvoir conduire:

* Elle a 18 ans ou plus **et** elle possède un permis.

```java
int age = 20;
boolean aLePermis = true;

// Complète ici
```

> 💡 Astuce : Utilise `&&` pour combiner les deux conditions.

---

## 🟡 **Exercice 3 – Accès restreint**

On veut donner accès à un site **seulement** si l’utilisateur est :

* Membre **ou** admin,
* Et **pas banni**.

Complète :

```java
boolean estMembre = true;
boolean estAdmin = false;
boolean estBanni = false;


```

> 💡 Tu devras utiliser `||` et `!`.

---

## 🟠 **Exercice 4 – Pluie et parapluie**

Écris un programme qui affiche true si tu es mouillé:

```java
boolean pluie = true;
boolean parapluie = false;

// Complète ici
```

---

## 🔴 **Exercice 5 – Validation d’une note**

Affiche "true" **seulement si** la note est **entre 0 et 100 inclus**. Sinon, affiche "false".

```java
int note = 105;

// Complète ici
```
---

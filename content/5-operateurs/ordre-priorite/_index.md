+++
date = '2025-09-03T15:03:33-04:00'
title = '🧭 Ordre de priorité des opérations en Java'
linkTitle = 'Ordre Priorite'
weight = 4
+++


---

En Java, comme en mathématiques, certaines opérations sont effectuées **avant d’autres**. C’est ce qu’on appelle la **priorité des opérateurs**.

---

## 🪜 Diagramme de priorité (du plus fort au plus faible)


```text
╔════════════════════════════════════╗
║ ()                                 ║ ➤ Parenthèses : forcent la priorité
╠════════════════════════════════════╣
║ ++  --  !                          ║ ➤ Incrément, décrément, NON logique
╠════════════════════════════════════╣
║ *   /   %                          ║ ➤ Multiplication, division, modulo
╠════════════════════════════════════╣
║ +   -                              ║ ➤ Addition, soustraction
╠════════════════════════════════════╣
║ <   <=  >   >=                     ║ ➤ Comparaisons
╠════════════════════════════════════╣
║ ==  !=                             ║ ➤ Égalité / inégalité
╠════════════════════════════════════╣
║ &&                                 ║ ➤ ET logique (et court-circuité)
╠════════════════════════════════════╣
║ ||                                 ║ ➤ OU logique (et court-circuité)
╠════════════════════════════════════╣
║ =  +=  -=  *=  /=  %=              ║ ➤ Affectations simples et composées
╚════════════════════════════════════╝
```

---

## 🎓 Exemple d’analyse : sans parenthèses

```java
boolean resultat = 4 + 2 * 3 > 10 || !false;
```

🔍 Étapes d’évaluation :
```java
boolean resultat = 4 + 2 * 3 > 10 || !false;
resultat = 4 + 2 * 3 > 10 || true;
resultat = 4 + 6 > 10 || true;
resultat = 10 > 10 || true;
resultat = false || true;
resultat = true;


```


✅ Résultat final : `true`

---

## 🧪 À retenir

* Java suit **un ordre strict de priorité**, mais **ne lit pas toujours de gauche à droite**.
* Les opérateurs comme `*`, `/`, `%` sont **évalués avant** les `+` et `-`.
* Les opérateurs logiques `&&` et `\|\|` viennent **après** les comparateurs (`<`, `>`, `==`, etc.).
* L’opérateur `!` (NON logique) a **une priorité très élevée**, il est évalué rapidement.
* Les **affectations** (`=`, `+=`, etc.) sont **toujours faites en dernier**.

---

## 🧩 Exemple 1 : Opérations arithmétiques + comparaisons + logique

```java
boolean res1 = 10 + 2 * 5 < 30 && (4 + 3 * 2 == 10 || false);
```

### ✳️ Étapes d’évaluation :

```java
boolean res1 = 10 + 2 * 5 < 30 && (4 + 3 * 2 == 10 || false);
res1 = 10 + 2 * 5 < 30 && (4 + 6 == 10 || false);
res1 = 10 + 2 * 5 < 30 && (10 == 10 || false);
res1 = 10 + 2 * 5 < 30 && (true || false);
res1 = 10 + 2 * 5 < 30 && true;
res1 = 10 + 10 < 30 && true;
res1 = 20 < 30 && true;
res1 = true && true;
res1 = true;
```

✅ Résultat final :

```java
res1 = true;
```

---

## 🧠 Exemple 2 : Avec modulos, NON logique, ET / OU

```java
boolean res2 = !(15 % 4 == 3) || (8 / 2 + 1 > 4 && true);
```

### ✳️ Étapes d’évaluation :

```java
boolean res2 = !(15 % 4 == 3) || (8 / 2 + 1 > 4 && true);
res2 = !(3 == 3) || (8 / 2 + 1 > 4 && true);
res2 = !(true) || (8 / 2 + 1 > 4 && true);
res2 = false || (8 / 2 + 1 > 4 && true);
res2 = false || (4 + 1 > 4 && true);
res2 = false || (5 > 4 && true);
res2 = false || (true && true);
res2 = false || true;
res2 = true;

```

✅ Résultat final :

```java
res2 = true;
```

---

## 💡 Astuce

Même si Java respecte cet ordre, écrire avec **des parenthèses explicites** améliore grandement la **lisibilité** et **réduit les erreurs** :

```java
boolean res2 = (!(15 % 4 == 3)) || ((8 / 2 + 1 > 4) && true);
```

---

## 🟢 **Exercice 1 – Simple priorité arithmétique + logique**

```java
boolean ex1 = 5 + 3 * 2 > 10 && !false;
```

> ✏️ **Question** : Que vaut `ex1` ?
> Explique étape par étape comme dans les exemples.

---

## 🟡 **Exercice 2 – Parenthèses et inversion logique**

```java
boolean ex2 = !(6 + 4 / 2 <= 7) || false;
```

---

## 🟠 **Exercice 3 – Comparaisons croisées et OU logique**

```java
boolean ex3 = 3 * 3 == 9 || 8 - 3 > 10 && true;
```

> ✏️ Attention : l’opérateur `&&` est plus prioritaire que `||`. Analyse bien.

---

## 🔴 **Exercice 4 – Plusieurs niveaux de priorité + modulo**

```java
boolean ex4 = 18 % 5 + 1 == 4 && !(2 * 2 >= 5);
```

> 🔍 À toi de jouer ! Résous-le à la main (ou à tête).

---

## 🔴 **Exercice 5 – Affectation + expressions mixtes**

```java
boolean ex5;
ex5 = (10 - 2 * 3 != 4) || (6 / 3 == 2 && false);
```

> 🔍 À toi de jouer ! Résous-le à la main (ou à tête).

---

## Exercice 6

```java
boolean mystere = !(7 + 1 == 8) && (5 * 2 < 11 || false);
```

> 🔍 À toi de jouer ! Résous-le à la main (ou à tête).

---


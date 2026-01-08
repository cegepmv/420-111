+++
date = '2025-09-19T13:16:57-04:00'
weight = 10
title = 'Fonctions'
+++


---

## 🧩 Les **fonctions** (ou **méthodes**) en Java

Une **fonction** (appelée **méthode** en Java) est un **bloc de code réutilisable** qui **effectue une tâche** précise.

Elles permettent de **structurer ton programme**, d’**éviter la répétition**, et de **mieux organiser le code**.

---

## 🧱 Structure d’une méthode

```java
typeRetour nomDeLaMéthode(paramètres) {
    // instructions
    return valeur;
}
```

| Élément          | Description                                               |
| ---------------- | --------------------------------------------------------- |
| `typeRetour`     | Le **type de la valeur** renvoyée (`int`, `String`, etc.) |
| `nomDeLaMéthode` | Le **nom** de la méthode (en camelCase)                   |
| `paramètres`     | Données reçues en **entrée** (optionnel)                  |
| `return`         | Permet de **renvoyer un résultat** (optionnel si `void`)  |

---

## ✋ Exemple simple

```java
public static int addition(int a, int b) {
    return a + b;
}
```

💡 Cette méthode **prend deux entiers** et **renvoie leur somme**.

---

## 🧪 Utilisation d’une méthode

```java
int resultat = addition(4, 7);
System.out.println("Résultat : " + resultat); // Résultat : 11
```

---

## 🔄 Méthode sans retour (`void`)

```java
public static void direBonjour(String nom) {
    System.out.println("Bonjour " + nom + " !");
}
```

➡️ Ici, la méthode **n’a pas de retour** (elle affiche juste un message).

---

## 🎯 Pourquoi utiliser des méthodes ?

✅ Pour **éviter de dupliquer du code**
✅ Pour **organiser son programme** en petits blocs logiques
✅ Pour **faciliter les tests, le débogage et la maintenance**

---

## 🧑‍🔬 Paramètres multiples

```java
public static double moyenne(double a, double b, double c) {
    return (a + b + c) / 3;
}
```

📌 Tu peux passer **autant de paramètres que nécessaire**, séparés par des virgules.

---

## 🔁 Méthodes appelant d’autres méthodes

```java
public static double carre(double x) {
    return x * x;
}

public static double surfaceCercle(double rayon) {
    return Math.PI * carre(rayon);
}
```

💡 Tu peux **réutiliser des méthodes** dans d'autres méthodes !

---

## 🛠️ Portée et `static`

* Le mot-clé `static` signifie que la méthode appartient à la **classe** (pas à un objet)
* Dans la méthode `main`, tu ne peux appeler que des **méthodes `static`** sans créer d’objet

---

## 🧠 À retenir

* Une méthode est une **fonction réutilisable** qui peut **prendre des paramètres** et **renvoyer une valeur**
* Le mot-clé `void` signifie que la méthode **ne renvoie rien**
* Tu peux appeler une méthode **plusieurs fois avec des valeurs différentes**
* Les méthodes rendent ton code **plus clair, plus court et plus facile à maintenir**

---

### 🧮 Exercice 1 — Doubler un nombre entier

👉 Écris une méthode `doubler` qui prend un entier en paramètre et retourne sa valeur multipliée par 2.


🔹 Exemple attendu :

```java
int x = doubler(9);
System.out.println("Résultat : " + x); // Résultat : 18
```

---

### 🎵 Exercice 2 — Chanter une ligne

👉 Crée une méthode `chanterRefrain` qui prend un mot (`String`) et affiche :
🎶 `[mot], [mot], toujours [mot] !`



🔹 Exemple attendu :

```java
chanterRefrain("Java");
// 🎶 Java, Java, toujours Java !
```

---

### 📐 Exercice 3 — Calculer l’aire d’un triangle

👉 Écris une méthode `aireTriangle` qui prend deux `double` (base et hauteur), et retourne l’aire du triangle (base × hauteur ÷ 2).



🔹 Exemple attendu :

```java
double a = aireTriangle(6.0, 4.0);
System.out.println("Aire : " + a); // Aire : 12.0
```

---

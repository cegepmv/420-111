+++
date = '2025-08-20T19:04:38-04:00'

title = 'Commentaires'
+++

## 🧠 Qu’est-ce qu’un commentaire ?

Un **commentaire** est une partie du code **ignorée par le compilateur Java**.

Il sert à :
- Expliquer le code aux humains (programmeurs).
- Documenter le fonctionnement des classes, des méthodes, etc.
- Faciliter la relecture et la maintenance du programme.

---

## ✍️ 1. Commentaire sur une ligne (`//`)

### 🔹 Syntaxe :

```java
// Ceci est un commentaire sur une ligne
int age = 25; // Stocke l’âge
```
### ✅ Utilisation :
- Expliquer une ligne de code.
- Ajouter une remarque rapide.
---

## 🧾2. Commentaire sur plusieurs lignes (/* ... */)
### 🔹 Syntaxe :

```java
/*
 Ceci est un commentaire
 sur plusieurs lignes.
 Il peut couvrir un bloc de texte.
*/
```
### ✅ Utilisation :
- Fournir une explication plus longue.
- Désactiver temporairement un bloc de code.

---

{{% notice style="warning" title="Avancé"%}}
**Nous verrons peut être cette théorie plus tard**

## 📚 3. Commentaire de documentation (/** ... */)

🔹 Syntaxe :
```java
/**
 * Cette méthode affiche un message de bienvenue.
 * @param nom Le nom de l’utilisateur.
 */
public void direBonjour(String nom) {
    System.out.println("Bonjour " + nom);
}

```

### ✅ Utilisation :
- Générer une documentation HTML avec **Javadoc**.
- Documenter les **classes**, **méthodes**, **constructeurs**, etc.
{{% /notice %}}





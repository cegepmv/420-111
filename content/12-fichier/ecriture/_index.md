+++
date = '2025-09-19T13:21:19-04:00'
weight = 2
title = 'Écriture'
+++

---

## 📤 Écrire dans un fichier en Java

Pour **écrire du texte dans un fichier**, Java propose plusieurs classes. Ici, on va utiliser la classe **`PrintWriter`**, simple et pratique pour écrire du texte.

---

## 🧱 Importer les classes nécessaires

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
```

---

## 📄 Exemple simple d’écriture dans un fichier

```java
public class EcritureFichier {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("sortie.txt"));

            pw.println("Bonjour le monde !");
            pw.println("Voici une deuxième ligne.");

            pw.close(); // Important : ferme et écrit dans le fichier
        } catch (FileNotFoundException e) {
            System.out.println("Impossible de créer ou ouvrir le fichier.");
        }
    }
}
```

---

## 🔍 Explications

| Instruction                               | Rôle                                            |
| ----------------------------------------- | ----------------------------------------------- |
| `new PrintWriter(new File("sortie.txt"))` | Crée (ou écrase) le fichier `sortie.txt`        |
| `pw.println("...")`                       | Écrit une ligne dans le fichier                 |
| `pw.close()`                              | Ferme le fichier et termine l’écriture          |
| `catch (FileNotFoundException e)`         | Gère le cas où le fichier ne peut pas être créé |

---

## ⚠️ Points importants

* **Le fichier est créé s’il n’existe pas**.
* Si le fichier existe, **son contenu est écrasé** (attention !).
* Pour **ajouter du texte sans écraser**, il faut utiliser d’autres classes (ex : `FileWriter` en mode append).
* **Toujours fermer** le `PrintWriter` avec `close()` pour que tout soit bien sauvegardé.

---

## 🧠 À retenir

* `PrintWriter` est simple pour écrire du texte dans un fichier.
* Utilise `println()` pour écrire des lignes.
* Gère l’exception `FileNotFoundException`.
* Ferme toujours le writer avec `close()`.

---

### 🧪 Exercice 1 : Écrire un message personnalisé

**Objectif :** Écrire dans un fichier un message composé de plusieurs lignes.

**Consigne :**

* Crée un fichier nommé `message.txt`.
* Écris 3 lignes contenant un message personnalisé (exemple : ta présentation, ta ville, ton hobby).
* Ferme le fichier correctement.
* Gère l’exception si le fichier ne peut pas être créé.

---

### 📝 Exercice 2 : Copier une chaîne de caractères ligne par ligne

**Objectif :** Écrire chaque mot d’une phrase donnée dans un fichier, **un mot par ligne**.

**Consigne :**

* La phrase à écrire est codée en dur dans le programme (ex : `"Java est fun à apprendre"`).
* Ouvre un fichier `mots.txt`.
* Écris chaque mot de la phrase sur une ligne séparée.
* Ferme le fichier correctement.

---

### 🔄 Exercice 3 : Écrire des nombres pairs de 2 à 20

**Objectif :** Écrire dans un fichier la liste des nombres pairs de 2 à 20 inclus.

**Consigne :**

* Ouvre un fichier `nombres_pairs.txt`.
* Écris chaque nombre pair (2,4,6,…) sur une ligne différente.
* Ferme le fichier.
* Gère les exceptions.

---


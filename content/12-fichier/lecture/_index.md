+++
date = '2025-09-19T13:21:12-04:00'
weight = 1
title = 'Lecture'
+++

---

## 📂 Lire un fichier texte avec `Scanner` en Java

La classe **`Scanner`** permet aussi de **lire le contenu d’un fichier texte** très facilement, ligne par ligne.

---

## 🧱 Importer les classes nécessaires

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
```hugo serve --disableFastRender --ignoreCache


---

## 📄 Exemple simple de lecture d’un fichier

```java
public class LectureFichier {
    public static void main(String[] args) {
        try {
            File fichier = new File("donnees.txt");
            Scanner sc = new Scanner(fichier);

            while (sc.hasNextLine()) {
                String ligne = sc.nextLine();
                System.out.println(ligne);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
        }
    }
}
```

---

## 🔍 Explications

| Instruction                               | Rôle                                 |
| ----------------------------------------- | ------------------------------------ |
| `File fichier = new File("donnees.txt");` | Crée une référence vers le fichier   |
| `Scanner sc = new Scanner(fichier);`      | Ouvre le fichier pour lecture        |
| `sc.hasNextLine()`                        | Vérifie s’il reste une ligne         |
| `sc.nextLine()`                           | Lit la ligne suivante                |
| `sc.close()`                              | Ferme le scanner (libère ressources) |
| `catch (FileNotFoundException e)`         | Gère le cas où le fichier est absent |

---

## ⚠️ Points importants

* **Toujours gérer l’exception** `FileNotFoundException` quand tu ouvres un fichier.
* **Pense à fermer** le scanner avec `sc.close()` pour libérer les ressources.
* La méthode `nextLine()` lit une **ligne complète** du fichier.

---

## 🧠 À retenir

* `Scanner` est simple à utiliser pour lire un fichier texte.
* Utilise une boucle `while (sc.hasNextLine())` pour lire toutes les lignes.
* Gère toujours les erreurs avec un `try-catch`.
* Ferme le scanner après utilisation.

---

### 📘 **Exercice 1 : Compter les lignes d’un fichier**

**🎯 Objectif :** Lire un fichier texte et compter combien de lignes il contient.

#### 🔧 Consigne :

1. Le programme prend le **nom du fichier** à lire via `new File(...)`.
2. Il affiche :

   ```
   Le fichier contient X lignes.
   ```

🔁 **Bonus** : Affiche un message d’erreur si le fichier est introuvable.

---

### ✂️ **Exercice 2 : Afficher uniquement les lignes non vides**

**🎯 Objectif :** Lire un fichier texte et afficher **seulement les lignes qui ne sont pas vides**.

#### 🔧 Consigne :

1. Parcours le fichier ligne par ligne avec `Scanner`.
2. Affiche uniquement les lignes dont le contenu n’est **pas vide** (`!ligne.trim().isEmpty()`).

#### Exemple attendu (pour un fichier contenant des lignes vides) :

```
Bonjour
Cette ligne est utile
Fin
```

---

### 🔍 **Exercice 3 : Recherche d’un mot-clé dans un fichier**

**🎯 Objectif :** Afficher uniquement les lignes contenant un **mot-clé spécifique**.

#### 🔧 Consigne :

1. Le mot-clé est **défini dans le code** (ex. `"important"`).
2. Si une ligne du fichier contient ce mot, elle est affichée.

> Tu peux utiliser : `ligne.contains("important")`

🔁 **Bonus** : Rends le mot-clé **insensible à la casse** (`toLowerCase()`).

---

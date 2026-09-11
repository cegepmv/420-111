+++
date = '2025-08-20T19:04:19-04:00'
title = 'Affichage console'
weight = 2
+++


---

# ☕ Créer son tout premier programme en Java

Avant de plonger dans le code, il est important de savoir qu’en Java, tout le code source doit être enregistré dans un fichier avec l’extension `.java`.

{{% notice style="tip" title="EN ligne" %}}
Si java n'est malheureusement pas installé sur votre ordinateur et que vous ne pouvez pas le faire, vous pouvez tout de même 
programmer directement sur le web <a href="https://www.programiz.com/java-programming/online-compiler/">ici</a>
{{% /notice %}}



### 🔧 Étapes :

1. Crée un nouveau fichier et nomme-le `Main.java`.
2. Tape (de préférence manuellement) le code suivant dans ce fichier :

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

> 💡 *Astuce : Prends le temps de taper le code au lieu de simplement le copier-coller. Cela t'aidera à bien comprendre chaque ligne.*

---

## 🧩 Comprendre la notion de classe

* En Java, tout le code exécutable doit être contenu dans une **classe**.

  * Ce concept sera expliqué en détail plus tard, mais retiens pour l’instant qu’une classe est **indispensable**.
  * Dans notre exemple, cela correspond à la ligne `public class Main`.
  * Par convention, le **nom d'une classe commence par une majuscule** (ce n’est pas obligatoire, mais recommandé).
  * Le nom du **fichier doit être identique au nom de la classe**, suivi de l’extension `.java`. Ici, la classe s’appelle `Main`, donc le fichier s’appelle `Main.java`.
  * Le mot-clé `public` est un **modificateur d’accès** indiquant que cette classe est accessible depuis d'autres classes (nous y reviendrons plus tard).

---

## 🏁 La méthode `main()`

* La méthode `main()` est **le point d’entrée** de tout programme Java.
* Tout le code à l’intérieur de cette méthode sera exécuté au lancement du programme.

> 🔍 *Ne t'inquiète pas pour le moment des autres mots-clés comme `static` ou `void`. Tu les comprendras avec le temps.*

---

## 🔄 Résumé ligne par ligne

| Ligne de code                            | Explication                                                                |
| ---------------------------------------- | -------------------------------------------------------------------------- |
| `public class Main`                      | Déclare une classe publique appelée `Main`.                                |
| `public static void main(String[] args)` | Déclare la méthode principale qui sera exécutée au démarrage du programme. |
| `System.out.println("Hello World");`     | Affiche le message `"Hello World"` dans la console.                        |

---


## 🧪 Compilation et exécution d’un programme Java

D'abord, tu dois t'assurer que Java est bien installé sur ton ordinateur
* Ouvre une invite de commandes (cmd) sous Windows (Terminal sous Mac/Linux).
* Tape la commande `java -version`. Cette commande devrait vous dire la version de Java qui est installé sur votre ordinateur.
* Tape aussi la commande `javac -version`. Cette commande devrait te dire la version du compilateur de Java installé sur ton ordinateur
_Note: Ces commandes fonctionnent seulement si Java et le compilateur de Java sont installés et que le chemin où le répertoire de Java se trouve est mis dans le `PATH` des variables d'environnement (À expliquer en classe pour que ce soit plus clair)_

## Exécution du code dans le fichier Main.java
* Ouvre une invite de commandes (cmd) sous Windows (Terminal sous Mac/Linux).
* Navigue vers le dossier où se trouve votre fichier Main.java
* Exécute la commande `java Main.java`. Tu devrais voir le message `Hello World` dans l'invite de commandes.

Traditionnellement, Java fonctionne en deux étapes :

1. **Compilation** : Le code source (`.java`) est transformé en bytecode (`.class`) grâce à la commande :

   ```bash
   javac Main.java
   ```

2. **Exécution** : Le bytecode est ensuite exécuté avec la commande :

   ```bash
   java Main
   ```

{{% notice style="warning" title="Erreur fréquente : classe introuvable" %}}
Si tu obtiens une erreur du genre `Error: Could not find or load main class Main`, c'est souvent parce que la commande `java` n'a pas été exécutée **au bon endroit** (pas dans le même dossier que le fichier `Main.class`), ou parce que le `.class` ne se trouve pas dans le **classpath** utilisé par la commande.

Le **classpath** (`-cp`) indique à Java **où chercher** les fichiers `.class` à exécuter. Par exemple, pour dire à Java de chercher dans le **dossier courant** :

```bash
java -cp . Main
```

Ici, `-cp .` dit à Java d'aller chercher `Main.class` dans le dossier courant (le `.` représente le dossier où tu te trouves actuellement). Oublier ce `-cp` (ou exécuter la commande depuis le mauvais dossier) est une source d'erreur très fréquente pour les débutants.
{{% /notice %}}

> 💡 *Astuce : Depuis Java 11, il est aussi possible d’exécuter directement un fichier `.java` sans passer explicitement par l’étape de compilation (`javac`), grâce au "single-file source-code launcher".*

```bash
java Main.java
```

Cela permet d’exécuter rapidement un programme, mais à noter :

* Le fichier `.class` est **généré temporairement**.
* Il est ensuite **supprimé automatiquement** après l’exécution.

> 📝 Cette méthode est pratique pour tester du code rapidement, mais dans un projet structuré, on utilise généralement `javac` suivi de `java`.

---

## 🖨️ Affichage avec `System.out.print` et `System.out.println`

Dans la méthode `main()`, tu peux utiliser :

* `System.out.println()` : pour afficher une ligne de texte suivie d’un **retour à la ligne**.
* `System.out.print()` : pour afficher du texte **sans retour à la ligne**.

> ✏️ Pour l’instant, retiens que tu dois utiliser `System.out.println("ton message");` pour afficher du texte à l’écran.

---

### 📌 Détail sur `System.out`

| Élément      | Rôle                                      |
| ------------ | ----------------------------------------- |
| `System`     | Classe prédéfinie dans `java.lang`        |
| `out`        | Représente le **flux de sortie standard** |
| `System.out` | Utilisé pour **écrire dans la console**   |

---

### 🧩 Différence entre `print()` et `println()`

| Méthode     | Effet                                               |
| ----------- | --------------------------------------------------- |
| `print()`   | Affiche le texte **sur la même ligne**              |
| `println()` | Affiche le texte **puis passe à la ligne suivante** |

#### Exemple 1 : sans retour à la ligne

```java
System.out.print("Bonjour ");
System.out.print("tout le monde !");
```

🖥️ **Résultat :**

```
Bonjour tout le monde !
```

#### Exemple 2 : avec retour à la ligne

```java
System.out.println("Bonjour");
System.out.println("tout le monde !");
```

🖥️ **Résultat :**

```
Bonjour
tout le monde !
```

#### Exemple 3 : retour à la ligne manuel

```java
System.out.print("Ligne 1\nLigne 2");
```

🖥️ **Résultat :**

```
Ligne 1
Ligne 2
```

---

### ✅ En résumé :

* `print()` : n’ajoute pas de retour à la ligne.
* `println()` : ajoute un retour à la ligne automatiquement.
* Ces méthodes sont très utilisées pour afficher des messages ou pour déboguer.

---


## Le caractère d’échappement `\`

Le `\` permet d’insérer des caractères spéciaux dans une chaîne.

| Séquence | Résultat           | Exemple               | Résultat Console |
| -------- | ------------------ | --------------------- | ---------------- |
| `\n`     | Saut de ligne      | `"Bonjour\nSalut"`    | Bonjour<br>Salut |
| `\t`     | Tabulation         | `"Nom\tAge"`          | Nom  Age         |
| `\"`     | Guillemets doubles | `"Il a dit : \"ok\""` | Il a dit : "ok"  |
| `\\`     | Backslash          | `"C:\\Users\\Nom"`    | C:\Users\Nom     |
| `\'`     | Apostrophe         | `'\'`                 | `'`              |

---

## `System.out.printf()` – Affichage formaté


Tu peux fixer la **largeur de colonnes** avec :

```java
System.out.printf("%-15s : %s\n", "Nom", "Alice");
System.out.printf("%-15s : %d\n", "Âge", 30);
```

🔎 `%–15s` → champ texte **aligné à gauche** sur **15 caractères**.

---

### ✅ À retenir

| Commande    | Utilité principale                          |
| ----------- | ------------------------------------------- |
| `print()`   | Affiche sur la même ligne.                  |
| `println()` | Affiche puis saute une ligne.               |
| `\`         | Caractère d’échappement pour mise en forme. |
| `printf()`  | Affichage **structuré et aligné**.          |

---

### 🛠️ Astuce pro : format avancé


```java
System.out.printf("""
    Nom complet  : Julie MARTIN     
    Âge          : 28
    Ville        : %s
    """, "Paris"
  );
```

#### 🖥️ Résultat console

```
Nom complet  : Julie MARTIN    
Âge          : 28    
Ville        : Paris    
```

---

#### ✅ Explication ligne par ligne

| Élément                               | Rôle                                                      |
| ------------------------------------- | --------------------------------------------------------- |
| `"""` (Text block)                    | Permet un texte **multiligne** propre (Java 15+).         |
| `%s`                                  | Placeholder pour une **valeur chaîne** (String ou objet). |


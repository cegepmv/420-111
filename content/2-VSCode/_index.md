+++
date = '2025-08-28T21:15:14-04:00'
title = 'VSCode'
weight = 2
+++
# Installation

[Lien d'instalation](https://code.visualstudio.com/Download)


### Installation des extensions**

1. Ouvrez la barre latérale de gauche dans VSCode.
2. Cliquez sur l'icône des extensions ![alt text](extensions.png) ou utilisez le raccourci clavier `Ctrl + Shift + X`.
3. Recherchez **Language Support for Java(TM) by Red Hat** et installez l’extension.
4. Recherchez **Debugger for Java** et installez l’extension.

# Racourci clavier utilie

Je n'ai pas testé la version Mac.

### 🖱️ **Raccourcis de base**

| Action         | Windows/Linux | Mac             |
| -------------- | ------------- | --------------- |
| Copier         | **Ctrl + C**  | **Cmd (⌘) + C** |
| Coller         | **Ctrl + V**  | **Cmd (⌘) + V** |
| Annuler (Undo) | **Ctrl + Z**  | **Cmd (⌘) + Z** |

---

### 🔍 **Édition avancée**

| Action                                | Windows/Linux           | Mac                              |
| ------------------------------------- | ----------------------- | -------------------------------- |
| Sélectionner prochaine occurrence     | **Ctrl + D**            | **Cmd (⌘) + D**                  |
| Ajouter plusieurs curseurs (haut/bas) | **Ctrl + Alt + ↑ / ↓**  | **Option (⌥) + Cmd (⌘) + ↑ / ↓** |
| Copier ligne vers le haut ou le bas   | **Shift + Alt + ↑ / ↓** | **Shift + Option (⌥) + ↑ / ↓**   |
| Commenter rapidement des lignes       | **ctrl + é**            |                                  |


1. Surligner un String dont on a oublié les `"`, faites le `"`et il s'ajoutera des deux côtés.


---

<!-- 
# Maven 

Nous allons utiliser la structure de projet recommandée par [Maven](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html).

### Installation de l'extension **Maven for Java**

1. Ouvrez la barre latérale de gauche dans VSCode.
2. Cliquez sur l'icône des extensions ![alt text](extensions.png) ou utilisez le raccourci clavier `Ctrl + Shift + X`.
3. Recherchez **Maven for Java** et installez l’extension.

### Création d’un projet Maven

Une fois l’extension installée :

1. Dans l’explorateur de fichiers de VSCode, faites un clic droit.
2. Sélectionnez : `Maven` → `New Project`.
3. Choisissez l’option **No Archetype**.

VSCode vous demandera ensuite de saisir plusieurs informations :

- **Group ID** : identifiant unique de votre organisation ou projet (ex. `com.example`). Mettez n'importe quoi pour l'instant.
- **Artifact ID** : nom du projet (il correspond au nom du dossier créé).
- **Version** (optionnelle) : laissez la valeur par défaut sauf si besoin spécifique.

Une fois le projet créé, vous devriez voir une structure de dossier semblable à ceci :


## Exemple

**Group ID** : serie2.exo026

**Artifact ID** : poo

![alt text](treeStructure.png)

---

### Ouverture du projet dans VSCode

Une fois le projet créé, assurez-vous d’**ouvrir le dossier racine** du projet dans VSCode.
Dans l’explorateur (à gauche), le dossier tout en haut doit être celui contenant les sous-dossiers `src`, `pom.xml`, etc.

> 💡 Astuce : si vous êtes à l’aise avec le terminal, vous pouvez faire un clic droit sur le dossier du projet → **"Open in Integrated Terminal"**, puis taper `code .` pour ouvrir le projet dans une nouvelle fenêtre VSCode.

### Organisation du code

* Tout votre code Java doit se trouver dans le dossier `src/main/java/`.
* Un sous-dossier est généralement créé automatiquement à l’intérieur de `java/` (en fonction du `groupId` et `artifactId` fournis).
  Vous pouvez **le supprimer**, nous ne l'utiliserons pas cette session.

### Exécuter votre code

Une fois un fichier `.java` ouvert (contenant une méthode `main`), vous pouvez l’exécuter facilement en cliquant sur le bouton ▶️ **"Run"** situé en haut à droite de l’éditeur.


Créez un fichier HelloWorld.java dans le dossier src/main/java/

-->
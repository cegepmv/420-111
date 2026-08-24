+++
title = "Les blocs Capteurs"
weight = 7
+++

# Les blocs Capteurs

Les blocs de type **Capteurs** servent à créer des conditions et à permettre des interactions entre les différents lutins d'un programme. Les blocs à valeurs aux extrémités pointues sont des blocs booléens utilisés pour définir ces conditions dans les blocs **Contrôle** vus précédemment.

| Bloc | Effet |
|---|---|
| `<touche [pointeur de la souris]>` | Renvoie « vrai » si l'élément choisi (le pointeur de la souris, le bord de la scène, un autre lutin) est touché. Souvent utilisé avec un bloc conditionnel. |
| `<touche la touche [espace] pressée>` | Vérifie si une touche précise du clavier est enfoncée. Si le résultat est « vrai », l'action associée est exécutée. |
| `demander () et attendre` | Affiche une bulle de dialogue qui pose une question à l'utilisateur et attend sa réponse. |
| `réponse` | Contient la dernière réponse saisie par l'utilisateur suite à un bloc `demander`. |

![Menu déroulant du bloc touche](toucher.png)

**Exemple** : un chat qui joue un son lorsqu'il touche le bord de la scène.

![Exemple utilisant le capteur toucher le bord](exemple-toucher.png)

## Créer un dialogue

Le bloc `réponse` peut être inséré directement dans un bloc `dire ()` pour afficher la réponse de l'utilisateur. Un peu plus loin, dans la catégorie **Opérateurs**, tu découvriras le bloc `assembler () et ()`, qui permettra d'intégrer la réponse à l'intérieur d'une phrase complète, comme dans l'exemple ci-dessous (« Bonjour » + réponse) :

![Exemple de dialogue avec demander, réponse et assembler](assembler-exemple.png)
![Exemple complet de dialogue interactif](dialogue-exemple.png)

## Exercice 1 — Faire connaissance

Quand on clique sur le drapeau vert, le lutin demande "Comment tu t'appelles ?". Il attend la réponse, puis :

* dit "Enchanté !" pendant 1 seconde;
* dit ensuite (réponse) pendant 1 seconde.

*Objectif : combiner `demander` et `réponse` pour créer une conversation. (Tu pourras fusionner les deux phrases en une seule plus tard, avec le bloc `assembler` vu dans la section Opérateurs.)*

## Exercice 2 — Attrape le fantôme

**Objectif** : le joueur contrôle un lutin (par exemple un chat) avec les flèches pour attraper un fantôme.

Blocs à utiliser :

* `quand touche flèche gauche pressée` → ajouter -10 à x
* `quand touche flèche droite pressée` → ajouter 10 à x
* `quand touche flèche haut pressée` → ajouter 10 à y
* `quand touche flèche bas pressée` → ajouter -10 à y
* `quand je reçois [attraper]` → se cacher, puis `aller à (position aléatoire)`, puis se montrer (pour le fantôme)

Événements à programmer :

* Sur le lutin **chat**, utilise une boucle `répéter indéfiniment` contenant `si <je touche [fantôme]> alors envoyer à tous [attraper]`.

*Indice : tu dois utiliser un bloc de type* Contrôle *(`si...alors`), un bloc de type* Capteurs *(`toucher`) et le bloc* Mouvement *`aller à (position aléatoire)` vu précédemment.*

## Exercice 3 — Le labyrinthe 🧩

**Contexte** : dessine (ou importe) un arrière-plan représentant un labyrinthe avec des murs d'une couleur bien précise (par exemple noir), un point de départ et une sortie.

**Objectifs** :

* Le joueur déplace son lutin dans le labyrinthe avec les touches flèches.
* Si le lutin touche la couleur des murs, il retourne instantanément à son point de départ.
* S'il atteint la sortie, il affiche "Bravo, tu as réussi !".

*Indice : utilise une boucle `répéter indéfiniment` contenant deux blocs `si...alors` : un avec `<touche la couleur []>` pour remettre le lutin au départ (`aller à x:() y:()`), l'autre avec `<touche [sortie]>` pour afficher le message de victoire.*

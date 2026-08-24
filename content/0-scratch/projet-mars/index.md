+++
title = "Projet final : Mission Oxygène"
weight = 11
hidden = true
+++

# 🚀 PROJET FINAL — MISSION OXYGÈNE : SAUVETAGE SUR MARS

## 🌟 Bienvenue, Commandant ! 🌟

*Date : 2157. Le petit robot explorateur **ARES-1** vient de s'écraser à la surface de Mars. Sa réserve d'oxygène fuit lentement... Sa seule chance de survie : récolter assez de **cristaux d'énergie** pour réactiver ses boucliers avant que sa jauge d'oxygène tombe à zéro, tout en évitant une pluie de **météorites**!*

*Toi seul·e, en tant qu'ingénieur·e de la Base de Contrôle, peux programmer ARES-1 pour qu'il survive... et peut-être même devienne un héros!*

Ce projet regroupe **toutes les notions vues jusqu'à présent en Scratch** : mouvement, événements, boucles, conditions, capteurs, opérateurs, variables et listes. Chaque niveau ajoute une nouvelle capacité à ton jeu, jusqu'au niveau final où tout s'assemble dans une vraie mission jouable!

---

## 🗺️ CARTE DE LA MISSION

```
 🛰️ NIVEAU 1        🚦 NIVEAU 2        ☄️ NIVEAU 3        💥 NIVEAU 4
 Atterrissage      Centre de          Pluie de           Collisions et
 et Mouvement      Contrôle           Météorites         Récoltes
   [10 pts]          [10 pts]           [15 pts]           [15 pts]

 🔋 NIVEAU 5        🎲 NIVEAU 6        📋 NIVEAU 7        🌪️ NIVEAU 8
 Jauge              Niveaux de         Inventaire et      TEMPÊTE FINALE
 d'Oxygène          Difficulté         Grand Livre        (Boss)
   [10 pts]          [15 pts]           [15 pts]           [20 + bonus]

                  110 POINTS DE BASE + JUSQU'À 40 POINTS BONUS
```

### 🎯 Système de progression

* 🥉 **Apprenti Martien** (0-50 pts) : tu maîtrises les bases.
* 🥈 **Pilote Confirmé** (51-90 pts) : ton robot commence à bien réagir.
* 🥇 **Commandant de Mission** (91-120 pts) : ton jeu est complet et fonctionnel.
* 💎 **Explorateur Légendaire** (121-140 pts) : tu es allé·e au-delà des attentes.
* 👑 **Héros de Mars** (141-150 pts) : mission parfaite, tous les défis bonus relevés!

---

## 🎬 Mise en place du projet

Avant de commencer, prépare ton projet Scratch :

1. Crée un **nouveau projet** et donne-lui un nom (ex. `Mission_Oxygene_TonNom`).
2. Choisis ou dessine un **arrière-plan** de type surface martienne (rouge/orangé).
3. Ajoute **3 lutins** :
   * `ARES-1` (le robot que le joueur contrôle),
   * `Cristal` (l'objet à récolter),
   * `Meteorite` (l'obstacle à éviter).
4. Garde ce projet ouvert : tu vas le faire évoluer niveau par niveau.

---

# 🛰️ NIVEAU 1 — ATTERRISSAGE ET MOUVEMENT

### 📜 Histoire

*ARES-1 vient de toucher le sol martien. Premier réflexe : apprendre à bouger sur ce terrain accidenté!*

## 💎 Points : 10 pts | 🧠 Notion : **Mouvement**

---

### 🎯 Mission 1.1 : Positionner ARES-1

* Place `ARES-1` au centre-bas de la scène au démarrage (`aller à x:(0) y:(-140)`).
* Choisis une taille adaptée avec `mettre la taille à ()%`.

### 🎯 Mission 1.2 : Déplacer ARES-1 avec le clavier

| Touche | Effet attendu |
|---|---|
| Flèche gauche | ARES-1 avance de 10 pas vers la gauche |
| Flèche droite | ARES-1 avance de 10 pas vers la droite |
| Flèche haut | ARES-1 avance de 10 pas vers le haut |
| Flèche bas | ARES-1 avance de 10 pas vers le bas |

*Indice : utilise `ajouter () à x` et `ajouter () à y` plutôt que `avancer`, pour que le robot puisse se déplacer dans les 4 directions sans changer d'orientation.*

### 🎯 Mission 1.3 : Rester dans les limites

ARES-1 ne doit **jamais sortir de la scène**. Utilise des conditions pour limiter sa position `x` entre -230 et 230, et sa position `y` entre -170 et 170.

### ✅ Checklist niveau 1

* [ ] ARES-1 apparaît au bon endroit au démarrage
* [ ] ARES-1 se déplace dans les 4 directions
* [ ] ARES-1 ne sort jamais de l'écran

---

## 🏆 Défi Bonus 1 (+5 pts)

Ajoute une **animation de propulsion** : quand une touche directionnelle est pressée, change de costume ou applique un effet visuel (ex. `changer l'effet [tourbillon] de (25)`) pour simuler les réacteurs d'ARES-1.

---

# 🚦 NIVEAU 2 — CENTRE DE CONTRÔLE

### 📜 Histoire

*La Base de Contrôle doit pouvoir démarrer, mettre en pause et arrêter la mission à distance. C'est le moment de maîtriser les **événements** et la **communication entre lutins**!*

## 💎 Points : 10 pts | 🧠 Notion : **Événements**

---

### 🎓 Concept : Les messages (broadcast)

Un **message** permet à un lutin d'envoyer une information que d'autres lutins peuvent recevoir et auxquels ils peuvent réagir, même s'ils ne se touchent pas. C'est ainsi que la Base de Contrôle (le drapeau vert) peut dire à tous les lutins : *"la mission commence!"*

---

### 🎯 Mission 2.1 : Démarrage de la mission

Quand le **drapeau vert** est cliqué :

1. Envoyer le message `debut_mission`.
2. Chaque lutin (`ARES-1`, `Cristal`, `Meteorite`) doit avoir un bloc `quand je reçois [debut_mission]` qui réinitialise sa position et son apparence.

### 🎯 Mission 2.2 : Message de fin

Crée deux nouveaux messages : `victoire` et `defaite` (ils seront utilisés au Niveau 4). Pour l'instant, ajoute seulement les blocs `quand je reçois [victoire]` et `quand je reçois [defaite]` vides dans le lutin `ARES-1` — tu les compléteras plus tard.

### 🎯 Mission 2.3 : Message vocal de la Base

Au tout début de la mission, `ARES-1` doit dire (`dire () pendant () secondes`) : *"Base de Contrôle, ARES-1 est prêt pour la mission!"*

### ✅ Checklist niveau 2

* [ ] Le drapeau vert relance proprement toute la mission
* [ ] Les 3 lutins réagissent au message `debut_mission`
* [ ] Les messages `victoire` et `defaite` existent déjà (même vides)

---

## 🏆 Défi Bonus 2 (+5 pts)

Ajoute un son de démarrage (bip de vaisseau) qui se joue dès que `debut_mission` est reçu par `ARES-1`.

---

# ☄️ NIVEAU 3 — PLUIE DE MÉTÉORITES

### 📜 Histoire

*Le ciel martien s'assombrit... des météorites commencent à tomber! ARES-1 devra les éviter en continu. Direction les **boucles**!*

## 💎 Points : 15 pts | 🧠 Notion : **Contrôle et boucles**

---

### 🎯 Mission 3.1 : Faire apparaître une météorite

Dans le lutin `Meteorite`, quand `debut_mission` est reçu :

1. `répéter indéfiniment`
2. Se positionner en haut de l'écran à un `x` aléatoire (`aller à x:(nombre aléatoire entre -230 et 230) y:(170)`)
3. `répéter jusqu'à ce que (y) < -170` : descendre progressivement (`changer y de -5`), avec un petit `attendre (0.02) secondes` à chaque tour.

### 🎯 Mission 3.2 : Faire apparaître un cristal

Fais la même chose pour le lutin `Cristal`, mais avec une vitesse de chute plus lente (par exemple `changer y de -3`).

### 🎯 Mission 3.3 : Pause synchronisée

Ajoute un bloc `attendre (nombre aléatoire entre 0.5 et 2) secondes` avant chaque nouvelle apparition, pour que les météorites et cristaux ne tombent pas toujours au même rythme (rends la mission imprévisible!).

### ✅ Checklist niveau 3

* [ ] Les météorites tombent en boucle depuis le haut de l'écran
* [ ] Les cristaux tombent aussi, à une vitesse différente
* [ ] Chaque chute recommence à une position `x` aléatoire

---

## 🏆 Défi Bonus 3 (+5 pts)

Utilise le bloc `créer un clone de (moi-même)` pour que **plusieurs** météorites puissent tomber en même temps, au lieu d'une seule à la fois.

---

# 💥 NIVEAU 4 — COLLISIONS ET RÉCOLTES

### 📜 Histoire

*Maintenant que le ciel est rempli de dangers et de trésors, ARES-1 doit apprendre à réagir : ramasser les cristaux, éviter les météorites. C'est l'heure des **conditions**!*

## 💎 Points : 15 pts | 🧠 Notion : **Conditions**

---

### 🎯 Mission 4.1 : Toucher un cristal

Dans le lutin `Cristal`, à l'intérieur de la boucle de chute, ajoute une condition :

```
si <touche [ARES-1]?> alors
    changer [score] de 10
    jouer le son "collecte"
    aller à x:(nombre aléatoire) y:(170)   // le cristal réapparaît en haut
```

### 🎯 Mission 4.2 : Toucher une météorite

Dans le lutin `Meteorite`, ajoute une condition similaire :

```
si <touche [ARES-1]?> alors
    changer [oxygene] de -15
    jouer le son "impact"
    aller à x:(nombre aléatoire) y:(170)
```

### 🎯 Mission 4.3 : Conditions de victoire et de défaite

Dans le lutin `ARES-1`, à l'intérieur d'une boucle `répéter indéfiniment` :

```
si <(score) > 100> alors
    envoyer le message [victoire]
si <(oxygene) < 1> alors
    envoyer le message [defaite]
```

### ✅ Checklist niveau 4

* [ ] Le score augmente quand ARES-1 touche un cristal
* [ ] L'oxygène diminue quand ARES-1 touche une météorite
* [ ] Les messages `victoire` et `defaite` sont envoyés au bon moment

---

## 🏆 Défi Bonus 4 (+5 pts)

Ajoute un effet visuel temporaire (clignotement avec l'effet `fantôme`) sur `ARES-1` pendant 1 seconde après avoir touché une météorite, pour simuler un bouclier d'invincibilité temporaire.

---

# 🔋 NIVEAU 5 — JAUGE D'OXYGÈNE

### 📜 Histoire

*Un bon pilote garde toujours un œil sur ses instruments! Il est temps d'ajouter une vraie **jauge d'oxygène** qui diminue avec le temps, et pas seulement après un impact.*

## 💎 Points : 10 pts | 🧠 Notion : **Capteurs et variables**

---

### 🎯 Mission 5.1 : Créer et initialiser les variables

Crée deux variables **pour tous les lutins** : `score` et `oxygene`. Quand `debut_mission` est reçu par `ARES-1` :

* `mettre [score] à 0`
* `mettre [oxygene] à 100`

### 🎯 Mission 5.2 : Fuite d'oxygène naturelle

Dans une boucle `répéter indéfiniment`, fais diminuer l'oxygène progressivement même sans impact :

```
attendre (1) secondes
changer [oxygene] de -2
```

### 🎯 Mission 5.3 : Afficher les jauges

Affiche les variables `score` et `oxygene` à l'écran (`afficher la variable`). Personnalise leur affichage en mode **curseur** dans les paramètres de la variable pour qu'elles ressemblent à de vraies jauges.

### 🎯 Mission 5.4 : Alerte oxygène critique

Utilise le capteur `demander () et attendre` d'une autre façon : ici, utilise plutôt une condition pour afficher un avertissement :

```
si <(oxygene) < 20> alors
    dire "⚠️ Alerte : oxygène critique!" pendant (0.5) secondes
```

### ✅ Checklist niveau 5

* [ ] `score` commence à 0 et `oxygene` commence à 100 à chaque partie
* [ ] L'oxygène diminue tout seul avec le temps
* [ ] Un message d'alerte apparaît sous les 20% d'oxygène

---

## 🏆 Défi Bonus 5 (+5 pts)

Change la couleur d'ARES-1 (effet `couleur`) progressivement à mesure que l'oxygène baisse, pour renforcer visuellement l'urgence.

---

# 🎲 NIVEAU 6 — NIVEAUX DE DIFFICULTÉ

### 📜 Histoire

*Une mission trop facile n'est pas amusante longtemps! Utilise les **opérateurs** pour que le jeu devienne de plus en plus intense à mesure que le score augmente.*

## 💎 Points : 15 pts | 🧠 Notion : **Opérateurs**

---

### 🎓 Concept : Modulo et comparaisons combinées

Le bloc `mod` permet de détecter des **paliers** (par exemple tous les 20 points). Combiné à `et`/`ou`, il permet de créer des règles plus riches, comme *"le score est un multiple de 20 ET l'oxygène est encore suffisant"*.

---

### 🎯 Mission 6.1 : Créer une variable `niveau_difficulte`

Initialise-la à 1 au début de la mission.

### 🎯 Mission 6.2 : Augmenter la difficulté tous les 20 points

Dans le lutin `ARES-1`, dans la boucle principale :

```
si <((score) mod 20) = 0> et <(score) > 0> alors
    changer [niveau_difficulte] de 1
```

*Attention : sans précaution, cette condition pourrait s'exécuter plusieurs fois de suite pour le même palier. Réfléchis à une façon d'éviter ce problème (indice : une variable qui mémorise le dernier palier atteint).*

### 🎯 Mission 6.3 : Accélérer les météorites

Dans le lutin `Meteorite`, remplace la vitesse fixe de chute par une vitesse liée à `niveau_difficulte` :

```
changer y de (-5 - (niveau_difficulte) * 1)
```

Plus le niveau de difficulté augmente, plus les météorites tombent vite!

### 🎯 Mission 6.4 : Message de changement de niveau

Chaque fois que `niveau_difficulte` change, `ARES-1` doit dire : `assembler "Niveau " (assembler (niveau_difficulte) " atteint!")`.

### ✅ Checklist niveau 6

* [ ] `niveau_difficulte` augmente d'exactement 1 tous les 20 points
* [ ] Les météorites tombent plus vite à mesure que le niveau augmente
* [ ] Un message annonce chaque changement de niveau

---

## 🏆 Défi Bonus 6 (+5 pts)

Ajoute aussi une variable `multiplicateur` qui augmente la valeur des cristaux ramassés selon le niveau de difficulté (`changer [score] de (10 * multiplicateur)`), pour récompenser les joueurs qui survivent longtemps.

---

# 📋 NIVEAU 7 — INVENTAIRE ET GRAND LIVRE

### 📜 Histoire

*La Base de Contrôle veut garder une trace de chaque mission : quels cristaux ont été récoltés, et quel est le meilleur score jamais atteint. Direction les **listes**!*

## 💎 Points : 15 pts | 🧠 Notion : **Listes**

---

### 🎯 Mission 7.1 : Créer deux listes

* `inventaire` : contiendra le type de chaque cristal ramassé pendant la partie en cours (par exemple "cristal bleu", "cristal doré"...).
* `grand_livre` : contiendra le score final de **toutes les parties jouées** depuis le début.

### 🎯 Mission 7.2 : Trois types de cristaux

Dans le lutin `Cristal`, utilise une variable `type_cristal` qui prend aléatoirement une des 3 valeurs suivantes à chaque réapparition, avec des valeurs de points différentes :

| Type | Valeur | Probabilité suggérée |
|---|---|---|
| Bronze | +5 pts | fréquent |
| Argent | +10 pts | moyen |
| Or | +25 pts | rare |

*Indice : utilise `nombre aléatoire entre (1) et (10)` et des conditions pour répartir les probabilités (ex. 1-6 = Bronze, 7-9 = Argent, 10 = Or).*

### 🎯 Mission 7.3 : Ajouter à l'inventaire

Chaque fois qu'ARES-1 touche un cristal, ajoute son type dans la liste `inventaire` avec `ajouter () à [inventaire]`.

### 🎯 Mission 7.4 : Mettre à jour le grand livre

Quand la mission se termine (`victoire` ou `defaite` reçu), ajoute le score final à la liste `grand_livre` avec `ajouter (score) à [grand_livre]`.

### 🎯 Mission 7.5 : Afficher le meilleur score

Parcours la liste `grand_livre` avec une boucle pour trouver et afficher le **meilleur score de tous les temps** (réutilise la logique du calcul de maximum vue dans les exercices d'algorithmique).

### ✅ Checklist niveau 7

* [ ] Il existe 3 types de cristaux avec des valeurs différentes
* [ ] L'inventaire se remplit correctement pendant la partie
* [ ] Le grand livre conserve les scores de toutes les parties jouées
* [ ] Le meilleur score est calculé et affiché à la fin

---

## 🏆 Défi Bonus 7 (+5 pts)

Affiche, à la fin de chaque mission, le **nombre de cristaux de chaque type** récoltés (utilise le bloc `[inventaire] contient ()?` ou une boucle de comptage).

---

# 🌪️ NIVEAU 8 — TEMPÊTE FINALE (BOSS)

### 📜 Histoire

*Une tempête de poussière géante s'approche! Il ne reste qu'une seule chance à ARES-1 : combiner tout ce qu'il a appris pour survivre et ramener suffisamment de cristaux à la base avant la fin de l'oxygène.*

## 💎 Points : 20 pts (+ bonus) | 🧠 Notion : **Intégration complète**

---

### 🎯 Mission 8.1 : Écran de fin — Victoire

Quand `ARES-1` reçoit `victoire` :

1. Arrêter tous les autres scripts (`arrêter [tout]` ou `arrêter [les autres scripts du lutin]` sur chaque lutin concerné).
2. Afficher un message : *"🎉 Mission réussie! ARES-1 rentre à la base avec [score] points!"*
3. Jouer un son de victoire.
4. Ajouter le score au `grand_livre`.

### 🎯 Mission 8.2 : Écran de fin — Défaite

Quand `ARES-1` reçoit `defaite` :

1. Arrêter les autres scripts.
2. Afficher : *"💀 Signal perdu... ARES-1 a manqué d'oxygène après avoir récolté [score] points."*
3. Jouer un son d'échec.
4. Ajouter le score au `grand_livre` (même en cas de défaite, pour le grand livre historique).

### 🎯 Mission 8.3 : Effet tempête

Ajoute un lutin `Tempete` qui apparaît seulement lorsque `oxygene < 30` : il doit appliquer un effet visuel (`changer l'effet [pixelate] de (10)`) sur toute la scène, pour montrer que la situation devient critique.

### 🎯 Mission 8.4 : Rejouer la mission

Ajoute un bouton (un lutin `Rejouer`) qui, lorsqu'il est cliqué, renvoie le message `debut_mission` pour recommencer une nouvelle partie sans fermer le projet.

### ✅ Checklist niveau 8

* [ ] Une vraie fin de victoire s'affiche avec le score final
* [ ] Une vraie fin de défaite s'affiche avec le score final
* [ ] Un effet visuel de tempête apparaît quand l'oxygène est critique
* [ ] Le joueur peut rejouer sans recharger la page

---

## 🏆 Défis Bonus Finaux

### Défi 8.A (+10 pts) : Mode difficile

Ajoute un menu au tout début (`demander et attendre`) qui laisse le joueur choisir "facile" ou "difficile". En mode difficile, l'oxygène diminue plus vite et les météorites sont plus nombreuses.

### Défi 8.B (+10 pts) : Musique dynamique

Change la musique de fond ou augmente son tempo/volume à mesure que `niveau_difficulte` augmente.

### Défi 8.C (+10 pts) : Animation d'ARES-1

Ajoute plusieurs costumes à ARES-1 et fais-le alterner entre eux (marche/vol) pendant les déplacements, pour une animation fluide.

### Défi 8.D (+10 pts) : Classement des 3 meilleurs scores

Améliore la Mission 7.5 pour afficher, non pas seulement le meilleur score, mais le **top 3** des meilleurs scores dans la liste `grand_livre`.

---

## 📦 Remise du projet

1. Exporte ton projet en fichier `.sb3` (`Fichier > Sauvegarder sur l'ordinateur`).
2. Nomme le fichier `MissionOxygene_NOM_Prenom.sb3`.
3. Dépose-le sur la plateforme du cours avant la date limite.
4. Sois prêt·e à présenter ta mission en 2-3 minutes en classe : montre ta jauge d'oxygène, ta récolte de cristaux, et une fin (victoire ou défaite)!

---

## 🎊 FÉLICITATIONS, COMMANDANT ! 🎊

Si tu as terminé les 8 niveaux, ton projet utilise maintenant **toutes** les notions vues en Scratch : mouvement, événements, boucles, conditions, capteurs, opérateurs, variables et listes — exactement les briques que tu retrouveras bientôt dans un vrai langage de programmation textuel! 🚀👑

+++
title = "Projet final : Chef Express"
weight = 12
hidden = true
+++

# 🍕 PROJET FINAL — CHEF EXPRESS : LE DÉFI DU CAMION-RESTAURANT

## 🌟 Bienvenue, Chef ! 🌟

*Tu viens de décrocher ton premier emploi comme cuisinier·ère dans le camion-restaurant le plus populaire de la ville : **Le Foodie Truck**! Les commandes s'accumulent, les client·e·s ont faim (et sont impatient·e·s), et les ingrédients tombent du ciel dans ta cuisine un peu magique...*

*Attrape les bons ingrédients pour compléter chaque commande, évite les ingrédients pourris, et gère la patience de la clientèle avant qu'elle ne quitte le camion pour de bon!*

Ce projet regroupe **toutes les notions vues jusqu'à présent en Scratch** : mouvement, événements, boucles, conditions, capteurs, opérateurs, variables et listes. Chaque niveau ajoute un ingrédient (!) supplémentaire à ta recette de programmeur·euse, jusqu'au service final où tout s'assemble dans un vrai jeu jouable!

---

## 🗺️ CARTE DU SERVICE

```
 🚚 NIVEAU 1        🔔 NIVEAU 2        🥕 NIVEAU 3        🍽️ NIVEAU 4
 Ouverture du       Le Service         Pluie              Bonnes et
 Camion             Commence           d'Ingrédients      Mauvaises Prises
   [10 pts]          [10 pts]           [15 pts]           [15 pts]

 😠 NIVEAU 5        🎲 NIVEAU 6        📋 NIVEAU 7        🌶️ NIVEAU 8
 Jauge de           Rush et            Les Commandes      COUP DE FEU
 Patience           Combos             et le Palmarès     DU VENDREDI (Boss)
   [10 pts]          [15 pts]           [15 pts]           [20 + bonus]

                  110 POINTS DE BASE + JUSQU'À 40 POINTS BONUS
```

### 🎯 Système de progression

* 🥉 **Commis de cuisine** (0-50 pts) : tu maîtrises les bases.
* 🥈 **Cuisinier·ère confirmé·e** (51-90 pts) : ton camion tourne bien.
* 🥇 **Chef de service** (91-120 pts) : ton jeu est complet et fonctionnel.
* 💎 **Chef étoilé** (121-140 pts) : tu es allé·e au-delà des attentes.
* 👑 **Légende du Foodie Truck** (141-150 pts) : service parfait, tous les défis bonus relevés!

---

## 🎬 Mise en place du projet

Avant de commencer, prépare ton projet Scratch :

1. Crée un **nouveau projet** et donne-lui un nom (ex. `ChefExpress_TonNom`).
2. Choisis ou dessine un **arrière-plan** représentant l'intérieur d'un camion-restaurant.
3. Ajoute au moins **4 lutins** :
   * `Assiette` (contrôlée par le joueur, en bas de l'écran),
   * `Ingredient_Bon` (un ingrédient qui peut être demandé dans une commande, par ex. une tomate),
   * `Ingredient_Mauvais` (un ingrédient pourri ou non désiré, par ex. une chaussure ou un citron pourri),
   * `Client` (affiche la commande et la jauge de patience).
4. Garde ce projet ouvert : tu vas le faire évoluer niveau par niveau.

---

# 🚚 NIVEAU 1 — OUVERTURE DU CAMION

### 📜 Histoire

*Le camion vient d'ouvrir ses fenêtres. Premier réflexe : apprendre à déplacer ton assiette pour attraper ce qui tombe!*

## 💎 Points : 10 pts | 🧠 Notion : **Mouvement**

---

### 🎯 Mission 1.1 : Positionner l'assiette

* Place `Assiette` en bas de la scène au démarrage (`aller à x:(0) y:(-150)`).
* Choisis une taille adaptée avec `mettre la taille à ()%`.

### 🎯 Mission 1.2 : Déplacer l'assiette avec le clavier

| Touche | Effet attendu |
|---|---|
| Flèche gauche | L'assiette se déplace de 10 pas vers la gauche |
| Flèche droite | L'assiette se déplace de 10 pas vers la droite |

*Indice : utilise `ajouter () à x` pour ne modifier que la position horizontale — l'assiette reste toujours à la même hauteur.*

### 🎯 Mission 1.3 : Rester dans les limites

L'assiette ne doit **jamais sortir de la scène**. Utilise des conditions pour limiter sa position `x` entre -220 et 220.

### ✅ Checklist niveau 1

* [ ] L'assiette apparaît au bon endroit au démarrage
* [ ] L'assiette se déplace horizontalement avec le clavier
* [ ] L'assiette ne sort jamais de l'écran

---

## 🏆 Défi Bonus 1 (+5 pts)

Ajoute un effet visuel (ex. léger agrandissement) sur `Assiette` chaque fois qu'elle change de direction, pour un rendu plus vivant.

---

# 🔔 NIVEAU 2 — LE SERVICE COMMENCE

### 📜 Histoire

*Le patron du camion appuie sur la sonnette : le service commence! Il faut coordonner tous les lutins de la cuisine. C'est le moment de maîtriser les **événements** et la **communication entre lutins**!*

## 💎 Points : 10 pts | 🧠 Notion : **Événements**

---

### 🎓 Concept : Les messages (broadcast)

Un **message** permet à un lutin d'envoyer une information que d'autres lutins peuvent recevoir et auxquels ils peuvent réagir, même s'ils ne se touchent pas. C'est ainsi que le `Client` peut annoncer à toute la cuisine : *"le service commence!"*

---

### 🎯 Mission 2.1 : Démarrage du service

Quand le **drapeau vert** est cliqué :

1. Envoyer le message `debut_service`.
2. Chaque lutin (`Assiette`, `Ingredient_Bon`, `Ingredient_Mauvais`, `Client`) doit avoir un bloc `quand je reçois [debut_service]` qui réinitialise sa position et son apparence.

### 🎯 Mission 2.2 : Message de fin

Crée deux nouveaux messages : `service_reussi` et `service_rate` (ils seront utilisés au Niveau 4). Pour l'instant, ajoute seulement les blocs `quand je reçois [service_reussi]` et `quand je reçois [service_rate]` vides dans le lutin `Client` — tu les compléteras plus tard.

### 🎯 Mission 2.3 : Message d'accueil

Au tout début du service, `Client` doit dire (`dire () pendant () secondes`) : *"Bienvenue au Foodie Truck! Prépare-moi ma commande!"*

### ✅ Checklist niveau 2

* [ ] Le drapeau vert relance proprement tout le service
* [ ] Les 4 lutins réagissent au message `debut_service`
* [ ] Les messages `service_reussi` et `service_rate` existent déjà (même vides)

---

## 🏆 Défi Bonus 2 (+5 pts)

Ajoute un son de cloche de service qui se joue dès que `debut_service` est reçu par `Client`.

---

# 🥕 NIVEAU 3 — PLUIE D'INGRÉDIENTS

### 📜 Histoire

*Les ingrédients commencent à tomber du plafond de la cuisine (un peu de magie n'a jamais fait de mal)! Direction les **boucles**!*

## 💎 Points : 15 pts | 🧠 Notion : **Contrôle et boucles**

---

### 🎯 Mission 3.1 : Faire tomber un bon ingrédient

Dans le lutin `Ingredient_Bon`, quand `debut_service` est reçu :

1. `répéter indéfiniment`
2. Se positionner en haut de l'écran à un `x` aléatoire (`aller à x:(nombre aléatoire entre -220 et 220) y:(170)`)
3. `répéter jusqu'à ce que (y) < -170` : descendre progressivement (`changer y de -5`), avec un petit `attendre (0.02) secondes` à chaque tour.

### 🎯 Mission 3.2 : Faire tomber un mauvais ingrédient

Fais la même chose pour le lutin `Ingredient_Mauvais`, mais avec une vitesse de chute légèrement différente (par exemple `changer y de -6`), pour le rendre plus difficile à éviter.

### 🎯 Mission 3.3 : Pause synchronisée

Ajoute un bloc `attendre (nombre aléatoire entre 0.5 et 2) secondes` avant chaque nouvelle chute, pour que les ingrédients ne tombent pas toujours au même rythme (rends le jeu imprévisible!).

### ✅ Checklist niveau 3

* [ ] Les bons ingrédients tombent en boucle depuis le haut de l'écran
* [ ] Les mauvais ingrédients tombent aussi, à une vitesse différente
* [ ] Chaque chute recommence à une position `x` aléatoire

---

## 🏆 Défi Bonus 3 (+5 pts)

Utilise le bloc `créer un clone de (moi-même)` pour que **plusieurs** ingrédients puissent tomber en même temps, au lieu d'un seul à la fois.

---

# 🍽️ NIVEAU 4 — BONNES ET MAUVAISES PRISES

### 📜 Histoire

*Maintenant que la cuisine est remplie d'ingrédients, l'assiette doit apprendre à réagir : attraper les bons, éviter les mauvais. C'est l'heure des **conditions**!*

## 💎 Points : 15 pts | 🧠 Notion : **Conditions**

---

### 🎯 Mission 4.1 : Attraper un bon ingrédient

Dans le lutin `Ingredient_Bon`, à l'intérieur de la boucle de chute, ajoute une condition :

```
si <touche [Assiette]?> alors
    changer [score] de 10
    jouer le son "miam"
    aller à x:(nombre aléatoire) y:(170)   // l'ingrédient réapparaît en haut
```

### 🎯 Mission 4.2 : Attraper un mauvais ingrédient

Dans le lutin `Ingredient_Mauvais`, ajoute une condition similaire :

```
si <touche [Assiette]?> alors
    changer [patience] de -15
    jouer le son "beurk"
    aller à x:(nombre aléatoire) y:(170)
```

### 🎯 Mission 4.3 : Conditions de réussite et d'échec

Dans le lutin `Client`, à l'intérieur d'une boucle `répéter indéfiniment` :

```
si <(score) > 100> alors
    envoyer le message [service_reussi]
si <(patience) < 1> alors
    envoyer le message [service_rate]
```

### ✅ Checklist niveau 4

* [ ] Le score augmente quand l'assiette attrape un bon ingrédient
* [ ] La patience diminue quand l'assiette attrape un mauvais ingrédient
* [ ] Les messages `service_reussi` et `service_rate` sont envoyés au bon moment

---

## 🏆 Défi Bonus 4 (+5 pts)

Ajoute un effet visuel temporaire (l'assiette clignote avec l'effet `fantôme`) pendant 1 seconde après avoir attrapé un mauvais ingrédient, pour bien signaler l'erreur au joueur.

---

# 😠 NIVEAU 5 — JAUGE DE PATIENCE

### 📜 Histoire

*Un·e bon·ne chef garde toujours un œil sur sa clientèle! Il est temps d'ajouter une vraie **jauge de patience** qui diminue avec le temps, et pas seulement après une mauvaise prise.*

## 💎 Points : 10 pts | 🧠 Notion : **Capteurs et variables**

---

### 🎯 Mission 5.1 : Créer et initialiser les variables

Crée deux variables **pour tous les lutins** : `score` et `patience`. Quand `debut_service` est reçu par `Client` :

* `mettre [score] à 0`
* `mettre [patience] à 100`

### 🎯 Mission 5.2 : Patience qui s'épuise naturellement

Dans une boucle `répéter indéfiniment`, fais diminuer la patience progressivement même sans mauvaise prise :

```
attendre (1) secondes
changer [patience] de -2
```

### 🎯 Mission 5.3 : Afficher les jauges

Affiche les variables `score` et `patience` à l'écran (`afficher la variable`). Personnalise leur affichage en mode **curseur** dans les paramètres de la variable pour qu'elles ressemblent à de vraies jauges.

### 🎯 Mission 5.4 : Alerte patience critique

Utilise une condition pour afficher un avertissement :

```
si <(patience) < 20> alors
    dire "😡 Le client s'impatiente sérieusement!" pendant (0.5) secondes
```

### ✅ Checklist niveau 5

* [ ] `score` commence à 0 et `patience` commence à 100 à chaque partie
* [ ] La patience diminue toute seule avec le temps
* [ ] Un message d'alerte apparaît sous les 20% de patience

---

## 🏆 Défi Bonus 5 (+5 pts)

Change l'expression du visage du `Client` (costume différent ou effet `couleur`) progressivement à mesure que la patience baisse, pour renforcer visuellement l'urgence.

---

# 🎲 NIVEAU 6 — RUSH ET COMBOS

### 📜 Histoire

*Un service tranquille n'est pas amusant longtemps! Utilise les **opérateurs** pour que le jeu devienne de plus en plus intense à mesure que le score augmente, et récompense les joueurs qui enchaînent les bonnes prises.*

## 💎 Points : 15 pts | 🧠 Notion : **Opérateurs**

---

### 🎓 Concept : Modulo et comparaisons combinées

Le bloc `mod` permet de détecter des **paliers** (par exemple tous les 20 points). Combiné à `et`/`ou`, il permet de créer des règles plus riches, comme *"le score est un multiple de 20 ET la patience est encore suffisante"*.

---

### 🎯 Mission 6.1 : Créer une variable `niveau_rush`

Initialise-la à 1 au début du service.

### 🎯 Mission 6.2 : Augmenter le rush tous les 20 points

Dans le lutin `Client`, dans la boucle principale :

```
si <((score) mod 20) = 0> et <(score) > 0> alors
    changer [niveau_rush] de 1
```

*Attention : sans précaution, cette condition pourrait s'exécuter plusieurs fois de suite pour le même palier. Réfléchis à une façon d'éviter ce problème (indice : une variable qui mémorise le dernier palier atteint).*

### 🎯 Mission 6.3 : Accélérer la pluie d'ingrédients

Dans les lutins `Ingredient_Bon` et `Ingredient_Mauvais`, remplace la vitesse fixe de chute par une vitesse liée à `niveau_rush` :

```
changer y de (-5 - (niveau_rush) * 1)
```

Plus le niveau de rush augmente, plus les ingrédients tombent vite!

### 🎯 Mission 6.4 : Système de combo

Crée une variable `combo` qui augmente de 1 chaque bonne prise consécutive, et qui revient à 0 dès qu'un mauvais ingrédient est attrapé. Utilise-la pour multiplier les points :

```
changer [score] de (10 + (combo))
```

### ✅ Checklist niveau 6

* [ ] `niveau_rush` augmente d'exactement 1 tous les 20 points
* [ ] Les ingrédients tombent plus vite à mesure que le niveau augmente
* [ ] Le combo augmente les bonnes prises et se réinitialise sur une mauvaise prise

---

## 🏆 Défi Bonus 6 (+5 pts)

Affiche un message spécial (ex. "🔥 COMBO x5!") chaque fois que `combo` atteint un multiple de 5.

---

# 📋 NIVEAU 7 — LES COMMANDES ET LE PALMARÈS

### 📜 Histoire

*Un·e vrai·e chef ne travaille pas au hasard : il·elle suit une commande précise, et le patron garde une trace des meilleurs services de tous les temps. Direction les **listes**!*

## 💎 Points : 15 pts | 🧠 Notion : **Listes**

---

### 🎯 Mission 7.1 : Créer deux listes

* `commande` : contient les ingrédients demandés pour le service en cours (par exemple "tomate", "pain", "fromage").
* `palmares` : contiendra le score final de **tous les services joués** depuis le début.

### 🎯 Mission 7.2 : Trois types d'ingrédients à valeur variable

Dans le lutin `Ingredient_Bon`, utilise une variable `type_ingredient` qui prend aléatoirement une des 3 valeurs suivantes à chaque réapparition, avec des valeurs de points différentes :

| Type | Valeur | Probabilité suggérée |
|---|---|---|
| Légume courant | +5 pts | fréquent |
| Viande/protéine | +10 pts | moyen |
| Ingrédient rare (truffe, safran) | +25 pts | rare |

*Indice : utilise `nombre aléatoire entre (1) et (10)` et des conditions pour répartir les probabilités (ex. 1-6 = courant, 7-9 = protéine, 10 = rare).*

### 🎯 Mission 7.3 : Cocher la commande

Chaque fois que l'assiette attrape un ingrédient présent dans la liste `commande`, retire-le de la liste (`supprimer (1) de [commande]`) pour montrer la progression de la commande.

### 🎯 Mission 7.4 : Mettre à jour le palmarès

Quand le service se termine (`service_reussi` ou `service_rate` reçu), ajoute le score final à la liste `palmares` avec `ajouter (score) à [palmares]`.

### 🎯 Mission 7.5 : Afficher le meilleur score

Parcours la liste `palmares` avec une boucle pour trouver et afficher le **meilleur score de tous les temps** (réutilise la logique du calcul de maximum vue dans les exercices d'algorithmique).

### ✅ Checklist niveau 7

* [ ] Il existe 3 types d'ingrédients avec des valeurs différentes
* [ ] La commande se met à jour correctement pendant la partie
* [ ] Le palmarès conserve les scores de tous les services joués
* [ ] Le meilleur score est calculé et affiché à la fin

---

## 🏆 Défi Bonus 7 (+5 pts)

Affiche, à la fin de chaque service, un résumé de la commande : combien d'ingrédients de chaque type ont été servis (utilise le bloc `[commande] contient ()?` ou une boucle de comptage).

---

# 🌶️ NIVEAU 8 — COUP DE FEU DU VENDREDI (BOSS)

### 📜 Histoire

*C'est vendredi soir, le camion est pris d'assaut! Il ne reste qu'une seule chance : combiner tout ce que tu as appris pour tenir le rythme du service avant que la patience de la clientèle ne s'épuise complètement.*

## 💎 Points : 20 pts (+ bonus) | 🧠 Notion : **Intégration complète**

---

### 🎯 Mission 8.1 : Écran de fin — Service réussi

Quand `Client` reçoit `service_reussi` :

1. Arrêter tous les autres scripts (`arrêter [tout]` ou `arrêter [les autres scripts du lutin]` sur chaque lutin concerné).
2. Afficher un message : *"🎉 Service terminé avec succès! Score final : [score] points!"*
3. Jouer un son de succès.
4. Ajouter le score au `palmares`.

### 🎯 Mission 8.2 : Écran de fin — Service raté

Quand `Client` reçoit `service_rate` :

1. Arrêter les autres scripts.
2. Afficher : *"😤 Le client est parti fâché! Score obtenu : [score] points."*
3. Jouer un son d'échec.
4. Ajouter le score au `palmares` (même en cas d'échec, pour l'historique).

### 🎯 Mission 8.3 : Effet coup de feu

Ajoute un lutin `AlarmeCuisine` qui apparaît seulement lorsque `patience < 30` : il doit appliquer un effet visuel (ex. `changer l'effet [couleur] de (25)` en boucle rapide) sur toute la scène, pour montrer que la situation devient critique.

### 🎯 Mission 8.4 : Rejouer le service

Ajoute un bouton (un lutin `Rejouer`) qui, lorsqu'il est cliqué, renvoie le message `debut_service` pour recommencer un nouveau service sans fermer le projet.

### ✅ Checklist niveau 8

* [ ] Un vrai écran de service réussi s'affiche avec le score final
* [ ] Un vrai écran de service raté s'affiche avec le score final
* [ ] Un effet visuel d'alarme apparaît quand la patience est critique
* [ ] Le joueur peut rejouer sans recharger la page

---

## 🏆 Défis Bonus Finaux

### Défi 8.A (+10 pts) : Mode difficile

Ajoute un menu au tout début (`demander et attendre`) qui laisse le joueur choisir "facile" ou "difficile". En mode difficile, la patience diminue plus vite et les ingrédients sont plus nombreux.

### Défi 8.B (+10 pts) : Musique dynamique

Change la musique de fond ou augmente son tempo/volume à mesure que `niveau_rush` augmente.

### Défi 8.C (+10 pts) : Animation de l'assiette

Ajoute plusieurs costumes à l'assiette et fais-la alterner entre eux pendant les déplacements, pour une animation fluide.

### Défi 8.D (+10 pts) : Classement des 3 meilleurs scores

Améliore la Mission 7.5 pour afficher, non pas seulement le meilleur score, mais le **top 3** des meilleurs scores dans la liste `palmares`.

---

## 📦 Remise du projet

1. Exporte ton projet en fichier `.sb3` (`Fichier > Sauvegarder sur l'ordinateur`).
2. Nomme le fichier `ChefExpress_NOM_Prenom.sb3`.
3. Dépose-le sur la plateforme du cours avant la date limite.
4. Sois prêt·e à présenter ton service en 2-3 minutes en classe : montre ta jauge de patience, tes ingrédients récoltés, et une fin (service réussi ou raté)!

---

## 🎊 FÉLICITATIONS, CHEF ! 🎊

Si tu as terminé les 8 niveaux, ton projet utilise maintenant **toutes** les notions vues en Scratch : mouvement, événements, boucles, conditions, capteurs, opérateurs, variables et listes — exactement les briques que tu retrouveras bientôt dans un vrai langage de programmation textuel! 🍕👑

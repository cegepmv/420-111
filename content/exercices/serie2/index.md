+++
date = '2025-08-20T19:02:29-04:00'
title = 'Série 2'
weight = 2
+++


---

## 🧠 **Exercices – Choisis le type le plus adapté**

Tu dois enregistrer les données suivantes dans une variable **aussi petite que possible**, selon leur type.

Pour chaque donnée, **déclare une variable** (ou une valeur fixe) en utilisant le **type primitif le plus petit possible** ou String.


## Exo 1

```text
1. La température d’un congélateur : -18
2. Une distance interplanétaire en kilomètres : 150000000000L
3. Le taux de réussite à un examen : 0.987
4. Le message d’accueil : "Bienvenue sur le système"
5. Une température corporelle : 36.6
6. Le niveau d’alerte (valeur unique entre ‘A’ et ‘Z’) : 'C'
7. L’âge d’un arbre centenaire : 153
8. La réponse à une question (oui/non) : true
9. Le nom de la planète : "Terre"
10. Le nombre d’enfants dans une classe : 28


```

## Exo 2


```text
1. Le taux de remplissage d’un réservoir : 0.735
2. Le code de niveau de sécurité : 'B'
3. Le nombre de jours dans une semaine : 7 (valeur fixe)
4. Le nom du système solaire : "Système solaire"
5. La distance Terre-Lune (en km) : 384400
6. L’année de construction d’un pont : 1967
7. La température d’ébullition de l’eau (en °C) : 100
8. La lumière est-elle allumée ? : false
9. Le message d'erreur affiché à l'écran : "Erreur : accès refusé"
10. L’identifiant d’un capteur : 120

🎯 Objectif : 1 ligne = 1 variable. Type primitif ou `String`. La plus petite taille possible.
```

## Exo 3

```text
1. Le niveau sonore maximal autorisé : 120
2. Le symbole de la touche entrée : '\n'
3. Le résultat d’un test booléen : true
4. Le prénom du robot assistant : "EVA"
5. La masse d’un atome d’hydrogène : 1.00784
6. Le nombre de planètes dans le système solaire : 8 (valeur fixe)
7. Le code d’erreur reçu par un serveur : 404
8. Une température très basse mesurée dans l’espace : -270
9. La distance entre deux étoiles : 9461000000000 (en km)
10. Le slogan affiché à l’accueil : "Bonjour, humain."

```

## Exo 4


```text
1. L'âge d’un personnage de jeu vidéo : 32
2. La température idéale pour un serveur : 21.5
3. Le caractère de commande utilisé dans le terminal : '$'
4. Le nombre d’heures dans une journée : 24 (valeur fixe)
5. Le nom du fichier système : "kernel.sys"
6. La valeur de l'accélération gravitationnelle (m/s²) : 9.80665
7. Le niveau de batterie d’un drone : 98
8. Est-ce que le drone est actif ? : true
9. Le message système de veille : "Mise en veille imminente"
10. Une distance astronomique (en km) : 149600000000

```

## Exo 5


```text
1. Un identifiant d’objet unique : 256
2. Le mot de passe par défaut : "admin"
3. La pression moyenne atmosphérique : 1013.25
4. Le caractère spécial de validation : '#'
5. Le nombre de bits dans un octet : 8 (valeur fixe)
6. Le message de confirmation : "Action enregistrée"
7. Est-ce que le mode nuit est activé ? : false
8. L’année de fondation de l’entreprise : 2001
9. La température moyenne de Mars : -63
10. La vitesse de la lumière en km/s : 299792

```



## 💡 Exercices : **Concaténation de chaînes de caractères en Java**

---

### 🧪 **Exo 6 – Concaténation simple avec `+`**

Enregistre *Alice* et *Durand* dans 2 variables distinctes:



Utilise les 2 variables créés préalablement pour créer une troisième variable `nomComplet` qui contient la phrase :

```text
"Bonjour Alice Durand"
```

Affiche-la 3e variable.

---

### 🧪 **Exo 7 – Concaténation avec des variables numériques**

Déclare les variables suivantes :

```java
String nomProduit = "Clavier";
byte quantite = 5;
float prixUnitaire = 24.99f;
```

Affiche le message suivant en une seule ligne avec concaténation :

```text
"5 Clavier à 24.99$ l’unité"
```

---

### 🧪 **Exo 8 – Concaténation avec `concat()`**

Utilise `.concat()` pour construire la phrase suivante à partir des morceaux :

```java
String a = "Java ";
String b = "est";
String c = "super.";
```

Résultat attendu : `"Java est super."`

> Ne pas utiliser `+`

---

<!-- ### 🧪 **Exo  – Concaténation avec `StringBuilder`**

Utilise `StringBuilder` pour créer la phrase suivante :

```text
"Chargement terminé à 100% !"
```

À partir des variables :

```java
int pourcentage = 100;
String message = "Chargement terminé à ";
```

> Utilise `.append()` à chaque étape, puis affiche la chaîne finale avec `toString()`.

--- -->

### 🧪 **Exo 9 – Concaténation multi-lignes**

À partir des éléments suivants que vous devez enregistrer dans des variables distinctes:

```java
"Martin"; //prenom
29; //age
"Lyon"; //nom
```

Construit et affiche la phrase suivante (avec retours à la ligne `\n`) :

```text
Nom : Martin
Âge : 29
Ville : Lyon
```


---

<a href="https://github.com/cegepmv/420-111/tree/main/soltions/serie2">Solutions</a>

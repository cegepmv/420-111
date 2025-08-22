var relearn_searchindex = [
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV)",
    "content": "This is a new chapter.",
    "description": "This is a new chapter.",
    "tags": [],
    "title": "Intro",
    "uri": "/420-111/intro/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Intro",
    "content": "Introduction C’est quoi un language de programmation? Java est l’un des langages les plus populaires en 2025 selon TIOBE https://www.tiobe.com/tiobe-index/\nJava fonctionne sur plusieurs systèmes d’exploitation (Windows, Mac, Linux, Raspberry Pi, etc.) Java est assez facile à apprendre, surtout pour les débutants, et il est agréable à utiliser.\nSi vous connaissez déjà un peu C++ ou C#, passer à Java est simple, et l’inverse aussi. Il facilite donc la transition pour les développeurs entre ces langages\nComme Java est un langage orienté objet, il permet d’écrire du code bien organisé et réutilisable, ce qui facilite la création de programmes.\nIl peut être utilisé pour:\ncréer des applications mobiles, surtout sur les téléphones Android ; développer des logiciels pour ordinateur (Windows, Mac, etc.) ; concevoir des applications web, comme les sites internet interactifs ; mettre en place des serveurs web et des serveurs d’applications ; programmer des jeux vidéo ; se connecter à des bases de données pour lire ou sauvegarder des informations ; et bien d’autres choses encore ! Qu’est-ce que Java ? Java est un langage de programmation orienté objet et indépendant de la plateforme, ce qui signifie que vous pouvez écrire du code Java sur un système d’exploitation (par exemple Windows) et l’exécuter sur n’importe quel autre système (par exemple Linux, Mac) sans modification. Java suit le principe du “write once, run anywhere”.\nIntroduction_à_l’environnement_Java POUR LINUX wget https://www.oracle.com/java/technologies/downloads/?er=221886 sudo dpkg -i Downloads/jdk-23_linux-x64_bin.deb OU\nsudo apt update sudo apt install openjdk-11-jdk POUR WINDOWS Aller sur le site officiel de oracle\nNotepad++ Jusqu’à nouvel ordre vous ne pourrez coder exclusivement qu’avec Notepad++ dans mon cours.\nVous pouvez changer les couleurs. Je suggère DansLeRush-Dark, mais vous pouvez le personnaliser comme vous voulez.",
    "description": "Introduction C’est quoi un language de programmation? Java est l’un des langages les plus populaires en 2025 selon TIOBE https://www.tiobe.com/tiobe-index/\nJava fonctionne sur plusieurs systèmes d’exploitation (Windows, Mac, Linux, Raspberry Pi, etc.) Java est assez facile à apprendre, surtout pour les débutants, et il est agréable à utiliser.",
    "tags": [],
    "title": "Java",
    "uri": "/420-111/intro/java/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Intro",
    "content": "☕ Créer son tout premier programme en Java Avant de plonger dans le code, il est important de savoir qu’en Java, tout le code source doit être enregistré dans un fichier avec l’extension .java.\nEN ligne Si java n’est malheureusement pas installé sur votre ordinateur et que vous ne pouvez pas le faire, vous pouvez tout de même programmer directement sur le web ici\n🔧 Étapes : Crée un nouveau fichier et nomme-le Main.java. Tape (de préférence manuellement) le code suivant dans ce fichier : public class Main { public static void main(String[] args) { System.out.println(\"Hello World\"); } } 💡 Astuce : Prends le temps de taper le code au lieu de simplement le copier-coller. Cela t’aidera à bien comprendre chaque ligne.\n🧩 Comprendre la notion de classe En Java, tout le code exécutable doit être contenu dans une classe.\nCe concept sera expliqué en détail plus tard, mais retiens pour l’instant qu’une classe est indispensable. Dans notre exemple, cela correspond à la ligne public class Main. Par convention, le nom d’une classe commence par une majuscule (ce n’est pas obligatoire, mais recommandé). Le nom du fichier doit être identique au nom de la classe, suivi de l’extension .java. Ici, la classe s’appelle Main, donc le fichier s’appelle Main.java. Le mot-clé public est un modificateur d’accès indiquant que cette classe est accessible depuis d’autres classes (nous y reviendrons plus tard). 🏁 La méthode main() La méthode main() est le point d’entrée de tout programme Java. Tout le code à l’intérieur de cette méthode sera exécuté au lancement du programme. 🔍 Ne t’inquiète pas pour le moment des autres mots-clés comme static ou void. Tu les comprendras avec le temps.\n🔄 Résumé ligne par ligne Ligne de code Explication public class Main Déclare une classe publique appelée Main. public static void main(String[] args) Déclare la méthode principale qui sera exécutée au démarrage du programme. System.out.println(\"Hello World\"); Affiche le message \"Hello World\" dans la console. 📌 Quelques règles de syntaxe essentielles Les accolades {} servent à délimiter des blocs de code (classes, méthodes, boucles, etc.). Chaque instruction Java doit se terminer par un point-virgule ;. Sinon, tu auras une erreur lors de la compilation. 🧪 Compilation et exécution d’un programme Java D’abord, tu dois t’assurer que Java est bien installé sur ton ordinateur\nOuvre une invite de commandes (cmd) sous Windows (Terminal sous Mac/Linux). Tape la commande java -version. Cette commande devrait vous dire la version de Java qui est installé sur votre ordinateur. Tape aussi la commande javac -version. Cette commande devrait te dire la version du compilateur de Java installé sur ton ordinateur Note: Ces commandes fonctionnent seulement si Java et le compilateur de Java sont installés et que le chemin où le répertoire de Java se trouve est mis dans le PATH des variables d’environnement (À expliquer en classe pour que ce soit plus clair) Exécution du code dans le fichier Main.java Ouvre une invite de commandes (cmd) sous Windows (Terminal sous Mac/Linux). Navigue vers le dossier où se trouve votre fichier Main.java Exécute la commande java Main.java. Tu devrais voir le message Hello World dans l’invite de commandes. Traditionnellement, Java fonctionne en deux étapes :\nCompilation : Le code source (.java) est transformé en bytecode (.class) grâce à la commande :\njavac Main.java Exécution : Le bytecode est ensuite exécuté avec la commande :\njava Main 💡 Astuce : Depuis une version relativement récente de Java, il est aussi possible d’exécuter directement un fichier .java sans passer explicitement par l’étape de compilation (javac).\njava Main.java Cela permet d’exécuter rapidement un programme, mais à noter :\nLe fichier .class est généré temporairement. Il est ensuite supprimé automatiquement après l’exécution. 📝 Cette méthode est pratique pour tester du code rapidement, mais dans un projet structuré, on utilise généralement javac suivi de java.\n🖨️ Affichage avec System.out.print et System.out.println Dans la méthode main(), tu peux utiliser :\nSystem.out.println() : pour afficher une ligne de texte suivie d’un retour à la ligne. System.out.print() : pour afficher du texte sans retour à la ligne. ✏️ Pour l’instant, retiens que tu dois utiliser System.out.println(\"ton message\"); pour afficher du texte à l’écran.\n📌 Détail sur System.out Élément Rôle System Classe prédéfinie dans java.lang out Représente le flux de sortie standard System.out Utilisé pour écrire dans la console 🧩 Différence entre print() et println() Méthode Effet print() Affiche le texte sur la même ligne println() Affiche le texte puis passe à la ligne suivante Exemple 1 : sans retour à la ligne System.out.print(\"Bonjour \"); System.out.print(\"tout le monde !\"); 🖥️ Résultat :\nBonjour tout le monde ! Exemple 2 : avec retour à la ligne System.out.println(\"Bonjour\"); System.out.println(\"tout le monde !\"); 🖥️ Résultat :\nBonjour tout le monde ! Exemple 3 : retour à la ligne manuel System.out.print(\"Ligne 1\\nLigne 2\"); 🖥️ Résultat :\nLigne 1 Ligne 2 ✅ En résumé : print() : n’ajoute pas de retour à la ligne. println() : ajoute un retour à la ligne automatiquement. Ces méthodes sont très utilisées pour afficher des messages ou pour déboguer.",
    "description": "☕ Créer son tout premier programme en Java Avant de plonger dans le code, il est important de savoir qu’en Java, tout le code source doit être enregistré dans un fichier avec l’extension .java.\nEN ligne Si java n’est malheureusement pas installé sur votre ordinateur et que vous ne pouvez pas le faire, vous pouvez tout de même programmer directement sur le web ici",
    "tags": [],
    "title": "Premier Programme",
    "uri": "/420-111/intro/premier-programme/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV)",
    "content": "This is a new chapter.",
    "description": "This is a new chapter.",
    "tags": [],
    "title": "Exercices",
    "uri": "/420-111/exercices/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Intro",
    "content": "🧠 Qu’est-ce qu’un commentaire ? Un commentaire est une partie du code ignorée par le compilateur Java.\nIl sert à :\nExpliquer le code aux humains (programmeurs). Documenter le fonctionnement des classes, des méthodes, etc. Faciliter la relecture et la maintenance du programme. ✍️ 1. Commentaire sur une ligne (//) 🔹 Syntaxe : // Ceci est un commentaire sur une ligne int age = 25; // Stocke l’âge ✅ Utilisation : Expliquer une ligne de code. Ajouter une remarque rapide. 🧾2. Commentaire sur plusieurs lignes (/* … */) 🔹 Syntaxe : /* Ceci est un commentaire sur plusieurs lignes. Il peut couvrir un bloc de texte. */ ✅ Utilisation : Fournir une explication plus longue. Désactiver temporairement un bloc de code. Avancé Nous verrons peut être cette théorie plus tard\n📚 3. Commentaire de documentation (/** … */) 🔹 Syntaxe :\n/** * Cette méthode affiche un message de bienvenue. * @param nom Le nom de l’utilisateur. */ public void direBonjour(String nom) { System.out.println(\"Bonjour \" + nom); } ✅ Utilisation : Générer une documentation HTML avec Javadoc. Documenter les classes, méthodes, constructeurs, etc.",
    "description": "🧠 Qu’est-ce qu’un commentaire ? Un commentaire est une partie du code ignorée par le compilateur Java.\nIl sert à :\nExpliquer le code aux humains (programmeurs). Documenter le fonctionnement des classes, des méthodes, etc. Faciliter la relecture et la maintenance du programme. ✍️ 1. Commentaire sur une ligne (//) 🔹 Syntaxe : // Ceci est un commentaire sur une ligne int age = 25; // Stocke l’âge ✅ Utilisation : Expliquer une ligne de code. Ajouter une remarque rapide. 🧾2. Commentaire sur plusieurs lignes (/* … */) 🔹 Syntaxe : /* Ceci est un commentaire sur plusieurs lignes. Il peut couvrir un bloc de texte. */ ✅ Utilisation : Fournir une explication plus longue. Désactiver temporairement un bloc de code. Avancé Nous verrons peut être cette théorie plus tard",
    "tags": [],
    "title": "Commentaires",
    "uri": "/420-111/intro/commentaires/index.html"
  },
  {
    "breadcrumb": "",
    "content": "Plans de cours 📋 Maxime Fournier : Plan de cours(TODO)\n📋 Samuel Fostiné : Plan de cours(TODO)\nHoraire et disponibilités des enseignants ✔️ Maxime Fournier : Lien vers mon horaire et mes disponibilités(TODO)\n✔️ Samuel Fostiné : Lien vers mon horaire et mes disponibilités(TODO)\nMaxime Fournier | Samuel Fostiné Nom de l’évaluation Pondération Date de l’évaluation Laboratoire 1 10 % Semaine x Laboratoire 2 10 % Semaine x Laboratoire 3 15 % Semaine x Quiz (entre 12 ou 13 quiz) 10 meilleures notes 15 % Semaine 2 à 14 Examen 1 20 % Semaine x Examen Final 30 % ESO",
    "description": "Plans de cours 📋 Maxime Fournier : Plan de cours(TODO)\n📋 Samuel Fostiné : Plan de cours(TODO)\nHoraire et disponibilités des enseignants ✔️ Maxime Fournier : Lien vers mon horaire et mes disponibilités(TODO)\n✔️ Samuel Fostiné : Lien vers mon horaire et mes disponibilités(TODO)\nMaxime Fournier | Samuel Fostiné Nom de l’évaluation Pondération Date de l’évaluation Laboratoire 1 10 % Semaine x Laboratoire 2 10 % Semaine x Laboratoire 3 15 % Semaine x Quiz (entre 12 ou 13 quiz) 10 meilleures notes 15 % Semaine 2 à 14 Examen 1 20 % Semaine x Examen Final 30 % ESO",
    "tags": [],
    "title": "Introduction à la programmation informatique (420-111-MV)",
    "uri": "/420-111/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie015",
    "uri": "/420-111/exercices/serie015/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie014",
    "uri": "/420-111/exercices/serie014/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie013",
    "uri": "/420-111/exercices/serie013/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie012",
    "uri": "/420-111/exercices/serie012/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie011",
    "uri": "/420-111/exercices/serie011/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie010",
    "uri": "/420-111/exercices/serie010/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie09",
    "uri": "/420-111/exercices/serie09/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie08",
    "uri": "/420-111/exercices/serie08/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie07",
    "uri": "/420-111/exercices/serie07/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie06",
    "uri": "/420-111/exercices/serie06/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie05",
    "uri": "/420-111/exercices/serie05/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie04",
    "uri": "/420-111/exercices/serie04/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie3",
    "uri": "/420-111/exercices/serie3/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Serie2",
    "uri": "/420-111/exercices/serie2/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV) \u003e Exercices",
    "content": "📘 Exercices – Semaine 1 : Introduction à Java 🟢 Exercice 1 – Mon premier programme Objectif : Créer un programme Java qui affiche ton nom, ton âge et ta ville sur 3 lignes différentes.\n➡️ Exemple attendu :\nNom : Alice Âge : 23 Ville : Toulouse Instructions :\nUtilise System.out.println(). Respecte l’indentation. Le nom du fichier doit être Profil.java. N’oublie pas le point-virgule ; à chaque ligne. 🟢 Exercice 2 – Affichage sur une seule ligne Objectif : Reproduis le même affichage que l’exercice 1, mais sur une seule ligne.\n➡️ Exemple attendu :\nNom : Alice | Âge : 23 | Ville : Toulouse Instructions :\nUtilise System.out.print() (sans println()). Utilise \\n si besoin. Respecte les espaces entre les mots (convention d’espacement). 🟢 Exercice 3 – Utilisation des caractères d’échappement Objectif : Créer un programme qui affiche les lignes suivantes :\nNom : \"Alice\" Chemin du fichier : C:\\Users\\Alice Instructions :\nUtilise System.out.println(). Utilise les caractères \\\" et \\\\. 🟠 Exercice 4 – Rappel sur les conventions Question écrite (pas de code) :\nDans le programme ci-dessous, relève 5 erreurs de convention de nommage ou d’espacement, puis corrige-les.\npublic class profilUtilisateur{ public static void main(String[]args){ int AgeUtilisateur=25; System.out.println( \"Age :\"+AgeUtilisateur ); } } 🟠 Exercice 5 – Indentation et lisibilité Réécris proprement le programme suivant avec une indentation correcte, sans modifier le code fonctionnel :\npublic class Bonjour{ public static void main(String[]args){ System.out.println(\"Bonjour\"); if(true){ System.out.println(\"Ceci est un test\"); } } } 🔵 Exercice 6 – Compilation et exécution (manuel) Objectif : Créer et compiler ton fichier Java dans ton terminal (Notepad++ + commande).\nCrée un fichier nommé Bienvenue.java. Écris un programme qui affiche : Bienvenue dans le monde de Java ! Compile avec : javac Bienvenue.java Exécute avec : java Bienvenue 🔵 Exercice 7 – Formatage avec printf Objectif : Affiche un profil formaté et aligné grâce à System.out.printf() :\nUtilise une chaîne multiligne (\"\"\") ➡️ Exemple attendu :\nNom complet : Julie MARTIN Âge : 28 Ville : Lyon Instructions :\nUtilise printf() avec %s. Applique les règles de mise en majuscule ou capitalisation sur le nom et la ville.",
    "description": "📘 Exercices – Semaine 1 : Introduction à Java 🟢 Exercice 1 – Mon premier programme Objectif : Créer un programme Java qui affiche ton nom, ton âge et ta ville sur 3 lignes différentes.\n➡️ Exemple attendu :\nNom : Alice Âge : 23 Ville : Toulouse Instructions :\nUtilise System.out.println(). Respecte l’indentation. Le nom du fichier doit être Profil.java. N’oublie pas le point-virgule ; à chaque ligne. 🟢 Exercice 2 – Affichage sur une seule ligne Objectif : Reproduis le même affichage que l’exercice 1, mais sur une seule ligne.",
    "tags": [],
    "title": "Serie1",
    "uri": "/420-111/exercices/serie1/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV)",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Categories",
    "uri": "/420-111/categories/index.html"
  },
  {
    "breadcrumb": "Introduction à la programmation informatique (420-111-MV)",
    "content": "",
    "description": "",
    "tags": [],
    "title": "Tags",
    "uri": "/420-111/tags/index.html"
  }
]

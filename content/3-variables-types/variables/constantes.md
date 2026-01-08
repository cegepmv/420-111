+++
date = '2025-08-26T14:39:35-04:00'
title = 'Constantes'
weight = 1
+++


---

En Java, une **constante** est une variable dont la valeur **ne peut plus être modifiée** après son initialisation.

Elles sont utilisées pour représenter des **valeurs fixes** (comme un taux de taxe, un seuil, une unité de mesure, etc.) qui **ne doivent pas changer** pendant l’exécution du programme.

---

## ✅ Comment déclarer une constante ?

Pour déclarer une constante, on utilise le mot-clé `final`. Cela indique que la valeur ne pourra être assignée **qu'une seule fois**.

```java
public class ExempleConstantes {

    public static void main(String[] args) {
        // Déclaration d'une constante locale
        final double TAUX_TPS = 0.20;

        System.out.println(TAUX_TPS);  // Affiche : 0.20
    }
}
```

📝 Remarque : Par convention, on écrit les noms de constantes en **majuscules**, avec des underscores `_` pour séparer les mots.

---

## ❓ Pourquoi utiliser des constantes ?

Utiliser des constantes a plusieurs avantages :

* 💡 Cela rend le code **plus clair** : on comprend que la valeur ne changera pas.
* ✅ Cela **évite les erreurs** involontaires en empêchant toute modification de la valeur.
* 📚 C’est aussi une **bonne pratique** pour centraliser et réutiliser des valeurs fixes.

---

## ⚠️ Que se passe-t-il si on essaie de modifier une constante ?

Le compilateur Java lève une **erreur** si on tente de modifier une constante après son initialisation :

```java
public class ExempleConstantes {

    public static void main(String[] args) {
        final double TAUX_TPS = 0.20;

        // ❌ Erreur de compilation : impossible de modifier une constante
        TAUX_TPS = 0.30;

        System.out.println(TAUX_TPS);
    }
}
```
---

## 🎯 Exercice 1

🔧 **Consigne** :

1. Déclare une constante nommée `PI` de type `double` avec la valeur `3.1416`.
2. Affiche la valeur de cette constante avec `System.out.println`.
3. Ensuite, **essaie** de modifier la valeur de `PI` en `3.14` pour voir ce que Java affiche.

📝 **Exemple attendu à l'écran** si on ne modifie pas la constante :

```
3.1416
```

🔍 Tu devrais aussi voir une **erreur de compilation** si tu essaies de modifier la constante.

<details>
    <summary>Réponse</summary>

```java
public class ExempleConstante {

    public static void main(String[] args) {
        final double PI = 3.1416;

        System.out.println(PI);

        // PI = 3.14; // ❌ Erreur : impossible de modifier une constante
    }
}
```

</details>


/*
## 🧩 **Exercice 1 — Analyse de note** (/3)

**Concepts** : `if-else`, `if-elseif`, opérateurs de comparaison, opérateurs logiques, conversion, arguments du programme.

### Énoncé

Écris un programme `NoteApp.java` qui :

1. Reçoit une **note** (sur 100) en **argument de ligne de commande** (`args[0]`).
2. Affiche :

   * `"Échec"` si la note est < 60
   * `"Passable"` si entre 60 et 69
   * `"Bien"` si entre 70 et 84
   * `"Excellent"` si >= 85
3. Si la note est supérieure à 100 ou inférieure à 0, affiche `"Note invalide"`.

### Exemple

```
> java NoteApp 78
Bien
```

---

 */
public class NoteApp {
    public static void main(String[] args){
        int note = Integer.valueOf(args[0]);
        if (note < 0 || note > 100) {
            System.out.println("Note invalide");
        } else if (note < 60) {
            System.out.println("Échec");
        } else if (note < 70) {
            System.out.println("Passable");
        } else if (note < 85) {
            System.out.println("Bien");
        } else {
            System.out.println("Excellent");
        }
    }
}

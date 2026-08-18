

public class solution6_8 {
    public static void main(String[] args) {
        String[] user = {"Lucie", "Ginette", "Jean-Michel"};
        int[] age = {32, 43, 78};

        System.out.printf("""
                %-12s : %d
                %-12s : %d
                %-12s : %d
                """,
                user[0], age[0],
                user[1], age[1],
                user[2], age[2]
                );
    }
}

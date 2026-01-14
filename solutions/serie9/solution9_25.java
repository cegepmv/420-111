

public class solution9_25 {
    public static void main(String[] args) {
        String email = "alexandre.durand@example.com";

        int indexArobase = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                indexArobase = i;
                break;
            }
        }

        System.out.printf("%c%s@example.com\n", email.charAt(0), "*".repeat(indexArobase));
    }
}

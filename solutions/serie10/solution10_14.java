

public class solution10_14 {
    public static void main(String[] args) {
        System.out.println(estPalindrome("Laval"));
        System.out.println(estPalindrome("Patate"));
    }

    public static boolean estPalindrome(String mot){
        char[] array = mot.toLowerCase().toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[array.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}

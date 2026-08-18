

public class solution10_15 {
    public static void main(String[] args) {
        int[] tab = new int[]{1,4,3,6,85,7};

        System.out.println(tabContainsInt(tab, 88));
        System.out.println(tabContainsInt(tab, 4));
    }

    public static boolean tabContainsInt(int[] tab, int chiffre){
        for (int i : tab) {
            if(i == chiffre){
                return true;
            }
        }
        return false;
    }
}



public class solution10_5 {
    public static void main(String[] args) {
        System.out.println(estPair(11));
        System.out.println(estPair(12));
    }
    public static boolean estPair(int nombre){
        if(nombre % 2 == 0){
            return true;
        }
        return false;
    }
}

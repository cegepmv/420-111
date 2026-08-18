public class SOL3 {
//4 pts
    public static void main(String[] args) {
        String prenom = "henry";
        String nom = "christophe saint-cyr";
        String anneeNaissance = "188";

        System.out.println( 
                            //1
                            nom.substring(0,1).toUpperCase() + 
                            //1
                            nom.substring(1,5).toLowerCase() + 
                            "_" + //-0.5 si oublié
                            //1
                            prenom.substring(0, 1).toUpperCase() + 
                            //1
                            anneeNaissance.substring(anneeNaissance.length() - 2));
    }
}

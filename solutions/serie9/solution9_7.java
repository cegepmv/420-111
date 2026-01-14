

public class solution9_7 {
    public static void main(String[] args) {
        int i = 0;

        while(i < args.length && !args[i].equals("stop")){
            System.out.println("Argument " + i + " : " + args[i]);
            i++;
        }


    }
}

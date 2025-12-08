

public class solution9_19 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        for(int i = 0; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                System.out.printf("%-2s ",(A[i][j] + B[i][j]));
            }
            System.out.println();
        }
    }
}

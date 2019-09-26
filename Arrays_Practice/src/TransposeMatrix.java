public class TransposeMatrix {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}};
        int result[][] = new TransposeMatrix().transpose(A);
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(result[i][j] + " ");

            }
        }
    }

    public int[][] transpose(int[][] A) {

        int col_length = A[0].length;
        int row_length = A.length;
        System.out.println("Row: " +row_length);
        System.out.println("Column: " +col_length);


        int B[][] = new int[A[0].length][A.length];

        if(A.length == 0){
            return B;
        }

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                    B[i][j] = A[j][i];
            }
        }
        return B;
    }
}

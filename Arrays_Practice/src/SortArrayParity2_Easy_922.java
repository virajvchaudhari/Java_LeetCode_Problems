public class SortArrayParity2_Easy_922 {
    public static void main(String[] args) {
        int A[] = {4,2,5,7};
        int result[] = new SortArrayParity2_Easy_922().sortArrayByParityII(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
    }

    public int[] sortArrayByParityII(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == i % 2){
                continue;
            }
            else {
                int j = i + 1;
                while(A[j] % 2 != i % 2 && j < A.length - 1){
                    j++;
                }
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        return A;
    }
}

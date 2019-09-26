public class DuplicateZeros_Easy_1089 {
    public static void main(String[] args) {
        int A[] = {1, 0, 2, 3, 0, 4, 5, 0};
        new DuplicateZeros_Easy_1089().duplicateZeros(A);
    }

    public void duplicateZeros(int[] arr) {

//        Finding zero.

        for (int i = arr.length; i >= 0; i++) {
            if (arr[i] == 0) {
//                int index = i;
                arr[i + 1] = arr[i];
                arr[i] = 0;
            }
        }

    }
}

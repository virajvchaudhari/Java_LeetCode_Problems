import java.util.Arrays;

/* My Solution
* Time Complexity: O(N Log N)
* */
public class SortedSquare_Easy {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int A[] = {-4,-1,0,3,10};
        SortedSquare_Easy se = new SortedSquare_Easy();
        int result[] = se.sortedSquares(A);

        for (int i:result)
        {
            System.out.print(i + " ");
        }
    }
}

/*
 95% Time and 100% Space Complexity
 O(n log n) - used System.arraycopy and Arrays.sort
 */


import java.util.Arrays;

public class HeightChecker_Easy_1051 {
    public static void main(String[] args) {
        int A[] = {1, 1, 4, 2, 1, 3};
        new HeightChecker_Easy_1051().heightChecker(A);
    }

    public int heightChecker(int[] heights) {
        int count = 0;
        int copied[] = new int[heights.length];
        System.arraycopy(heights, 0, copied, 0, copied.length);
        Arrays.sort(copied);

        for (int i = 0; i < copied.length; i++) {
            if (copied[i] != heights[i])
                count++;
        }
        return count;
    }
}

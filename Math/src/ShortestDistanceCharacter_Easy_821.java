import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceCharacter_Easy_821 {
    public static void main(String[] args) {
        int result[] = new ShortestDistanceCharacter_Easy_821().shortestToChar("loveleetcode",'e');
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public int[] shortestToChar(String S, char C) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C){
                indexes.add(i);
            }
        }

        int result[] = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            int min = Integer.MAX_VALUE;

            if (S.charAt(i) != C){
                for (int val : indexes) {
                    min = Math.min(Math.abs(val - i),min);
                }
                result[i] = min;
            }
        }

        return result;
    }
}

/**
 *  Look at this more efficient solution.
 */

/* public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int pos = -n;
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        for (int i = n - 1; i >= 0; --i) {
            if (S.charAt(i) == C)  pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }

    */
import java.util.HashMap;

public class SpecialEquivalentStrings {
    public static void main(String[] args) {
        String A[] = {"abc","acb","bac","bca","cab","cba"};
        new SpecialEquivalentStrings().numSpecialEquivGroups(A);
    }

    public int numSpecialEquivGroups(String[] A) {
        HashMap<String, Integer> hm = new HashMap();
        for (int i =  0; i < A.length; i++){
            for (int j = 0; j < A.length; i++){
                if (i%2 == j%2)
                    System.out.println(A[i] + " " + A[j]);
            }
        }
        return A.length;
    }
}

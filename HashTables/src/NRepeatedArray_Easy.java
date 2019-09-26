import java.util.HashMap;

public class NRepeatedArray_Easy {
    public static void main(String[] args) {
        int A[] = {5,1,5,2,5,3,5,4};
        System.out.println(new NRepeatedArray_Easy().repeatedNTimes(A));
    }

    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int result = 0;
        for (int i = 0; i < A.length; i++){
            if (hash.containsKey(A[i])){
                return A[i];
            }
            else{
                hash.put(A[i],1);
            }

            if (hash.get(A[i]) > 1){
                result = A[i];
            }
        }

        return result;
    }
}

/* Similar Solution */

/*
class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> store = new HashSet<>();
        for(int a: A) if(store.add(a) == false) return a;
        return 0;
    }
}
*/

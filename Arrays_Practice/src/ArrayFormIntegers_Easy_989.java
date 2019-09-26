import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ArrayFormIntegers_Easy_989 {
    public static void main(String[] args) {
        int ip[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int K = 516;
        System.out.println(new ArrayFormIntegers_Easy_989().addToArrayForm(ip, K));
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder sb = new StringBuilder();
        for (int val: A) sb.append(val);
        String res = new BigInteger(sb.toString(),10).
                add(BigInteger.valueOf(K)).toString();
        List<Integer> ret = new ArrayList<>();
        for (char c:res.toCharArray()) {
            ret.add(Character.getNumericValue(c));
        }
        return ret;
    }
}

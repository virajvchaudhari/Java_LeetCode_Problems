import java.util.HashSet;
import java.util.Set;

public class HappyNumber_Easy_202 {
    public static void main(String[] args) {
        System.out.println(new HappyNumber_Easy_202().isHappy(19));
    }

    public boolean isHappy(int n) {
//        Set<Integer> vals = new HashSet<Integer>();

        while(true) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow((n % 10), 2);
                n = n / 10;
            }

            if (sum == 1)
                return true;
            else
                n = sum;
        }
    }
}

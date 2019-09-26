import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPrimes_Easy_204 {
    public static void main(String[] args) {
        new CountPrimes_Easy_204().countPrimes(10);
    }

    public int countPrimes(int n) {
//        int count = 0;
//        for (int i = 2; i < n; i++) {
//            boolean flag = true;
//            int j = 2;
//            if (i % j == 0){
//                flag = false;
//            }
//            j++;
//        }
//


        int count = 0;
        for (int i = 2; i < n/2; i++) {

            boolean flag = true;
            int j = 2;

            while (j < i){
                if (i % j == 0){
                    flag = false;
                    break;
                }
                j++;
            }

            if (flag)
                count++;
        }

        System.out.println(count);
        return 0;
    }






    /*public int countPrimes(int n) {

        Set<Integer> primes = new HashSet<>();

        for (int i = 2; i < n; i++) {
            int j = 2;
            while (j <= i){
                if (j != i && i % j == 0){
                    primes.add(i);
                }
                j++;
            }
        }

        return ((n- 2) - primes.size());
    }*/
}

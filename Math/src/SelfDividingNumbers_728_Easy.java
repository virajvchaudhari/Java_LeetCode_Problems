import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_728_Easy {
    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers_728_Easy().selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right ; i++) {
            int num = i;

            while(num > 0){
                if (num % 10 == 0 || i % (num % 10) != 0) {
                    break;
                }
                else
                    num = num/10;
            }
            if (num == 0) result.add(i);
        }

        return result;
    }
}

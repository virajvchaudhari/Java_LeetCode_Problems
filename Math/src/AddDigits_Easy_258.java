public class AddDigits_Easy_258 {
    public static void main(String[] args) {
        new AddDigits_Easy_258().addDigits(38);
    }

    public int addDigits(int num) {
        int sum = 0;

        while (num != 0)
        {
            sum += num % 10;
            num = num /10;
        }

        System.out.println(sum);
        return 0;
    }
}

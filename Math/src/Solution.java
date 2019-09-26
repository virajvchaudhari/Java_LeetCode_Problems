public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-280883939));
    }

    public int reverse(int x){
        long temp = 0;

        while(Math.abs(x) >= 10){
            temp = (temp + x%10) * 10;
            x /= 10;
        }

        if (Math.abs(temp + x) >= Integer.MAX_VALUE)
            return 0;
        else
            return (int) temp + x;
    }
}

import java.math.BigInteger;

public class ReverseInteger_Easy_7 {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger_Easy_7().reverse(-2147483648));
    }


        public int reverse(int x) {
            long temp = 0;
            while (Math.abs(x) >= 10){
                temp = (temp + x%10)*10;
                x/=10;
            }
            if (Math.abs(temp + x)>= Integer.MAX_VALUE)
                return 0;
            else
                return (int) (temp + x);
        }

}


/*
    public int reverse(int x) {
        BigInteger reversed, remain;
        reversed = BigInteger.valueOf(0);
        remain = BigInteger.valueOf(0);
        boolean flag = false;
        String val = Integer.toString(x,10);

        if (val.charAt(0) == '-') {
            flag = true;
        }
        else
            remain = BigInteger.valueOf(x);

        while (!remain.equals(BigInteger.ZERO)) {
            BigInteger digit = remain.mod(BigInteger.TEN);
            reversed = reversed.multiply(BigInteger.TEN).multiply(digit);
            remain = remain.divide(BigInteger.TEN);
            System.out.println(remain);
        }

        if (flag)
            return Integer.parseInt("-" + reversed);
        return reversed.intValue();
    }
*/






    /*public int reverse(int x) {
        int reversed = 0, remain = 0;
        boolean flag = false;
        String val = Integer.toString(x,10);

        if (val.charAt(0) == '-') {
            remain = Integer.valueOf(val.substring(1));
            flag = true;
        }
        else
            remain = x;

        while (remain != 0) {
            int digit = remain % 10;
            reversed = reversed * 10 + digit;
            remain = remain / 10;
        }

        if (flag)
            return Integer.parseInt("-" + reversed);
        return reversed;
    }*/
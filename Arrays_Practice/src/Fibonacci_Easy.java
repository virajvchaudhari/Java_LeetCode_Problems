public class Fibonacci_Easy {
    public static void main(String[] args) {
        Fibonacci_Easy fb = new Fibonacci_Easy();
        System.out.println(fb.fib(8));
    }
//    public int fib(int N) {
//        if (N == 0)
//            return 0;
//        if (N == 1)
//            return 1;
//        else
//            return fib(N-1) + fib(N-2);
//    }
    public int fib(int N) {
        if (N <= 1)
            return N;

        int a = 0, b =1;

        while(N-- > 1)
        {
                int sum = a + b;
                a = b;
                b = sum;
        }
        return b;

    }
}

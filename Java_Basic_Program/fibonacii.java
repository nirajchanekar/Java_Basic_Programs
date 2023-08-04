public class fibonacii {
    public static void fibo(int n) {
        int a = 0, b = 1, c = 1;
        while (c <= n) {

            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

    }

    public static void main(String args[]) {
        int m = 10;
        fibo(m);
    }
}

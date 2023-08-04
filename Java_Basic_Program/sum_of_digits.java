public class sum_of_digits {
    public static void main(String args[]) {
        int a = 12345, sum = 0;
        while (a > 0) {
            int k = a % 10;
            sum = sum + k;
            a = a / 10;
        }
        System.out.println(sum);
    }
}

public class reverse_num {

    public static void main(String args[]) {
        int a = 233, r = 0;
        while (a > 0) {
            int k = a % 10;
            r = r * 10 + k;
            a = a / 10;
        }

        System.out.println(r);
    }

}

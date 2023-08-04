public class count_no_digits_entered {
    public static void main(String args[])
    {
        int a=123456,count=0;
        while(a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}

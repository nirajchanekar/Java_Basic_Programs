import java.util.*;
public class sec_digit_Even_odd {
    public static void num(int n)
    {
      int k=n/10;
      n=k%10;
      
      String m=n%2==0?"even":"odd";
      System.out.println(m);
      
    }

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       num(n);
    }
}

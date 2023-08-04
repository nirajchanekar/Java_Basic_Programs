import java.util.*;

public class sum_odd_no {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum=0;
     for(int i=1;i<=n;i++)
     {
      System.out.println(i);
      sum=sum+i;
     }
     System.out.println("sum:"+sum);

     System.out.println("~~~~~~~~Sum of enterd 5 num~~~~~");
    int s=0;
     for(int j=1;j<=5;j++)
     {
        int l=sc.nextInt();
        s=s+l;
     }
     System.out.println("Sum:"+s);
    }
}

import java.util.*;
public class even_odd {
    public static void main(String args[])
    {
        System.out.println("Check the Entered No is Even or Odd");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The no is Even");
        }

        else{
            System.out.println("The no is odd");
        }

        String no=n%2==0?("The no is even"):("The no is Odd");
        System.out.println(no);

    }
}

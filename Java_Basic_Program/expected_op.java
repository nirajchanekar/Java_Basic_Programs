import java.util.Scanner;
public class expected_op {


    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Principal, Rate of Interset and time");
     int p=sc.nextInt();
     int r=sc.nextInt();
     int t=sc.nextInt();
     
     int si=p*r*t/100;
     System.out.println("Simple Intersert is:"+si);
     System.out.println("Total amount you have to pay:"+(p+si));    

    }
    
}

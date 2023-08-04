import java.util.*;
public class switch_1 {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int r=n%2;
     switch(r){
        case 0:
        System.out.println("you have even no");
        break;

        case 1:
        System.out.println("You have odd no");
        break;
        
        default:
        System.out.println("You have enterd Wrong No");

     }

     }
    }


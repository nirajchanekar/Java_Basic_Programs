public class gretest_of_three {
    public static void main(String args[])
    {
        int a=10,b=11,c=12,m=13;

        int d=a>b?a:b;
        int e=d>c?d:c;
        System.out.print(e);

        System.out.println("~~~~~~~~~~~~~~~~~Nested If Elese~~~~~~~~~~~~~~~");

        if(a>b)
        {
            if(a>c){
                System.out.println("A is gretest");
            }
            else 
            System.out.println("C is gretest");
        }

        else{
            if(b>c){
                System.out.println("B is gretest");
            }

            else{
                System.out.println("C is gretest");
            }
        }

         System.out.println("~~~~~~~~~~~~~~~~~Ladder If Elese~~~~~~~~~~~~~~~");

         if(a>b && a>c){
            System.out.println("A is gretest");
         }

         else if(b>a && b>c){
            System.out.println("B is gretest");
         }

         else{
            System.out.println("C is gretest");
         }

         int max=(a>b)?(a>c?a:c):(b>c?b:c);
         System.out.println(max);

         int maximum=(a>b && a>c && a>m)?a:((b>c && b>m)?b:(c>m?c:m));
         System.out.println(maximum);
    }
}

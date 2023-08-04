public class smallest_of_three_no {

    public static void main(String args[])
    {
        int a=10,b=6,c=7,d=9;

        int k=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println(k);

        int p=(a<b && a<c && a<d)?a:((b<c && b<d)?b:(c<d?c:d));

        System.out.println(p);
    }
    
}

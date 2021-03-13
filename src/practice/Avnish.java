package practice;

public class Avnish {
    public static void main(String[] args)
    {
        int n=103;
        int original_num=n;
        int rev=0,rem;
        while(original_num!=0)
        {
            rem=original_num%10;
            rev=(rem*rem*rem)+rev;
            original_num=original_num/10;
        }
        System.out.println(rev);
        if(n==rev)
            System.out.println("armstrong number");

        else
            System.out.println("not armstrong");
    }
}

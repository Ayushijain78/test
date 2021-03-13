package practice;
public class Fabonacci {
    public static void main(String[] s)
    {
        int a=0,b=1,temp,n=10;

        System.out.print(a);
        for(int i=0;i<n;i++)
        {
           temp=a+b;
           b=a;
           a=temp;
           System.out.print(","+temp);

        }




    }


}

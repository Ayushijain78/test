package practice;



public class Factorial {

    int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);

    }


    public static void main(String[] args) {
        int n=6;
        int result=n;
        for(int i=1;i<n;i++) {
            result=result*i;

        }
        System.out.println(result);
        Factorial f=new Factorial();
        System.out.println(f.factorial(5));



    }
}

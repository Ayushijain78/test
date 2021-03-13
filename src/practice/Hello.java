package practice;

public class Hello {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("  ");
		}
		
		for(int k=0;k<9;k++)
		{
			
			for(int m=9;m>k;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

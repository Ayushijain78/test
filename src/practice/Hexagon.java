package practice;

public class Hexagon {
	public static void main(String[] s)
	{
		int n=9;
		int len=2*n-1;
		for(int i=0;i<n;i++) {
			int temp=i+n;
			for(int k=0;k<temp;k++) {
				if((k==n+i-1)||(k==n-i-1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for(int m=0;m<n;m++) 
		{
			for(int j=0;j<len;j++) 
			{
				if(j==0 || j==len-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	
		int res=n-1;
		for(int l=res;l>0;l--) {
			int temp2=l+n;
			for(int k=0;k<temp2;k++) {
				if((k==n+l-1)||(k==n-l-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

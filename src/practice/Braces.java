package practice;

/*public class Braces {

	public static void main(String[] args)
	{

		String str="[{{()}]";
		boolean result=false;
		String st="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			switch (ch[i])
			{
				case '[':
					if(ch[++i]=='{'||ch[++i]=='(')
					{
						st=st+ch[i];
						System.out.println(st);
						break;
					}
				case '{':
					if(ch[i+1]=='(' || ch[i+1]=='}')
					{
						st=st+ch[i];
						System.out.println(st);
						break;
					}
				case '(':
					if(ch[i+1]==')')
					{
						st=st+ch[i];
						System.out.println(st);
						break;
					}
				default:
					result=false;

			}













			if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(' || ch[i]==']'){
				st+=ch[i];
				st.replace("[","");
				System.out.println(st);
			}
			else if(ch[i]=='{' || ch[i]=='(' || ch[i]=='}')
			{
				st+=ch[i];

				System.out.println(st);
			}
			else if(ch[i]=='(' || ch[i]==')')
			{
				st+=ch[i];
				System.out.println(st);
			}
			else
			{
				System.out.println(st+"else");
			}

		}

	}

}*/


import java.util.*;
import java.io.*;
import java.lang.*;

class Braces
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		//Reading total number of testcases
		int t= sc.nextInt();

		while(t-- >0)
		{
			//reading the string
			String st = sc.next();

			//calling ispar method of Paranthesis class
			//and printing "balanced" if it returns true
			//else printing "not balanced"
			if(new Solution().ispar(st) == true)
				System.out.println("balanced");
			else
				System.out.println("not balanced");

		}
	}
}// } Driver Code Ends




class Solution
{
	// Function to return if the paranthesis are balanced or not
	static boolean ispar(String x)
	{
		ArrayList<Character> str=new ArrayList<>();
		for(int i=0;i<x.length();i++){

			switch (x.charAt(i))
			{
				case '[':
					if(x.charAt(i)=='{' || x.charAt(i)=='(' || x.charAt(i)==']')
					{
						str.add(i,x.charAt(i));
					}
				case '{':
					if(x.charAt(i)=='(' || x.charAt(i)==')' || x.charAt(i)=='}')
					{
						str.add(i,x.charAt(i));
					}
				case '(':
					if(x.charAt(i)==')')
					{
						str.add(i,x.charAt(i));
					}
				default:

						System.out.println("defaluy");


			}

		}
		for(Character name:str)
		{
			System.out.println(name);
		}
		return false;
	}
}

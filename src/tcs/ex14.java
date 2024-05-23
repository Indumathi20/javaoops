package tcs;
import java.util.*;
public class ex14 {
	public static void main(String[] args) {
		//Program to Check for Palindrome String
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		int n= str.length();
		int flag = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(n-i-1))
			{
				flag = 1;
			}else
			{
				flag = 0;
			}
		}
		if(flag == 0)
		{
			System.out.println("not a palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
	}

}

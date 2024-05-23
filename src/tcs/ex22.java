package tcs;
import java.util.*;
public class ex22 {
	public static void main(String[] args) {
//		Capitalize the first and last character of each word in a string
//		Last Updated : 07 Aug, 2022
//		Given the string, the task is to capitalise the first and last character of each word in a string.
//		Examples: 
//		 
//
//		Input: Geeks for geeks
//		Output: GeekS FoR GeekS
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int n=0;
		for(String s1 : s)
		{
			char c[] = s1.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(i == 0 || i == c.length-1)
				{
					System.out.print(Character.toUpperCase(c[i]));;
				}else
				{
					System.out.print(c[i]);
				}
			}
			System.out.print(" ");
			
		}
	}

}

package tcs;
import java.util.*;
public class ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Program to remove vowels from a String
//		Last Updated : 16 Feb, 2023
//		Given a string, remove the vowels from the string and print the string without vowels. 
//
//		Examples: 
//
//		Input : welcome to geeksforgeeks
//		Output : wlcm t gksfrgks
//
//		Input : what is your name ?
//		Output : wht s yr nm ?
		String str = sc.nextLine();
		str.toLowerCase();
		char c[] = str.toCharArray();
		
		for(char cr : c)
		{
			if(cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u')
			{
				continue;
			}
			else
			{
				System.out.print(cr);
			}
		}
	}

}

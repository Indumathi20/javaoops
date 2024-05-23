package tcs;
import java.util.*;

public class ex13 {
	public static void main(String[] args) {
		
//	Program to count vowels, consonant, digits and special characters in string.
//	Last Updated : 20 Feb, 2023
//	Given a string and the task is to count vowels, consonant, digits and special character in string. 
//	Special character also contains the white space.
//	Examples: 
//	 
//
//	Input : str = "geeks for geeks121"
//	Output : Vowels: 5
//	         Consonant: 8
//	         Digit: 3
//	         Special Character: 2
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str.toLowerCase();
		char c[] = str.toCharArray();
		int vowel = 0,conso = 0,digit = 0,special = 0;
		for(char cr : c)
		{
			if(Character.isAlphabetic(cr))
			{
				if(cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u')
				{
					vowel++;
				}
				else
				{
					conso++;
				}
			}
			else if(Character.isDigit(cr))
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("vowel "+ vowel+" "+"consonant "+ conso+" "+"digit "+digit+" "+"special "+special);
	}
}

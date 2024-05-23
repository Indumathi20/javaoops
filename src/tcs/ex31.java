package tcs;
import java.util.*;
public class ex31 {
	public static void main(String[] args) {
//		Remove duplicates from a given string
//		Given a string S which may contain lowercase and uppercase characters.
//		The task is to remove all duplicate characters from the string and find the resultant string.
//
//		Note: The order of remaining characters in the output should be the same as in the original string.
//
//		Example:
//
//		Input: Str = geeksforgeeks
//		Output: geksfor
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for(char ch : c)
		{
			set.add(ch);
		}
		for(char c1: set)
		{
			System.out.print(c1);
		}
		
	}

}

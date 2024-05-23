package tcs;
import java.util.*;
public class ex26 {
	public static void main(String[] args) {
//		Check whether two Strings are anagram of each other
//		Last Updated : 28 Dec, 2023
//		Given two strings. The task is to check whether the given strings are anagrams of each other or not. 
//		An anagram of a string is another string that contains the same characters, 
//		only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.
//
//		Examples:
//
//		Input: str1 = “listen”  str2 = “silent”
//		Output: “Anagram”
//		Explanation: All characters of “listen” and “silent” are the same.
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		int flag = 0;
		
		if(c1.length == c2.length)
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i] == c2[i])
				{
					flag = 1;
				}
				else
				{
					flag = 0;
				}
			}
			
		}
		if(flag == 0)
		{
			System.out.println("not a anagram");
		}else
		{
			System.out.println("it is a anagram");
		}
		
	}

}

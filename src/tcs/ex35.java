package tcs;
import java.util.*;
public class ex35 {
	public static void main(String[] args) {
//		Check if a string is substring of another
//		Given two strings S1 and S2, The task is to find if S1 is a substring of S2.
//		If yes, return the index of the first occurrence, else return -1.
//
//		Examples : 
//
//		Input: S1 = “for”, S2= “geeksforgeeks”
//		Output: 5
//		Explanation: String “for” is present as a substring of s2.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give substring");
		String s1 = sc.nextLine();
		System.out.println("give the string");
		String s2 = sc.nextLine();
//		 This method call takes the substring s1 and searches 
//		 for its first occurrence within the string s2.
//		 If s1 is found within s2, indexOf returns the starting index of the
//		 first occurrence of s1 within s2. If s1 is not found within s2, it returns -1.
		int index = s2.indexOf(s1);
        System.out.println("Substring index: " + index);
		
	}

}

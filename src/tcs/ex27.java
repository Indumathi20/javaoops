package tcs;
import java.util.*;
public class ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		Sort string of characters
//		Last Updated : 29 Feb, 2024
//		Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.
//
//		Examples: 
//
//		Input : bbccdefbbaa 
//		Output : aabbbbccdef
//		Input : geeksforgeeks
//		Output : eeeefggkkorss
		
		char c[] = str.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}

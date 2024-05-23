package tcs;
import java.util.*;
public class ex17 {
	public static void main(String[] args) {
//		Remove spaces from a given string
//		Last Updated : 18 Apr, 2023
//		Given a string, remove all spaces from the string and return it. 
	//
//		Input:  "g  eeks   for ge  eeks  "
//		Output: "geeksforgeeks"
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		
		for(char cr : c)
		{
			if(cr == ' ')
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

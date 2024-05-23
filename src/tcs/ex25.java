package tcs;
import java.util.*;
public class ex25 {
	public static void main(String[] args) {
//		Program to find Smallest and Largest Word in a String
//		Given a string, find the minimum and the maximum length words in it. 
//
//		Examples: 
//
//		Input : "This is a test string"
//		Output : Minimum length word: a
//		         Maximum length word: string
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		String ma = "",mi = "";
		int max = -1,min = s[0].length();
		for(String s1 : s)
		{
			if(s1.length() > max)
			{
				max = s1.length();
				ma = s1;
			}
			if(s1.length() < min)
			{
				min = s1.length();
				mi = s1;
			}
		}
		System.out.println("maximum length word is : " + ma);
		System.out.println("minimum length word is: " + mi);
		
	}

}

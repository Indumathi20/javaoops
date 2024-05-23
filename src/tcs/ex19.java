package tcs;
import java.util.*;
public class ex19 {
	public static void main(String[] args) {
//		Remove all characters other than alphabets from string
//		Given a string consisting of alphabets and others characters, 
//		remove all the characters other than alphabets and print the string so formed. 
//
//		Examples: 
//
//		Input : $Gee*k;s..fo, r’Ge^eks?
//		Output : GeeksforGeeks
//
//		Input : P&ra+$BHa;;t*ku, ma$r@@s#in}gh
//		Output : PraBHatkumarsingh
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		for(char c1: c)
		{
			if(Character.isAlphabetic(c1))
			{
				System.out.print(c1);
			}
		}
	}

}

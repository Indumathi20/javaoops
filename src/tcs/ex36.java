package tcs;
import java.util.*;
public class ex36 {
	public static void main(String[] args) {
//		Reverse words in a given string
//		Last Updated : 13 Sep, 2023
//		Given a string, the task is to reverse the order of the words in the given string. 
//
//		Examples:
//
//		Input: s = “geeks quiz practice code” 
//		Output: s = “code practice quiz geeks”
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String c[] = str.split("\\s");
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]+" ");
			
		}

	}

}

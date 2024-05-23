package tcs;
import java.util.*;
public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. 
//		The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. 
//		The string is considered valid if the number of ‘*’ and ‘#’ are equal. 
//		The ‘*’ and ‘#’ can be at any position in the string.
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int star=0,hash=0;
		for(char c1 : c)
		{
			
			if(c1 == '*')
			{
				star++;
			}
			else if(c1 == '#')
			{
				hash++;	
			}
		}
//		(*>#): positive integer
//		(#>*): negative integer
//		(#=*): 0
		System.out.println(star-hash);
		
	}

}

package tcs;
import java.util.*;
public class ex28 {
	public static void main(String[] args) {
//		Convert characters of a string to opposite case
//		Given a string, convert the characters of the string into the opposite case,i.e.
//		if a character is the lower case then convert it into upper case and vice-versa. 
//
//		Examples: 
//
//		Input : geeksForgEeks
//		Output : GEEKSfORGeEKS
//		Input : hello every one
//		Output : HELLO EVERY ONE
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}else
			{
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}
	}

}

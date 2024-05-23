package tcs;
import java.util.*;
public class ex38 {
	public static void main(String[] args) {
//		Replace all ‘0’ with ‘5’ in an input Integer
//		Given an integer as input and replace all the ‘0’ with ‘5’ in the integer. 
//
//		Examples: 
//
//		Input: 102 
//		Output: 152
//		Explanation: All the digits which are '0' is replaced by '5' 
//
//		Input: 1020 
//		Output: 1525
//		Explanation: All the digits which are '0' is replaced by '5'
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = Integer.toString(num);
		char c[] = s.toCharArray();
		
		for(char c1 : c)
		{
			if(c1 == '0')
			{
				System.out.print('5');
			}
			else
			{
				System.out.print(c1);
			}
			
		}
		
		
	}

}

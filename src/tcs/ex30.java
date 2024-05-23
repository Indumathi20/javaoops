package tcs;
import java.util.*;
public class ex30 {
	public static void main(String[] args) {
//		Find maximum occurring character in a string
//		Given string str. The task is to find the maximum occurring character in the string str.
//
//		Examples:
//
//		Input: geeksforgeeks
//		Output: e
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Map<Character,Integer> map = new HashMap<>();
		char c[] = str.toCharArray();
		for(char ch : c)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		int max = 0;
		char c1 = '\0';
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() > max)
			{
				max = entry.getValue();
				c1 = entry.getKey();
			}
			
		}
		System.out.println(c1 +" "+"has occured"+" "+max+" "+"times");
		
	}

}

package tcs;
import java.util.*;
public class ex32 {
	public static void main(String[] args) {
//		Print all the duplicate characters in a string
//		Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.
//
//		Example:
//
//		Input: S = “geeksforgeeks”
//		Output:
//
//		e, count = 4
//		g, count = 2
//		k, count = 2
//		s, count = 2
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		Map<Character,Integer> map = new TreeMap<>();
		for(char ch : c)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+"count"+" "+entry.getValue());
			}
		}
	}

}

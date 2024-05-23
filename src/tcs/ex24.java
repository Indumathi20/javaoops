package tcs;
import java.util.*;
public class ex24 {
	public static void main(String[] args) {
//		Find first non-repeating character of given String
//		Last Updated : 15 Oct, 2023
//		Given a string S consisting of lowercase Latin Letters, 
//		the task is to find the first non-repeating character in S.
//
//		Examples: 
//
//		Input: “geeksforgeeks”
//		Output: f
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		char c[] = str.toCharArray();
		for(char c1 : c)
		{
			map.put(c1, map.getOrDefault(c1, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
            {
            	System.out.print(entry.getKey()+" ");
            	break;
            }
        }
	}

}

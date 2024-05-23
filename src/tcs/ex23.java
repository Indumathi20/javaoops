package tcs;
import java.util.*;
public class ex23 {
	public static void main(String[] args) {
//		Print characters and their frequencies in order of occurrence
//		Last Updated : 08 May, 2023
//		Given string str containing only lowercase characters. 
//		The problem is to print the characters along with their frequency in 
//		the order of their occurrence and in the given format explained in the examples below.
//
//		Examples: 
//
//		Input : str = "geeksforgeeks"
//		Output : g2 e4 k2 s2 f1 o1 r1
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		char c[] = str.toCharArray();
		for(char c1 : c)
		{
			map.put(c1, map.getOrDefault(c1, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
		

	}

}

package tcs;
import java.util.*;
public class ex7 {
	public static void main(String[] args) {
//		Find first non-repeating element in a given Array of integers
//		Given an array of integers of size N, the task is to find the first non-repeating element in this array. 
//
//		Examples:
//
//		Input: {-1, 2, -1, 3, 0}
//		Output: 2
//		Explanation: The first number that does not repeat is : 2
		
		int arr[] = { 9, 4, 9, 5,6, 7, 4 };
		int n = arr.length;
		Map<Integer,Integer> map = new HashMap<>();
		
	for (int num :arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
	for (int i = 0; i < n; i++)
	{
        if (map.get(arr[i]) == 1)
        {
        	System.out.println(arr[i]);
        	break;
        }
	}
            
	}

}

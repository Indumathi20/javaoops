package tcs;
import java.util.*;
public class ex12 {
	public static void main(String[] args) {
//		Remove duplicates from Sorted Array
//		Last Updated : 29 Dec, 2023
//		Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.
//
//		Examples: 
//
//		Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
	//	Output: arr[] = {1, 2, 3, 4, 5}
//		Explanation: All the elements are 2, So only keep one instance of 2.
		
		int arr[] = {1, 2, 2,8,8,9, 3, 4, 4, 4, 5, 5};
		
		Set<Integer> set = new HashSet<>();
		int n1 = arr.length;
		for(int n : arr)
		{
			set.add(n);
		}
		
		for(int num : set)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		for(int i=n1-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}

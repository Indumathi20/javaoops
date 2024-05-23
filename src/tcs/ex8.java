package tcs;
import java.util.*;
public class ex8 {
	public static void main(String[] args) {
//		Program for array left rotation by d positions.
//		Last Updated : 07 Mar, 2024
//		Given an array of integers arr[] of size N and an integer,
//		the task is to rotate the array elements to the left by d positions.
//
//		Examples:  
//
//		Input: 
//		arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
//		Output: 3 4 5 6 7 1 2
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		int d = 4;
		
		for(int i=d;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<d;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
			
	}

}

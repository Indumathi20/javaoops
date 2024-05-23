package tcs;
import java.util.*;
public class ex11 {
	public static void main(String[] args) {
//		Find whether an array is subset of another array
//		Last Updated : 27 Mar, 2024
//		Given two arrays: arr1[0..m-1] and arr2[0..n-1].
//		Find whether arr2[] is a subset of arr1[] or not.
//		Both arrays are not in sorted order. It may be assumed that elements in both arrays are distinct.
//
//		Examples: 
//
//		Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
//		Output: arr2[] is a subset of arr1[]
		
		int arr1[] = {10, 5, 2, 23, 19};
		int arr2[] = {19, 5, 3};
		
		int n1=arr1.length;
		int n2 = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int flag = 0;
		
		for(int i=0;i<n2;i++)
		{
			if(arr1[i] == arr2[i])
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("arr2 is the subset of arr1");
		}
		else
		{
			System.out.println("not a subset");
		}
		
	}

}

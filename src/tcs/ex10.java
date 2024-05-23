package tcs;
import java.util.*;
public class ex10 {
	public static void main(String[] args) {
//		Print array after it is right rotated K times
//		Last Updated : 24 Feb, 2024
//		Given an Array of size N and a value K, around 
//		which we need to right rotate the array. How do you quickly print the right rotated array?
//		Examples : 
//
//		Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
//		Output: 7 9 1 3 5
//		Explanation:
//		After 1st rotation – {9, 1, 3, 5, 7}After 2nd rotation – {7, 9, 1, 3, 5}
		int arr[] = {1, 2, 3, 4, 5,6,7,8,9};
		int n = arr.length;
		int k = 2;
		for(int i=n-k;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		for(int i=0;i<n-k;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}

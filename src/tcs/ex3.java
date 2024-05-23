package tcs;
import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Given an integer array Arr of size N the task is to find the count 
//		of elements whose value is greater than all of its prior elements.
//
//		Note : 1st element of the array should be considered in the count of the result.
//
//		For example,
//		Arr[]={7,4,8,2,9}
//		As 7 is the first element, it will consider in the result.
//		8 and 9 are also the elements that are greater than all of its previous elements.
//		Since total of  3 elements is present in the array that meets the condition.
//		Hence the output = 3.
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 1;
		int flag ;
		for(int i=0;i<size;i++)
		{
			
			flag = 0;
			for(int j = i ; j >= 0;j--)
			{
				if(arr[i] > arr[j])
				{
					flag = 1;
				}
			}
			if(flag ==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

package tcs;
import java.util.*;
public class ex9 {
	public static int equilibrium(int arr[], int n)
    {
		int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];
 
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index
                           // i
 
            if (leftsum == sum) //4,3,2,1,0,8,2 =20 l =10
                return i;
 
            leftsum += arr[i];
        }
 
        /* If no equilibrium index found, then return 0 */
        return -1;
    }
	public static void main(String[] args) {
//		Equilibrium index of an array
//		Given a sequence arr[] of size n, 
//		Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index 
//		(if any) or -1 if no equilibrium index exists. 
//
//		The equilibrium index of an array is an index such that 
//		the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 
//
//		Examples: 
//
//		Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
//		Output: 3 
//		3 is an equilibrium index, because: 
//		A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
		
//		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int arr[] = {4,3,2,1,0,8,2};
		int n = arr.length;
		System.out.println(
	            "First equilibrium index is "
	            + equilibrium(arr, n));
		
	}

}

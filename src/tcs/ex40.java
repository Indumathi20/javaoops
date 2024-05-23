package tcs;

public class ex40 {

	    public static int subarraySum(int[] arr, int target) {
	        int count = 0; // Initialize count of subarrays
	        int currentSum = arr[0]; // Initialize sum of current subarray
	        int start = 0; // Initialize start pointer of sliding window

	        // Iterate through the array
	        for (int end = 1; end < arr.length; end++) {
	            // Update currentSum by adding the element at the end pointer
	            currentSum += arr[end];

	            // If currentSum is greater than the target, move the start pointer
	            while (currentSum > target && start <= end) {
	                currentSum -= arr[start];
	                start++;
	            }

	            // If currentSum equals target, increment count
	            if (currentSum == target) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int target = 5;
	        System.out.println(subarraySum(arr, target)); // Output: 2 (There are 2 subarrays with sum 5: [2, 3] and [5])
	    }
}

package tcs;
import java.util.*;
public class ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int arr[] = new int[M];
		int sum = (M * (M+1))/2;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int an = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = an;
				}
				
			}
			sum = sum - arr[i];
		}
		System.out.println(sum);
		
		
		
		
		
	}

}

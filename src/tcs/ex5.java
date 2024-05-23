package tcs;
import java.util.*;
public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		A party has been organised on cruise. The party is organised for a limited time(T).
//		The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array.
//		The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
		System.out.println("hrs");
		int hrs = sc.nextInt();
		int e[] = new int[hrs];
		int l[] = new int[hrs];
		System.out.println("entry");
		for(int i=0;i<hrs;i++)
		{
			e[i] = sc.nextInt();
		}System.out.println("leaving");
		for(int i=0;i<hrs;i++)
		{
			l[i] = sc.nextInt();
		}
		int max = 0;
		int sum=0;
		int index=-1;
		for(int i=0;i<hrs;i++)
		{
			sum = sum + e[i]-l[i];
			if(max < sum)
			{
				max = sum;
				index = i+ 1;
				
			}
				
		}
		System.out.println(max + "in the hr " + index);
	}

}

package tcs;
import java.util.*;
public class ex42 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int av= 0;
	for(int i=a;i<=b;i++)
	{
		if(isprime(i) == 1)
		{
			if(issum(i)== 1)
			{
				System.out.println(i);
			}
			
		}
		
		
	}
}
public static int isprime(int n)
{
	for(int i=2;i<=n/2;i++)
	{
		if(n%i == 0)
			return 0;
		
	}
	return 1;
}
public static int issum(int n)
{
	int sum = 0;
	while(n != 0)
	{
		sum = sum + n % 10;
		n = n / 10;
	}
	return isprime(sum);
}

}

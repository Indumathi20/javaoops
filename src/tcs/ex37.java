package tcs;
import java.util.*;
public class ex37 {
	public static void main(String[] args) {
//		Prime Numbers
//		Last Updated : 29 Mar, 2024
//		What are Prime Numbers?
//		A prime number is defined as a natural number greater than 1 and is divisible by only 1 and itself. 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		
		if(num <= 1)
		{
			System.out.println("not prime");
		}else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num % i == 0)
				{
					flag = 1;
				}
			}
		}
		System.out.println(flag == 0 ?"prime":"not prime");
		
	}

}

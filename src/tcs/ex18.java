package tcs;
import java.util.*;
public class ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Remove characters from the first string which are present in the second string
//		Input:
//			string1 = “computer”
//			string2 = “cat”
//			Output: “ompuer”
//			Explanation: After removing characters(c, a, t)
//			from string1 we get “ompuer”.
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		int n = c1.length;
		int flag;
		for(int i=0;i<c1.length;i++)
		{
			flag = 0;
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i] == c2[j])
				{
					flag = 1;
					continue;
				}
			}
			if(flag == 0)
				System.out.print(c1[i]);
		}
	}

}

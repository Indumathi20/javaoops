package tcs;
import java.util.*;
public class ex33 {
	public static void main(String[] args) {
//		Lexicographically next string
//		Given a string, find lexicographically next string.
//
//		Examples: 
//
//		Input : geeks
//		Output : geekt
//		The last character 's' is changed to 't'.
//
//		Input : raavz
//		Output : raawz
//		Since we can't increase last character, 
//		we increment previous character.
//
//		Input :  zzz
//		Output : zzza
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n  = str.length();
        char c[] = str.toCharArray();
        if(str.isEmpty())
        {
            System.out.println('a');
        }
        else if(str.matches("z+"))
        {
            System.out.println(str + "a");
        }
        else
        {
            for(int i = 0; i < c.length; i++)
            {
                if(c[c.length - 1] == 'z' && i == n-2) 
                {
                    int asciiValue = (int)c[i];
                    asciiValue++;
                    System.out.print((char)asciiValue);
                }
                else if(c[c.length - 1] != 'z' && i == n-1)
                {
                    int asciiValue = (int)c[i];
                    asciiValue++;
                    System.out.print((char)asciiValue);
                }
                else
                {
                    System.out.print(c[i]);
                }
            }
        }
		
	}

}

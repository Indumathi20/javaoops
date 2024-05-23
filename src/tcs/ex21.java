
//		Calculate sum of all numbers present in a string
//		Given a string S containing alphanumeric characters, 
//		The task is to calculate the sum of all numbers present in the string.
//
//		Examples: 
//
//		Input:  1abc23
//		Output: 24
//		Explanation: 1 + 23 = 24
//
//		Input:  geeks4geeks
//		Output: 4
package tcs;
import java.util.*;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c[]= str.toCharArray();
        String str1 = "0";
        int sum = 0;
        for(char ch : c) {
            if(Character.isDigit(ch)) {
                str1 += ch;
            } else {
                sum += Integer.parseInt(str1);
                str1 = "0";
            }
        }
        // Add the last number if the string ends with a number
        sum += Integer.parseInt(str1);
        System.out.println(sum);
        
    }
}

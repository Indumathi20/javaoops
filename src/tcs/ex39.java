
package tcs;
import java.util.*;
public class ex39 {
    public static void main(String[] args) {
        // sum if odd places are prime
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len = 0;
        int temp = num;
        
        // Count number of digits
        while (temp != 0) {
            len++;
            temp = temp / 10;
        }
        
        int sum = 0;
        if (len % 2 == 1) {
            int position = 1; // Position counter
            while (num != 0) {
                int digit = num % 10;
                if (position % 2 == 1 && isPrime(digit)) {
                    sum += digit;
                }
                num = num / 10;
                position++;
            }
        }
        System.out.println(sum);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

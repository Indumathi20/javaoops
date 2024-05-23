package tcs;
import java.util.*;
public class ex6 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
//	At a fun fair, a street vendor is selling different colours of balloons.
//	He sells N number of different colours of balloons (B[]). The task is to 
//	find the colour (odd) of the balloon which is present odd number of times
//	in the bunch of balloons.
//
//	Note: If there is more than one colour which is odd in number, 
//	then the first colour in the array which is present odd number of times is displayed. 
//	The colours of the balloons can all be either upper case or lower case in the array. 
//	If all the inputs are even in number, display the message “All are even”.
//
//	Example 1:
//
//	7  -> Value of N
//	[r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
//	Output :
//
//	r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch.


    // Input the number of colors
    int n = scanner.nextInt();

    // Input the colors
    char[] colors = new char[n];
    for (int i = 0; i < n; i++) {
        colors[i] = scanner.next().charAt(0);
    }

    // Count occurrences of each color
    Map<Character, Integer> colorCount = new HashMap<>();
    for (char color : colors) {
        colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
    }

    // Find the first color occurring an odd number of times
    char oddColor = '\0'; // Null character
    for (char color : colors) {
        if (colorCount.get(color) % 2 != 0) {
            oddColor = color;
            break;
        }
    }

    // Output the result
    if (oddColor != '\0') {
        System.out.println(oddColor);
    } else {
        System.out.println("All are even");
    }
}
}

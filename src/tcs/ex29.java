package tcs;
import java.util.*;
public class ex29 {
	public static void main(String[] args) {
//		Count words in a given string
//		
//		Given a string, count the number of words in it. 
//		The words are separated by the following characters: space (‘ ‘) or new line (‘\n’) or tab (‘\t’)
//		or a combination of these.
		
	Scanner sc = new Scanner(System.in);
    String input = "One two       three\n four\tfive  ";
    
    // Split the input string based on space, newline, or tab
    String[] words = input.split("[ \\n\\t]+");
    
    // Count the number of words
    int wordCount = words.length;
    
    System.out.println("Number of words: " + wordCount);
    System.out.println(input);
	}
	

}

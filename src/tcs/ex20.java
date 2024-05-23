package tcs;
import java.util.*;
public class ex20 {
	public static void main(String[] args) {
		//Reverse a string in Java
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		System.out.println(st.toString());
	}

}

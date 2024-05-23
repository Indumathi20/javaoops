package tcs;
import java.util.*;
public class ex1 {
	
	public static void main(String[] args) {
//		An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
//		A company manager wants to make the production of both types of vehicle according to the given data below:
//
//			1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
//			2nd data, Total number of wheels = W
//			The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
//			Example :
//
//			Input :
//			200  -> Value of V
//			540   -> Value of W
//
//			Output :
//			TW =130 FW=70

			Scanner sc = new Scanner(System.in);
			int v = sc.nextInt();
			int w = sc.nextInt();
			int tw = ((4 * v) - w)/2;
			
//			This line calculates the number of four-wheelers (FW). It multiplies 
//			the total number of vehicles (v) by 4 (as each four-wheeler has 4 wheels), 
//			subtracts the total number of wheels (w), and then divides
//			the result by 2 (as each vehicle has 2 wheels).
			
			
//			Constraints :
//
//				2<=W
//				W%2=0
//				V<W
			if((2 <= w) && (w % 2 == 0) && (v < w))
			{
				System.out.println("two wheelers are : "+ tw + " four wheelers are : " + (v - tw));
			}
			else
			{
				System.out.println("invalid input");
			}
			
	}

}

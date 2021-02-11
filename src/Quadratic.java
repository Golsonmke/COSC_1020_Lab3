
import java.util.*;
/**
 * COSC 1020 Sec.101 8am/ Sec. 403 12pm
 * Lab 3 Quadratic equation solver
 * Professor Nadiyah Johnson
 * @author Gary Olson
 *
 */
public class Quadratic {

	public static void main(String[] args) {
		
		//Display title and function of program
		System.out.println("Welcome to the quadratic equation solver!");
		System.out.println("For an equation of the form ax^2 + bx + c,");
		
		// Instantiate new scanner for user input
		Scanner in = new Scanner(System.in);
		
		//Get user input for coefficients a,b,c
		System.out.print("Enter a: ");
		double a = in.nextDouble();
		System.out.print("Enter b: ");
		double b = in.nextDouble();
		System.out.print("Enter c: ");
		double c = in.nextDouble();
		
		//Square coefficient b
		double bSquared = (b * b);
		//Find square root of equation
		double root = Math.sqrt(bSquared - 4 * a * c);
		
		//Calculate the two out comes
		double addQuad = (-(b) + root)/ (2 * a);
		double subQuad = (-(b) - root)/ (2 * a);
		
		//Display results of x
		System.out.println("The answers are x = " + addQuad + " and x = " + subQuad);
		//Close scanner
		in.close();

	}

}

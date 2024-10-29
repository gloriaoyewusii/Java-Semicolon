import java.util.Scanner;
public class QuadraticEquation{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = input.nextInt();
	
	System.out.print("Enter a number: ");
	int b = input.nextInt();

	System.out.print("Enter a number: ");
	int c = input.nextInt();

	int bSquare = b * b;
	int squareRootExpression = 4 * a * c;
	int discriminant = bSquare - squareRootExpression;
	
	
	double xPositive = (double) ((- b) + Math.sqrt(discriminant))/(2 * a);
		if(discriminant < 0){
			System.out.println("X1 is: "+xPositive);
			System.out.println("Root is complex");
		} 
		else if (discriminant > 0){
			System.out.println("X1 is: "+xPositive);
			System.out.println("Root is real and distinct");
		}
		else if (discriminant == 0){
			System.out.println("X1 is: "+xPositive);
			System.out.println("Root is real and equal");
		}
	double xNegative = (double) ((- b) - Math.sqrt(discriminant))/(2 * a);
		if(discriminant < 0){
			System.out.println("X2 is: "+xNegative);
			System.out.println("Root is complex");
		} 
		else if (discriminant > 0){
			System.out.println("X2 is: "+xNegative);
			System.out.println("Root is real and distinct");
		}
		else if (discriminant == 0){
			System.out.println("X2 is: "+xNegative);
			System.out.println("Root is real and equal");
		}
				
	}
}
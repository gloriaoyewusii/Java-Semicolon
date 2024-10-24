import java.util.Scanner;
public class Powers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int result = 1;
		int baseNumber;
		int exponentNumber;
		
		System.out.print("Enter base: ");
		baseNumber = input.nextInt();
		
		System.out.print("Enter exponent: ");
		exponentNumber = input.nextInt();
		
		for(int iteration = 1; iteration <= exponentNumber; iteration++){
			result *= baseNumber;
		}
		System.out.println(number1 + " raised to the power of " + number2 + " is: " + result);
		

}
}


l
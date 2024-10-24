import java.util.Scanner;
public class TwoNumbers{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

	String terminationInput = "No"; 
	String userInput = "";

do {	
	System.out.print("Enter number: ");
	int number1 = input.nextInt();

	System.out.print("Enter number: ");
	int number2 = input.nextInt();

	int sum = number1 + number2;
	System.out.println("Sum is: " + sum);

	System.out.println("Enter 'Yes' to continue operation. Enter 'No' to discontinue.");
	userInput = input.next();

	
}
while (!(userInput.equals(terminationInput)));
System.out.print("Calculation terminated");


	}
}
import java.util.Scanner;
public class SumOfDigits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a three digit number: ");
	int Integer = input.nextInt();
int lastNumber = Integer % 10;
	System.out.printf("The last digit is: %d%n", lastNumber);

int firstQuotient = Integer/10;
int secondNumber = firstQuotient % 10;
	System.out.printf("The second digit is: %d%n", secondNumber);

int firstNumber = firstQuotient/10;
	
	System.out.printf("The first digit is: %d%n", firstNumber);

 int Sum = firstNumber + secondNumber + lastNumber;

System.out.printf("The sum of the digits is: %d", Sum);


		

	

	}
}
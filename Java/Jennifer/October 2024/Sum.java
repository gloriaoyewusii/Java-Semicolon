import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
System.out.print("Enter the first number: ");

Scanner input = new Scanner(System.in);

	int firstNum = input.nextInt();
	System.out.print("Enter the second number: ");	
int secondNum = input.nextInt();
	System.out.print("Enter the third number: ");	
int thirdNum = input.nextInt();
	System.out.print("Enter the fourth number: ");	
	int fourthNum = input.nextInt();
	System.out.print("Enter the fifth number: ");	
	int fifthNum = input.nextInt();
	int sumNum = firstNum + secondNum + thirdNum + fourthNum + fifthNum;
	int sumFinal = sumNum/2;

	System.out.printf("The sum is: %d", sumFinal);
		}
}
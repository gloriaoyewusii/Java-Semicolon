import java.util.Scanner;
public class FinanceApp{	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the balance: ");
	double balance = input.nextDouble();
	System.out.print("Enter annual percentage interest rate: ");
	double annualInterestRate = input.nextDouble();
	double interestCalculated = balance*(annualInterestRate/1200);
	System.out.printf("The interest is: %.5f", interestCalculated);




}
}
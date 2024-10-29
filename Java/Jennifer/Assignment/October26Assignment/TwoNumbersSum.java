import java.util.Scanner;
public class TwoNumbersSum {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);

    	System.out.print("Enter a number: ");
	int userInput = input.nextInt();
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
   	
	int total = 0;
	
	total = number + userInput;
	System.out.printf("Total is: %d%n", total);
	
	System.out.print("Enter -1 to quit operation, otherwise enter a different number to continue: ");
	int userConfirmation = input.nextInt();

	while (userConfirmation != -1) {
		if(userConfirmation == -1){
    			System.out.print("Operation terminated");
		}
	
		else{
			System.out.print("Enter a number: ");
			userInput = input.nextInt();
	
			System.out.print("Enter a number: \n");
			number = input.nextInt();
	
			total = number + userInput;
			System.out.printf("Total is: %d%n", total);
		}
		System.out.print("Enter -1 to quit operation, otherwise enter a different number to continue: ");
	userConfirmation = input.nextInt();


	}
   
	}
}
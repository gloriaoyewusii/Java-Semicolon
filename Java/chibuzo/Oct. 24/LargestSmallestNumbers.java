import java.util.Scanner;
public class LargestSmallestNumbers{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int largest = number;
		int smallest = number;
		int userInput;

		do {
			System.out.print("Enter a number ::> ");
			number = input.nextInt();

			if (number > largest){
				largest = number;
			}

			if (number < smallest){

				smallest = number;
			}

			System.out.print("Enter 0 if you want to stop ::> ");
			userInput = input.nextInt();

		} while (userInput != 0);

		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is: " + smallest);

	}
}
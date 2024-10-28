import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args){	
	
	int counter = 0;
	Random input = new Random();
	
	int randomNumber = input.nextInt();
	System.out.printf("Guess random number: ");
	
	Scanner nextInput = new Scanner(System.in);
	int userInput = nextInput.nextInt();
	System.out.printf("%d\n", userInput);	

	if (userInput > randomNumber) {
		System.out.print("Too high, try again");
		counter++;
	} else if (userInput < randomNumber) {
		System.out.print("Too low, try again");
	} else if (userInput == randomNumber) {
		System.out.print("Correct!");
	}

	}
}
import java.util.Scanner;
public class NumberCheck{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number to check: ");
	int numberToCheck = input.nextInt();

	int[] numbers = {2, 5, 6, 7, 3, 9};

	for(int counter = 0; counter < numbers.length; counter++){
		if (numberToCheck == numbers[counter])
			System.out.println("Number "+numberToCheck+" is found");

	}
	}
}


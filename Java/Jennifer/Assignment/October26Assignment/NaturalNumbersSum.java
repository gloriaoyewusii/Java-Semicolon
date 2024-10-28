import java.util.Scanner;
public class NaturalNumbersSum {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int total = 0;
	int naturalNumber = 1;
	int counter = 1;

	while (counter <= 10 && naturalNumber <= 10){
		System.out.printf("Number %d: ", counter);
		naturalNumber = input.nextInt();
		total = naturalNumber + total;
		counter = counter + 1;
	}
		if (naturalNumber > 0 && naturalNumber <= 10){
			int newCounter = counter - 1;
			System.out.printf("The sum of the first %d natural numbers is: %d", newCounter, total);
		}
		else if (naturalNumber < 0 && naturalNumber > 10) {
		System.out.print("Number is not a natural number");
		}	
	}
}

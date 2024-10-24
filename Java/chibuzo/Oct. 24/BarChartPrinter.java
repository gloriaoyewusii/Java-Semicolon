import java.util.Scanner;

public class BarChartPrinter {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

		int numberCounter = 1;
		int asterisksNumber = 1;
		String asterisks = "*";
	
	while (numberCounter <= 5){
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		asterisksNumber *=number;
		numberCounter +=1;
		asterisks+=1;
		
	}
		if (asterisksNumber > 5) 
			System.out.printf("%s", asterisks+=1);
		
	// System.out.printf("Print asterisks: %s", asterisks);

	}
}
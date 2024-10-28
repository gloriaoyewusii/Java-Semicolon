import java.util.Scanner;
public class LargestAndSmallestNumbers {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter any number to start or -1 to quit.");
	int counter = 1;
	int sentinelValue = -1;
	int largestNumber = 0;
	int smallestNumber = 0;
	int initialNumber = input.nextInt();
	int nextNumber = input.nextInt();

	while (initialNumber != sentinelValue && nextNumber != sentinelValue){
		initialNumber = input.nextInt();
		//System.out.printf("Input number: ");
		nextNumber = input.nextInt();
		//System.out.printf("Input next number: ");
		counter = counter + 1;
		
		if (nextNumber > initialNumber) {
			largestNumber = nextNumber;
		}
		else { 
			smallestNumber = initialNumber;
		}
		if (initialNumber > nextNumber) {
				largestNumber = initialNumber;
		}
			else {
				smallestNumber = nextNumber;
			}
		
	}
	System.out.println("The largest number is: "+largestNumber);
	System.out.print("The smallest number is: "+smallestNumber);


	//int largestNumber = countedNumber;




		//System.out.printf("%d is largest number", largestNumber);
		//} else if (countedNumber < number) {
		//	int smallestNumber = countedNumber;

		//}
		
	
	}
}
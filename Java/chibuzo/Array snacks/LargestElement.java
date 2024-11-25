import java.util.Scanner;
public class LargestElement{
	public static void main(String[] args){

	int[] numbers = {};
	
	largestElementOf(numbers);
	
	
	
	}

	public static void largestElementOf(int[] numbers){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int numbersSize = input.nextInt();
		numbers = new int[numbersSize];
		int largest = numbers[0];
		for(int counter = 0; counter < numbersSize; counter++){
		
			System.out.print("Elements are: ");
			numbers[counter]  = input.nextInt();
	
			if (numbers[counter] > largest)
				largest = numbers[counter];
		
		}
	System.out.print("The largest element is: "+largest);		
	
	}
}
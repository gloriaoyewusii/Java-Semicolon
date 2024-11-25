import java.util.Scanner;
public class ElementChecker{
	public static void main(String[] gloria){
		int[] completeNumbers = {3, 4, 5, 6, 7};
		checkElementIn(completeNumbers);

	}
	
	public static int[] checkElementIn(int[] numbers){
		Scanner input = new Scanner(System.in);
		numbers = new int[numbers.length];
		System.out.print("Enter element to check: ");
		int elementToCheck = input.nextInt();
		for (int index = 0; index < numbers.length; index++){
			
			if (elementToCheck == numbers[index])
				System.out.print("This element"+elementToCheck+" is in the list.");
		}
		
		return numbers;
	}




}
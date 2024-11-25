import java.util.Scanner;
public class ListReversal{
	public static void main(String[] gloria){
		int[] completeNumbers = {3, 4, 5, 6, 7};
		reverseArrayOf(completeNumbers);

	}
	
	public static void reverseArrayOf(int[] numbers){
		numbers = new int[numbers.length];
		
		for (int index = 0; index < numbers.length/2; index++){
			int initial = numbers[index];
			numbers[index] = numbers[numbers.length-1-index];
			numbers[numbers.length-1-index] = initial;
			System.out.print(numbers[index]);	
		}
	
	}




}
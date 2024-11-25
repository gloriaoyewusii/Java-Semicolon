public class OddElements{
	public static void main(String[] gloria){
		int[] completeNumbers = {3, 4, 5, 6, 7};
		printOddElementsIn(completeNumbers);

	}
	
	public static int[] printOddElementsIn(int[] numbers){
		for (int index = 0; index < numbers.length; index++){
			if (numbers[index] % 2 != 0)
				System.out.print(numbers[index]+" ");
		}
		
		return numbers;
	}




}
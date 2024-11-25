public class ListTotal{
	public static void main(String[] gloria){
		int[] completeNumbers = {1, 2, 3, 4};
		firstSetToSum(completeNumbers);
		
		int[] numbersToSum = {2, 4, 6};
		secondSetToSum(numbersToSum);
		
		int[] thirdSet = {1, 3, 5, 7, 9};
		thirdSetToSum(thirdSet);
		

	}
	
	public static void firstSetToSum(int[] numbers){
		int total = 0;
		for (int index = 0; index < numbers.length; index++){
			total = numbers[index] + total;
		}
		System.out.println("The first set's total is: "+total+" ");
	}
	public static void secondSetToSum(int[] numbers){
		int total = 0;
		int index = 0; 
		while (index < numbers.length){
			total = numbers[index] + total;
			index++;
		}
		System.out.println("Total of the second set of numbers is: "+total+" ");
	}
	public static void thirdSetToSum(int[] numbers){
		int total = 0;
		int index = 0; 
		do{
			total = numbers[index] + total;
			index++;
		} while (index < numbers.length);	
		
		System.out.println("Total of the third set of numbers is: "+total+" ");
	
	}








}
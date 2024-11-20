public class ArraySum{
	public static void main(String[] args){
	
	int[] numbers = {2, 3, 5, 6, 8};

	int counter = 0;
	int total = 0;

	for (counter = 0; counter < numbers.length; counter++){
		total = numbers[counter] + total;
	}
	System.out.println("The sum of arrays "+total);

	}
}
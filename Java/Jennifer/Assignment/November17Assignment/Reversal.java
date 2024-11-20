public class Reversal{
	public static void main(String[] args){
	
	int[] numbers = {2, 5, 7, 3, 9};
	
	int length = numbers.length;
	System.out.println("Length is "+length);

	int[] temporary = new int [numbers.length];
	
	for(int counter = 0; counter < numbers.length; counter++){
		int reversedNumbers = numbers.length - (counter+1);
		temporary[counter] = numbers[reversedNumbers];
		System.out.println(temporary[counter]);

	}
	
	
	}
}
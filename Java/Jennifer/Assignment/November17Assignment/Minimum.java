public class Minimum{
	public static void main(String[] args){

	int[] numbers = {2, 1, 5, 7, 3};
	int counter = 0;
	int minimum = numbers[counter];
	
	//minimum = numbers[counter];
	
	while (counter < numbers.length){
		if (numbers[counter] < minimum){
			minimum = numbers[counter];
			counter++;
			System.out.print("Minimum number is "+minimum);
		}
	}
	
	
	}
}
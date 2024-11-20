public class Duplicates{
	public static void main(String[] args){
	
	int[] numbers = {2, 5, 7, 2, 3, 9};
	int counter = 0;
	//int[] duplicates = new int[numbers.length];
	
	for(counter = 0; counter < numbers.length; counter++){
		if (numbers[counter+1] == numbers[counter])
			//duplicates = numbers[counter];
			System.out.print(numbers[counter]+" is a duplicate");
	}
	
	
	}
}
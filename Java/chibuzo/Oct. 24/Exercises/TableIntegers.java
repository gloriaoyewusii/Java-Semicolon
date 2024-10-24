public class TableIntegers{
	public static void main(String[] args){

		System.out.println("a\tb\tpow(a, b)");

		int resultOfExponent = 1;

		int baseNumber = 1;
		int exponentNumber = 2;
		
		int counter = 1;
		while(counter <= 5){

			for(int iterationNumber = 1; iterationNumber <= exponentNumber; iterationNumber++){
			resultOfExponent *= baseNumber;
			}

			System.out.printf("%d\t%d\t%d%n", baseNumber,exponentNumber, resultOfExponent);


			baseNumber++;
			exponentNumber++;

			resultOfExponent = 1;

			counter++;

		}



	




	}



}
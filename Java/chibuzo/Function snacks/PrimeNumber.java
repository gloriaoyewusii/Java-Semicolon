public class PrimeNumber{
	public static void main(String[] gloria){

	int integer = 14;
	isPrimeNumber(integer);

	}
	
	public static boolean isPrimeNumber(int integer){
		for(int index = 2; index < integer; index++){
			if (integer % index == 0)
				System.out.print("false");
			else if (integer % index != 0)
				System.out.print("true");
		}


	return false;
	}
	
}
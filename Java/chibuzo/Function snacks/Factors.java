public class Factors{
	public static void main(String[] gloria){

	int integer = 10;
	factorOf(integer);

	}
	
	public static void factorOf(int integer){
		int factors = 1;
		for (int index = 2; index <= integer; index++){
			if (integer % index == 0)
				factors += 1;
		
		}
		System.out.print(factors);
	
	}
	
}
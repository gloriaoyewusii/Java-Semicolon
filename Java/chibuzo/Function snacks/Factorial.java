public class Factorial{
	public static void main(String[] gloria){

	int integer = 5;
	factorialOf(integer);

	}
	

	public static void factorialOf(int integer){
			int factorial = integer;
		for (int index = 1; index < integer; index++){
			factorial *= integer - index;
		
		}
		System.out.print(factorial);
	}
}	
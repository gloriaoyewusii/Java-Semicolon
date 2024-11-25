public class DigitsOfNumbers{
	public static void main(String[] gloria){
		int number = 2345;
		getDigitsOf(number);
	}
	public static void getDigitsOf(int number){
		while (number > 0){
			int remainder = number % 10;
			int quotient = number / 10;
			number = quotient;
			
		}
		System.out.print(remainder);
	
	}
}
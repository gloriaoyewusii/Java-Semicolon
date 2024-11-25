public class Kata{
	public static void main(String[] gloria){

	}
	
	public static void getDigitsOf(int number){
		while (number > 0){
			int remainder = number % 10;
			int quotient = number / 10;
			number = quotient;
		System.out.print(remainder+" ");	
		}
		
	
	}
	
	public static boolean isEven(int integer){
		
		if (integer % 2 == 0)
			System.out.print("true");
		else
			System.out.print("false");


	return false;
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

	public static void subtract(int integer1, int integer2){
		int subtraction = 0;
		if (integer1 < integer2)
			subtraction = integer2 - integer1;
		else if (integer1 > integer2)
			subtraction = integer1 - integer2;
	System.out.print(subtraction);
	}

	public static void divide(float integer1, float integer2){
		float quotient = 0;
		if (integer1 < integer2)
			quotient = integer2 / integer1;
		else if (integer1 > integer2)
			quotient = integer1 / integer2;
		else if (integer1 == 0 && integer2 == 0)
			quotient = 0;
	System.out.print(quotient);
	}

	public static void factorOf(int integer){
		int factors = 1;
		for (int index = 2; index <= integer; index++){
			if (integer % index == 0)
				factors += 1;
		
		}
		System.out.print(factors);
	
	}
	
	public static void isSquare(int integer){
		int squareCounter = 0;
		for (int index = 1; index < integer; index++){
			if (index * index == integer)
				squareCounter += 1;
		if (squareCounter == 1)
			System.out.print("true");
		else
			System.out.print("false");
		}
	}
	
	public static void isPalindrome(int integer){
		int lastDigit = integer % 10;
		int fourthDigit = (integer/10) % 10;

		int secondDigit = (integer / 1000) % 10;
		int firstDigit = (integer/10000) % 10;


		if (lastDigit == firstDigit && secondDigit == fourthDigit)
			System.out.print("true");
		else
			System.out.print("false");
			
	}

	public static void factorialOf(int integer){
			int factorial = integer;
		for (int index = 1; index < integer; index++){
			factorial *= integer - index;
		
		}
		System.out.print(factorial);
	}

	public static void squareOf(int integer){
			int square = integer * integer;	
			
			System.out.print(square);
	}

	
}
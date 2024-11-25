public class Palindrome{
	public static void main(String[] gloria){

	int integer = 45654;
	isPalindrome(integer);

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

}




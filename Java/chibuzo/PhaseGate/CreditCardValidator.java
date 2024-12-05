import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] gloria){
		Scanner input = new Scanner(System.in);
		System.out.print("Hello, kindly enter card details to verify: ");
		String cardDetails = input.nextLine();
		
		int cardLength = printCardLength(cardDetails, input);
		String cardType = printCardType(cardDetails, input);
		String cardNumber = printCardNumber(cardDetails, input);
		int[] digitsArray = getDigitsFromRightToLeft(cardDetails, input);

	}

	public static int printCardLength(String cardDetails, Scanner input){
		int cardLength = 0;
		for (int index = 1; index < cardDetails.length(); index++){
			cardLength = cardDetails.length();
			
		}
		System.out.println("Credit Card Digit Length: "+cardLength);
		return cardLength;

	}

	public static String printCardType(String cardDetails, Scanner input){
		String cardType = "";
		
			
		for (char digit = '2'; digit <= '5'; digit++){
			for (int index = 1; index < cardDetails.length(); index++){
				if (digit == '2' || digit == '4'){
					if (digit == cardDetails.charAt(index))
						cardType = "Credit Card Type: Visa Card";
				
				} else if (digit == '5')
					cardType = "Credit Card Type: MasterCard";
				else if (digit == '3')
					cardType = "Credit Card Type: American Express";
				else if (digit == '6')
					cardType = "Credit Card Type: Discover";

			}
		}
		System.out.println(cardType);		
		return cardType;
	}

	public static String printCardNumber(String cardDetails, Scanner input){
		String cardNumber = cardDetails;
		System.out.println("Credit Card Number: "+cardNumber);
		return cardNumber;

	}

	public static int[] getDigitsFromRightToLeft(String cardDetails, Scanner input){
		int length = cardDetails.length();
		int[] digitsArray = new int[cardDetails.length()];
		char digit = '0';
		
		for (int index = (cardDetails.length() - 2); index >= 0; index-=2){
			digit = cardDetails.charAt(index);
			int number = digit - '0';
			System.out.print(number);
			for (int secondIndex = 0; secondIndex < cardDetails.length(); secondIndex++){
				digitsArray[index] = number;
			}	
			
		}
			System.out.print(Arrays.toString(digitsArray));
			
		
		
		return digitsArray;
	}
}



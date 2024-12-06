import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] gloria){
		Scanner input = new Scanner(System.in);
		System.out.print("Hello, kindly enter your card details to verify: ");
		String cardDetails = input.nextLine();
		

		printInvalidType(cardDetails, input);
		int cardLength = printCardLength(cardDetails, input);
		String cardType = printCardType(cardDetails, input);
		String cardNumber = printCardNumber(cardDetails, input);
		int[] digitsArray = getSecondPlaceDigits(cardDetails, input);
		int secondPlaceTotal = addSecondPlaceDigits(digitsArray);
		int[] oddPlaceArray = getOddPlacedDigitsFromRightToLeft(cardDetails, input);
		int oddPlaceTotal = addOddPlaceDigits(oddPlaceArray);
		int total = addTotals(oddPlaceTotal, secondPlaceTotal);
		String validityStatus = checkValidityStatus(total);

	}
	public static void printInvalidType(String cardDetails, Scanner input){
		boolean number = true;
		while (number){
			if (cardDetails.length() >= 13 && cardDetails.length() <= 16){
				break;
			} else {
				System.out.println("Credit Card Type: Invalid Card");
				break;
			}
		}
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

	public static int[] getSecondPlaceDigits(String cardDetails, Scanner input){
		int length = cardDetails.length();
		int[] digitsArray = new int[cardDetails.length()];
		char digit = '0';
		int remainder = 0;
		int quotient = 0;
		int newDigits = 0;
		
		for (int index = (cardDetails.length() - 2); index >= 0; index-=2){
			digit = cardDetails.charAt(index);
			int number = digit - '0';
			for (int secondIndex = 0; secondIndex < cardDetails.length(); secondIndex++){
				digitsArray[index] = number * 2;
				if (digitsArray[index] - 9 >= 1){
					remainder = digitsArray[index] % 10;
					quotient = digitsArray[index] / 10;
					digitsArray[index] = remainder + quotient;		
				}
			}	
		}
			//System.out.println(Arrays.toString(digitsArray));
			
		
		
		return digitsArray;
	}

	public static int addSecondPlaceDigits(int[] digitsArray){
		int secondPlaceTotal = 0;
		for (int index = 0; index < digitsArray.length; index++){
			secondPlaceTotal = digitsArray[index] + secondPlaceTotal;
		}
		System.out.println("Total is: "+secondPlaceTotal);
		return secondPlaceTotal;
	}

	public static int[] getOddPlacedDigitsFromRightToLeft(String cardDetails, Scanner input){
		int length = cardDetails.length();
		int[] oddPlaceArray = new int[cardDetails.length()];
		char digit = '0';
		int remainder = 0;
		int quotient = 0;
		int newDigits = 0;
		
		for (int index = (cardDetails.length() - 1); index >= 0; index-=2){
			digit = cardDetails.charAt(index);
			int number = digit - '0';
			for (int secondIndex = 0; secondIndex < cardDetails.length(); secondIndex++){
				oddPlaceArray[index] = number;
				if (oddPlaceArray[index] - 9 >= 1){
					remainder = oddPlaceArray[index] % 10;
					quotient = oddPlaceArray[index] / 10;
					oddPlaceArray[index] = remainder + quotient;		
				}
			}	
		}
			//System.out.println(Arrays.toString(oddPlaceArray));
			
		
		
		return oddPlaceArray;
	}

	public static int addOddPlaceDigits(int[] oddPlaceArray){
		int oddPlaceTotal = 0;
		for (int index = 0; index < oddPlaceArray.length; index++){
			oddPlaceTotal = oddPlaceArray[index] + oddPlaceTotal;
		}
		System.out.println("Total is: "+oddPlaceTotal);
		return oddPlaceTotal;

	}

	public static int addTotals(int oddPlaceTotal, int secondPlaceTotal){

		int total = oddPlaceTotal + secondPlaceTotal;
		System.out.println(oddPlaceTotal + " + " + secondPlaceTotal + " = "+total);

		return total;
	}
	public static String checkValidityStatus(int total){
		String validityStatus = "";
		if (total % 10 == 0)
			validityStatus = "Credit Card Validity Status: Valid";
		else if (total % 10 != 0)
			validityStatus = "Credit Card Validity Status: Invalid";
	
		System.out.print(validityStatus);
		return validityStatus;

	}
}



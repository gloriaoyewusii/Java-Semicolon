
import java.util.Scanner;
public class PositiveNegativeZeros2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		int fourthNum = 0;
		int fifthNum = 0;		
		int positiveNum = 0;
		int negativeNum = 0;
		int zeros = 0;
		

		for(int index = 1; index <= 5; index++){
			System.out.print("Enter number: ");
			int number = input.nextInt();
			firstNum = number;
			secondNum = number;
			thirdNum = number;
			fourthNum = number;
			fifthNum = number;
		}

		if(firstNum == 0 || secondNum == 0 || thirdNum == 0 || fourthNum == 0 || fifthNum == 0){
			zeros = zeros + 1;
		}
		if(firstNum > 0 || secondNum > 0 || thirdNum > 0 || fourthNum > 0 || fifthNum > 0){
			positiveNum = positiveNum + 1 ; 
		}
		if(firstNum < 0 || secondNum < 0 || thirdNum < 0 || fourthNum < 0 || fifthNum < 0){
			negativeNum = negativeNum + 1;
		}
			
		System.out.printf("Positive Num: %d%nNegative numbers: %d%nZeros: %d",  positiveNum, negativeNum, zeros);
	
		
		
		
	}
}

import java.util.Scanner;
public class PositiveNegativeZeros{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int firstNum, secondNum, thirdNum, fourthNum, fifthNum = 0;
		System.out.print("Enter numbers: ");
		firstNum = input.nextInt();
		secondNum = input.nextInt();
		thirdNum = input.nextInt();
		fourthNum = input.nextInt();
		fifthNum = input.nextInt();
		
		
		int positiveNum = 0;
		int negativeNum = 0;
		int zeros = 0;


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
	
		//System.out.printf("first Num: %d%n, Second Num: %d%n, third Num: %d%n, fourth num: %d%n, fifth Num: %d", firstNum, secondNum, thirdNum, fourthNum, fifthNum);

		
		
	}
}
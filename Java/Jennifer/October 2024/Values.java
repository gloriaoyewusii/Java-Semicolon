//(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
//and prints the number of negative numbers input, the number of positive numbers input and
//the number of zeros input.

import java.util.Scanner;
public class Values{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		int fifthNumber = 0;

		for(int number = 0; number <=5; number++){
			System.out.println("Enter firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber: ");
 			firstNumber = input.nextInt();
			secondNumber = input.nextInt();
			thirdNumber = input.nextInt();
			fourthNumber = input.nextInt();
			fifthNumber = input.nextInt();
		}


	}
}
// A program summing up the digits in an integer.

import java.util.Scanner;
public class SummingDigits{
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("The integer is: ");
int aNumber = input.nextInt();

/*The integer is operated  upon by the % operator.
It results in the first remainder.*/

int rem1 = aNumber % 10;
System.out.println("Digit_ is: "+rem1);

int quot1 = aNumber / 10;
System.out.println("Quotient is: "+quot1);

int rem2 = quot1 % 10;
System.out.println("Digit__ is: "+rem2);

int quot2 = quot1 / 10;
System.out.println("Digit___ is: "+quot2);

/** Next, the number undergoes a test for number of digits.
*/

if (aNumber > 99){
int sum1 = rem1 + rem2 + quot2;
System.out.printf("The number is: %d%d%d%n", quot2, rem2, rem1);
System.out.println("The sum of the digits is: "+sum1);
}
if (aNumber < 99){
int sum2 = rem1 + quot1;
System.out.printf("The number is: %d%d%n", quot1, rem1);
System.out.println("The sum of the digits is: "+sum2);
}










	}
}

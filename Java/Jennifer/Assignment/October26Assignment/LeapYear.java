import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a year: ");
	int year = input.nextInt();
	int leapYear = year % 4;

	if (leapYear == 0) {
		System.out.printf("%d is a leap year", year);

	if (leapYear != 0){
		System.out.printf("%d is not a leap year", year);
	}	
	}

	}
}
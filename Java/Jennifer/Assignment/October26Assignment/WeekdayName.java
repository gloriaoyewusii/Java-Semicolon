import java.util.Scanner;
public class WeekdayName {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");

	int number = input.nextInt();

		if (number == 2){
			System.out.print("Monday");
		} 
		if (number == 3){
			System.out.print("Tuesday");
		} 
		if (number == 4){
			System.out.print("Wednesday");
		}
		if (number == 5){
			System.out.print("Thursday");
		}
		if (number == 6){
			System.out.print("Friday");
		}

	}
}
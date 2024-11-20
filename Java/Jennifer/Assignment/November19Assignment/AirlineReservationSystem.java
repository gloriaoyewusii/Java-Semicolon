import java.util.Scanner;
public class AirlineReservationSystem{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	boolean[] planeSeats = new boolean[10];

	int counter = 0;
	int economyCounter = 5;
	int firstClassCounter = 0;
	int userResponse = 0;
	
	while (counter < 10){
		System.out.println("Enter 1 for First class or 2 for Economy seats: ");
		userResponse = input.nextInt();
		while (userResponse >= 1 || userResponse <= 2){
			if (userResponse == 2){
				planeSeats[economyCounter] = true;
				System.out.printf("You have been assigned seat %d", economyCounter+1);
				economyCounter++;
				break;
				
			}
			else if (userResponse == 1){
				planeSeats[firstClassCounter] = true;
				System.out.printf("You have been assigned seat %d", firstClassCounter+1);
				firstClassCounter++;
				counter++;
				break;
			}
			else {
				System.out.println("Invalid input. Enter 1 for First class or 2 for Economy seats: ");
				userResponse = input.nextInt();
			}

			
		}
				
			
	}
		

	
	}
}
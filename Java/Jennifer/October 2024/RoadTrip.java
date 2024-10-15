import java.util.Scanner;

public class RoadTrip{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double drivingDistance = input.nextDouble();
	
	System.out.print("Enter the miles per gallon: ");
	double milesPerGallon = input.nextDouble();
	
	System.out.print("Enter the price per gallon: ");
	double pricePerGallon = input.nextDouble();

	double numberOfGallons = drivingDistance/milesPerGallon;

	System.out.printf("The number of Gallons is: %.2f%n",  numberOfGallons);
	
	double costOfDriving = numberOfGallons*pricePerGallon;

	System.out.printf("The cost of driving is: %.2f", costOfDriving);

	





}
}
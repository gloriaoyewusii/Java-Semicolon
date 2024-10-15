import java.util.Scanner;

public class PhysicsAcceleration{
	public static void main(String[] args){
	Scanner physics = new Scanner(System.in);
	System.out.print("Enter the starting velocity: ");
	double startingVelocity = physics.nextDouble();
	System.out.print("Enter the ending velocity: ");
	double endingVelocity = physics.nextDouble();
	System.out.print("Enter the time span: ");
	double timeSpan = physics.nextDouble();

double averageAcceleration = (endingVelocity-startingVelocity)/timeSpan;
System.out.printf("The average acceleration is: %.4f", averageAcceleration);




}
}
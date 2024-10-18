import java.util.Scanner;
public class BodyMassIndex {
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your weight in kilograms: ");

int weightInKilograms = input.nextInt();

System.out.print("Enter your height in meters: ");

int heightInMeters = input.nextInt();

int BodyMassIn = weightInKilograms / (heightInMeters * heightInMeters);

System.out.printf("The BMI is: %d%n", BodyMassIn);

if (BodyMassIn <= 18){
System.out.print("Body Mass Index category: Underweight");
}
if (BodyMassIn > 18 && BodyMassIn < 24){
System.out.print("Body Mass Index category: normal weight");
}
if (BodyMassIn > 24 && BodyMassIn < 30){
System.out.print("Body Mass Index category: overweight");
}
if (BodyMassIn >= 30){
System.out.print("Body Mass Index category: obese");
}





	}
}
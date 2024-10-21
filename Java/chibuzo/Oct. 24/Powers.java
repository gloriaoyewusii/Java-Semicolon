import java.util.Scanner;
public class Powers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int power = 1;
		int number1;
		int number2;
		
		System.out.print("Enter base: ");
		number1 = input.nextInt();
		
		System.out.print("Enter exponent: ");
		number2 = input.nextInt();
		
		for(int holder = 1; holder <= number2; holder++){
			power *= number1;
		}
		System.out.println(number1 + " raised to the power of " + number2 + " is: " + power);
		

}
}



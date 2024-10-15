import java.util.Scanner;
public class IntegersDivide{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int newNumber = number % 3;
	
	if (newNumber == 0)
	System.out.printf("%d is divisible by 3"+"\n", number);
	
	if (newNumber != 0)
	System.out.printf("%d is not divisible by 3", number);

	}
}
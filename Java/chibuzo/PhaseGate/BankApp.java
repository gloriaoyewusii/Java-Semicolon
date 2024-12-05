import java.util.Arrays;
import java.util.Scanner;
public class BankApp{
	public static void main(String[] gloria){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter your pin: ");
		String pin = input.next();

		String[] account = createAccount(firstName, lastName, pin);
	}
	
	public static String[] createAccount(String firstName, String lastName, String pin){
		String[] account = {firstName, lastName, pin};

		System.out.print(Arrays.toString(account));

		return account;
		
	}
}
import java.util.ArrayList;
import java.util.Scanner;
public class BankApp{
	public static void main(String[] gloria){
		Scanner input = new Scanner(System.in);
		ArrayList<String> account = new ArrayList<String> ();

		
		

		createAccount(account, input);
	}
	
	public static void createAccount(ArrayList<String> account, Scanner input){
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		account.add(firstName);

		System.out.print("Enter your last name: ");
		String lastName = input.next();
		account.add(lastName);

		System.out.print("Enter your pin: ");
		String pin = input.next();
		account.add(pin);
		
		
		

		System.out.print(account);
		
	}
		
	public static void closeAccount(){
		
	
	}
}
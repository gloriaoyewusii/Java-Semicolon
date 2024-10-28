import java.util.Scanner;
public class MultipleOfFive {
	public static void main(String[] args) {
   
	Scanner input = new Scanner(System.in);
	System.out.print("Input number of terms: ");
	int number = input.nextInt();
    
		for(int multipliedNumber  = 0; multipliedNumber <= 5; multipliedNumber++){
			int result = multipliedNumber * number;
			System.out.printf("%d * %d = %d%n", number, multipliedNumber, result);
		}
	}
}
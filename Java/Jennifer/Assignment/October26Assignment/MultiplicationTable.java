import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
   
	Scanner input = new Scanner(System.in);
	//System.out.print("Input number of terms: ");
	//int number = input.nextInt();
    
		for(int multipliedNumber  = 1; multipliedNumber < 10; multipliedNumber++){
			for(int number  = 1; number <= 9; number++){
				int result = multipliedNumber * number;
				System.out.printf("%d * %d = %d%t", number, multipliedNumber, result);
			}
		}
	}
}
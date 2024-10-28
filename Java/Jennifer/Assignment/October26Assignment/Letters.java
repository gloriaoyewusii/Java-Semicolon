import java.util.Scanner;
public class Letters {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);


	System.out.println("Enter an alphabet to check: ");	
	String userInput = input.nextLine();

	
	if (userInput.matches("a|e|i|o|u")){		
		System.out.printf("Input %s, is a vowel.",userInput);
	}
	else{
		System.out.printf("Input %s, is a consonant.",userInput);
	}
	
	}
}
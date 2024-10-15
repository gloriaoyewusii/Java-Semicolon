import java.util.Scanner;
public class GroupWork{
	public static void main(String[] args){
	System.out.print("Enter the first number: ");
Scanner input = new Scanner(System.in);
	int firstNum = input.nextInt();
System.out.print("Enter the second number: ");
	int secondNum = input.nextInt();
System.out.print("Enter the third number: ");
	int thirdNum = input.nextInt();

int answer1 = firstNum * secondNum;
int answer2 = thirdNum * firstNum;
int answer3 = answer2/2;
 int finalAnswer = answer1 + answer3;

System.out.println("The final answer is: "+finalAnswer);
System.out.print("The final answer is: "+finalAnswer);

System.out.printf("%n%d", finalAnswer);


}
}
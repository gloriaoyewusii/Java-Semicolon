import java.util.Scanner;
public class PalindromeInteger{
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Integer= ");

int wholeNumber = input.nextInt();
int leftInt = wholeNumber % 10;
System.out.println("Last number: "+leftInt);
int quotient = wholeNumber/10;
System.out.println("Quotient: "+quotient);
int midInt = quotient % 10;
System.out.println("Middle number: "+midInt);
int rightInt = quotient/10;
System.out.println("The first number: "+rightInt);

if (leftInt == rightInt) {
System.out.print("Integer "+wholeNumber+" is a palindrome");
}
if (leftInt != rightInt) {
System.out.print("Integer "+wholeNumber+" is not a palindrome");
}







	}
}
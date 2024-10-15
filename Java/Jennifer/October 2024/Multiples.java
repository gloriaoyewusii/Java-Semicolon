import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
	int firstInt = input.nextInt();
System.out.print("Enter another number: ");
	int secondInt = input.nextInt();
int tripleFirstInt = firstInt * 3;
int doubleSecondInt = secondInt * 2;
System.out.printf("First integer tripled is %d%nSecond integer doubled is %d%n", tripleFirstInt, doubleSecondInt);

int remainder = tripleFirstInt % doubleSecondInt;

System.out.printf("The remainder is %d%n", remainder);
	if (remainder == 0) { System.out.printf("%d is a multiple of %d%n", tripleFirstInt, doubleSecondInt);}
	else {System.out.printf("%d is not a multiple of %d%n", tripleFirstInt, doubleSecondInt);}

		}
}
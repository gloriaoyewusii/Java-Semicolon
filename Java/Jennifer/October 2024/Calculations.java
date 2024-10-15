import java.util.Scanner;

public class TableOfSquaresAndCubes{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");

int number0 = input.nextInt();
int squareOfNumber0 = number0 * number0;
int cubeOfNumber0 = squareOfNumber0 * number0;

System.out.print("Enter second number: ");

int number1 = input.nextInt();
int squareOfNumber1 = number1 * number1;
int cubeOfNumber1 = squareOfNumber1 * number1;

System.out.print("Enter third number: ");

int number2 = input.nextInt();
int squareOfNumber2 = number2 * number2;
int cubeOfNumber2 = squareOfNumber2 * number2;

System.out.print("Enter fourth number: ");

int number3 = input.nextInt();
int squareOfNumber3 = number3 * number3;
int cubeOfNumber3 = squareOfNumber3 * number3;

System.out.print("Enter fifth number: ");

int number4 = input.nextInt();
int squareOfNumber4 = number4 * number4;
int cubeOfNumber4 = squareOfNumber4 * number4;

System.out.print("Enter sixth number: ");

int number5 = input.nextInt();
int squareOfNumber5 = number5 * number5;
int cubeOfNumber5 = squareOfNumber5 * number5;


System.out.print("Enter seventh number: ");

int number6 = input.nextInt();
int squareOfNumber6 = number6 * number6;
int cubeOfNumber6 = squareOfNumber6 * number6;

System.out.print("Enter eighth number: ");

int number7 = input.nextInt();
int squareOfNumber7 = number7 * number7;
int cubeOfNumber7 = squareOfNumber7 * number7;


System.out.print("Enter ninth number: ");

int number8 = input.nextInt();
int squareOfNumber8 = number8 * number8;
int cubeOfNumber8 = squareOfNumber8 * number8;

System.out.print("Enter tenth number: ");

int number9 = input.nextInt();
int squareOfNumber9 = number9 * number9;
int cubeOfNumber9 = squareOfNumber9 * number9;

System.out.print("Enter eleventh number: ");

int number10 = input.nextInt();
int squareOfNumber10 = number10 * number10;
int cubeOfNumber10 = squareOfNumber10 * number10;


System.out.printf("The squares are: %d%n, %d%n, %d, %d, %d, %d, %d, %d, %d, %d, %d%n", squareOfNumber0, squareOfNumber1, squareOfNumber2, squareOfNumber3, squareOfNumber4, squareOfNumber5, squareOfNumber6, squareOfNumber7, squareOfNumber8, squareOfNumber9, squareOfNumber10);

System.out.printf("The cubes are: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", cubeOfNumber0, cubeOfNumber1, cubeOfNumber2, cubeOfNumber3, cubeOfNumber4, cubeOfNumber5, cubeOfNumber6, cubeOfNumber7, cubeOfNumber8, cubeOfNumber9, cubeOfNumber10);
}
}


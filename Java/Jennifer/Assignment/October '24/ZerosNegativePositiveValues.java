import java.util.Scanner;
public class ZerosNegativePositiveValues{
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("num1 = ");
int num1 = input.nextInt();

System.out.print("num2 = ");
int num2 = input.nextInt();

System.out.print("num3 = ");
int num3 = input.nextInt();

System.out.print("num4 = ");
int num4 = input.nextInt();

System.out.print("num5 = ");
int num5 = input.nextInt();


	int zeroInputs = 0;
	int negativeInputs = 0;
	int positiveInputs = 0;	

if (num1 > 0){
   positiveInputs++;
}
if (num2 > 0){
positiveInputs++;
}
if (num3 > 0){
positiveInputs++;
}
if (num4 > 0){
positiveInputs++;
}
if (num5 > 0){
positiveInputs++;
}
System.out.println("Positive numbers: "+positiveInputs);



if (num1 == 0){
   zeroInputs++;
}
if (num2 == 0){
zeroInputs++;
}
if (num3 == 0){
zeroInputs++;
}
if (num4 == 0){
zeroInputs++;
}
if (num5 == 0){
zeroInputs++;
}
System.out.println("Zeros: "+zeroInputs);


if (num1 < 0){
negativeInputs++;
}
if (num2 < 0){
negativeInputs++;
}
if (num3 < 0){
negativeInputs++;
}
if (num4 < 0){
negativeInputs++;
}
if (num5 < 0){
negativeInputs++;
}

System.out.print("Negative numbers: "+negativeInputs);












	}
}
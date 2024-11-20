public class Maximum{
	public static void main(String[] args){
		
	int counter = 1;
	int number1 = 23;
	int number2 = 25;
	int number3 = 45;
	int number4 = 56;
	int maximum = 0;

	if (number1 > number2 && number1 > number3 && number1 > number4)
		System.out.println("Number "+number1+" is the maximum number");
	else if (number2 > number1 && number2 > number3 && number2 > number4)
		System.out.println("Number "+number2+" is the maximum number");
	else if (number3 > number1 && number3 > number2 && number3 > number4)
		System.out.println("Number "+number3+" is the maximum number");
	else if (number4 > number1 && number4 > number2 && number4 > number3)
		System.out.println("Number "+number4+" is the maximum number");
	
	}
}
public class ForLoop{
	public static void main(String[] args){

	for(int number = 1; number <= 5; number++){
		int square = number * number;
		System.out.println(number+" square is: "+square);
	}

	System.out.println("For the while loop");

	int number = 1;
	int squares = 0;
	while (number <= 5){
		squares = number * number;
		System.out.println(number+" square is: "+squares);
		number++;
	}

	}
}
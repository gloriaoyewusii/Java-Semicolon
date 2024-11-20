public class NestedDoWhile{
	public static void main(String[] args){
	
	int number = 1;
	int square = 0;
	int cube = 0;
	
	do{
		System.out.println(number);
		do{ 
			square = number * number;
			number++;
			System.out.println(square);
			do {
				cube = number * number * number;
				number++;
				System.out.println(cube);
			} while(number <= 5);
		} while (number <= 5);
	} while(number <= 5);
	
	}
}



public class Square{
	public static void main(String[] gloria){

	int integer = 10;
	isSquare(integer);

	}
	
	public static void isSquare(int integer){
		int squareCounter = 0;
		for (int index = 1; index < integer; index++){
			if (index * index == integer)
				squareCounter += 1;
		if (squareCounter == 1)
			System.out.print("true");
		else
			System.out.print("false");
		}
	}
	
}
public class Subtraction{
	public static void main(String[] gloria){

	int integer1 = 23;
	int integer2 = 12;
	subtract(integer1, integer2);

	}
	
	public static void subtract(int integer1, int integer2){
		int subtraction = 0;
		if (integer1 < integer2)
			subtraction = integer2 - integer1;
		else if (integer1 > integer2)
			subtraction = integer1 - integer2;
	System.out.print(subtraction);
	}
	
}
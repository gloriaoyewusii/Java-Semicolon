public class Division{
	public static void main(String[] gloria){

	float integer1 = 24;
	float integer2 = 0;
	divide(integer1, integer2);

	}
	
	public static void divide(float integer1, float integer2){
		float quotient = 0;
		if (integer1 < integer2)
			quotient = integer2 / integer1;
		else if (integer1 > integer2)
			quotient = integer1 / integer2;
		else if (integer1 == 0 && integer2 == 0)
			quotient = 0;
	System.out.print(quotient);
	}
	
}
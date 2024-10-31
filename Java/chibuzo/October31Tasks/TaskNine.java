public class TaskNine{
	public static void main(String[] args){
	
		int result1 = 0;
		int result2 = 0;
		for(int number = 4; number <= Math.pow(4, 5); number*=4){
			result1 = number + result1;
	
		}
		System.out.print(result1+" ");
		for(int number2 = 8; number2 <= Math.pow(8, 5); number2*=8){
			result2 = number2 + result2;
		}
		System.out.println(result2);
		int pairOfResult = result1 + result2;
		System.out.println("Sum of pair is: "+pairOfResult);
 		
		int resultSquare = pairOfResult * pairOfResult;
		System.out.print("Square of result is: "+resultSquare);
 	}
	
}

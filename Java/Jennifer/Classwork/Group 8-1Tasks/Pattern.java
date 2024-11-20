public class Pattern{
	public static void main(String[] args){
	
	for (int counter = 1; counter < 10; counter+=3){
		for(int number = counter; number <= counter+2; number++){
			System.out.print(number+" ");
		}
		System.out.println();
	}
	
	}
}
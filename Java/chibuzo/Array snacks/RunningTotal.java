public class RunningTotal{
	public static void main(String[] gloria){
		int[] completeNumbers = {1, 2, 3, 4};
		findRunningTotalIn(completeNumbers);

	}
	
	public static int[] findRunningTotalIn(int[] numbers){
		int total = 0;
		int runningTotal = 0;
		for (int index = 0; index < numbers.length; index++){
			total = numbers[index] + total;
			runningTotal = total + total;
		
		}
		System.out.print("Running total is: "+runningTotal+" ");
		return numbers;
	}




}
import java.util.Scanner;
public class SpecificArrayValue{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int[] array = new int [5];
	
	array[0] = 14;
	array[1] = 23;
	array[2] = 45;
	array[3] = 32;
	array[4] = 56;
	
	int counter = 0;
	System.out.print("Enter a specific value: ");
	int value = input.nextInt();
	
	while (counter < array.length){
		if (value == array[counter])
			System.out.println(array[counter]+"is "+value);
		else
			System.out.println(array[counter]+"is not "+value);
			counter++;
	
	}

	}
}
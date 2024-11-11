import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinMax{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int[] array;
	array = new int [5];
	int counter = 0;
	int minimum = array[counter];
	int maximum = array[counter];
	
	for(counter = 0; counter < array.length; counter++){
		System.out.print("Enter an element: ");
		int newElement = input.nextInt();
		array[counter] = newElement;
		System.out.println(Arrays.toString(array));	
		if (array[counter] > maximum)
			maximum = array[counter];
		if (minimum < array[counter])
			minimum = array[counter];
	System.out.println("Maximum number is: "+maximum);
	System.out.print("Mininum number is: "+minimum);
	}
	}
}
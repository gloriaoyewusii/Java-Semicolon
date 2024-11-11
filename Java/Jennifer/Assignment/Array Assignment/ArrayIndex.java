import java.util.Scanner;
public class ArrayIndex{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int[] array;
	array = new int [5];
	
	for(int counter = 0; counter < array.length; counter++){
		System.out.print("Enter an element: ");
		int newElement = input.nextInt();
		array[counter] = newElement;
		System.out.println("Element "+newElement+" belongs to array index "+counter);
		//else
			//System.out.println("Array"+counter+"is "+array[counter]);
	}
	}
}
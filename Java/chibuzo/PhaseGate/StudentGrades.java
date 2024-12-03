import java.util.Scanner;
public class StudentGrades{

	public static void main(String[] gloria){
		getStudents();
		getNumberOfSubjects();

	}


	public static int getStudents(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?\n");

		int numberOfStudents = input.nextInt();	

		int[] studentsArray = new int[numberOfStudents];

		System.out.print("Students array length is "+studentsArray.length);

		return studentsArray.length;	
	}

	public static int getNumberOfSubjects(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many subjects do they offer?\n");

		int numberOfSubjects = input.nextInt();	
	
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>\n");

		System.out.println("Saved successfully");
		return numberOfSubjects;	
	}
	
}
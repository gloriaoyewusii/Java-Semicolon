import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades{

	static int numberOfStudents;
	static int numberOfSubjects;

	public static void main(String[] gloria){
		
		getNumberOfStudents();
		getNumberOfSubjects();
		getStudents();
		getScores();

	}


	public static int getNumberOfStudents(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?\n");

		numberOfStudents = input.nextInt();	

		return numberOfStudents;
	}

	public static int getNumberOfSubjects(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many subjects do they offer?\n");

		int numberOfSubjects = input.nextInt();	
		
		return numberOfSubjects;
	}
	
	public static String[] getStudents(){
		Scanner input = new Scanner(System.in);
		String[] studentsArray = new String[numberOfStudents];

		for (int index = 0; index < studentsArray.length; index++){
			
			System.out.println("What is the name of the student?\n");

			String studentName = input.nextLine();
			
			studentsArray[index] = studentName;

		
		}
		
		System.out.println(Arrays.toString(studentsArray));


		return studentsArray;	
	}	

	
	


public static int[] getScores(){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of students: ");
	
		numberOfStudents = input.nextInt();

		System.out.print("Enter number of subjects: ");

		numberOfSubjects = input.nextInt();

		int length = numberOfStudents * numberOfSubjects;
		
		int[] scoresArray = new int[length];

		for (int index = 0; index < length; index++){
			int count = index + 1;
			
			System.out.print("Enter score "+count+"\n");
			
			int student_score = input.nextInt();

			scoresArray[index] = student_score;	

		}

		System.out.print(Arrays.toString(scoresArray));
			
			
		return scoresArray;


	}	
	
}
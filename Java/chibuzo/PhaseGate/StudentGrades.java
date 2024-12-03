import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades{

	public static void main(String[] gloria){
		getStudents();
		getScores();

	}


	public static String[] getStudents(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?\n");

		int numberOfStudents = input.nextInt();	

		String[] studentsArray = new String[numberOfStudents];
	
		for (int index = 0; index < numberOfStudents; index++){
			
			System.out.println("What is the name of the student?\n");

			String student_name = input.nextLine();
			
			studentsArray[index] = student_name;

		System.out.println(Arrays.toString(studentsArray));

		}
		
		

		return studentsArray;	
	}

	public static int getScores(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many subjects do they offer?\n");

		int numberOfSubjects = input.nextInt();	

		int[] scoresArray = new int[numberOfSubjects];
	
		for (int index = 0; index < numberOfSubjects; index++){
			int count = index + 1;
	
			System.out.println("Entering scores for student "+count+"\n");
			
			System.out.println("Enter score for subject"+count+"\n");

			int studentScore = input.nextInt();

			scoresArray[index] = studentScore;

			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>\n");

			System.out.println("Saved successfully");

		System.out.println(Arrays.toString(scoresArray));



	



		}
	
				
		getStudents();
		
		return numberOfSubjects;	
	}
	
}
import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades{

	public static void main(String[] gloria){
		
		getScores();

	}


	public static int[][] getScores(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?\n");

		int numberOfStudents = input.nextInt();	

		System.out.println("How many subjects do they offer?\n");

		int numberOfSubjects = input.nextInt();	

		
		int[][] scoresArray = new int[studentsArray.length][numberOfSubjects];
		
		
		for (int index = 0; index < studentsArray.length; index++){
			for (int index2 = 0; index < numberOfSubjects; index++){
				String[] studentsArray = new String[numberOfStudents];
				System.out.println("What is the name of the student? \n");

				String studentName = input.nextLine();
			
				studentsArray[index] = studentName;

				System.out.println("Entering scores for student"+studentName+"\n");
			
				System.out.println("Enter score for subject "+studentName+"\n");

				int studentScore = input.nextInt();
			
				scoresArray[index][index2] = studentScore;

				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>\n");
				System.out.println("Saved successfully");
			System.out.print(scoresArray[index][index2]);

			}
			
		}
		
	
		return scoresArray;
	
	}

}
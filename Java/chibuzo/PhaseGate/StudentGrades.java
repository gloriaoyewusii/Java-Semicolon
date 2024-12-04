import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades{

	public static void main(String[] gloria){
		Scanner input = new Scanner(System.in);
		System.out.println("How many students do you have?\n");
		int numberOfStudents = input.nextInt();	

		System.out.println("How many subjects do they offer?\n");
		int numberOfSubjects = input.nextInt();	

		String[] studentsArray = new String[numberOfStudents];
		int[][] scoresArray = new int[studentsArray.length][numberOfSubjects];

		
		
		getScores(numberOfStudents, numberOfSubjects, scoresArray, input);

	}


	public static int[][] getScores(int numberOfStudents,  int numberOfSubjects, int[][] scoresArray, Scanner input){
		
		//studentsArray = new String[numberOfStudents];
		scoresArray = new int[numberOfStudents][numberOfSubjects];

		
		int[] total = new int[numberOfStudents];
		int[] average = new int[numberOfStudents];
		
		for (int index = 1; index <= numberOfStudents; index++){
			for (int secondIndex = 1; secondIndex <= numberOfSubjects; secondIndex++){
				System.out.print("Entering scores for student "+index+": ");
				String studentName = input.nextLine();
				
				System.out.print("Enter score for subject "+secondIndex+": ");
				int studentScore = input.nextInt();

				//while (studentScore > 0 && <= 100){
				scoresArray[index-1][secondIndex-1] = studentScore;

				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully\n");

				total[index-1] += scoresArray[index-1][secondIndex-1];
				average[index-1] = total[index-1]/numberOfSubjects;

				int highest = scoresArray[index-1][secondIndex-1];
				if (scoresArray[index-1][secondIndex-1] > highest){
					highest = scoresArray[index-1][secondIndex-1];
				}
				int lowest = scoresArray[index-1][secondIndex-1];
				if (scoresArray[index-1][secondIndex-1] < lowest){
					lowest = scoresArray[index-1][secondIndex-1];
				}
			
		//System.out.print("Highest scoring student is: Student "+index+" scoring "+highest);
					
			}
		}		
	
		return scoresArray;	
	}

	
			

}
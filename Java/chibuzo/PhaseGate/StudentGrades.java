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

		String[] studentsArray = new String[numberOfStudents];
		int[][] scoresArray = new int[studentsArray.length][numberOfSubjects];
		
		
		int[] total = new int[numberOfStudents];
		int[] average = new int[numberOfStudents];

		for (int index = 1; index <= studentsArray.length; index++){
			for (int secondIndex = 1; secondIndex <= numberOfSubjects; secondIndex++){
				
				System.out.println("Entering scores for student "+index);
				
				String student = input.nextLine();
				
				System.out.println("Enter score for subject "+secondIndex);

				int studentScore = input.nextInt();
			
				scoresArray[index-1][secondIndex-1] = studentScore;

				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>\n");
				System.out.println("Saved successfully");

				total[index-1] += scoresArray[index-1][secondIndex-1];
				average[index-1] = total[index-1]/numberOfSubjects;
				
				System.out.println("========================================================");
			
				System.out.print("STUDENT\t\tSUB1\tSUB2\tSUB3\tTOT\tAVE\tPOS\n");

			System.out.println("Student "+index+"\t"+scoresArray[index-1][secondIndex-1]+"\t");




			int highest = average[index-1];
			if (average[index-1] > highest)
				highest = average[index-1];
			
			
			}

			
			
					
		}
		
	
		return scoresArray;
	
	}

}
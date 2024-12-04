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
		scoresArray = getScores(numberOfStudents, numberOfSubjects, scoresArray, input);	
		int[] total = getTotal(scoresArray, numberOfStudents, numberOfSubjects);
		int[] average = getAverage(total, numberOfStudents, numberOfSubjects);
		int[] positions = getPosition(total, numberOfStudents, numberOfSubjects);
		int highest =  getHighestScorer(scoresArray, numberOfStudents, numberOfSubjects);
		int lowest =  getHighestScorer(scoresArray, numberOfStudents, numberOfSubjects);

		printTable(scoresArray, total, average, numberOfStudents, numberOfSubjects, positions);
		

	}
	public static int[][] getScores(int numberOfStudents,  int numberOfSubjects, int[][] scoresArray, Scanner input){
		scoresArray = new int[numberOfStudents][numberOfSubjects];
		//int[] total = new int[numberOfStudents];
		//int[] average = new int[numberOfStudents];
		
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
			
		//System.out.print("Highest scoring student is: Student "+index+" scoring "+highest);
					
			}
		}
		//System.out.print(Arrays.deepToString(scoresArray));
		
	
		return scoresArray;	
	}

	

	public static int[] getTotal(int[][] scoresArray, int numberOfStudents, int numberOfSubjects){
		int[] total = new int[numberOfStudents];
		for (int index = 0; index < numberOfStudents; index++){
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				total[index] += scoresArray[index][secondIndex];
			
				//average[index-1] = total[index-1]/numberOfSubjects;
			}			
		}
		//System.out.print(Arrays.toString(total));	
		return total;
	}

	public static int[] getAverage(int[] total, int numberOfStudents, int numberOfSubjects){
		int[] average = new int[numberOfStudents];
		for (int index = 0; index < numberOfStudents; index++){
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				average[index] = total[index]/numberOfSubjects;
			}			
		} 
		//System.out.print(Arrays.toString(average));	
		return average;
	}

	public static int[] getPosition(int[] total, int numberOfStudents, int numberOfSubjects){
		int[] positions = new int[numberOfStudents];
		
		for (int index = 0; index < numberOfStudents; index++){
			positions[index] = (numberOfStudents - index) / numberOfStudents;
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				int highest = total[index];
				if (total[index] > highest){
					highest = total[index];
					positions[index] = (numberOfStudents - index) / numberOfStudents;
				} 
				
			}
		}
		
		return positions;
	}

	public static void printTable(int[][] scoresArray, int[] total, int[] average, int numberOfStudents, int numberOfSubjects, int[] positions){
		System.out.print("=====================================================================================\n");
		System.out.print("STUDENT\t");
		for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
			System.out.print("SUB" + (secondIndex+1) +"\t");		
		}
		System.out.print("TOT\tAVE\tPOS");
		System.out.println();
		System.out.print("=====================================================================================\n");
		
		for (int index = 0; index < numberOfStudents; index++){
			System.out.print("Student " + (index+1)+" ");
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				System.out.print(scoresArray[index][secondIndex]+"\t");
			}
			System.out.print(total[index] + "\t" + average[index]+"\t"+positions[index]);
			System.out.println();
			
		}
		System.out.print("=====================================================================================\n");
		System.out.print("=====================================================================================\n");



	}

	public static int getHighestScorer(int[][] scoresArray, int numberOfStudents, int numberOfSubjects){
		int highest = 0;
		for (int index = 0; index < numberOfStudents; index++){
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				highest = scoresArray[index][secondIndex];
				if (scoresArray[index][secondIndex] > highest)
					highest = scoresArray[index][secondIndex];
			}
		}
		return highest;
	}
	
	public static int getLowestScorer(int[][] scoresArray, int numberOfStudents, int numberOfSubjects){
		int lowest = 0;
		for (int index = 0; index < numberOfStudents; index++){
			for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++){
				lowest = scoresArray[index][secondIndex];
				if (scoresArray[index][secondIndex] < lowest)
					lowest = scoresArray[index][secondIndex];				
			}
		}
		
		return lowest;
	}

	
}
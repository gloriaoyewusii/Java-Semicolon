import java.util.Scanner;
public class LowestScores{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of students: ");
	int numberOfStudents = input.nextInt();
System.out.println("Enter the names of the students: ");
	String name1 = input.nextLine();
	String name2 = input.nextLine();
	String name3 = input.nextLine();
	String name4 = input.nextLine();
	String name5 = input.nextLine();
	String name6 = input.nextLine();
System.out.println("Enter the score of the students: ");
	int score1 = input.nextInt();
	int score2 = input.nextInt();
	int score3 = input.nextInt();
	int score4 = input.nextInt();
	int score5 = input.nextInt();
	int score6 = input.nextInt();
	String studentSecondLowestScore = input.nextLine();
	String lowest = input.nextLine();
	String secondLowest = input.nextLine();
;

	if(score1 < score2 && score1 < score3 && score1 < score4 && score1 < score5){
		lowest = name1;
	}
	else if(score2 < score1 && score2 < score3 && score2 < score4 && score2 < score5){
		lowest = name2;
	}
	else if(score3 < score1 && score3 < score2 && score3 < score4 && score3 < score5){
		lowest = name3;
	}
	else if(score4 < score1 && score4 < score3 && score4 < score2 && score4 < score5){
		lowest = name4;
	}
	else if(score5 < score1 && score5 < score3 && score5 < score2 && score5 < score4){
		lowest = name5;
	}
	else{
		System.out.println("They are all equal");
	}
	System.out.printf("The lowest score is for %s%n", lowest);
	System.out.print("The second lowest score is for: ");
	

	//String nameOfStudentWithLowestScore = input.nextLine();
//System.out.printf("The lowest score is: %d%nThe second-lowest score is %df", nameOfStudentWithLowestScore, studentSecondLowestScore);
	}
}
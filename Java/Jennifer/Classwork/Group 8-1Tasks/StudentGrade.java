import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter your mark: ");
	int studentMarks = input.nextInt();

	System.out.println("Enter attendance marks: ");
	int attendanceMarks = input.nextInt();

	int totalScore = studentMarks + attendanceMarks;
	System.out.println("Student total score is: "+totalScore);

	System.out.println("If total score falls within the following range, enter a number between 1 and 7. \n1. 0 - 39\n2. 40 - 49\n3. 50 - 59\n4. 60 - 69\n5. 70 - 79\n6. 80 - 89\n7. 90 - 100");
	int studentGrade = input.nextInt();
	
	
	switch (studentGrade){
		case 1: System.out.print("Student grade is F");
		break;
		case 2: System.out.print("Student grade is E");
		break;
		case 3: System.out.print("Student grade is D");
		break;
		case 4: System.out.print("Student grade is C");
		break;
		case 5: System.out.print("Student grade is B");
		break;
		case 6: System.out.print("Student grade is A");
		break;
		case 7: System.out.print("Student grade is A+");
		break;
		

	}
	}
}
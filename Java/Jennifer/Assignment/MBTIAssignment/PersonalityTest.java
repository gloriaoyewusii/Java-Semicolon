import java.util.Arrays;
import java.util.Scanner;
public class PersonalityTest{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int extraCounter = 0;
	int introCounter = 0;
	int sensingCounter = 0;
	int intuitiveCounter = 0;
	int thinkingCounter = 0;
	int feelingCounter = 0;
	int judgingCounter = 0;
	int perceptiveCounter = 0;
	
	String[] arrayOne = new String[2];
	arrayOne [0] = "1. A. expend energy, enjoy groups";
	arrayOne [1] = "B. conserve energy, enjoy one-on-one";
	
	String[] arrayTwo = new String[2];
	arrayTwo[0] = "2. A. interpret literally";
	arrayTwo [1] = "B. look for meaning and possibilities";
		
	String[] arrayThree = new String[2];
	arrayThree [0] = "3. A. logical, thinking, questioning";
	arrayThree [1] = "B. empathetic, feeling, accomodating";
	
	String[] arrayFour = new String[2];
	arrayFour [0] = "4. A. organised, orderly";
	arrayFour [1] = "B. flexible, adaptable";
	
	String[] arrayFive = new String[2];
	arrayFive [0] = "5. A. more outgoing, think out loud";
	arrayFive [1] = "B. more reserved, think to yourself";
	
	String[] arraySix = new String[2];
	arraySix [0] = "6. A. practical, realistic, experiential";
	arraySix [1] = "B. imaginative, innovative, theoretical";
	
	String[] arraySeven = new String[2];
	arraySeven [0] = "7. A. candid, straight forward, frank";
	arraySeven [1] = "B. tactful, kind, encouraging";
	
	String[] arrayEight = new String[2];
	arrayEight [0] = "8. A. plan, schedule";
	arrayEight [1] = "B. unplanned, spontaneous";
	
	String[] arrayNine = new String[2];
	arrayNine [0] = "9. A. seek many tasks, public activities, interaction with others";
	arrayNine [1] = "B. seek privatae, solitary activities with quiet to concentrate";

	String[] arrayTen = new String[2];
	arrayTen [0] = "10. A. standard, usual, conventional";
	arrayTen [1] = "B. different, novel, unique";
	
	String[] arrayEleven = new String[2];
	arrayEleven [0] = "11. A. firm, tend to criticise, hold the line";
	arrayEleven [1] = "B. gentle, tend to appreciate, conciliate";

	String[] arrayTwelve = new String[2];
	arrayTwelve [0] = "12. A. regulated, structured";
	arrayTwelve [1] = "B. easy-going, live and let live";

	String[] arrayThirteen = new String[2];
	arrayThirteen [0] = "13. A. external, communicative, express yourself";
	arrayThirteen [1] = "B. internal, reticent, keept to yourself";
	
	String[] arrayFourteen = new String[2];
	arrayFourteen [0] = "14. A. focus on here-and-now";
	arrayFourteen [1] = "B. look to the future, gloabal perspective, big picture";

	String[] arrayFifteen = new String[2];
	arrayFifteen [0] = "15. A. tough-minded, just";
	arrayFifteen [1] = "B. tender-hearted, merciful";
	
	String[] arraySixteen = new String[2];
	arraySixteen [0] = "16. A. preparation, plan ahead";
	arraySixteen [1] = "B. go with the flow, adapt as you go";
	
	String[] arraySeventeen = new String[2];
	arraySeventeen [0] = "17. A. active, initiate";
	arraySeventeen [1] = "B. reflective, deliberate";
	
	String[] arrayEighteen = new String[2];
	arrayEighteen [0] = "18. A. facts, things, what is";
	arrayEighteen [1] = "B. ideas, dreams, what could be, philosophical";
	
	String[] arrayNineteen = new String[2];
	arrayNineteen [0] = "19. A. mattter of fact, issue-oriented";
	arrayNineteen [1] = "B. sensitive, people-oriented, compassionated";
	
	String[] arrayTwenty = new String[2];
	arrayTwenty [0] = "20. A. control, govern";
	arrayTwenty [1] = "B. latitude, freedom";

	
	System.out.print("What is your name: ");
	String name = input.nextLine();	

	System.out.println(arrayOne[0]);
	System.out.println(arrayOne[1]);
	String userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		extraCounter = extraCounter + 1;
	else if (userAnswer.equals("B"))
		introCounter = introCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayOne[0]);
		System.out.println(arrayOne[1]);
		userAnswer = input.nextLine();
	}
	
	System.out.println(arrayTwo[0]);
	System.out.println(arrayTwo[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		sensingCounter = sensingCounter + 1;
	else if (userAnswer.equals("B"))
		intuitiveCounter = intuitiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayTwo[0]);
		System.out.println(arrayTwo[1]);
		userAnswer = input.nextLine();
	}
	
	System.out.println(arrayThree[0]);
	System.out.println(arrayThree[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		thinkingCounter = thinkingCounter + 1;
	else if (userAnswer.equals("B"))
		feelingCounter = feelingCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayThree[0]);
		System.out.println(arrayThree[1]);
		userAnswer = input.nextLine();
	}
		

	System.out.println(arrayFour[0]);
	System.out.println(arrayFour[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		judgingCounter = judgingCounter + 1;
	else if (userAnswer.equals("B"))
		perceptiveCounter = perceptiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayFour[0]);
		System.out.println(arrayFour[1]);
		userAnswer = input.nextLine();
	}
	
	System.out.println(arrayFive[0]);
	System.out.println(arrayFive[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		extraCounter = extraCounter + 1;
	else if (userAnswer.equals("B"))
		introCounter = introCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");	
		System.out.println(arrayFive[0]);
		System.out.println(arrayFive[1]);
		userAnswer = input.nextLine();
	}

	System.out.println(arraySix[0]);
	System.out.println(arraySix[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		sensingCounter = sensingCounter + 1;
	else if (userAnswer.equals("B"))
		intuitiveCounter = intuitiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arraySix[0]);
		System.out.println(arraySix[1]);
		userAnswer = input.nextLine();
	}
		

	System.out.println(arraySeven[0]);
	System.out.println(arraySeven[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		thinkingCounter = thinkingCounter + 1;
	else if (userAnswer.equals("B"))
		feelingCounter = feelingCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arraySeven[0]);
		System.out.println(arraySeven[1]);
		userAnswer = input.nextLine();
	}
	

	System.out.println(arrayEight[0]);
	System.out.println(arrayEight[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		judgingCounter = judgingCounter + 1;
	else if (userAnswer.equals("B"))
		perceptiveCounter = perceptiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))) {
		System.out.println("Expected A or B");
		System.out.println(arrayEight[0]);
		System.out.println(arrayEight[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayNine[0]);
	System.out.println(arrayNine[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		extraCounter = extraCounter + 1;
	else if (userAnswer.equals("B"))
		introCounter = introCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))) {
		System.out.println("Expected A or B");
		System.out.println(arrayNine[0]);
		System.out.println(arrayNine[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayTen[0]);
	System.out.println(arrayTen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		sensingCounter = sensingCounter + 1;
	else if (userAnswer.equals("B"))
		intuitiveCounter = intuitiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayTen[0]);
		System.out.println(arrayTen[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayEleven[0]);
	System.out.println(arrayEleven[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		thinkingCounter = thinkingCounter + 1;
	else if (userAnswer.equals("B"))
		feelingCounter = feelingCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayEleven[0]);
		System.out.println(arrayEleven[1]);
		userAnswer = input.nextLine();
	}
	

	System.out.println(arrayTwelve[0]);
	System.out.println(arrayTwelve[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		judgingCounter = judgingCounter + 1;
	else if (userAnswer.equals("B"))
		perceptiveCounter = perceptiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayTwelve[0]);
		System.out.println(arrayTwelve[1]);
		userAnswer = input.nextLine();
	}
		

	System.out.println(arrayThirteen[0]);
	System.out.println(arrayThirteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		extraCounter = extraCounter + 1;
	else if (userAnswer.equals("B"))
		introCounter = introCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayThirteen[0]);
		System.out.println(arrayThirteen[1]);
		userAnswer = input.nextLine();
	}


	System.out.println(arrayFourteen[0]);
	System.out.println(arrayFourteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		sensingCounter = sensingCounter + 1;
	else if (userAnswer.equals("B"))
		intuitiveCounter = intuitiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayFourteen[0]);
		System.out.println(arrayFourteen[1]);
		userAnswer = input.nextLine();
	}
		
		
	System.out.println(arrayFifteen[0]);
	System.out.println(arrayFifteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		thinkingCounter = thinkingCounter + 1;
	else if (userAnswer.equals("B"))
		feelingCounter = feelingCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayFifteen[0]);
		System.out.println(arrayFifteen[1]);
		userAnswer = input.nextLine();
	}

	System.out.println(arraySixteen[0]);
	System.out.println(arraySixteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		judgingCounter = judgingCounter + 1;
	else if (userAnswer.equals("B"))
		perceptiveCounter = perceptiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arraySixteen[0]);
		System.out.println(arraySixteen[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arraySeventeen[0]);
	System.out.println(arraySeventeen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		extraCounter = extraCounter + 1;
	else if (userAnswer.equals("B"))
		introCounter = introCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arraySeventeen[0]);
		System.out.println(arraySeventeen[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayEighteen[0]);
	System.out.println(arrayEighteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		sensingCounter = sensingCounter + 1;
	else if (userAnswer.equals("B"))
		intuitiveCounter = intuitiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayEighteen[0]);
		System.out.println(arrayEighteen[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayNineteen[0]);
	System.out.println(arrayNineteen[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		thinkingCounter = thinkingCounter + 1;
	else if (userAnswer.equals("B"))
		feelingCounter = feelingCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayNineteen[0]);
		System.out.println(arrayNineteen[1]);
		userAnswer = input.nextLine();
	}
		
	System.out.println(arrayTwenty[0]);
	System.out.println(arrayTwenty[1]);
	userAnswer = input.nextLine();
	if (userAnswer.equals("A"))
		judgingCounter = judgingCounter + 1;
	else if (userAnswer.equals("B"))
		perceptiveCounter = perceptiveCounter + 1;
	while (!userAnswer.equals("A") && (!userAnswer.equals("B"))){
		System.out.println("Expected A or B");
		System.out.println(arrayTwenty[0]);
		System.out.println(arrayTwenty[1]);
		userAnswer = input.nextLine();
	}
	
		

	System.out.println("Number of selected extrovert traits are: "+extraCounter);	
	System.out.println("Number of selected introvert traits are: "+introCounter);	
	System.out.println("Number of selected sensing traits are: "+sensingCounter);
	System.out.println("Number of selected intuitive traits are: "+intuitiveCounter);
	System.out.println("Number of selected thinking traits are: "+thinkingCounter);	
	System.out.println("Number of selected feeling traits are: "+feelingCounter);
	System.out.println("Number of selected judging traits are: "+judgingCounter);
	System.out.println("Number of selected perceptive traits are: "+perceptiveCounter);


	if (extraCounter > introCounter)
		System.out.print("E");
	else if (introCounter > extraCounter)
		System.out.print("I");
	if (sensingCounter > intuitiveCounter)
		System.out.print("S");
	else if (intuitiveCounter > sensingCounter)
		System.out.print("N");
	if (thinkingCounter > feelingCounter)
		System.out.print("T");
	else if (feelingCounter > thinkingCounter)
		System.out.print("F");
	if (judgingCounter > perceptiveCounter)
		System.out.print("J");
	else if(perceptiveCounter > judgingCounter)
		System.out.print("P");
	

	}
}

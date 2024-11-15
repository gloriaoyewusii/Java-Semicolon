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


	
	String personalityType = "";

	if (introCounter > extraCounter && intuitiveCounter > sensingCounter && thinkingCounter > feelingCounter && judgingCounter > perceptiveCounter) {
	personalityType = "INTJ";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (N)Intuitive (T) Thinking (J)Judging");
	System.out.println("THE ARCHITECT\nHaving the INTJ personality type shows that you are a curious individual, inquisitive for more and more knowledge. As an individual with an INTJ personality type also proves that you prioritise creativity and are limitless in your creative depths. Additionally, you would notice you value consistent growth and progress in your patterns of thinking. INTJs tend to structure their activities, and want to take on their plans independently without depending on other people's expectations or ideas\nOn the other hand, INTJs can become blinded to other people's reasons or inputs, thus displaying arrogance.");
	}	
	if (introCounter > extraCounter && intuitiveCounter > sensingCounter && thinkingCounter > feelingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "INTP";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (N)Intuitive (T) Thinking (P)Perceptive");
	System.out.println("THE LOGICIAN\nYou focus your attention on your inner world and you're largely introspective. As such INTPs have a small social circle. Despite the breadth of your social circle as an INTP, you tend to keep a select group  of poeple close to you. As the name implies, you are introverted, intuitive, thinking and perceiving.You are largely logical and weigh things from an objective perspective. A major strength of being an INTP is your independence, loyalty and affection for those you choose to be in your circle. On the other hand, major weaknesses of the INTP personality trait is being difficult to get to know, in addition to having trouble showing expressions of your  feelings.");	
	}
	if (extraCounter > introCounter && intuitiveCounter > sensingCounter && thinkingCounter > feelingCounter && judgingCounter > perceptiveCounter) {
	personalityType = "ENTJ";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (N)Intuitive (T) Thinking (J)Judging");
	System.out.println("THE COMMANDER\nAn ENTJ personality trait is reflective of your person as being extraverted, intuitive, thinking and judging. This trait suggests that you are not just capable of being decisive, but also love momentum and accomplishment. You act on your plans when you decide, so you do not take long or hesitate to take on the right strides towards your goals, visions and accomplishments. You struggle with being patient sometimes and can be stubborn if care is not taken. More strengths allude to you being focused on the future, great at planning and with people. However, weak points as an ENTJ suggests you have trouble focusing on details, trouble paying attention to other people's emotions and are quite prone to hiding your emotions and sentiments.");
	}
	if (extraCounter > introCounter && intuitiveCounter > sensingCounter && thinkingCounter > feelingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "ENTP";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (N)Intuitive (T) Thinking (P)Perceptive");
	System.out.println("THE DEBATER\nAn ENTP personality trait is reflective of your person as being extraverted, intuitive, thinking and perceptive. This trait suggests that you are audacious, and are not afraid to disagree with people or over anything. You are verbally at ease with constructing solid arguments against opponents and even personal views that expand your views or horizon about yourself. Your idea of fun lies more towards controversies and as such, you have within you an immense desire to break rules, test boundaries and disconform to norms and social standards. While this can be beneficial on several occasions, contrarianviews and perspectives are not deemed of essence in every situation. Therefore, a major weakness of the ENTP trait is that you tend to struggle to keep, nurture and grow deeper friendships and relationships, or even achieve your professional goals. Nevertheless, more strengths allude to you being a quick thinker, original, an excellent brainstormer and knowledgeable.");
	}
	if (introCounter > extraCounter  && intuitiveCounter > sensingCounter && feelingCounter > thinkingCounter  && judgingCounter > perceptiveCounter) {
	personalityType = "INFJ";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (N)Intuitive (F) Feeling (J)Judging");
	System.out.println("THE ADVOCATE\nAn INFJ personality trait tends to approach life with deep thoughtfulness and imagination. Your inner vision, personal values, and a quiet, principled version of humanism reflects your compassionate self and how natural of helper you are. In additon, you're high on being organised as well as idealism. You do not just dream away your ideals, you put in the work to make it come to fruition.");	
	}
	if (introCounter > extraCounter  && intuitiveCounter > sensingCounter && feelingCounter > thinkingCounter  && perceptiveCounter > judgingCounter) {
	personalityType = "Trait is: INFP";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (N)Intuitive (F) Feeling (P)Perceptive");
	System.out.println("THE MEDIATOR\nAn INFP personality trait tends to approach life from a quiet and imaginative perspective whilst also being open to new experiences. What sets you apart is your compassionate and creative pattern to the things you do. In additon, you long for meaningful relationships where you connect on a deeper level with people. The thirst for connection is what makes you empathic, which is one of your greatest qualities as an INFP.");	
	}
	if (extraCounter > introCounter && intuitiveCounter > sensingCounter && feelingCounter > thinkingCounter  && judgingCounter > perceptiveCounter) {
	personalityType = "ENFJ";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (N)Intuitive (F) Feeling (J)Judging");
	System.out.println("THE PROTAGONIST\nIf you feel called to a higher purpose in life, and rarely step back from opportunities to do the right thing, despite limiting surrounding factors, then the ENFJ trait is reflective of your personality.");
	}
	if (extraCounter > introCounter  && intuitiveCounter > sensingCounter && feelingCounter > thinkingCounter  && perceptiveCounter > judgingCounter) {
	personalityType = "ENFP";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (N)Intuitive (F) Feeling (P)Perceptive");
	System.out.println("THE CAMPAIGNER\nIf you feel called to a higher purpose in life, and rarely step back from opportunities to do the right thing, despite limiting surrounding factors, then the ENFJ trait is reflective of your personality.");
	}
	if (extraCounter > introCounter  && sensingCounter > intuitiveCounter && feelingCounter > thinkingCounter  && judgingCounter > perceptiveCounter) {
	personalityType = "ESFJ";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (S)Sensing (F) Feeling (J)Judging");
	System.out.println("THE CONSUL\nAs an ESFJ, you are dutiful and go out of your way to provide assistance to people around you. Therefore, your core strengths are your zeal for showing care and compassion to others.");
	}
	if (extraCounter > introCounter  && sensingCounter > intuitiveCounter && thinkingCounter > feelingCounter && judgingCounter > perceptiveCounter) {
	personalityType = "ESTJ";
	System.out.println(personalityType);
	System.out.println("\n(E)Extraverted (S)Sensing (T) Thinking (J)Judging");
	System.out.println("THE EXECUTIVE\nAs an ESTJ, You are an embodiment of someone with a drive for excellence and efficiency. You are organised and manage your self expertly with results to show for it. ");
	}
	if (introCounter > extraCounter  && sensingCounter > intuitiveCounter && feelingCounter > thinkingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "ISFP";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (S)Sensing (F) Feeling (P)Perceptive");
	System.out.println("THE ADVENTURER\nAs an ISFP, You embody the creative aspects of you. You show yourself to the world through your creative lenses. You are therefore an epitome of creativity.");
	}
	if (introCounter > extraCounter  && sensingCounter > intuitiveCounter && thinkingCounter > feelingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "ISTP";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (S)Sensing (T) Thiniking (P)Perceptive");
	System.out.println("THE VIRTUOSO\nAs an ISTP, You are an individualist. You typically are independent and go through life's processes as a goal oriented person without the influence of external forces.");
	}
	if (introCounter > extraCounter  && sensingCounter > intuitiveCounter && feelingCounter > thinkingCounter && judgingCounter > perceptiveCounter) {
	personalityType = "ISFJ";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (S)Sensing (F) Feeling (J)Judging");
	System.out.println("THE DEFENDER\nAs an ISFJ, You are largely responsible and dutiful. In additon, you spread warmth every where you go.");
	}
	if (introCounter > extraCounter  && sensingCounter > intuitiveCounter && thinkingCounter > feelingCounter && judgingCounter > perceptiveCounter) {
	personalityType = "ISTJ";
	System.out.println(personalityType);
	System.out.println("\n(I)Introverted (S)Sensing (T) Thinking (J)Judging");
	System.out.println("THE LOGISTICIAN\nAs an ISTJ, You have a logical approach to life and are very composed in your behaviour.");
	}
	if (extraCounter > introCounter  && sensingCounter > intuitiveCounter && feelingCounter > thinkingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "ESFP";
	System.out.println(personalityType);
	System.out.println("\n(E)Extroverted (S)Sensing (F) Feeling (P)Perceptive");
	System.out.println("THE ENTREPRENEUR\nAs an ESFP, you love vibrant experiences and enhoy engaging with others.");
	}
	if (extraCounter > introCounter  && sensingCounter > intuitiveCounter && thinkingCounter > feelingCounter && perceptiveCounter > judgingCounter) {
	personalityType = "ESTP";
	System.out.println(personalityType);
	System.out.println("\n(E)Extroverted (S)Sensing (T) Thinking (P)Perceptive");
	System.out.println("THE ENTERTAINER\nAs an ESTP, you re socially responsible, and are thoughtful in a very deep manner.");
	}

	
	}
}

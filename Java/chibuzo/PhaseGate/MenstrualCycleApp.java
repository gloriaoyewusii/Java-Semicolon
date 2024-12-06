import java.util.Scanner;
public class MenstrualCycleApp{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the Menstrual Cycle App, <3 \nPlease enter your name: ");
		String userName = input.nextLine();

		System.out.println("Hello "+userName+", enter the start date of your menstrual cycle in the previous month: ");
		int previousStartDate = input.nextInt();

		System.out.println("Enter the start date of your current menstrual cycle: ");
		int currentStartDate = input.nextInt();

		System.out.print("Enter the end date of your menstrual cycle: ");
		int endDate = input.nextInt();

		int menstrualCycle = getMenstrualCycle(previousStartDate, currentStartDate, endDate);
		int ovulationDay =  getOvulationPhase(menstrualCycle);
		int numberOfSafePeriodDays = getNumberOfSafeDays(menstrualCycle);
		int safePeriodDay = getSafePeriodPhase(menstrualCycle, numberOfSafePeriodDays);
	}
	
	
	public static int getMenstrualCycle(int previousStartDate, int currentStartDate, int endDate){
		
		int menstrualCycle = 1;

		int counter = previousStartDate; 

		while (counter < currentStartDate) {
			menstrualCycle += 1;
			counter++;
			
		}
		System.out.print("Your monthly cycle runs for: "+menstrualCycle+" days\n\nYour menstrual cycle is also known as your flow date.It is the time that runs from the first day of your menstrual period until the first day of your next menstrual period.The average length of a menstrual cycle is 28 days.However, a cycle can range in length from 21 days to about 35 days and still be normal.\n");

		return menstrualCycle;



	}


	public static int getOvulationPhase(int menstrualCycle){
		
		int ovulationDay = (menstrualCycle / 2);
		if (ovulationDay <= 14)
			System.out.print("\nYour ovulation commences on day "+ovulationDay+" of your cycle.\n\nFor your "+menstrualCycle+" day menstrual cycle, ovulation typically occurs around day 12 - 14.");
		else if (ovulationDay >= 15)
			System.out.print("\nYour ovulation commences on day "+ovulationDay+" of your cycle.\n\nFor your "+menstrualCycle+" day menstrual cycle, ovulation typically occurs around day 15 - 18.");
		return ovulationDay;

	}
	public static int getNumberOfSafeDays(int menstrualCycle){
		int numberOfSafePeriodDays = menstrualCycle - 19;
		return numberOfSafePeriodDays;
	}


	public static int getSafePeriodPhase(int menstrualCycle, int numberOfSafePeriodDays){
		
		int safePeriodDay = menstrualCycle - numberOfSafePeriodDays;
		System.out.print("\n\nYour have "+numberOfSafePeriodDays+" safe days in your menstrual cycle.\n\nYour safe period commences on day "+safePeriodDay+" of your menstrual cycle.");
		return safePeriodDay;
	}




}
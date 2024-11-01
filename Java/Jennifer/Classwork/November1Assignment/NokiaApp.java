import java.util.Scanner;
public class NokiaApp {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("List of menu functions \n1. Phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminder\n11. Clock\n12. Profiles\n13. SIM services");
	int selection = input.nextInt();
	
	switch (selection){
	
	case 1:
	System.out.print("Enter: \n1. To search\n2. To service numbers\n3. To add a name\n4. To erase\n5. To edit\n6. To assign tone\n7. To send b'card\n8. To get options\n9. To speed dial\n10. To voice tag");	
		int phoneBookMenus = input.nextInt();
		switch (phoneBookMenus){
			case 1: System.out.println("Search");
			break;
			case 2: System.out.println("Service Nos");
			break;
			case 3: System.out.println("Add name");
			break;
			case 4: System.out.println("Erase");
			break;
			case 5:	System.out.print("Edit");
			break;
			case 6: System.out.print("Assign tone");
			break;
			case 7: System.out.print("Send b'card");
			break;
			case 8: System.out.println("Options\n\t1. Type of view\n\t2. Memory status");
				int options = input.nextInt();
					switch (options){
						case 1: System.out.println("1. Type of view");
						break;
						case 2: System.out.println("2. Memory status");
						break;
					}
			break;
			case 9: System.out.println("Speed dials");
			break;
			case 10: System.out.println("Voice tags");
			break;

		}
	break;
	case 2:
	System.out.print("Enter: \n1. To write messages\n2. To access your inbox\n3. To access your outbox\n4. For picture messages\n5. To access templates\n6. For Smileys\n7. To message settings\n8. To get information services\n9. To access your voice mailbox number\n10. To access the service command editor");	
		int messageMenus = input.nextInt();
		switch (messageMenus){
			case 1: System.out.println("Write messages");
			break;
			case 2: System.out.println("Inbox");
			break;
			case 3: System.out.println("Outbox");
			break;
			case 4: System.out.println("Picture messages");
			break;
			case 5:	System.out.print("Templates");
			break;
			case 6: System.out.print("Smileys");
			break;
			case 7: System.out.print("Messages\n1. Set 1\n\t1.  Message centre number\n\t2. Message sent as\n\t3. Message validity\n2. Common\n\t1. Delivery reports\n\t2. Reply via same centre\n\t3. Character support");
			int messageSettings = input.nextInt();
			switch (messageSettings){
				case 1: System.out.println("Set 1");
				int set1 = input.nextInt();
					switch (set1){
						case 1: System.out.println("Message centre number");
						break;
						case 2: System.out.println("Message sent as");
						break;
						case 3: 
						System.out.println("Message validity");
						break;
					}
				break;
				case 2: System.out.println("Common");
				int common = input.nextInt();
					switch (common){
						case 1: System.out.println("Delivery reports");
						break;
						case 2: System.out.println("Reply via same centre");
						break;
						case 3: System.out.println("Character support");
						break;	
					}
				break;	
			}
			break;
			case 8: System.out.println("Info service");
			break;
			case 9: System.out.println("Voice mailbox number");
			break;
			case 10: System.out.println("Service command editor");
			break;

		}
	break;
	case 3: System.out.println("Chat");
	break;
	case 4: System.out.println("Enter: \n1. Call register\n\t1. Missed calls\n\t2. Received calls\n\t3. Dialled numbers\n\t4. Erase recent call lists\n\t5. Show call duration\n\t6. Show call costs\n\t7. Call cost settings\n\t8. Prepaid credit");
	int callRegister = input.nextInt();
	switch (callRegister){
		case 1: System.out.println("Missed calls");
		break;
		case 2: System.out.println("Received calls");
		break;
		case 3: System.out.println("Dialled numbers");
		break;
		case 4: System.out.println("Erase recent call lists");
		break;
		case 5:  System.out.println("Show call duration\n\t1. Last call duration\n\t2. All calls' duration\n\t3. Received calls' duration\n\t4. Dialled calls' duration\n\t5. Clear timers");
		int showCallDuration = input.nextInt();
			switch (showCallDuration){
				case 1: System.out.println("Last call duration");
				break;
				case 2: System.out.println("All calls' duration");
				break;
				case 3: System.out.println("Received calls' duration");
				break;
				case 4: System.out.println("Dialled calls' duration");
				break;
				case 5: System.out.println("Clear timers");
				break;
			}
		break;
		case 6: System.out.println("Show call costs\n\t1. Last call cost\n\t2. All calls' cost\n\t3. Clear timers");
		int showCallCosts = input.nextInt();
			switch (showCallCosts){
				case 1: System.out.println("Last call cost");
				break;
				case 2: System.out.println("All calls' cost");
				break;
				case 3: System.out.println("Clear timers");
				break;
			}
		break;
		case 7: System.out.println("Call cost settings\n\t1. Call cost limit\n\t2. Show costs in");
		int callCostSettings = input.nextInt();
			switch (callCostSettings){
				case 1: System.out.print("Call cost limit");
				break;
				case 2: System.out.println("Show costs in");
				break;
			}
		break;
		case 8: System.out.println("Prepaid credit");
		break;
		}

	break;
	case 5: System.out.println("Tones\n\t1. Ringing tone\n\t2. Ringing volume\n\t3. Incoming call alert\n\t4. Composer\n\t5. Message alert tone\n\t6. Keypad tones\n\t7. Warning and game tones\n\t8. Vibrating alert\n\t9. Screen saver");
	int tones = input.nextInt();
		switch (tones){
			case 1: System.out.println("Ringing tone");
			break;
			case 2: System.out.println("Ringing volume");
			break;
			case 3: System.out.println("Incoming call alert");
			break;
			case 4: System.out.println("Composer");
			break;
			case 5: System.out.println("Message alert tone");
			break;
			case 6: System.out.println("Keypad tones");
			break;
			case 7: System.out.println("Warning and game tones");
			break;
			case 8: System.out.println("Vibrating alert");
			break;
			case 9: System.out.println("Screen saver");
			break;
		}
	break;
	case 6: System.out.println("Settings\n\t1. Call settings\n\t2. Phone settings\n\t3. Security settings\n\t4. Restore factory settings");
	int settings = input.nextInt();
		switch (settings){
			case 1: System.out.println("Call settings\n\t1. Automatic redial\n\t2. Speed dialling\n\t3. Call waiting options\n\t4. Own number sending\n\t5. Phone line in use\n\t6. Automatic answer");
			int callSettings = input.nextInt();
				switch (callSettings){
					case 1: System.out.println("Automatic redial");
					break;
					case 2: System.out.println("Speed dialling");
					break;
					case 3: System.out.println("Call waiting options");
					break;
					case 4: System.out.println("Own number sending");
					break;
					case 5: System.out.println("Phone line in use");
					break;
					case 6: System.out.println("Automatic answer");
					break;
				}
			break;
			case 2: System.out.println("Phone settings\n\t1. Language\n\t2. Cell info display\n\t3. Welcome note\n\t4. Network selection\n\t5. Lights\n\t6. Confirm SIM service actions");
			int phoneSettings = input.nextInt();
				switch (phoneSettings){
					case 1: System.out.println("Language");
					break;
					case 2: System.out.println("Cell info display");
					break;
					case 3: System.out.println("Welcome note");
					break;
					case 4: System.out.println("Network selection");
					break;
					case 5: System.out.println("Lights");
					break;
					case 6: System.out.println("Confirm SIM service actions");
					break;
				}
			break;
			case 3: System.out.println("Security settings\n\t1. PIN code request\n\t2. Call barring service\n\t3. Fixed dialling\n\t4. Closed user group\n\t5. Phone security\n\t6. Change access codes");
			int securitySettings = input.nextInt();
				switch (securitySettings){
					case 1: System.out.println("PIN code request");
					break;
					case 2: System.out.println("Call barring service");
					break;
					case 3: System.out.println("Fixed dialling");
					break;
					case 4: System.out.println("Closed user group");
					break;
					case 5: System.out.println("Phone security");
					break;
					case 6: System.out.println("Change access codes");
					break;	
				}
			break;
			case 4: System.out.println("Restore factory settings");
			break;

		}
	break;
	case 7: System.out.println("Call divert");
	break;
	case 8: System.out.println("Games");
	break;
	case 9: System.out.println("Calculator");
	break;
	case 10: System.out.println("Reminders");
	break;
	case 11: System.out.println("Clock\n\t1. Alarm clock\n\t2. Clock settings\n\t3. Date setting\n\t4. Stopwatch\n\t5. Countdown timer\n\t6. Auto update of date and time");
	int clock = input.nextInt();
		switch (clock){
			case 1: System.out.println("Alarm clock");
			break;
			case 2: System.out.println("Clock settings");
			break;
			case 3: System.out.println("Date setting");
			break;
			case 4: System.out.println("Stopwatch");
			break;
			case 5: System.out.println("Countdown timer");
			break;
			case 6: System.out.println("Auto update of date and time");
			break;
		}
	break;
	case 12: System.out.println("Profiles");
	break;
	case 13: System.out.println("SIM services");
	break;	
	
	}			

	}
}
import java.util.Scanner;
public class PizzaApp{

	public static void main(String[] gloria){
		getPizzaFor(30);

	}



	public static int getPizzaFor(int numberOfGuests){
		int numberOfBoxes = 1;
		int price = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Number of people: \n");
		numberOfGuests = input.nextInt();

		System.out.println("Select your preferred pizza type:\n1. Sapa size\n2. Small money\n3. Big boys\n4. Odogwu\nSelection: ");
		int pizzaType = input.nextInt();
	
		switch (pizzaType) {

			case 1: System.out.println("Pizza type: Sapa size\n");
			break;
			case 2: System.out.println("Pizza type: Small money\n");
			break;
			case 3: System.out.println("Pizza type: Big boys\n");
			break;
			case 4: System.out.println("Pizza type: Odogwu\n");
			break;	
		}
		
		int[] numberOfSlices = {4, 6, 8, 12};
		int[] pricePerBox = {2500, 2900, 4000, 5200};
		int slicesToBuy = 1;
		int remainingSlices = 1;

		for (int index = 0; index < 1; index++) {			
			if (pizzaType == 1){
				slicesToBuy = numberOfGuests;

				numberOfBoxes = slicesToBuy / numberOfSlices[index];

				if (slicesToBuy % numberOfSlices[index] > 0)
					numberOfBoxes += 1;

				price = numberOfBoxes * pricePerBox[index];

				System.out.println("Number of boxes of pizza to buy: "+numberOfBoxes+" boxes\n");

				remainingSlices = (numberOfBoxes * numberOfSlices[index]) - numberOfGuests;

			} else if (pizzaType == 2){

				slicesToBuy = numberOfGuests;

				numberOfBoxes = slicesToBuy / numberOfSlices[index+1];

				if (slicesToBuy % numberOfSlices[index+1] > 0)
					numberOfBoxes += 1;

				price = numberOfBoxes * pricePerBox[index+1];

				System.out.println("Number of boxes of pizza to buy: "+numberOfBoxes+" boxes\n");

				remainingSlices = (numberOfBoxes * numberOfSlices[index+1]) - numberOfGuests;

			} else if (pizzaType == 3){

				slicesToBuy = numberOfGuests;

				numberOfBoxes = slicesToBuy / numberOfSlices[index+2];

				if (slicesToBuy % numberOfSlices[index+2] > 0)
					numberOfBoxes += 1;

				price = numberOfBoxes * pricePerBox[index+2];

				System.out.println("Number of boxes of pizza to buy: "+numberOfBoxes+" boxes\n");

				remainingSlices = (numberOfBoxes * numberOfSlices[index+2]) - numberOfGuests;

			} else if (pizzaType == 4){

				slicesToBuy = numberOfGuests;

				numberOfBoxes = slicesToBuy / numberOfSlices[index+3];

				if (slicesToBuy % numberOfSlices[index+3] > 0)
					numberOfBoxes += 1;

				price = numberOfBoxes * pricePerBox[index+3];

				System.out.println("Number of boxes of pizza to buy: "+numberOfBoxes+" boxes\n");

				remainingSlices = (numberOfBoxes * numberOfSlices[index+3]) - numberOfGuests;
			}

			
			System.out.println("Number left over slices after serving = "+remainingSlices+" slices\n");
		
			

		}
		System.out.print("Price = "+price);
		
		return price;

	}

	
	












	
}
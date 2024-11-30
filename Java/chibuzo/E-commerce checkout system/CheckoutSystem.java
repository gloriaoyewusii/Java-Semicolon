import java.util.Scanner;
public class CheckoutSystem{

	public static void main(String[] gloria){
		
		String[][] products = {{"Face cleanser", "Sunscreen", "Antiperspirant"}, {"4000", "4000", "3000"}};
		//display(products);
		view(products);
	}
	Scanner input = new Scanner(System.in);
	
	public static String[][] display(String[][] products){
		for (int index = 0; index <= products.length; index++){
			System.out.print(products[0][index]+" - "+products[1][index]);
			System.out.println(); 
		}
		return products;
	}
	
	public static int descriptionOf(int select){
		Scanner input = new Scanner(System.in);
		
		System.out.print("To know more about your desired product, press\n1. Face cleanser\n2. Sunscreen\n3. Anti-perspirant\n");
		select = input.nextInt();
		switch (select){
			case 1: System.out.print("The Semicolon Face cleanser is the perfect choice for you because it contains a blend of natural and specially sourced ingredients expedient for a perfect and healthy face.");
			break;
			case 2: System.out.print("The Semicolon sunscreen is the perfect choice for you because it serves to heal the effects of the harsh weather conditions on your skin thereby leaving it moist and healthy for any weather.");
			break;
			case 3: System.out.print("The Semicolon anti-perspirant is the perfect choice for you because it leaves you refreshened through out the day and more.");
			break;
		

		}
		return select;
	}
	
	public static int getFaceCleanserDecision(int buyFaceCleanser){
		Scanner input = new Scanner(System.in);

		int faceCleanserQuantity = 0;
		while (buyFaceCleanser == 1){
			
			System.out.print("Do you want to buy the Semicolon Face cleanser product?\n1. Yes\n2. No\n");
			buyFaceCleanser = input.nextInt();
			if (buyFaceCleanser == 1){
				faceCleanserQuantity += 1;
			
			} else if (buyFaceCleanser != 1)
				System.out.println("Thank you for shopping with us. Hope you liked it here! Kindly check our other products.");
			
			
		}
		System.out.println();	
		System.out.println("You have added "+faceCleanserQuantity+" of this item to your cart");
		System.out.println();	
	
		return faceCleanserQuantity;
	}
		
	public static int getSunscreenDecision(int buySunscreen){
		Scanner input = new Scanner(System.in);

		int sunScreenQuantity = 0;
		while (buySunscreen == 1){
			
			System.out.print("Do you want to buy the Semicolon Sunscreen product?\n1. Yes\n2. No\n");
			buySunscreen = input.nextInt();
			if (buySunscreen == 1){
				sunScreenQuantity += 1;
			
			} else if (buySunscreen != 1)
				System.out.println("Thank you for shopping with us. Hope you liked it here! Kindly check our other products.");
			
			
		}	
		System.out.println();
		System.out.println("You have added "+sunScreenQuantity+" of this item to your cart");
		System.out.println();	
	
		return sunScreenQuantity;

	}

	
	public static int geAntiPerspirantDecision(int buyAntiPerspirant){
		Scanner input = new Scanner(System.in);

		int antiPerspirantQuantity = 0;
		while (buyAntiPerspirant == 1){
			
			System.out.print("Do you want to buy the Semicolon Anti-Perspirant product?\n1. Yes\n2. No\n");
			buyAntiPerspirant = input.nextInt();
			if (buyAntiPerspirant == 1){
				antiPerspirantQuantity += 1;
			
			} else if (buyAntiPerspirant != 1)
				System.out.println("Thank you for shopping with us. Hope you liked it here! Kindly check our other products.");
			
			
		}
		System.out.println();	
		System.out.println("You have added "+antiPerspirantQuantity+" of this item to your cart");
	
		return antiPerspirantQuantity;

	}

	public static String[][] view(String[][] cart){
	
		getFaceCleanserDecision(1);
		getSunscreenDecision(1);
		geAntiPerspirantDecision(1);

		for (int index = 0; index < cart.length; index++){
			
		}
		return cart;
	}


}
import java.util.Scanner;
import java.util.ArrayList;

public class CheckoutSystem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	ArrayList<String> products = new ArrayList<>();
	ArrayList<Integer> numberOfItems = new ArrayList<>();
	ArrayList<Double> priceOfItems = new ArrayList<>();
	
	System.out.print("What is the customer's name? -  ");
	String customersName = input.nextLine();
	
	displayQuestions(customersName, input, products, numberOfItems, priceOfItems);

	}

	public static void displaySystemQuestions(String customersName, Scanner input, ArrayList<String> products, ArrayList<Integer> numberOfItems, ArrayList<Double> priceOfItems ){
		System.out.print("What did the user buy? - ");
		String productsBought = input.nextLine();
		products.add(productsBought);

		System.out.print("How many pieces? - ");
		int productQuantity = input.nextInt();
		numberOfItems.add(productQuantity);

		System.out.print("How much per unit? - "); 
		double productPrice  = input.nextDouble();
		priceOfItems.add(productPrice);

		input.nextLine();
		System.out.print("Do you want to add more items? - ");
		String addMoreItems = input.nextLine();

		if(addMoreItems.equalsIgnoreCase("Yes")){
			displaySystemQuestions(customersName, input, products, numberOfItems, priceOfItems);
		}
		else {
			System.out.print("What is your name? - ");
			String nameOfCashier = input.nextLine();
		
			System.out.print("How much discount will the customer get? - ");
			double discount = input.nextDouble();
			
			displayPromptToPay(customersName, nameOfCashier, input, products, numberOfItems, priceOfItems, discount);
		}

	}
		
	public static void displayPromptToPay(String customersName, String nameOfCashier, Scanner input, ArrayList<String> products, ArrayList<Integer> numberOfItems, ArrayList<Double> priceOfItems, double discount) {
		System.out.print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
DATE: 18TH-DEC-22 7:25pm
""");
			System.out.println("Cashier: "+nameOfCashier+"\n");
			System.out.println("Customer's name: "+customersName+"\n");
			System.out.println("=================================================");
			System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
			System.out.println("-------------------------------------------------");

			double billTotal = 0;
			double VAT = 17.50;
			double subTotal = 0;
			for (int index = 0; index < products.size(); index++) {
				System.out.printf("%s\t%d\t%.2f\t%.2f%n", products.get(index), numberOfItems.get(index), priceOfItems.get(index), (numberOfItems.get(index) * priceOfItems.get(index)));
				subTotal += (numberOfItems.get(index) * priceOfItems.get(index));
				
			}
			discount = (subTotal * (discount/100));
			VAT = (subTotal * (VAT/100));
			billTotal = (subTotal - discount + VAT);
			System.out.println("-------------------------------------------------");

			System.out.printf("\tSub Total:\t%.2f%n\tDiscount:\t%.2f%n\tVAT:\t\t%.2f\n", subTotal, discount, VAT);
			System.out.println("=================================================");
			System.out.printf("\tBill Total:\t%.2f%n", billTotal);
			System.out.println("=================================================");
			System.out.println("\n\tTHIS IS NOT A RECEIPT. KINDLY PAY "+billTotal);
			System.out.println("=================================================");

			System.out.print("How much did the customer give to you? - ");
			double amountPaid = input.nextDouble();

			displayInvoice(customersName, nameOfCashier, input, products, numberOfItems, priceOfItems, discount, amountPaid);

	}

	public static void displayInvoice(String customersName, String nameOfCashier, Scanner input, ArrayList<String> products, ArrayList<Integer> numberOfItems, ArrayList<Double> priceOfItems, double discount, double amountPaid) {
		System.out.print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
DATE: 18TH-DEC-22 7:25pm
""");
			System.out.println("Cashier: "+nameOfCashier+"\n");
			System.out.println("Customer's name: "+customersName+"\n");
			System.out.println("=================================================");
			System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
			System.out.println("-------------------------------------------------");
			
			double billTotal = 0;
			double VAT = 17.50;
			double subTotal = 0;
			for (int index = 0; index < products.size(); index++) {
				System.out.printf("%s\t%d\t%.2f\t%.2f%n", products.get(index), numberOfItems.get(index), priceOfItems.get(index), (numberOfItems.get(index) * priceOfItems.get(index)));
				subTotal += (numberOfItems.get(index) * priceOfItems.get(index));
				
			}
			discount = (subTotal * (discount/100));
			VAT = (subTotal * (VAT/100));
			billTotal = (subTotal - discount + VAT);
			double balance = amountPaid - billTotal;
			System.out.println("-------------------------------------------------");

			System.out.printf("\tSub Total:\t%.2f%n\tDiscount:\t%.2f%n\tVAT:\t\t%.2f\n", subTotal, discount, VAT);
			System.out.println("=================================================");
			System.out.printf("\tBill Total:\t%.2f%n\tBalance:\t%.2f%n", billTotal, balance);
			System.out.println("=================================================");
			System.out.println("\n\tTHANK YOU FOR YOUR PATRONAGE");
			System.out.println("=================================================");
			



		
	}

}
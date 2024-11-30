import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CheckoutSystemStandardTest{

	@Test
	public void getCheckoutSystemTest(){


		CheckoutSystem checkoutSystem = new CheckoutSystem();

		String[][] products = {{"Face cleanser", "Sunscreen", "Anti-perspirant"}, {"4000", "5000", "2500"}};
	
		System.out.println(Arrays.toString(products));
		
		
	}

	@Test
	public void getDescriptionOfProductTest(){

		CheckoutSystem checkoutSystem = new CheckoutSystem();

		int select = 1;

		System.out.print(select);

	}

	@Test
	public void getFaceCleanserDecisionTest(){
		
		CheckoutSystem checkoutSystem = new CheckoutSystem();

		int quantity = 0;

		int buyFaceCleanser = 1;

		System.out.print(quantity);


	}


	@Test
	public void getSunscreenDecisionTest(){
		
		CheckoutSystem checkoutSystem = new CheckoutSystem();

		int quantity = 0;

		int buySunscreen = 1;

		System.out.print(quantity);


	}



	@Test
	public void geAntiPerspirantDecisionTest(){
		
		CheckoutSystem checkoutSystem = new CheckoutSystem();

		int quantity = 0;

		int buyAntiPerspirant = 1;

		System.out.print(quantity);


	}


	 
}
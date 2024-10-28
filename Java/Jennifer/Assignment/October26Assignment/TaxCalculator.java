import java.util.Scanner;
public class TaxCalculator {
   public static void main(String[] args){
 
   Scanner input = new Scanner(System.in);
  
   double total = 0;
   int counter = 1;
   double taxAmount = 0;
   int nameCounter = 1;
   

   while (nameCounter <= 3) {
       System.out.print("Enter name: ");
       String citizenName = input.nextLine();
       nameCounter = nameCounter + 1;
   }
   while (counter <= 3) {
            System.out.print("Earnings: ");                   
            double citizenEarning = input.nextDouble();
            counter = counter + 1;
       if (citizenEarning <= 30000) {
          taxAmount = (citizenEarning * 0.15);
	  total = (total + taxAmount);
       }
       else if (citizenEarning > 30000) {
           taxAmount = (citizenEarning * 0.20);
           total = (total + taxAmount);
       }

   }
       

            System.out.printf("The total taxes for the three citizens is: %.2f", total);

   }
}
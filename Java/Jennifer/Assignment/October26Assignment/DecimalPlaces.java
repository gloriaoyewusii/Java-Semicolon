import java.util.Scanner;
public class DecimalPlaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input floating number");
        double num1 = input.nextDouble();
        System.out.println("Input floating number");
        double num2 = input.nextDouble();
        System.out.println(String.format("Number: %.3f", num1));
        System.out.println(String.format("Number: %.3f", num2));

                if(num1 == num2){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are different");
        }
        }
}
public class TableIntegers{
	public static void main(String[] args){

		System.out.println("a\tb\tpow(a, b)");

		int power = 1;
		int number1 = 1;
		int number2 = 2;
		
		int counter = 1;
		while(counter <= 5){

			for(int holder = 1; holder <= number2; holder++){
			power *= number1;
			}

			System.out.printf("%d\t%d\t%d%n", number1,number2, power);


			number1++;
			number2++;
			power = 1;
			counter++;

		}

		//System.out.print("1\t2\t1\n2\t3\t8\n3\t4\t81\n4\t5\t1024\n5\t6\t15625");


	




	}



}
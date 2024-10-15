public class SquaresAndCodes{
public static void main(String[] args){

System.out.println("numbers\tsquares\tcubes");

for(int numbers = 0; numbers <=10; numbers++){
	int squares = numbers * numbers;
	int cubes = numbers * numbers * numbers;
System.out.println(numbers+"\t"+squares+"\t"+cubes);

}

}
}
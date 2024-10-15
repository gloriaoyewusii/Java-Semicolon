public class NewSquaresCubes{
public static void main(String[] args){

System.out.println("numbers\tsquares\tcubes");

for(int number = 0; number <=30; number++){
int squareNum = number * number;
int cubeNum = squareNum * number;

System.out.println(number+"\t"+squareNum+"\t"+cubeNum);



}
}
}
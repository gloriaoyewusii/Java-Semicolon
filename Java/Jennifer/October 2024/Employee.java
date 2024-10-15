import java.util.Scanner;  
public class Employee{
public static void main(String args[]){

Employee e = new Employee();

Scanner sc = new Scanner(System.in);  
System.out.println("Enter the name of the employee: ");  
String name = sc.nextLine();  
System.out.println("Enter the age of the employee: ");  
int age = sc.nextInt();  
System.out.println(" "); 

System.out.println("Show() method for the parameterized constructor: ");  
new Employee(name, age).show(); 

System.out.println("Show() method for the default constructor: ");  
new Employee().show();  








	}
}  

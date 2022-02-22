/**
 * 
 * @author Yanilda
 * @version 1
 * @description My first program
 * @created 2.1.22 
 *
 **/
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to my fisrt Java Program"); //display message to console
		
		Scanner input = new Scanner(System.in) ; // Creating a scanner object
		
		System.out.println("What is your name? "); // Prompting the user for their names
		String name = input.nextLine();  // Waiting for the user to enter a name, grabbing that input from user, storing it as String object
	
		System.out.println("Hello, "+name); // We are greeting the user.
		
		input.close();
	}
}

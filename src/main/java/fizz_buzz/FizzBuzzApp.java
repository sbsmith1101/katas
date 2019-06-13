package fizz_buzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String [] args) {
		
		System.out.println("Please Give me a Number");
		System.out.println("Type quite to exit");
		String userChoice;
		Scanner input = new Scanner(System.in);
		
		do {
			userChoice = input.nextLine();
			if(!user)
			FizzBuzz.say(Integer.parseInt(userChoice));
			
		}while(!userChoice.contentEquals("quit"));
	}
}
	


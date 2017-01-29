import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args ) {
		Scanner keyboard = new
Scanner(System.in);

	System.out.println( "What city is the capital of France?" );
	keyboard.next();
	
	System.out.println( "What is 6 multiplied by 7?" );
	keyboard.nextInt();
	
	System.out.println( "Enter a number between 0.0 and 1.0." );
	keyboard.nextDouble();
	
	System.out.println( "Is there anything else you would like to say?" );
	keyboard.next();
	// When typing [BLANK] for question 2 the program returned an exceptions
	// to the thread "main" java.util.InputMismatchExceptions followed by many
	// more java.util.scanner errors.
	
	// When typing "blue" for questions number 3 I received the same exceptions
	// error to the thread main with slightly different following java.util.scanner errors.
	}
}
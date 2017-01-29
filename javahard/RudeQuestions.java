import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income, number;
		
		Scanner keyboard = new
Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weight, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "!Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		
		System.out.println( "Last question, I promise, What is your favorite number " + 
		name + "?" );
		number = keyboard.nextDouble();
		System.out.println ( "Of course, how original!" );
		System.out.print( "Well thanks for answering my rude questions, " );
		System.out.println( name + "." );
		//  1. The program did not blow up when using an integer instead of a Double.
		//  2. The program did blow up when I used a numeric value instead of a string
	    //     I guess this is because since numeric values are used for calculations in 
	    //     a lot of cases the program rejects an answer when its not numeric 
	    //     and its expected.
		//  3. I was able to break every question (accept for the first one) by inputing 
		//     "%', which I predict is because a string can be any number/symbol/
		//     character/etc.
	    //  4. 
		
		
	}
}

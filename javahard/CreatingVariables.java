public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, z;
		double seconds, e, checking, savings;
		String firstName, lastName, title, city, state;
		
		x = 10;
		y = 400;
		age = 39;
		z = 11;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 5.31;
		
		firstName = "Graham";
		lastName = " Mitchell";
		title = "Mr. ";
		city = "Denver";
		state = " Colorado";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + "seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "However your favorite number is: " + z );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "But at least you have $" + savings + " in savings!" );
		System.out.println( "My name's " + title + firstName + lastName + " from " + city + state + "." );
	}
}
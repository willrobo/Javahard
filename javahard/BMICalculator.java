import java.util.Scanner;

public class BMICalculator {
	public static void main( String [] args ) {
		Scanner keyboard = new
Scanner(System.in); double m, kg, bmi, ft, in, lbs;

		System.out.print( "How tall are you in feet? (you will be asked for inches next): " );
		ft = keyboard.nextDouble();
		
		System.out.print( "And how many inches?" );
		in = keyboard.nextDouble();
		
		m = ((ft*12)+in)*.0254;
		
		System.out.print( "How much do you weigh (in pounds): " );
		lbs = keyboard.nextDouble();
		
		kg = lbs*.453592;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}		
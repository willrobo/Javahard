public class ClubBouncer {
	public static void main( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
	if ( onGuestList || age >=21 || (gender.equals("F") && allure >= 8) ) {
		System.out.println("You are allowed to enter the club."); 
		}
	else {
		System.out.println("you are not allowed to enter the club.");
		//  The program would not compile with a println statment
		//  after line 10.  It cause the else statement to appear
		//  without the presence of the if statement.
		}
	}
}
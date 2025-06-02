import java.util.Scanner;

public class UseFor2 {
    
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("You have to write an email anddress: ");
	String emailUser = input.nextLine();

	boolean atBand = false;
	boolean dotBand = false;

	String message = "Your email is ";

	for (int i=0 ; i<emailUser.length() ; i++) {
	    if ((emailUser.charAt(i) == '@') && (!atBand)) {
		atBand = true;
		continue;
	    }
	    else if ((emailUser.charAt(i) == '@') && (atBand)) {
		message += "incorrect.";
		break;
	    }

	    if ((emailUser.charAt(i) == '.') && (!dotBand) && atBand) {
		dotBand = true;
		message += "correct.";
		break;
	    }
	}

	System.out.println(message);
    }
    
}

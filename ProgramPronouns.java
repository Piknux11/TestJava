import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramPronouns {

    public static void main(String[] args) {

	var userPronouns = "";
	
	do {
	    userPronouns = switch(JOptionPane.showInputDialog("What's your pronouns?")) {
	    case "Men", "M", "m" -> "Men";
	    case "Woman", "W", "w" -> "Woman";
	    default -> "None";
	    };
	} while (userPronouns.equals("None"));

	var message = "You are a " + userPronouns + "\n" + "And your ideal weight is ";

	var userHeight = Integer.parseInt(JOptionPane.showInputDialog("What's your height?"));

	switch(userPronouns) {
	case "Men":
	    userHeight -= 110;
	    break;
	    
	case "Woman":
	    userHeight -= 120;
	    break;
	    
	default:
	    userHeight -= 110;
	    break;
	}

	JOptionPane.showMessageDialog(null, message + userHeight);
	
    }
}

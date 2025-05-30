import javax.swing.JOptionPane;

public class UseFor {

    public static void main(String[] args) {

	String mail = JOptionPane.showInputDialog("You type your email address:");
	String message = "Your email is wrong.";

	for (int i=0 ; i<mail.length() ; i++) {
	    if (mail.charAt(i) == '@') {
		message = "Your email is correct.";
		break;
	    }
	}

	JOptionPane.showMessageDialog(null, message);
    }
    
}

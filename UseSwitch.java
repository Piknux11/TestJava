import javax.swing.JOptionPane;

public class UseSwitch {
    public static void main(String[] args) {

	var answer = Integer.parseInt(JOptionPane.showInputDialog("You type a number of month: "));

	switch(answer) {
	case 1:
	    System.out.println("Enero");
	    break;
	case 2:
	    System.out.println("Febrero");
	    break;
	case 3:
	    System.out.println("Marzo");
	    break;
	case 4:
	    System.out.println("Abril");
	    break;
	default:
	    System.out.println("Month's number is invalid");
	}
    }
}

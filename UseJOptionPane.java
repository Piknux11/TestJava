import javax.swing.JOptionPane;
import java.util.Scanner;

public class UseJOptionPane {
	public static void main (String[] args) {
		String nameUser = "";
		int ageUser = 0;
		double salariUser = 0.0;

		String res = "";
		
		res += JOptionPane.showInputDialog("Type your name: ") + "\n";
		res += JOptionPane.showInputDialog("Type your age: ") + "\n";
		res += JOptionPane.showInputDialog("Type your salary: ") + "\n";
		
		Scanner entrada = new Scanner(res);

		nameUser = entrada.nextLine();
		salariUser = entrada.nextDouble();
		ageUser = entrada.nextInt();

		System.out.println("Your name is " + nameUser + " and you are " + ageUser + " yesars old.");
		JOptionPane.showMessageDialog(null, "Your salary is " + salariUser);
	}
}

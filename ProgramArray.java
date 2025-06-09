import javax.swing.JOptionPane;
import java.util.Scanner;

public class ProgramArray {
    
    public static void main(String[] args) {
	String[] contries;
	String file = "";
	Scanner input;

	file += JOptionPane.showInputDialog("You must type a number of contries") + "\n";

	input = new Scanner(file);

	int num = input.nextInt();

	input.close();

	contries = new String[num];

	for (int i=0 ; i<contries.length ; i++) {
	    contries[i] = JOptionPane.showInputDialog("Write a name contries");
	}

	for (String i : contries) {
	    System.out.println(i);
	}
    }
    
} 

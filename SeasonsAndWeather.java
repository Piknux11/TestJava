import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeasonsAndWeather {
    public static void main(String[] args) {

	System.out.println("You write a Season: ");

	var input = new Scanner(System.in);

	var answer = input.nextLine();
	input.close();
	
	if (answer.equalsIgnoreCase("Spring")) {
	    System.out.println("It's sunny day and warm.");
	}
	
    }
}

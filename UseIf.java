import java.util.Scanner;

public class UseIf {
    public static void main (String[] args) {

	var entrada = new Scanner(System.in);

	System.out.println("Type your age, please: ");

	int edad = entrada.nextInt();

	if (edad >= 18) {
	    System.out.println("You are of legal age");
	} else {
	    System.out.println("You are not of legal age.");
	}

	if (edad <= 18) {
	    System.out.println("You're too young");
	}
	else if (edad <= 35) {
	    System.out.println("You're young");
	}
	else if (edad <= 60) {
	    System.out.println("You're an old man");
	}
	else if (edad <= 90) {
	    System.out.println("You take care");
	}
	
    }
}

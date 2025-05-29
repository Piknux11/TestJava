import java.util.Scanner;
import java.util.Random;

public class Game {
    
    public static void main(String[] args) {

	var random = new Random();
	var scaner = new Scanner(System.in);

	var message = "";
	
	int randomNumber = random.nextInt(100);
	int num = 0;
	int attempts = 1;

	while (true) {
	    System.out.println("You write a number between 0 and 100");
	    num = scaner.nextInt();

	    if (num == randomNumber) {
		message = "Your attempts were: " + attempts + "\n" + "You win the game.";
		break;
	    }
	    else if (num < randomNumber) {
		message = "Your number is less";
		attempts += 1;
	    }
	    else if (num > randomNumber) {
		message = "Your number is greater";
		attempts += 1;
	    }

	    System.out.println(message);
	}

	System.out.println(message);
    }
    
}

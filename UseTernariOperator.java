import java.util.Scanner;

public class UseTernariOperator {
    public static void main(String[] args) {

	System.out.println("You type some age: ");

	var entrada = new Scanner(System.in);

	var age = entrada.nextByte();

	entrada.close();

	var answer = (age >= 18)? "You are old" : "You are a chill";

	System.out.println(answer);
	
    }
}

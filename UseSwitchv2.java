import java.util.Scanner;

public class UseSwitchv2 {
    public static void main(String[] args) {
	System.out.println("You type a number of month: ");

	var input = new Scanner(System.in);

	var answer = input.nextInt();
	input.close();

	var month = switch(answer) {
	case 1 -> "Enero";
	case 2 -> "Febrero";
	case 3 -> "Marzo";
	case 4 -> "Abril";
	default -> "Error";
	};

	System.out.println(month);
    }
}

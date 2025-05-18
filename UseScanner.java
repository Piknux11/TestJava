import java.util.Scanner;

public class UseScanner {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Type your name, please: ");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Your name is " + nombreUsuario + "\n");

		System.out.println("Type your age: ");

		int edad = entrada.nextInt();

		System.out.println("Your age is " + edad + "\n");

		System.out.println("Your name is " + nombreUsuario + " and you are " + edad + " years old.");

		entrada.close();
	}
}

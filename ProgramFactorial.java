import javax.swing.JOptionPane;
import java.math.BigInteger;

public class ProgramFactorial {
    
    public static void main(String[] args) {

	int numberInput = Integer.parseInt( JOptionPane.showInputDialog("You should write a number") );
	BigInteger answer = BigInteger.valueOf(1);

	for (int i=numberInput ; i>0 ; i--) {
	    answer = answer.multiply(BigInteger.valueOf(i)); 
	}

	System.out.println("The factorial of your number is = " + answer.toString());
    }
    
}

import java.util.Random;

public class ProgramArray2 {

    public static void main(String[] args) {
	Random randomNum = new Random();

	int[] numbers = new int[200];

	for (int i=0 ; i<numbers.length ; i++) {
	    numbers[i] = randomNum.nextInt(200);
	}


	int iterator = 0;
	for (int i : numbers) {
	    iterator++;
	    System.out.println("Num [" + iterator + "] = " + i);
	}
    }
    
}

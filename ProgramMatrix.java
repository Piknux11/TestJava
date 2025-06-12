import java.util.Scanner;

public class ProgramMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	//double salary = 10000.00;
	double interest = 0.10;

	int numberOfYears = input.nextInt();
	int numberOfInterest = input.nextInt();
	
	double[][] totals = new double[numberOfInterest][numberOfYears];

	for (int i=0 ; i<totals.length ; i++) {
	    totals[i][0] = 10000.00;
	    
	    for (int j=1 ; j<totals[1].length ; j++) {
		totals[i][j] = 0.0;
		totals[i][j] = totals[i][(j-1)] + (interest * totals[i][(j-1)]);
		//salary = totals[i][j];
	    }
	    interest+=0.01;
	    //salary = 10000.00;
	}

	for (int i=0 ; i<totals[1].length ; i++) {
	    //System.out.println("The interest is = " + (10 * (i+1)));
	    for (int j=0 ; j<totals.length ; j++) {
		//System.out.println("On the year " + (j+1));
		System.out.print("[" + j + "][" + i + "] = ");
		System.out.printf("%1.2f", totals[j][i]);
		System.out.print(" ");
	    }
	    System.out.println();
	}
	
    }
    
}

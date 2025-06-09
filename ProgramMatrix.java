
public class ProgramMatrix {

    public static void main(String[] args) {
	float[][] interes = new float[3][6];

	FillArray1(interes[0]);
	FillArray2(interes[1]);

	Answer(interes);
    }

    public static void FillArray1(float[] array) {

	for (int i=0 ; i<array.length ; i++) {
	    array[i] = 10000.00f;
	}
	
    }

    public static void FillArray2(float[] array) {
	
	for (int i=0 ; i<array.length ; i++) {
	    array[i] = (10+i) * 0.01f;
	}
	
    }

    public static void Answer(float[][] array) {

	for (int i=0 ; i<array[1].length ; i++) {
	    array[2][i] = array[0][i] + (array[1][i] * array[0][i]); 
	}

	for (float[] i : array) {
	    for (float j : i) {
		System.out.print(j + " ");
	    }
	    System.out.println();
	}
    }
    
}

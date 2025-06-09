
public class UseTwodimensionalArray {
    
    public static void main(String[] args) {
	int[][] numbersArray = new int[5][5];

	FillMatrix(numbersArray);
	ShowMatrix(numbersArray);
	
    }

    public static void FillMatrix(int[][] matrix) {
	
	for (int i=0 ; i<matrix.length ; i++) {
	    for (int j=0 ; j<matrix[0].length ; j++) {
		matrix[i][j] = j+1;
	    }
	}
	
    }

    public static void ShowMatrix(int[][] matrix) {

	for (int[] i : matrix) {
	    for (int j : i) {
		System.out.print(j + "  ");
	    }
	    System.out.println();
	}
	
    }
    
}

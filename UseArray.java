
public class UseArray {

    public static void main(String[] args) {
	int[] numbers = new int[10];

	fillArray(numbers);
	showArray(numbers);

	System.out.println("The index number of array is");
	getIndexNumberOfArray(numbers);

	int[] numbers1 = {10,20,30,40,50,60,70};

	showArray(numbers1);

	System.out.println("The index number of array is");
	getIndexNumberOfArray(numbers1);
    }

    public static void fillArray(int[] array) {
	for (int i=0 ; i<array.length ; i++) {
	    array[i] = 1;
	}
    }

    public static void showArray(int[] array) {
	for (int i=0 ; i<array.length ; i++) {
	    System.out.println("The value of index " + i + "is equals to " + array[i]);
	}
    }

    public static void getIndexNumberOfArray(int[] array) {
	System.out.println(array.length);
    }
    
}

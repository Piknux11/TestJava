import java.util.List;
import java.util.Arrays;

public class UseArray2 {
    
    public static void main(String[] args) {

	String[] contries = new String[8];

	contries[0] = "Mexico";
	contries[1] = "Espana";
	contries[2] = "Colombia";
	contries[3] = "Peru";
	contries[4] = "Chile";
	contries[5] = "Argentina";
	contries[6] = "Ecuador";
	contries[7] = "Venezuela";

	for(String i : contries) {
	    System.out.println(i);
	}

	List<String> list1 = List.of("David", "Angel", "Brandon", "Marcos");

	for (String i : list1) {
	    System.out.println(i);
	}

	List<String> list2 = Arrays.asList("Pepe", "Max", "Isabella");

	for (String i : list2) {
	    System.out.println(i);
	}

	list2.set(1,"David");

	for (String i : list2) {
	    System.out.println(i);
	}
    }
    
} 

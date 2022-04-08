import java.util.Arrays;

public class NumericArray {
	public static void main(String[] args) {
		int numarr[] = {1789, 2035, 1899, 1456,2013};
	    Arrays.sort(numarr);
	    
	    System.out.println("Sorted array: " + Arrays.toString(numarr));
	    System.out.println("Sum: " + Arrays.stream(numarr).sum());
		System.out.println("Average: " + Arrays.stream(numarr).average().getAsDouble());		
	}
}

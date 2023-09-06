package Scanner;
import java.util.Scanner;
public class VargArgs {
	
	    // Method that accepts a variable number of integers
	    static int sumIntegers(int... numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        return sum;
	    }

	    // Method that accepts a variable number of doubles
	    static double averageDoubles(double... numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }

	    public static void main(String[] args) {
	        System.out.println("Sum of integers: " + sumIntegers(1, 2, 3, 4, 5));
	        System.out.println("Average of doubles: " + averageDoubles(1.5, 2.5, 3.5));
	    }
	}




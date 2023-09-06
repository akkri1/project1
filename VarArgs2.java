package Scanner;

import java.util.Scanner;

public class VarArgs2 {
    
	
	    // Using varargs to calculate the sum of integers
	    static int sum(int... numbers) {
	        int total = 0;
	        for (int num : numbers) {
	            total += num;
	        }
	        return total;
	    }

	    // Using varargs with other parameters
	    static void printInfo(String message, int... numbers) {
	        System.out.println(message);
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int result = sum(1, 2, 3, 4, 5);
	        System.out.println("Sum: " + result);

	        printInfo("Numbers:", 10, 20, 30);
	        printInfo("More numbers:", 5, 15, 25, 35, 45);
	    }
	}

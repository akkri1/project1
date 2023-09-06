package Scanner;

import java.util.Scanner;

public class VarsArgs3 {
    
	
	    // Using varargs to calculate the sum of integers
	    static int sum1(int... numbers) {
	        int total = 0;
	        for (int num : numbers) {
	            total += num;
	        }
	        return total;
	    }

	    // Using varargs with other parameters
	    static void sum(String num, int... numbers) {
	        int total=0;
	        for (int nu : numbers) {
	            total =total+nu;
	        }
	        System.out.println(num+" "+total);
	    }

	    public static void main(String[] args) {
	        sum("asd" , 2, 3, 4, 5);
	        //System.out.println("Sum: " + res);

	       
	    }
	}

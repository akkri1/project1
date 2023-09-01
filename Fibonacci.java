package Scanner;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
				System.out.println("Ener the value of n");
		int n =sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++)
		{
          num=num+i;
	    }
		System.out.println(num);

}
}

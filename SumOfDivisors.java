package Scanner;

import java.util.Scanner;

public class SumOfDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ener the value of n");
int n =sc.nextInt();
int sum =0;
for(int i=1;i<=n;i++)
{
  if(n%i==0)
  {

   System.out.println(i);
   sum=sum+i;
}
  
}
System.out.println("sum of divisor" + sum);
	}

}

package Scanner;
import java.util.Scanner;
public class NoIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ener the value of n");
int n =sc.nextInt();
int count=0;
for(int i=2;i<n;i++)
{
  if(n%i==0)
  {

   count++;
  }
   
  }
if (count==0)
{
System.out.println(" number is prime");
}
else {
System.out.println("number is not prime");
}


}

}

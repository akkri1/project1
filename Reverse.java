package Scanner;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ener the string");
			String str =sc.nextLine();
			String str1= "";
			for(int i=str.length()-1;i>=0;i--)
			{
				str1=str1+str.charAt(i);
			}
			System.out.println(str1);
	}

}

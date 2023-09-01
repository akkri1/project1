package Scanner;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		
		String str1= "";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equals(str1))
		{
			return true ;
		}
		return false;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ener the string");
		String str =sc.nextLine();
		if (isPalindrome(str))
		{
			System.out.println(" is palindqweee");
		}
		else
		{
			System.out.println(" no palindrome");
		}
		}
			
			
	}
	



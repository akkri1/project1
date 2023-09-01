package Scanner;

import java.util.Scanner;

public class Div {
	static int div(int s,int e)
	{
		for(int i=s; i<=e;i++)
		{
			if(i%12==0)
			 { 
		
		     return i;
			 }
			
			
	}
		return -1;
	    
	}
           
	public static void main(String[] args) {
		int result =div(13,50);
	   
		System.out.println(result);
	}

}

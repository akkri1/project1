package Scanner1;
import java.util.Scanner;


	


	class Animal {
	   public void eat() {
	       System.out.println("bhuki bhuki");
	   }
	}

	class Mammal extends Animal {
	   
	   public void walk() {
	       System.out.println("walki walki");
	   }
	}

	class Chotu extends Mammal {
	  
	   public void sleep() {
	       System.out.println("nini nini");
	   }
	}

	public class InheritAnimal {
	   public static void main(String[] args) {
	       Chotu cho = new Chotu();
	 
	       
	      cho.eat();
	      cho.walk();
	      cho.sleep();
	   }


		}



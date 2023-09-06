package Scanner1;
    class Ka {
	private int id;
	private String name;
	public void setName(String n) {
		this.name=n;
	}
	public void setId(int i) {
		this.id=i;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}

public class Setter {
		public static void main (String args[]) {
		Ka g1 =new Ka();
		//g1.setName("akki");
		g1.setId(11);
		g1.setName("Joh"); // Set the value of the name variable to "John"
	    System.out.println(g1.getName());
	    System.out.println(g1.getId());
		
	}

}

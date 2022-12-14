package week1;

public class Customer {

	public String Name = "Levi";
	private int PhoneNumber = 90251236;
	protected long Age      = 25;
	 
	public static void main(String [] args) {
		
		Customer A = new Customer();
		System.out.println(A.PhoneNumber);
	}
	
}

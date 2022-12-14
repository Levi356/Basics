package week2;

public class Account {

	String customerName;
        int accountNo;
	
	Account(String a,int b){
		this.customerName = a;
	    this.accountNo= b;}
	    
	    void display() {
			System.out.println("Customer name : "+customerName);
			System.out.println("Account number : "+accountNo);

			}
	}
	


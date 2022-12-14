package week2;

public class AccountDetails extends CurrentAccount{

	int depositAmount;
	int withdrawalAmount;
	
	AccountDetails(String a,int b,int c,int d,int e){
		
		super(a,b,c);
		depositAmount = d;
		withdrawalAmount = e;
		
		}
	
	void display() {
		super.display();
		System.out.println("Deposite Ammount : "+depositAmount);
		System.out.println("Withdrawl Ammount : "+withdrawalAmount);
	}
		
	}
	
	


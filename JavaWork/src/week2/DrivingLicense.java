package week2;

public class DrivingLicense {

	private int age;
	private boolean decision;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDecision() {
		return decision;
	}

	public void setDecision(boolean decision) {
		this.decision = decision;
	}

	public static void main(String[] args) {

		DrivingLicense D = new DrivingLicense();

		D.setAge(60);

		if (D.age <= 60) {
			D.setDecision(false);
		} else {
			D.setDecision(true);
		}
	     if (D.decision = D.decision) { 
		//System.out.println(D.decision);
			System.out.println("The age of the candidate is 70.Driving license can be issued to the candidate.false");
	     }
	     else {
			System.out.println("You are under the age of 60 so you are not eligbile for Driving License");
		}
	}
}


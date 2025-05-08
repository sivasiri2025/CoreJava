package oops;

public class BankAccount {
	
	private double balance; //100
	private String name;
	
	public void setBalance(double balance) { //100
		if(balance <= 0) 
			System.out.println("Don't enter -ve numbers");
		else 
			this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

package oops;

public class Clerk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAccount = new BankAccount();
		
		//bankAccount.setBalance(5000);
		bankAccount.setName("DZT");
		System.out.println(bankAccount.getBalance());
		System.out.println(bankAccount.getName());
		
	}
}

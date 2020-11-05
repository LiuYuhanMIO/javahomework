package homework;
import java.util.Date;

public class hw97 {
	public static void main(String args[]) {
		Account account = new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		
		System.out.println("您的余额是："+account.getBalance());
		System.out.println("月利息是："+account.getMonthlyInterest());
		System.out.println("您的开户日期是："+account.getDate());
		
	}
}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	Account(){}
	Account(int id,double balance){
		this.id = id;
		this.balance = balance;
	}
	
	int getID(){
		return id;
	}
	void setId(int id){
		this.id = id;
	}
	
	double getBalance(){
		return balance;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	String getDate() {
		return dateCreated.toString();
	}
	
	double getMonthlyInterestRate() {
		return (annualInterestRate/12/100);
	}
	double getMonthlyInterest() {
		return (balance * this.getMonthlyInterestRate());
	}
	
	void withDraw(int i) {
		this.balance = balance - i;
	}
	void deposit(int i) {
		this.balance = balance + i;
	}

}
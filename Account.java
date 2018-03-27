package BankingApp;

public abstract class Account implements IBaseRate {
	protected String SSN,AccountNo,Name;
	protected double Balance,Rate;
	static int Index=10000;

	public Account(String Name,String SSN,double InitBal) {
	
	this.Name=Name;
	this.SSN=SSN;
	Balance=InitBal;
	this.AccountNo=SetAccountNumber();
	SetInterestRate();
	
	
}
	public void Deposit(double Amount)
	{
		Balance+=Amount;
		System.out.println("Depositing");
		Balance();
	}
	public void Withdraw(double Amount)
	{
		Balance-=Amount;
		System.out.println("Withdrawing");
		Balance();
	}
	public void Transfer(String ToWhom,double Amount)
	{
		Balance-=Amount;
		System.out.println("Transferring to"+ToWhom);
		Balance();
	}
	public void CompoundInterest()
	{
		double AccurredInterest=Balance*(Rate/100);
		Balance+=AccurredInterest;
		Balance();
	}
	public void Balance() {
		System.out.println("Balance is "+Balance);
	}
	abstract void SetInterestRate();
	private String SetAccountNumber() {
		String LastTwoOfSSN=SSN.substring(SSN.length()-2, SSN.length());
		int UniqueId=Index;
		int RandomNo=(int)(Math.random()*Math.pow(10, 3));
		return LastTwoOfSSN+UniqueId+RandomNo;
  
	}
	public void ShowInfo() {
		System.out.println("Name:"+Name);
		System.out.println("AccountNo:"+AccountNo);
		System.out.println("Balance:"+Balance);
		System.out.println("Interest Rate:"+Rate);
	}
}

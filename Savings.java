package BankingApp;

public class Savings extends Account {
	protected int SafetyDepositBoxID,SafetyDepositBoxKey;
	public Savings(String Name,String SSN,double InitBal) {
		super(Name, SSN ,  InitBal);
		AccountNo="1"+AccountNo;
		SetSafetyDepositBox();}
	private void SetSafetyDepositBox()
	{
		SafetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		SafetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}
	@Override
	public void SetInterestRate() {
		Rate=GetBaseRate()*0.15;
	}
		
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println(" Account Type: Savings  ");
		System.out.println(" ADDITIONAL FEATURES ");
		System.out.println(" SafetyDepositBoxID= "+SafetyDepositBoxID);
		System.out.println(" SafetyDepositBoxKey= "+SafetyDepositBoxKey);
		
		}
}


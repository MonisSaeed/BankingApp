package BankingApp;

public class Checking extends Account {
	protected int DepositCardNumber,DepositCardPin;
	
	
	public Checking (String Name,String SSN,double InitBal) {
		super(Name, SSN ,  InitBal);
		
	AccountNo="2"+AccountNo;
	SetDebitCard();
		}
	@Override
	public void SetInterestRate() {
		Rate=GetBaseRate()-0.25;
	}
	private void SetDebitCard()
	{
		DepositCardNumber=(int)(Math.random()*Math.pow(10, 12));
		DepositCardPin=(int)(Math.random()*Math.pow(10, 4));
	}
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println(" Account Type: Checking  ");
	System.out.println(" ADDITIONAL FEATURES ");
	System.out.println(" DepositCardNumber= "+DepositCardNumber);
	System.out.println(" DepositCardPin= "+DepositCardPin);}
}

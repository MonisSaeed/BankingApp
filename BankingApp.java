package BankingApp;

import java.util.LinkedList;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Checking Checking1=new Checking("Monis","1111111111",100.0);
Savings Savings1=new Savings("Monis","1111111111",100.0);
Checking1.ShowInfo();
System.out.println(" ++++++++++++++++++++++++++ ");
Savings1.ShowInfo();
Savings1.Deposit(3000);
Savings1.Transfer("Monis", 200);
Savings1.Withdraw(2);
Savings1.CompoundInterest();*/
String File="D:\\Files\\FileDatas.csv";
List<Account> Accounts=new LinkedList<Account>();
List<String[]> NewAccountHolders= Utilities.CSV.Read(File);
for(String[] AccountHolder:NewAccountHolders) {
	System.out.println("New Account");
	String Name= AccountHolder[0];
	String SSN= AccountHolder[1];
	String AccountType=AccountHolder[2];
	double InitDeposit=Double.parseDouble(AccountHolder[3]);
	if(AccountType.equals("Checking"))
	{Accounts.add(new Checking(Name,SSN,InitDeposit));
		
	}
	else if(AccountType.equals("Savings"))
	{
		Accounts.add(new Savings(Name,SSN,InitDeposit));
	}
	else
	{
		System.out.println("Error Reading Account Type");
	}
}
for(Account Acc:Accounts) {
	System.out.println("\n++++++++++++++");
	Acc.ShowInfo();
}
	}

}

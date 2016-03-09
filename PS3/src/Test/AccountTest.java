package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Account.Account;
import Exception.InsufficientFundsException;

public class AccountTest {
	
	Account myAccount; 
	
	@Before
	public void setUp() throws Exception {
		myAccount = new Account(1112,20000,0.045);
	}

	@After
	public void tearDown() throws Exception {
		myAccount = null;
	}
	
	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		myAccount.Withdraw(2500);
		myAccount.Deposit(3000);
	
		java.util.Date dateCreated = new java.util.Date();

		System.out.println("Balance:" + myAccount.getBalance());
		System.out.println("Monthly interest Rate:" + myAccount.getAnnualInterestRate());
		System.out.println("Date created:" + dateCreated);
	}
	
	
	@Test
	public final void testWithdraw2() throws InsufficientFundsException {
		myAccount.Deposit(500);
		myAccount.Withdraw(90000);
		System.out.println("Balance:" + myAccount.getBalance());
	}
	
}

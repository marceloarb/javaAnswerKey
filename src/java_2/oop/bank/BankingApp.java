package java_2.oop.bank;

public class BankingApp {


	public static void main(String[] args) {
			/*
				-Create a Bank
				-Create 5 Customers
				-Open a new account for each customer.
				-have 3 customers withdraw and deposit, making sure the account balances update.
				-Close 2 of the customer accounts.
				-view the opened accounts at the Bank.
				-find an account by any of the customer credentials
				-find an account by account number.
		 	*/
		Bank chase = new Bank();
		Customer marcelo = new Customer("Marcelo","Barbosa",876543765,"30-03-1994",100000.00 );
		Account marceloAccount = chase.openAccount(new Account(marcelo,chase));
		System.out.println(chase.getAccountByCustomer(marcelo));
	}
}

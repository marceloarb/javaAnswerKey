package java_2.oop.bank;

import java.util.Random;

public class Account{
    private Bank bank;
    private Customer accountHolder;
    private final long accountNumber;

    public Account(Customer customer, Bank bank) {
        this.accountHolder = customer;
        this.bank = bank;
        this.accountNumber = getAccountNumber();
    }
    private Long getAccountNumber() {
        return new Random().nextLong();
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }
    /*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */



}

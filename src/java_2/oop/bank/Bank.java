package java_2.oop.bank;

import java.util.ArrayList;


public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
	/*
		Properties:
			accounts;

		Methods :
			openAccount(); //create a new account, add it to the accounts list, and return it.
			closeAccount(Account); close the account by removing it from the account list. and removing it's association with this Bank
	 		getAccountByCustomer(Customer);
	 		getAccountByNumber(acctNum);
	 */
    public Account openAccount(Account account){
        accounts.add(account);
        return account;
    }
    public Account getAccountByCustomer(Customer customer){
        for(Account account : accounts){
            if(account.getAccountHolder().equals(customer)){
                return account;
            }
        }
        return null;
    }
}
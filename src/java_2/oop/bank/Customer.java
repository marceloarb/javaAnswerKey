package java_2.oop.bank;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final int ssn;
    private final String dob;
    private double wallet;


    public Customer(String firstName, String lastName, int ssn, String dob, double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.wallet = wallet;
    }
		/*
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/
}


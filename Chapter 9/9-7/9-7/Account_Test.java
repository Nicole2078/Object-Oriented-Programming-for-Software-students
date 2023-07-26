/*
 * Author: Nicole Hackler
 * Date: 7/20/2023
 * 
 * This is a test program to test the Account class
 * 
 * Create the Account object class. Write a test program that 
 * creates an Account object with an account ID of 1122, 
 * a balance of $20,000, and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, use the deposit 
 * method to deposit $3,000, and print the balance, the monthly 
 * interest, and the date when this account was created.
 * 
 * 
 */
public class Account_Test {

	public static void main(String[] args) {
		//First account testing the withdraw method
		Account account1 = new Account(1122, 20000, 4.5);
		System.out.println("The account ID is: " + account1.getId());
		System.out.println("The balance of is: $" + account1.getBalance());
		System.out.println("The monthly interest is: $" + account1.getMonthlyInterest());
		System.out.println("Withdrawing $2,500 brings the balance to: $" + account1.withdraw(2500.0));
		System.out.println("Deposting $3,000 brings the balance to: $" + account1.deposit(3000.0));
		System.out.println(account1.getDateCreated());
	}

}

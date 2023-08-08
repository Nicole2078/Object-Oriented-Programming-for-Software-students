/*
 * Author: Nicole Hackler
 * Date: 7/20/2023 (original date submitted for assignment 9-7)
 * 
 * ***Using this class for the exercise 10-7 ATM machine***
 * ***For the ATM machine game I've changed the starting balance
 * ***to be $100 form the original class that it was set to '0.0'.
 * 
 * This is a class called Account it contains 
 * private data fields of:
 * id: int (default 0)
 * balance: double (default 0)
 * annualInterestRate: double (default 0) All accounts have the same interest rate
 * The class with be calling the Date class
 * 
 * (Hint: The method getMonthlyInterest() is to return monthly interest, 
 * not the interest rate. Monthly interest is balance * monthlyInterestRate. 
 * monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate 
 * is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * 
 */
//Import the Date class
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated = new Date(); //new private date object
	
	//No-arg constructor
	Account(){
	}
	
	//Constructor with specified id and initial balance
	Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//Method that returns the monthly interest rate
	double getMonthInterestRate() {
		return annualInterestRate / 1200;
	}
	
	//Method that returns the monthly interest
	double getMonthlyInterest() {
		return balance * getMonthInterestRate();
	}
	
	//Method that withdraws a specified amount form the account
	void withdraw(double cash) {
		balance = balance - cash;
	}
	
	//Method that deposits a specified amount to the account
	void deposit(double check) {
		balance = balance + check;
	}
	
	//Method to set id
	void setId(int newId) {
		id = newId;
	}
	
	//Method to get id
	int getId() {
		return id;
	}
	
	//Method to set balance
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	//Method to get balance
	double getBalance() {
		return balance;
	}
	
	//Method to set annualInterestRate
	void setAnnualInterestRate(double newAnnualInterestRate) {
		 annualInterestRate = newAnnualInterestRate; 
	}
	
	//Method to get annualInterestRate
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//Method to get date created
	Date getDateCreated() {
		return dateCreated;
	}
	
}
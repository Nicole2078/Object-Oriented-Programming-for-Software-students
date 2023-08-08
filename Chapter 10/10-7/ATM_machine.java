/*
 * Author: Nicole Hackler
 * Date: 8-3-2023
 * 
 * This Exercise pulls the Account class form Exercise 9-7
 * 
 *  (Game: ATM machine) Use the Account class created in Programming
 *  Exercise 9-7 to simulate an ATM machine. Create ten accounts
 *  in an array with id 0, 1,..., 9, and the initial balance $100.
 *  
 *  The system prompts the user to enter an id. If the id is entered
 *  incorrectly, ask the user to enter a correct id. Once an id is 
 *  accepted, the main menu is displayed as show in the sample run. 
 *  You can enter a choice 1 for viewing the current balance, 2 for 
 *  withdrawing money, 3 for depositing money, and 4 for exiting the
 *  main menu.
 * 
 * Once you exit, the system will prompt for an id again. Thus, once
 * the system starts, it will not stop.
 * 
 */
//import scanner
import java.util.Scanner;
public class ATM_machine {

	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//An array to hold the 10 different Accounts
		Account[] atmId = new Account[10];
		for (int i = 0; i < atmId.length; i++) {
			atmId[i] = new Account(i, 100.0, 0.0);
		}
		
		//Prompt the user to enter an id of 0-9. repeat if entered wrong
		System.out.print("Enter an ID number '0' to '9': ");
		int id = input.nextInt();
		
		//Checking to see if the id is valid
		if (id < 0 || id > 9) {
			id = validId(id);
		}
		//while loop to run though the main menu and account class
		while (true) {
			int choice = mainMenu();
				if (choice == 1) {
					choice1(atmId[id]);
				}
				else if (choice == 2) {
					choice2(atmId[id]);
				}
				else if (choice == 3) {
					choice3(atmId[id]);
				}
				else if (choice == 4) {
					System.out.print("Enter an ID number '0' to '9': ");
					id = input.nextInt();
					if (id < 0 || id > 9) {
						id = validId(id);
				}else {
					System.out.print("Please enter a correct choice.");
				}
			}
			
		}
			
	}
	
	//method for the "Main menu"
	public static int mainMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Main menu\n1: Check balance\n2: Withdarw" +
		 "\n3: Deposit\n4: Exit");
		System.out.print("Enter a choice: ");
		int choice = input.nextInt();
		
		return choice;
	
	}
	
	//Method for choice1 check balance
	public static void choice1(Account atmId) {
		System.out.println("The balance is " + atmId.getBalance());
	}
	
	//method for choice2 withdraw
	public static void choice2(Account atmId) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ammount to withdraw: ");
		double take = input.nextDouble();
		atmId.withdraw(take);
	}
	
	//Method for choice3 deposit
	public static void choice3(Account atmId) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount to deposit: ");
		double put = input.nextDouble();
		atmId.deposit(put);
	}
	
	//Method for checking if id is valid
	public static int validId(int id) {
		Scanner input = new Scanner(System.in);
		while (id >= 0 || id <=9) {
			System.out.print("Enter a valid ID number '0' to '9': ");
			id = input.nextInt();
		}
		return id;
	}
	
}

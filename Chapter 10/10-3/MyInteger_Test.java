/*
* Author: Nicole Hackler
* Date: 8/1/2023
*
* This is a test program to test the methods in the MyInteger class
*
*/
public class MyInteger_Test {
	
//Main method
	public static void main(String[] args) {
		//system.out.printf(%d is prime? %s%n', int1.getValue(), int1.isPrime()); ***example printout
		MyInteger testInt1 = new MyInteger(7);
		int testInt2 = 14;
		MyInteger testInt3 = new MyInteger(11);
		
		//Testing the isEven method
		System.out.println("Testing isEven(): " + testInt1.isEven() +
				"\nTesting isEven(int): " + testInt1.isEven(testInt2) +
				" \nTesting isEven(MyInteger): " + MyInteger.isEven(testInt3));

		//Testing the isOdd method
		System.out.println("Testing isOdd(): " + testInt1.isOdd() +
				"\nTesting isOdd(int): " + testInt1.isOdd(testInt2) +
				" \nTesting isOdd(MyInteger): " + MyInteger.isOdd(testInt3));
		
		//Testing the isPrime method
		System.out.println("Testing isPrime(): " + testInt1.isPrime() +
				"\nTesting isPrime(int): " + testInt1.isPrime(testInt2) +
				" \nTesting isPrime(MyInteger): " + MyInteger.isPrime(testInt3));
		
		//Testing the equals method
		System.out.println("Testing equals(int): " + testInt1.equals(testInt2) + 
				"\nTesting equals(MyInteger): " + testInt1.equals(testInt3));
		
		//Testing the parseInt(char[]) method
		System.out.print("Testing parseInt(char[]): ");
		MyInteger.parseInt(new char[] {'2', '4', '7'});
		
		//Testing the parseInt(String) method
		System.out.println("\nTesting parseInt(String)" + MyInteger.parseInt("123"));
		
	}
}

/*
* Author: Nicole Hackler
* Date: 7/31/2023
*
* This class contains a int data field for the object.
* It contains static and non-static that test if the
* object's int is an even, odd, or prime number returning true if
* even, odd or prime respectively.
* It contains non-static methods to compare if it is equal
* to int and MyInteger returning true if equal.
* It contains a method parseInt(char[]) to converts an array of numeric
* characters to an int value.
* It also contains a method parseInt(string) that converts a string
* into an int value.
*
*/
public class MyInteger {
	private int value;
	//Constructor to create the MyInteger object.
	MyInteger(int value1) {
		value = value1;
	}
	
	//Non-static getter method that returns the int value.
	int getValue() {
		return value;
	}
	//Non-static isEven() method returns true if true.
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	//Non-static isOdd() method returns true if true.
	public boolean isOdd() {
		if (value % 2 == 1) {
			return true;
		}
		else return false;
	}
	
	
	//Non-static isPrime() method returns true if true.
	public boolean isPrime() {
		if (value <= 1) {
			return false;
		}
		else {
			for (int i = 2; i <= value / 2; i++) {
				if (value % i == 0)
					return false;
			}
		return true;
		}
	}
	
	//Non-static method isEven(int) returns true if true.
	public boolean isEven(int vEven) {
		if (vEven % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	//Non-static method isOdd(int) returns true if true.
	public boolean isOdd(int vOdd) {
		if (vOdd % 2 == 1) {
			return true;
		}
		else return false;
	}
	
	//Non-static method isPrime(int) returns true if true.
	public boolean isPrime(int vPrime) {
		if (vPrime <= 1) {
			return false;
		}
		else {
			for (int i = 2; i <= vPrime / 2; i++) {
				if (vPrime % i == 0)
					return false;
			}
		return true;
		}
	}
	
	//Method isEven(MyInteger) returns true if true.
	public static boolean isEven(MyInteger evenValue) {
		if (evenValue.value % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	//Method isOdd(MyInteger) returns true if true.
	public static boolean isOdd(MyInteger oddValue) {
		if (oddValue.value % 2 == 1) {
			return true;
		}
		else return false;
	}
	
	//Method isPrime(MyInteger) returns true if true.
	public static boolean isPrime(MyInteger primeValue) {
		if (primeValue.value <= 1) {
			return false;
		}
			for (int i = 2; i <= primeValue.value / 2; i++) {
				if (primeValue.value % i == 0)
					return false;
			}
		return true;
	}
	
	//Non-static method equals(int) return true if the value is equal.
	public boolean equals(int valueCompareTo) {
		if (valueCompareTo == value) {
			return true;
		}
		else return false;
	}
	
	//No--static method equals(MyInteger) return true if the value is equal.
	public boolean equals(MyInteger compareTo) {
		if (this.value == compareTo.value) {
			return true;
		}
		else return false;
	}
	
	//Method parseInt(char[]) that converts an array of numeric characters to an int value.
	public static int parseInt(char[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			 
			System.out.print(a[i]);
		}
		return total;
	}
	
	//Method parseInt(String) that converts a string into an int value.
	public static int parseInt(String stringValue) {
		return Integer.parseInt(stringValue);
	}
}

package cse360assignment01;

//Assignment #: 1 
//Arizona State University - CSE360
//      Name: Kevin OBrien
// StudentID: 1214786131
//   Lecture: T 9:00 
//Description: Performs predefined math actions and displays each 
//				 action to the user.

public class AddingMachine {
	private int total;
	private String history = "0 ";

	/*
	* The main method of the AddingMachine class is the
	* driver for the program. 
	*/
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4); 
		myCalculator.subtract(2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		return;
	}
	
	/*
	* The constructor for the Adding machine class.
	* Sets total to 0.
	*/
	public AddingMachine() {
		total = 0;  // not needed - included for clarity
	}
  
	/*
	* The getTotal method implements returns the current total
	* of the Adding machine class.
	*/
	public int getTotal() {
		return total;
	}
	
	/*
	* The add method adds the parameter to the total variable
	* of the Adding machine class.
	*/
	public void add(int value) {
		total += value;
		history += "+ " + value + " ";
	}
	
	/*
	* The subtract method subtracts the parameter from the total 
	* variable of the Adding machine class.
	*/
	public void subtract(int value) {
		total -= value; 
		history += "- " + value + " ";
	}

	/*
	* The toString method keeps a history of the transactions 
	* and returns the history as a string.
	*/
	public String toString() {
		return history;
	}
	
	/*
	* The clear method deletes the history of transactions
	* and resets the total to 0
	*/
	public void clear() {
		total = 0;
		history = "0 ";
	}
}

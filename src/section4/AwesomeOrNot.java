package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int rannumber = new Random().nextInt(4);

	// 3. Print out this variable
	System.out.println(rannumber);

	// 4. Get the user to enter something that they think is awesome
	String answer = JOptionPane.showInputDialog("What do you think is awsome?");

	// 5. If the random number is 0
	if(rannumber==0) {
		JOptionPane.showMessageDialog(null, "That is awesome!");
	}

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	else if(rannumber==1) {
		JOptionPane.showMessageDialog(null, "Thats not my favorite, but its okay.");
	}

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
	else if(rannumber==2) {
		JOptionPane.showMessageDialog(null, "That is so boring!!!");
	}

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
	else if(rannumber==3) {
		JOptionPane.showMessageDialog(null, "You are horrible and should go die in a hole!");
	}

	// -- write your own answer

}

}

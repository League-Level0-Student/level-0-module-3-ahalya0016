
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 4th";
		String dadsBirthday = "Semptember 19th";
		String myBirthday = "July 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String x = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(x);
		// 4. if user asked for "mom"
		if (x.equals("mom")) {
			//print mom's birthday
			System.out.println("July 4th"); }
		// 5. if user asked for "dad"
		if (x.equals("dad")) {
			// print dad's birthday
		System.out.println("September 19th"); }
		// 6. if user asked for your name
		if (x.equals("your birthday")) {
			// print myBirthday
		System.out.println("July 16th"); }	
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remeber that person's birthday");
		}
	} 
}

package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		double money = 0.00;
		// Ask the user how many nickels they have
		String nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickel1 = Integer.parseInt(nickel);
		money += nickel1 * .05;
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime1 = Integer.parseInt(dime);
		money += dime1 * .10;

		// Ask the user how many quarters they have, and convert their answer
		String quater = JOptionPane.showInputDialog("How many quarters do you have?");
		int quater1 = Integer.parseInt(quater);
		money += quater1 * .25;

		// Calculate how much money the user has and save it in a double variable

		// Tell the user how much money they have
		System.out.println("" + money + "");
	}
}

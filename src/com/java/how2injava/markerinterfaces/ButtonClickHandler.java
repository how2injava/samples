package com.java.how2injava.markerinterfaces;

import java.awt.event.ActionEvent;//importing packages
import java.awt.event.ActionListener;//importing package
import javax.swing.JButton;//importing package

public class ButtonClickHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) { // override button click event

	}

	public static void main(String[] args) {

		JButton button = new JButton("Click Me"); // create button object

		button.addActionListener(new ButtonClickHandler()); // add listener to button

	}

}

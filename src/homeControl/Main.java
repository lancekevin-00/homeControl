package homeControl;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		final int FRAME_WIDTH = 800, FRAME_HEIGHT = 500;
		final int NUM_OF_ROWS = 2, NUM_OF_COLS = 2;
		
		JFrame frame = new JFrame("Home Control System");
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		
		
		//adding the functionality to the buttons
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("running script 2");
				try {
					String[] cmd = new String[] {"/bin/bash", "-c", "./button2script"};
					Runtime.getRuntime().exec(cmd);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("running script 3");
				try {
					String[] cmd = new String[] {"/bin/bash", "-c", "./button3script"};
					Runtime.getRuntime().exec(cmd);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("running script 4");
				try {
					String[] cmd = new String[] {"/bin/bash", "-c", "./button4script"};
					Runtime.getRuntime().exec(cmd);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		GridLayout mainPanelLayout = new GridLayout(NUM_OF_ROWS, NUM_OF_COLS);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(mainPanelLayout);
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		mainPanel.add(button4);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static void button1() {
		System.out.println("running script 1");
		try {
			String[] cmd = new String[] {"/bin/bash", "button1script"};
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

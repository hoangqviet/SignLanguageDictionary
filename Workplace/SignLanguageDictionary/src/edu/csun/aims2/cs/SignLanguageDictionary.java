package edu.csun.aims2.cs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SignLanguageDictionary implements ActionListener{

	private JFrame frame;
	private JTextField translateField;
	JButton submitButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignLanguageDictionary window = new SignLanguageDictionary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignLanguageDictionary() {
		initializeGUI();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JPanel statusPanel = new JPanel();
		statusPanel.setPreferredSize(new Dimension(10, 15));
		frame.getContentPane().add(statusPanel, BorderLayout.SOUTH);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setRequestFocusEnabled(false);
		leftPanel.setPreferredSize(new Dimension(150, 10));
		frame.getContentPane().add(leftPanel, BorderLayout.WEST);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(10, 300));
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(10, 405));
		mainPanel.add(topPanel, BorderLayout.NORTH);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(10, 125));
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		translateField = new JTextField();
		translateField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		translateField.setColumns(10);
		
		submitButton = new JButton("Translate");
		submitButton.setPreferredSize(new Dimension(90, 23));
		submitButton.addActionListener(this);
		submitButton.setAlignmentX(0.5f);

		GroupLayout gl_bottomPanel = new GroupLayout(bottomPanel);
		gl_bottomPanel.setHorizontalGroup(
			gl_bottomPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_bottomPanel.createSequentialGroup()
					.addGap(74)
					.addComponent(translateField, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(submitButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
		);
		gl_bottomPanel.setVerticalGroup(
			gl_bottomPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bottomPanel.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_bottomPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(translateField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(submitButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		bottomPanel.setLayout(gl_bottomPanel);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(150, 10));
		frame.getContentPane().add(rightPanel, BorderLayout.EAST);
	}
	
	
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == submitButton) {
				/*
				 * TODO tasks
				 * parseText();
				 * getImage();
				 * displayImage();
				 */
				
			}
			
			
			
		}
	
}

package new_ex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

/*
# inject0r
# RectAngleCalc GUI Version 
# Exercises for beginners
*/

public class RectApp {

	private JFrame frmJavaIotClass;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblWidth;
	private JLabel lblHeight;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RectApp window = new RectApp();
					window.frmJavaIotClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RectApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaIotClass = new JFrame();
		frmJavaIotClass.getContentPane().setBackground(UIManager.getColor("Button.focus"));
		frmJavaIotClass.setTitle("JAVA IOT CLASS");
		frmJavaIotClass.setBounds(100, 100, 572, 234);
		frmJavaIotClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaIotClass.getContentPane().setLayout(null);
		
		JLabel lblRectangleCalculator = new JLabel("RECTANGLE CALCULATOR");
		lblRectangleCalculator.setFont(new Font("Dialog", Font.BOLD, 32));
		lblRectangleCalculator.setBounds(49, 12, 467, 37);
		frmJavaIotClass.getContentPane().add(lblRectangleCalculator);
		
		textField = new JTextField();
		textField.setBounds(313, 61, 191, 37);
		frmJavaIotClass.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(313, 110, 191, 37);
		frmJavaIotClass.getContentPane().add(textField_1);
		
		lblWidth = new JLabel("WIDTH:");
		lblWidth.setFont(new Font("Dialog", Font.BOLD, 18));
		lblWidth.setBounds(215, 61, 104, 26);
		frmJavaIotClass.getContentPane().add(lblWidth);
		
		lblHeight = new JLabel("HEIGHT:");
		lblHeight.setFont(new Font("Dialog", Font.BOLD, 18));
		lblHeight.setBounds(215, 121, 104, 26);
		frmJavaIotClass.getContentPane().add(lblHeight);
		
		JButton btnNewButton = new JButton("getArea");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//RectAngleUtils r1 = new RectAngleUtils(width, height);
				//System.out.println("Rectangle1 Area :" + r1.getArea());
				
				double width = Double.parseDouble(textField.getText());
				double height = Double.parseDouble(textField_1.getText());
				RectAngleUtils r1 = new RectAngleUtils();
				double getArea = r1.getArea(width, height);
				textField_2.setText("Rectangle Area is " +String.valueOf(getArea));
			}
		});
		btnNewButton.setBounds(313, 152, 191, 37);
		frmJavaIotClass.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(24, 151, 277, 37);
		frmJavaIotClass.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}

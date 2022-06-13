import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 237, 360);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setText("");
		textField.setBounds(10, 11, 200, 40);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Row 1
		JButton btnDel = new JButton("<");
		btnDel.setBackground(Color.LIGHT_GRAY);
		btnDel.setFont(new Font("Arial", Font.BOLD, 22));
		btnDel.setBounds(10, 62, 50, 50);
		frmCalculator.getContentPane().add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");

			}
		});
		btnClear.setFont(new Font("Arial", Font.BOLD, 22));
		btnClear.setBounds(60, 62, 50, 50);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.setFont(new Font("Arial", Font.BOLD, 22));
		btnPercent.setBounds(110, 62, 50, 50);
		frmCalculator.getContentPane().add(btnPercent);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 22));
		btnAdd.setBounds(160, 62, 50, 50);
		frmCalculator.getContentPane().add(btnAdd);
		
		
		//Row 2
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 22));
		btn7.setBounds(10, 112, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 22));
		btn8.setBounds(60, 112, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 22));
		btn9.setBounds(110, 112, 50, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.LIGHT_GRAY);
		btnSub.setFont(new Font("Arial", Font.BOLD, 22));
		btnSub.setBounds(160, 112, 50, 50);
		frmCalculator.getContentPane().add(btnSub);
		
		//Row 3
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 22));
		btn4.setBounds(10, 162, 50, 50);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 22));
		btn5.setBounds(60, 162, 50, 50);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 22));
		btn6.setBounds(110, 162, 50, 50);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.setBackground(Color.LIGHT_GRAY);
		btnMult.setFont(new Font("Arial", Font.BOLD, 22));
		btnMult.setBounds(160, 162, 50, 50);
		frmCalculator.getContentPane().add(btnMult);
		
		//Row 4
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 22));
		btn1.setBounds(10, 212, 50, 50);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 22));
		btn2.setBounds(60, 212, 50, 50);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 22));
		btn3.setBounds(110, 212, 50, 50);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setFont(new Font("Arial", Font.BOLD, 22));
		btnDivide.setBounds(160, 212, 50, 50);
		frmCalculator.getContentPane().add(btnDivide);
		
		//Row 5
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				
				textField.setText(EnterNumber);

			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 22));
		btn0.setBounds(10, 262, 50, 50);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setFont(new Font("Arial", Font.BOLD, 22));
		btnDot.setBounds(60, 262, 50, 50);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+-");
		btnPM.setBackground(Color.LIGHT_GRAY);
		btnPM.setFont(new Font("Arial", Font.BOLD, 17));
		btnPM.setBounds(110, 262, 50, 50);
		frmCalculator.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setFont(new Font("Arial", Font.BOLD, 22));
		btnEqual.setBounds(160, 262, 50, 50);
		frmCalculator.getContentPane().add(btnEqual);
		
	}
}

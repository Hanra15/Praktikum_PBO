package kalku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator {

	private JFrame frmCalculator;
	private JTextField textField;
//	deklarasi variabel
//	nomor
	double firstnum;
	double secondnum;
//	hasil
	double result;
//	operasi
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("calculator");
		frmCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalculator.getContentPane().setForeground(new Color(0, 0, 0));
		frmCalculator.setBounds(100, 100, 270, 400);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 234, 35);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
//		fungsi operasi
		
//		tombol modulus / persen
		JButton btn_mod = new JButton("%");
		btn_mod.setForeground(Color.WHITE);
		btn_mod.setBackground(Color.BLACK);
		btn_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_mod.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_mod.setBounds(134, 57, 50, 50);
		frmCalculator.getContentPane().add(btn_mod);

//		tombol plus
		JButton btn_plus = new JButton("+");
		btn_plus.setForeground(Color.WHITE);
		btn_plus.setBackground(Color.BLACK);
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_plus.setBounds(194, 57, 50, 50);
		frmCalculator.getContentPane().add(btn_plus);
		
//		tombol minus
		JButton btn_min = new JButton("-");
		btn_min.setForeground(Color.WHITE);
		btn_min.setBackground(Color.BLACK);
		btn_min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_min.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_min.setBounds(194, 118, 50, 50);
		frmCalculator.getContentPane().add(btn_min);
		
//		tombol kali
		JButton btn_x = new JButton("*");
		btn_x.setForeground(Color.WHITE);
		btn_x.setBackground(Color.BLACK);
		btn_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_x.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_x.setBounds(194, 179, 50, 50);
		frmCalculator.getContentPane().add(btn_x);
		
//		tombol bagi
		JButton btn_bagi = new JButton("/");
		btn_bagi.setForeground(Color.WHITE);
		btn_bagi.setBackground(Color.BLACK);
		btn_bagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_bagi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_bagi.setBounds(194, 239, 50, 50);
		frmCalculator.getContentPane().add(btn_bagi);
		
//		fungsi kalkulator
		
//		tombol backspace
		JButton btn_bs = new JButton("\uF0E7");
		btn_bs.setForeground(Color.WHITE);
		btn_bs.setBackground(Color.BLACK);
		btn_bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btn_bs.setFont(new Font("Wingdings", Font.BOLD, 15));
		btn_bs.setBounds(10, 57, 50, 50);
		frmCalculator.getContentPane().add(btn_bs);
		
//		tombol clear
		JButton btn_clear = new JButton("C");
		btn_clear.setForeground(Color.WHITE);
		btn_clear.setBackground(Color.BLACK);
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_clear.setBounds(70, 57, 50, 50);
		frmCalculator.getContentPane().add(btn_clear);
		
//		tombol plus / minus
		JButton btn_pm = new JButton("+/-");
		btn_pm.setForeground(Color.WHITE);
		btn_pm.setBackground(Color.BLACK);
		btn_pm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btn_pm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_pm.setBounds(134, 300, 50, 50);
		frmCalculator.getContentPane().add(btn_pm);
		
//		tombol hasil
		JButton btn_hasil = new JButton("=");
		btn_hasil.setForeground(Color.WHITE);
		btn_hasil.setBackground(Color.BLACK);
		btn_hasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		}); 
		btn_hasil.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_hasil.setBounds(194, 300, 50, 50);
		frmCalculator.getContentPane().add(btn_hasil);
		
//		tombol koma
		JButton btn_dot = new JButton(".");
		btn_dot.setForeground(Color.WHITE);
		btn_dot.setBackground(Color.BLACK);
		btn_dot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_dot.setBounds(70, 300, 50, 50);
		frmCalculator.getContentPane().add(btn_dot);
		
//		fungsi nomor
		
//		nomor baris 1
		
		JButton btn_7 = new JButton("7");
		btn_7.setForeground(Color.WHITE);
		btn_7.setBackground(Color.BLACK);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_7.getText();
				textField.setText(Number);
			}
		});
		btn_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_7.setBounds(10, 117, 50, 50);
		frmCalculator.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setForeground(Color.WHITE);
		btn_8.setBackground(Color.BLACK);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_8.getText();
				textField.setText(Number);
			}
		});
		btn_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_8.setBounds(70, 117, 50, 50);
		frmCalculator.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setForeground(Color.WHITE);
		btn_9.setBackground(Color.BLACK);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_9.getText();
				textField.setText(Number);
			}
		});
		btn_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_9.setBounds(134, 117, 50, 50);
		frmCalculator.getContentPane().add(btn_9);
		
//		nomor baris 2
		
		JButton btn_4 = new JButton("4");
		btn_4.setForeground(Color.WHITE);
		btn_4.setBackground(Color.BLACK);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_4.getText();
				textField.setText(Number);
			}
		});
		btn_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_4.setBounds(10, 178, 50, 50);
		frmCalculator.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setForeground(Color.WHITE);
		btn_5.setBackground(Color.BLACK);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_5.getText();
				textField.setText(Number);
			}
		});
		btn_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_5.setBounds(70, 178, 50, 50);
		frmCalculator.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setForeground(Color.WHITE);
		btn_6.setBackground(Color.BLACK);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_6.getText();
				textField.setText(Number);
			}
		});
		btn_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_6.setBounds(134, 178, 50, 50);
		frmCalculator.getContentPane().add(btn_6);
		
//		nomor baris 3
		
		JButton btn_1 = new JButton("1");
		btn_1.setForeground(Color.WHITE);
		btn_1.setBackground(Color.BLACK);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_1.getText();
				textField.setText(Number);
			}
		});
		btn_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_1.setBounds(10, 239, 50, 50);
		frmCalculator.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setForeground(Color.WHITE);
		btn_2.setBackground(Color.BLACK);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_2.getText();
				textField.setText(Number);
			}
		});
		btn_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_2.setBounds(70, 239, 50, 50);
		frmCalculator.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setForeground(Color.WHITE);
		btn_3.setBackground(Color.BLACK);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_3.getText();
				textField.setText(Number);
			}
		});
		btn_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_3.setBounds(134, 239, 50, 50);
		frmCalculator.getContentPane().add(btn_3);
		
//		nomor baris 4
		
		JButton btn_0 = new JButton("0");
		btn_0.setForeground(Color.WHITE);
		btn_0.setBackground(Color.BLACK);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_0.getText();
				textField.setText(Number);
			}
		});
		btn_0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_0.setBounds(10, 300, 50, 50);
		frmCalculator.getContentPane().add(btn_0);
		
	}
}

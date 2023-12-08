package praktikum7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator {

	private JFrame frmKalkulator;
	private JTextField textField;
	
	double firstnum, secondnum, result;
	
	String operation, answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frmKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKalkulator = new JFrame();
		frmKalkulator.setTitle("Kalkulator");
		frmKalkulator.setBounds(100, 100, 420, 357);
		frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 384, 40);
		frmKalkulator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_2.getText();
				textField.setText(Number);
			}
		});
		btn_2.setBounds(109, 160, 89, 37);
		frmKalkulator.getContentPane().add(btn_2);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_1.getText();
				textField.setText(Number);
			}
		});
		btn_1.setBounds(10, 160, 89, 37);
		frmKalkulator.getContentPane().add(btn_1);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_3.getText();
				textField.setText(Number);
			}
		});
		btn_3.setBounds(208, 160, 89, 37);
		frmKalkulator.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_4.getText();
				textField.setText(Number);
			}
		});
		btn_4.setBounds(10, 110, 89, 34);
		frmKalkulator.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_5.getText();
				textField.setText(Number);
			}
		});
		btn_5.setBounds(109, 110, 89, 34);
		frmKalkulator.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_6.getText();
				textField.setText(Number);
			}
		});
		btn_6.setBounds(208, 110, 89, 34);
		frmKalkulator.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_7.getText();
				textField.setText(Number);
			}
		});
		btn_7.setBounds(10, 62, 89, 37);
		frmKalkulator.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_8.getText();
				textField.setText(Number);
			}
		});
		btn_8.setBounds(109, 62, 89, 37);
		frmKalkulator.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_9.getText();
				textField.setText(Number);
			}
		});
		btn_9.setBounds(208, 62, 89, 37);
		frmKalkulator.getContentPane().add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBounds(109, 208, 89, 34);
		frmKalkulator.getContentPane().add(btn_0);
		
		JButton btn_tambah = new JButton("+");
		btn_tambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_tambah.setBounds(307, 62, 89, 37);
		frmKalkulator.getContentPane().add(btn_tambah);
		
		JButton btn_kurang = new JButton("-");
		btn_kurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_kurang.setBounds(307, 110, 89, 34);
		frmKalkulator.getContentPane().add(btn_kurang);
		
		JButton btn_kali = new JButton("*");
		btn_kali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_kali.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_kali.setBounds(307, 160, 89, 37);
		frmKalkulator.getContentPane().add(btn_kali);
		
		JButton btn_bagi = new JButton("/");
		btn_bagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_bagi.setBounds(307, 208, 89, 34);
		frmKalkulator.getContentPane().add(btn_bagi);
		
		JButton btn_hasil = new JButton("=");
		btn_hasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btn_hasil.setBounds(208, 208, 89, 34);
		frmKalkulator.getContentPane().add(btn_hasil);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setBounds(10, 208, 89, 34);
		frmKalkulator.getContentPane().add(btn_clear);
		
		JButton btn_plusminus = new JButton("+/-");
		btn_plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btn_plusminus.setBounds(10, 253, 89, 23);
		frmKalkulator.getContentPane().add(btn_plusminus);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Koma = textField.getText() + btn_dot.getText();
				textField.setText(Koma);
			}
		});
		btn_dot.setBounds(109, 253, 89, 23);
		frmKalkulator.getContentPane().add(btn_dot);
		
		JButton btn_back = new JButton("<-");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btn_back.setBounds(208, 253, 89, 23);
		frmKalkulator.getContentPane().add(btn_back);
	}

}

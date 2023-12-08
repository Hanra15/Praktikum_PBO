package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Kal {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kal window = new Kal();
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
	public Kal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_5 = new JButton("+");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_5.getText();
				textField.setText(Number);

			}
		});
		btn_5.setBounds(10, 58, 89, 23);
		frame.getContentPane().add(btn_5);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

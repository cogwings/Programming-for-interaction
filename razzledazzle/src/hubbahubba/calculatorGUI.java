package hubbahubba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class calculatorGUI extends JFrame {

	private calculator calk;
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorGUI frame = new calculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculatorGUI() {
		
		calk = new calculator();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calk.numberButtonPressed(1);
				
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(2);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(3);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(4);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(5);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(6);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(7);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(8);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
				
			}
		});
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(9);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
				
			}
		});
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.numberButtonPressed(0);
				int i = calk.getOperand();
				
				textField.setText(String.valueOf(i));
				
				
			}
		});
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.clear();
				textField.setText("");
			}
		});
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.equals();
				
				textField.setText(""+calk.getResult());
			}
		});
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.plus();
				//int i = calk.getOperator();
				
				textField.setText(""+calk.getOperator());
				
			}
		});
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.minus();
				
				textField.setText(""+calk.getOperator());
			}
		});
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calk.mult();
				textField.setText(""+calk.getOperator());
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button_13 = new JButton(",");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2)
							.addGap(6)
							.addComponent(button_11))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_6)
								.addComponent(btnC))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_10)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_13))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_8)
									.addGap(6)
									.addComponent(btnX))))
						.addComponent(textField))
					.addContainerGap(248, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1)
						.addComponent(button_2)
						.addComponent(button_11))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3)
						.addComponent(button_4)
						.addComponent(button_5)
						.addComponent(button_12))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_6)
						.addComponent(button_7)
						.addComponent(button_8)
						.addComponent(btnX))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_9)
						.addComponent(btnC)
						.addComponent(button_10)
						.addComponent(button_13))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	
	}
}

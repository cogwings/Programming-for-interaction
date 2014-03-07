import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldColor;
	private JTextField textFieldSize;
	private JTextField textFieldPrice;
    private BikeStore bs;
    private JTextArea textPlace;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		
		bs = new BikeStore();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Add bike");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bs.addBike(textFieldColor.getText(),Integer.parseInt(textFieldSize.getText()), Integer.parseInt(textFieldPrice.getText()));
				
				textPlace.setText(bs.getAllBikes());
			}
		});
		btnNewButton_1.setBounds(63, 162, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textFieldColor = new JTextField();
		textFieldColor.setBounds(24, 9, 128, 28);
		contentPane.add(textFieldColor);
		textFieldColor.setColumns(10);
		
		textFieldSize = new JTextField();
		textFieldSize.setBounds(24, 48, 128, 28);
		contentPane.add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(24, 87, 125, 28);
		contentPane.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		 textPlace = new JTextArea();
		textPlace.setBounds(199, 11, 414, 208);
		contentPane.add(textPlace);
	}
}

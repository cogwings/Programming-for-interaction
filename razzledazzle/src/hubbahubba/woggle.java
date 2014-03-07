package hubbahubba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class woggle {

	private JFrame frame;
	private JTextField txtProfilnamnChunLee;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					woggle window = new woggle();
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
	public woggle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnHjlp.add(menuItem);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEartxyc = new JLabel("");
		lblEartxyc.setBounds(0, 0, 195, 256);
		lblEartxyc.setVerticalAlignment(SwingConstants.TOP);
		lblEartxyc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEartxyc.setIcon(new ImageIcon(woggle.class.getResource("/Pics/zgh.jpg")));
		panel.add(lblEartxyc);
		
		txtProfilnamnChunLee = new JTextField();
		txtProfilnamnChunLee.setText("Chun Lee\r\n\r\n\r\n\r\n");
		txtProfilnamnChunLee.setBounds(269, 48, 155, 20);
		panel.add(txtProfilnamnChunLee);
		txtProfilnamnChunLee.setColumns(10);
		
		textField = new JTextField();
		textField.setText("2006-01-09");
		textField.setBounds(269, 120, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("2006-01-01");
		textField_1.setBounds(269, 85, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProfilnamn = new JLabel("Profilnamn:");
		lblProfilnamn.setBounds(202, 51, 57, 14);
		panel.add(lblProfilnamn);
		
		JLabel lblRegistrerad = new JLabel("Registrerad:");
		lblRegistrerad.setBounds(205, 88, 70, 14);
		panel.add(lblRegistrerad);
		
		JLabel lblSenastAktiv = new JLabel("Senast aktiv:");
		lblSenastAktiv.setBounds(205, 121, 70, 14);
		panel.add(lblSenastAktiv);
		
		JLabel lblLsenord = new JLabel("L\u00F6senord");
		lblLsenord.setBounds(213, 155, 46, 14);
		panel.add(lblLsenord);
		
		textField_2 = new JTextField();
		textField_2.setText("****** ******");
		textField_2.setBounds(269, 151, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnndraLsenord = new JButton("\u00C4ndra l\u00F6senord");
		btnndraLsenord.setBounds(316, 171, 108, 23);
		panel.add(btnndraLsenord);
	}
}

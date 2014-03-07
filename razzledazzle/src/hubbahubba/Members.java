package hubbahubba;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Members {

	private JFrame frame;
	
	private static int numberOfMembers;
	
	private String name;
	private String vatNumber;
	private String address;
	private String coAddress;
	private String postal_code;
	private String Email_address;
	private String image="profile.png"; /*default user image*/
	
	public String getCoAddres(){
		return coAddress;
	}
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Members window = new Members();
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
	public Members() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

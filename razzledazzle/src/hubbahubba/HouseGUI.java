package hubbahubba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 33, 394, 247);
		getContentPane().add(textArea);
		

	
		
		House h1 = new House(1999,300);
		House h2 = new House(1902,123);
		House h3 = new House(1953,670);
		
		
		House[] myHouse = new House[10];
		myHouse[0] = h1;
		myHouse[1] = h2;
		myHouse[2] = h3;
	
		for(int i = 0; i <myHouse.length; ++i){
			if(myHouse[i] !=null){
				int tid = myHouse[i].getYear();
				int stor= myHouse[i].getSize();
				textArea.append("Ett hus är byggt:"+tid+".	"+"Med ytan:"+stor+"\n");
				
			}
		}

		textArea.append("totalt antal hus:"+ House.getNbrHouses());
			
		}
	}



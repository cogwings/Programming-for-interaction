import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class zooGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zooGui frame = new zooGui();
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
	public zooGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea infoArea = new JTextArea();
		infoArea.setEditable(false);
		infoArea.setBounds(10, 11, 414, 239);
		contentPane.add(infoArea);

		Dog animal1 = new Dog("Canis voffus", 6, "is");
		Cat animal2 = new Cat("Ordförande Mjau", 8, "lands");
		Snake animal3 = new Snake("Snakeius sligeris", "is");
		Dog animal4 = new Dog(" Canis pltono", 4, "is ");
		Cat animal5 = new Cat("Splot", 8, "does ");
		Cat animal6 = new Cat("ordförande mjau", 39, "doesn't land ");
		Snake animal7 = new Snake("mouse", "is");
		Dog animal8 = new Dog("majs", 14, "is not ");
		Dog animal9 = new Dog("Laika", 2, "is ");

		ArrayList<Animal> myAnimals = new ArrayList<Animal>();

		myAnimals.add(animal1);
		myAnimals.add(animal3);
		myAnimals.add(animal5);
		myAnimals.add(animal2);

		for (Animal x : myAnimals) {
			infoArea.append(x.getInfo() + "\n");
		}
	}
}

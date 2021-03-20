import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JButton;

public class Pages {

	private JFrame frame;
	private final JLayeredPane layeredPane = new JLayeredPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pages window = new Pages();
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
	public Pages() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 902, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		layeredPane.setBounds(0, 0, 888, 663);
		frame.getContentPane().add(layeredPane);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 150, 663);
		layeredPane.add(btnPanel);
		btnPanel.setLayout(null);
		
		JButton btnList = new JButton("List");
		btnList.setBounds(12, 82, 126, 50);
		btnPanel.add(btnList);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(12, 180, 126, 50);
		btnPanel.add(btnInsert);
		
		JPanel insertPanel = new JPanel();
		insertPanel.setBounds(150, 0, 735, 663);
		layeredPane.add(insertPanel);
		insertPanel.setLayout(null);
		
		JPanel listPanel = new JPanel();
		listPanel.setBounds(150, 0, 735, 663);
		layeredPane.add(listPanel);
		frame.setLocationRelativeTo(null);
		
	}
}

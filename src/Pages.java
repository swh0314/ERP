import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTable;

public class Pages {

	private JFrame frame;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private JTextField txtName;
	private JTextField txtBirth;
	private JTextField txtPhone;
	private JTable infoTable;
	private JTextField txtSearch;

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
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		layeredPane.setBounds(0, 0, 888, 663);
		frame.getContentPane().add(layeredPane);
		
		JPanel listPanel = new JPanel();
		listPanel.setBounds(150, 0, 735, 663);
		layeredPane.add(listPanel);
		listPanel.setLayout(null);
		
		JLabel infoLabel2 = new JLabel("\uC778\uC0AC \uBAA9\uB85D");
		infoLabel2.setBounds(143, 10, 455, 68);
		infoLabel2.setHorizontalAlignment(JLabel.CENTER);
		listPanel.add(infoLabel2);
		
		infoTable = new JTable();
		infoTable.setBounds(31, 97, 678, 541);
		listPanel.add(infoTable);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(31, 57, 629, 30);
		listPanel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel btnSearch = new JLabel("search");
		btnSearch.setBounds(659, 57, 64, 30);
		listPanel.add(btnSearch);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 150, 663);
		layeredPane.add(btnPanel);
		btnPanel.setLayout(null);
		
		JButton btnList = new JButton("List");
		btnList.setBounds(12, 128, 126, 50);
		btnPanel.add(btnList);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(12, 210, 126, 50);
		btnPanel.add(btnInsert);
		
		JPanel insertPanel = new JPanel();
		insertPanel.setBounds(150, 0, 735, 663);
		layeredPane.add(insertPanel);
		insertPanel.setLayout(null);
		
		JLabel infoLabel = new JLabel("\uC778\uC0AC \uB4F1\uB85D");
		infoLabel.setFont(new Font("HY±×·¡ÇÈM", Font.PLAIN, 30));
		infoLabel.setBounds(121, 10, 508, 53);
		infoLabel.setHorizontalAlignment(JLabel.CENTER);
		insertPanel.add(infoLabel);
		
		JLabel nameLabel = new JLabel("\uC774\uB984 : ");
		nameLabel.setBounds(12, 99, 84, 30);
		insertPanel.add(nameLabel);
		
		txtName = new JTextField();
		txtName.setBounds(108, 99, 118, 30);
		insertPanel.add(txtName);
		txtName.setColumns(10);
		
		JLabel birthLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C : ");
		birthLabel.setBounds(324, 99, 95, 30);
		insertPanel.add(birthLabel);
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(418, 100, 118, 30);
		insertPanel.add(txtBirth);
		
		JLabel sexLabel = new JLabel("\uC131\uBCC4 : ");
		sexLabel.setBounds(12, 181, 84, 30);
		insertPanel.add(sexLabel);
		
		JRadioButton sexMan = new JRadioButton("\uB0A8");
		sexMan.setBounds(113, 185, 49, 23);
		insertPanel.add(sexMan);
		
		JRadioButton sexWoman = new JRadioButton("\uC5EC");
		sexWoman.setBounds(166, 185, 39, 23);
		insertPanel.add(sexWoman);
		
		ButtonGroup btnSex = new ButtonGroup();
		btnSex.add(sexMan);
		btnSex.add(sexWoman);
		
		JLabel phoneLabel = new JLabel("\uC5F0\uB77D\uCC98 : ");
		phoneLabel.setBounds(324, 181, 84, 30);
		insertPanel.add(phoneLabel);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(420, 181, 118, 30);
		insertPanel.add(txtPhone);
		
		JLabel workLabel = new JLabel("\uBD80\uC11C : ");
		workLabel.setBounds(12, 277, 84, 30);
		insertPanel.add(workLabel);
		
		JLabel jobLabel = new JLabel("\uC9C1\uCC45 : ");
		jobLabel.setBounds(324, 277, 84, 30);
		insertPanel.add(jobLabel);
		
		JLabel gradeLabel = new JLabel("\uB4F1\uAE09 : ");
		gradeLabel.setBounds(12, 363, 84, 30);
		insertPanel.add(gradeLabel);
		
		JRadioButton gradeS = new JRadioButton("S");
		gradeS.setBounds(84, 367, 49, 23);
		insertPanel.add(gradeS);
		
		JRadioButton gradeA = new JRadioButton("A");
		gradeA.setBounds(131, 367, 39, 23);
		insertPanel.add(gradeA);
		
		JRadioButton gradeB = new JRadioButton("B");
		gradeB.setBounds(174, 367, 49, 23);
		insertPanel.add(gradeB);
		
		JRadioButton gradeC = new JRadioButton("C");
		gradeC.setBounds(227, 367, 39, 23);
		insertPanel.add(gradeC);
		
		JRadioButton gradeD = new JRadioButton("D");
		gradeD.setBounds(270, 367, 49, 23);
		insertPanel.add(gradeD);
		
		JRadioButton gradeF = new JRadioButton("F");
		gradeF.setBounds(317, 367, 39, 23);
		insertPanel.add(gradeF);
		
		ButtonGroup btnGrade = new ButtonGroup();
		btnGrade.add(gradeS);	btnGrade.add(gradeA);
		btnGrade.add(gradeB);	btnGrade.add(gradeC);
		btnGrade.add(gradeD);	btnGrade.add(gradeF);
		frame.setLocationRelativeTo(null);
		
		btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertPanel.setVisible(false);
				listPanel.setVisible(true);
			}
			
		});
		
		btnInsert.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				listPanel.setVisible(false);
				insertPanel.setVisible(true);
			}
			
		});
		
	}
}

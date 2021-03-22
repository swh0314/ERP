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
import javax.swing.SwingConstants;

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
		infoLabel2.setBounds(130, 10, 450, 35);
		infoLabel2.setHorizontalAlignment(JLabel.CENTER);
		listPanel.add(infoLabel2);
		
		infoTable = new JTable();
		infoTable.setBounds(30, 100, 690, 540);
		listPanel.add(infoTable);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(30, 60, 630, 30);
		txtSearch.setColumns(10);
		txtSearch.setHorizontalAlignment(JTextField.CENTER);
		listPanel.add(txtSearch);
		
		JLabel btnSearch = new JLabel("search");
		btnSearch.setHorizontalAlignment(SwingConstants.CENTER);
		btnSearch.setBounds(660, 60, 60, 30);
		listPanel.add(btnSearch);
		
		JPanel insertPanel = new JPanel();
		insertPanel.setBounds(150, 0, 735, 663);
		layeredPane.add(insertPanel);
		insertPanel.setLayout(null);
		
		JLabel infoLabel = new JLabel("\uC778\uC0AC \uB4F1\uB85D");
		infoLabel.setFont(new Font("HY±×·¡ÇÈM", Font.PLAIN, 30));
		infoLabel.setBounds(101, 10, 508, 53);
		infoLabel.setHorizontalAlignment(JLabel.CENTER);
		insertPanel.add(infoLabel);
		
		JLabel nameLabel = new JLabel("\uC774\uB984 : ");
		nameLabel.setBounds(12, 100, 100, 30);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		insertPanel.add(nameLabel);
		
		txtName = new JTextField();
		txtName.setBounds(113, 100, 140, 30);
		insertPanel.add(txtName);
		txtName.setColumns(10);
		
		JLabel birthLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C : ");
		birthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		birthLabel.setBounds(324, 100, 100, 30);
		insertPanel.add(birthLabel);
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(425, 100, 140, 30);
		insertPanel.add(txtBirth);
		
		JLabel genderLabel = new JLabel("\uC131\uBCC4 : ");
		genderLabel.setBounds(12, 180, 100, 30);
		genderLabel.setHorizontalAlignment(JLabel.CENTER);
		insertPanel.add(genderLabel);
		
		JRadioButton genderMan = new JRadioButton("\uB0A8");
		genderMan.setBounds(113, 180, 49, 30);
		insertPanel.add(genderMan);
		
		JRadioButton genderWoman = new JRadioButton("\uC5EC");
		genderWoman.setBounds(165, 180, 50, 30);
		insertPanel.add(genderWoman);
		
		JLabel phoneLabel = new JLabel("\uC5F0\uB77D\uCC98 : ");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setBounds(324, 181, 84, 30);
		insertPanel.add(phoneLabel);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(425, 180, 140, 30);
		insertPanel.add(txtPhone);
		
		JLabel workLabel = new JLabel("\uBD80\uC11C : ");
		workLabel.setHorizontalAlignment(SwingConstants.CENTER);
		workLabel.setBounds(12, 260, 100, 30);
		insertPanel.add(workLabel);
		
		JLabel jobLabel = new JLabel("\uC9C1\uCC45 : ");
		jobLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jobLabel.setBounds(324, 260, 100, 30);
		insertPanel.add(jobLabel);
		
		JLabel gradeLabel = new JLabel("\uB4F1\uAE09 : ");
		gradeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gradeLabel.setBounds(12, 340, 100, 30);
		insertPanel.add(gradeLabel);
		
		JRadioButton gradeS = new JRadioButton("S");
		gradeS.setBounds(113, 340, 50, 30);
		insertPanel.add(gradeS);
		
		JRadioButton gradeA = new JRadioButton("A");
		gradeA.setBounds(163, 340, 50, 30);
		insertPanel.add(gradeA);
		
		JRadioButton gradeB = new JRadioButton("B");
		gradeB.setBounds(213, 340, 50, 30);
		insertPanel.add(gradeB);
		
		JRadioButton gradeC = new JRadioButton("C");
		gradeC.setBounds(263, 340, 50, 30);
		insertPanel.add(gradeC);
		
		JRadioButton gradeD = new JRadioButton("D");
		gradeD.setBounds(313, 340, 50, 30);
		insertPanel.add(gradeD);
		
		JRadioButton gradeF = new JRadioButton("F");
		gradeF.setBounds(363, 340, 50, 30);
		insertPanel.add(gradeF);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(100, 520, 500, 50);
		insertPanel.add(btnSubmit);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 150, 663);
		layeredPane.add(btnPanel);
		btnPanel.setLayout(null);
		
		JButton btnList = new JButton("List");
		btnList.setBounds(12, 125, 125, 50);
		btnPanel.add(btnList);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(12, 200, 125, 50);
		btnPanel.add(btnInsert);
		
		ButtonGroup btnGender = new ButtonGroup();
		btnGender.add(genderMan);
		btnGender.add(genderWoman);
		
		ButtonGroup btnGrade = new ButtonGroup();
		btnGrade.add(gradeS);	
		btnGrade.add(gradeA);
		btnGrade.add(gradeB);	
		btnGrade.add(gradeC);
		btnGrade.add(gradeD);	
		btnGrade.add(gradeF);
		
		btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertPanel.setVisible(false);
				listPanel.setVisible(true);
			}
			
		});
		
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listPanel.setVisible(false);
				insertPanel.setVisible(true);
			}
			
		});
		
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member(); 
			}
			
		});
		
	}
}

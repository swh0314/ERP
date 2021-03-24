import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Pages {

	private static final Graphics Graphics = null;
	private JFrame frame;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private JTextField txtName;
	private JTextField txtBirth;
	private JTextField txtPhone;
	private JTable infoTable;
	private JTextField txtSearch;
	private JTextField txtJoinday;
	private JTextField idField;
	private JPasswordField passField;

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
		Member member = new Member();

		frame = new JFrame();
		frame.setBounds(100, 100, 902, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		layeredPane.setBounds(0, 0, 888, 663);
		frame.getContentPane().add(layeredPane);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 150, 663);
		btnPanel.setLayout(null);
		btnPanel.setVisible(false);
		
		JPanel homePanel = new JPanel();
		homePanel.setBounds(0, 0, 888, 663);
		homePanel.setLayout(null);
		homePanel.setVisible(true);
		layeredPane.add(homePanel);
		
		JLabel lblNewLabel = new JLabel("\uC778\uC0AC \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("HY엽서M", Font.BOLD, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 100, 650, 200);
		homePanel.add(lblNewLabel);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(260, 350, 90, 30);
		homePanel.add(idLabel);
		
		JLabel passLabel = new JLabel("PassWord");
		passLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passLabel.setBounds(220, 410, 130, 30);
		homePanel.add(passLabel);
		
		idField = new JTextField();
		idField.setBounds(370, 350, 150, 30);
		homePanel.add(idField);
		idField.setColumns(10);
		
		passField = new JPasswordField();
		passField.setBounds(370, 410, 150, 30);
		homePanel.add(passField);
		
		JButton btnLoggin = new JButton("LOG IN");
		btnLoggin.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnLoggin.setHorizontalAlignment(SwingConstants.CENTER);
		btnLoggin.setBounds(260, 481, 338, 42);
		homePanel.add(btnLoggin);
		
		layeredPane.add(btnPanel);
		
		JButton btnList = new JButton("List");
		btnList.setBounds(12, 125, 125, 50);
		btnPanel.add(btnList);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(12, 200, 125, 50);
		btnPanel.add(btnInsert);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(12, 278, 125, 50);
		btnPanel.add(btnHome);
			

		JPanel insertPanel = new JPanel();
		insertPanel.setBounds(150, 0, 735, 663);
		insertPanel.setLayout(null);
		insertPanel.setVisible(false);
		layeredPane.add(insertPanel);
		
		JLabel infoLabel = new JLabel("\uC778\uC0AC \uB4F1\uB85D");
		infoLabel.setFont(new Font("HY그래픽M", Font.PLAIN, 30));
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
		
		JRadioButton genderMan = new JRadioButton("Male");
		genderMan.setSelected(true);
		genderMan.setBounds(113, 180, 49, 30);
		insertPanel.add(genderMan);
		
		JRadioButton genderWoman = new JRadioButton("Female");
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
		
		ButtonGroup btnGender = new ButtonGroup();
		btnGender.add(genderMan);
		btnGender.add(genderWoman);
		
		ButtonGroup btnGrade = new ButtonGroup();
		btnGrade.add(gradeS);	btnGrade.add(gradeA);
		btnGrade.add(gradeB);	btnGrade.add(gradeC);
		btnGrade.add(gradeD);	btnGrade.add(gradeF);
		
		JComboBox comboWork = new JComboBox(new String[] {"Account", "R&D", "H&R", "Sales", "Marketing", "Manufacture"});
		comboWork.setBackground(Color.WHITE);
		comboWork.setBounds(113, 260, 150, 30);
		insertPanel.add(comboWork);
		
		JComboBox comboJob = new JComboBox(new String[] {"chief leader","leader", "follower", "part-time"});
		comboJob.setBackground(Color.WHITE);
		comboJob.setBounds(425, 260, 150, 30);
		insertPanel.add(comboJob);
		
		JLabel joindayLabel = new JLabel("\uC785\uC0AC\uC77C : ");
		joindayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		joindayLabel.setBounds(12, 420, 100, 30);
		insertPanel.add(joindayLabel);
		
		txtJoinday = new JTextField();
		txtJoinday.setColumns(10);
		txtJoinday.setBounds(113, 420, 140, 30);
		insertPanel.add(txtJoinday);
		
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String birth = txtBirth.getText();
				String gender = null;
				String phone = txtPhone.getText();
				String grade = "-";
				String work = comboWork.getSelectedItem().toString();
				String job = comboJob.getSelectedItem().toString();
				String joinday = txtJoinday.getText();
				
				if(genderMan.isSelected()) {
					gender = "Male";
				} else if(genderWoman.isSelected()) {
					gender = "Female";
				}
				
				if(gradeS.isSelected()) {
					grade = "S";
				} else if(gradeA.isSelected()){
					grade = "A";
				} else if(gradeB.isSelected()) {
					grade = "B";
				} else if(gradeC.isSelected()) {
					grade = "C";
				} else if(gradeD.isSelected()) {
					grade = "D";
				} else if(gradeF.isSelected()) {
					grade = "F";
				}
				
				member.createMember(name, birth, gender, phone, work, job, grade, joinday);
				JOptionPane.showMessageDialog(null, "등록을 완료했습니다.");
			}
			
		});
		
		JPanel listPanel = new JPanel();
		listPanel.setBounds(150, 0, 735, 663);
		listPanel.setLayout(null);
		listPanel.setVisible(false);
		layeredPane.add(listPanel);
		
		JLabel infoLabel2 = new JLabel("\uC778\uC0AC \uBAA9\uB85D");
		infoLabel2.setBounds(130, 10, 450, 35);
		infoLabel2.setHorizontalAlignment(JLabel.CENTER);
		listPanel.add(infoLabel2);
		
		String[] headers = new String[] {"Name", "Birth", "Gender", "Phone", "Work", "Job", "Grade", "JoinDay"};
		String[][] data = Member.getMembers(); 
		
		infoTable = new JTable(data, headers);
		infoTable.setBounds(30, 100, 690, 540);
		infoTable.setRowHeight(30);
		infoTable.setAlignmentX(0);
		infoTable.setPreferredScrollableViewportSize(new Dimension(690, 540));
		
//		listPanel.add(infoTable);
		JScrollPane scrollPane = new JScrollPane(infoTable);
		scrollPane.setBounds(30, 100, 690, 540);
		listPanel.add(scrollPane);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(30, 60, 720, 30);
		txtSearch.setColumns(10);
		txtSearch.setHorizontalAlignment(JTextField.CENTER);
		listPanel.add(txtSearch);
		
		txtSearch.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String value= txtSearch.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<TableModel> (infoTable.getModel());
				infoTable.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(value));
			}
		});
		
		//table의 column을 설정
		TableColumnModel columnModels = infoTable.getColumnModel();
		columnModels.getColumn(6).setPreferredWidth(20);

		btnLoggin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(idField.getText().equals("Admin") && Arrays.equals(passField.getPassword(), new char[] {'1', '2', '3', '4'})) {
					homePanel.setVisible(false);
					listPanel.setVisible(true);
					btnPanel.setVisible(true);
				}
			}	
		});
		
		btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertPanel.setVisible(false);
				listPanel.setVisible(true);
				homePanel.setVisible(false);
				
			}
		});
		
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listPanel.setVisible(false);
				insertPanel.setVisible(true);
				homePanel.setVisible(false);
			}
			
		});

		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnPanel.setVisible(false);
				homePanel.setVisible(true);
				listPanel.setVisible(false);
				insertPanel.setVisible(false);
			}
			
		});
		
		
	}

}

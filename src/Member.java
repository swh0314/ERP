import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Member {
	
//	private String name;
//	private String birth;
//	private String gender;
//	private String phone;
//	private String work;
//	private String job;
//	private String grade;
//	private String join;
//	
//	public Member(String name, String birth, String gender, 
//			String phone, String work, String job,
//			String grade, String join) {
//		super();
//		this.name = name;
//		this.birth = birth;
//		this.gender = gender;
//		this.phone = phone;
//		this.work = work;
//		this.job = job;
//		this.grade = grade;
//		this.join = join;
//	}
//	
//	public Member() {
//		super();
//	}
//	
//	private String getName() {
//		return name;
//	}
//	private void setName(String name) {
//		this.name = name;
//	}
//	private String getGender() {
//		return gender;
//	}
//	private void setGender(String gender) {
//		this.gender = gender;
//	}
//	private String getBirth() {
//		return birth;
//	}
//	private void setBirthDay(String birth) {
//		this.birth = birth;
//	}
//	private String getPhone() {
//		return phone;
//	}
//	private void setPhone(String phone) {
//		this.phone= phone;
//	}
//	private String getWork() {
//		return work;
//	}
//	private void setWork(String work) {
//		this.work = work;
//	}
//	private String getJob() {
//		return job;
//	}
//	private void setJob(String job) {
//		this.job = job;
//	}
//	private String getGrade() {
//		return grade;
//	}
//	private void setGrade(String grade) {
//		this.grade = grade;
//	}
//	private String getJoin() {
//		return join;
//	}
//	private void setJoin(String join) {
//		this.join = join;
//	}
//	
//	private void printMember(Member member) {
//		System.out.println(member.getName() + "/" + member.getGender() + "/" +
//				member.getBirth() + "/" + member.getPhone() + "/" + 
//				member.getWork() + "/" + member.getJob() + "/" + member.getJoin());
//	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6400552"; /* jdbc:mysql://database host:port num(e-mail�� Ȯ��)/database name */
			String user = "sql6400552"; //database username
			String password = "jJJ5Twf7zS"; //�ش� ����Ʈ�� �����Ҷ� �Է��ߴ� e-mail�� ���� ���Ȯ�� �ʿ�
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password); //�ش� line�� error�� �߻��ϴ� ��� �ٷ� catch�� �Ѿ -> ���������� ������ ��� �Ʒ� ������ �����Բ���
			System.out.println("The Connection Successful");
			return con;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void createMember(String name, String birth, String gender, 
			String phone, String work, String job,
			String grade, String joinday) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INERT INTO member"
					+ "(name, birth, gender, phone, work, job, grade, joinday) "
					+ "VALUE "
					+ "('"+name+"', '"+birth+"', '"+gender+"', '"+phone+"', '"+work+"', '"+job+"', '"+grade+"', '"+joinday+"')"); // "�� ���� sql�� 'String' �� ������
			insert.executeUpdate();
		} catch(Exception e) {
			
		}
	}
	
	public static void createTable() {
		try {
			Connection con = getConnection(); //sql�� ����
			
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "member(id int NOT NULL, AUTO_INCREMENT,"
					+ "name varChar(15), "
					+ "birth varChar(10), "
					+ "gender varChar(1), "
					+ "phone varChar(15), "
					+ "work varChar(20),"
					+ "job varChar(10),"
					+ "grade varChar(1),"
					+ "joinday varChar(10),"
					+ "PRIMARY KEY(id))" ); //sql�� ��ɾ� ����, PRIMARY KEY(id) id�� sql�� key value�� (id = null ���� �ȵ�)
			createTable.execute(); //���޵� ��ɾ �����ϴ� method .execute()
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Table sucessfully created!");
		}
	}
	
	public static void main(String[] args) {
		createTable();
		createMember("song", "981102", "w", "01012345678", "�Ե��������", "������", "S", "210402");
	}
}

import java.sql.Connection;
import java.sql.DriverManager;

public class Member {
	
	private String name;
	private String sex;
	private String birthDay;
	private String phoneNumber;
	private String workPlace;
	private String job;
	private String grade;
	private String joinDay;
	
	public Member(String name, String sex, String birthDay, 
			String phoneNumber, String workPlace, String job,
			String grade, String joinDay) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;
		this.workPlace = workPlace;
		this.job = job;
		this.grade = grade;
		this.joinDay = joinDay;
	}
	
	public Member() {
		super();
	}
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getSex() {
		return sex;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	private String getBirthDay() {
		return birthDay;
	}
	private void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	private String getPhoneNumber() {
		return phoneNumber;
	}
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String getWorkPlace() {
		return workPlace;
	}
	private void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	private String getJob() {
		return job;
	}
	private void setJob(String job) {
		this.job = job;
	}
	private String getGrade() {
		return grade;
	}
	private void setGrade(String grade) {
		this.grade = grade;
	}
	private String getJoinDay() {
		return joinDay;
	}
	private void setJoinDay(String joinDay) {
		this.joinDay = joinDay;
	}
	
	private void printMember(Member member) {
		System.out.println(member.getName() + "/" + member.getSex() + "/" +
				member.getBirthDay() + "/" + member.getPhoneNumber() + "/" + 
				member.getWorkPlace() + "/" + member.getJob() + "/" + member.getJoinDay());
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6400552"; /* jdbc:mysql://database host:port num(e-mail로 확인)/database name */
			String user = "sql6400552"; //database username
			String password = "jJJ5Twf7zS"; //해당 사이트에 가입할때 입력했던 e-mail로 가서 비번확인 필요
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password); //해당 line에 error가 발생하는 경우 바로 catch로 넘어감 -> 성공적으로 실행한 경우 아래 문구가 나오게끔함
			System.out.println("The Connection Successful");
			return con;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void main(String[] args) {
		getConnection();
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Member {
	
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
	
	public static void createMember(String name, String birth, String gender, String phone, 
			String work, String job, String grade, String joinday) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO member"
					+ " (name, birth, gender, phone, work, job, grade, joinday) "
					+ "VALUE "
					+ "('"+name+"', '"+birth+"', '"+gender+"', '"+phone+"', '"+work+"', '"+job+"', '"+grade+"', '"+joinday+"')"); // "를 통해 sql에 'String' 을 보낸다
			insert.executeUpdate();
			System.out.println("The data has been saved!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createTable() {
		try {
			Connection con = getConnection(); //sql과 연결
			
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "member(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(15), "
					+ "birth varChar(10), "
					+ "gender varChar(2), "
					+ "phone varChar(15), "
					+ "work varChar(20),"
					+ "job varChar(10),"
					+ "grade varChar(2),"
					+ "joinday varChar(10),"
					+ "PRIMARY KEY(id))" ); //sql에 명령어 전달, PRIMARY KEY(id) id가 sql의 key value임 (id = null 절대 안됨)
			createTable.execute(); //전달된 명령어를 실행하는 method .execute()
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Table sucessfully created!");
		}
	}
	
	public static ArrayList<String> getMembers(){
		try { //sql의 commed를해서 data를 불러옴
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select name, birth, gender, phone FROM member");
			ResultSet results = statement.executeQuery(); //query를 불러오기
			ArrayList<String> list = new ArrayList<String>();
			while(results.next()) {
				list.add("Name :" + results.getString("name") + ", Birth :" + results.getString("birth") +
						 ", Gender :" + results.getString("gender") + ", Phone :" + results.getString("phone"));
			}
			
			System.out.println("The data has been fetched!");
			return list;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;	
		}
	}
	
//	public static void main(String[] args) {
//		createTable();
//		createMember("song", "981102", "w", "01012345678", "lotte", "engineer", "S", "210402");
//		ArrayList<String> list = getMembers();
//		for(String item: list) {
//			System.out.println(item);
//		}
//	}
}

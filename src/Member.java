
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
}

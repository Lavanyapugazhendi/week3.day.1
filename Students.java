package week3.day1.org.system;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student Information");
		
	}
	public void getStudentInfo(int id) {
		System.out.println("Student id is " + id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("student id and name " +  id + ":" + name);
	}
	public void getStudentInfo(String email,int phonenumber) {
		System.out.println("Student Email id is " + email + "and phone number # is" + phonenumber);
		
		
	}
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.getStudentInfo();
		s1.getStudentInfo(1049);
		s1.getStudentInfo(1049, "lavanya");
		s1.getStudentInfo("lavanyapugazhendi24@gmail.com", 934444444);
	}
}

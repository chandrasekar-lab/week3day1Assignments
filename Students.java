package week3_day1_Assignments;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}

	public void getStudentInfo(int id, String StudentName) {
		System.out.println("Student ID: " + id + " ,  " + "StudentName:" + StudentName);
	}

	public void getStudentInfo(String email, long phoneNO) {
		System.out.println("Student email: " + email + ",  " + "PhoneNO.: " + phoneNO);
	}

	public static void main(String[] args) {
	 
		Students students = new Students();
		students.getStudentInfo(1001);
		students.getStudentInfo(1001, "Sekar");
		students.getStudentInfo("sekar@gmail.com", 9884042698l);

	}
}

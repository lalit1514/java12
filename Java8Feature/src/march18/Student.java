package march18;

public class Student {

	private int StudentId;
	
	private String StudentName;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Student(int studentId, String studentName) {
		super();
		StudentId = studentId;
		StudentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentMR [StudentId=" + StudentId + ", StudentName=" + StudentName + "]";
	}



}
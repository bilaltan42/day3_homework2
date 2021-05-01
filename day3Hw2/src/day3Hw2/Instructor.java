package day3Hw2;

public class Instructor extends users {
	
	int students;
	String course;
	String examResults;
	public void setStudents(int students) {
		this.students = students;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setExamResults(String examResults) {
		this.examResults = examResults;
	}
	
	public String getExamResults() {
		return examResults;
	}
	

}

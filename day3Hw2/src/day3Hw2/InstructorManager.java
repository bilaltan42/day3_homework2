package day3Hw2;

public class InstructorManager {
	public void createLesson(Instructor teacher) {
		System.out.println(teacher.firstName+" " +teacher.lastName +" yeni kurs olusturdu");
	}
	
	public void examResults(Instructor teacher) {
		  System.out.println(teacher.firstName+" " +teacher.lastName +"Sýnav sonuçlarýný açýkladý");
	}

}

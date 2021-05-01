package day3Hw2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Kodlama.io,please Sign in : ");
		 
		Instructor instructor1= new Instructor();
		instructor1.setFirstName("Engin");;
		instructor1.setLastName("Demirog");;
		instructor1.setPassword("1234");;
		instructor1.setId(1);
		instructor1.setCourse("Java");
		instructor1.setExamResults("100");;
		
		Student student1= new Student();
		student1.setFirstName("Bilal");
		student1.setLastName("ALTAN");
		student1.setPassword("1903");
		student1.setId(2);
		student1.setGrade((instructor1.examResults));
		student1.setLessons(instructor1.getCourse());
		student1.setTeacher("Engin Demiroð");
		
        users[] kullanýcýlar = {instructor1,student1};
		UserManager userManager= new UserManager();
		userManager.addMultiple(kullanýcýlar);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.createLesson(instructor1);
		
		StudentManager studentManager= new StudentManager();
		studentManager.register(student1);
		
		instructorManager.examResults(instructor1);
		studentManager.grade(student1);
		
		
	   
		
		

	}

}

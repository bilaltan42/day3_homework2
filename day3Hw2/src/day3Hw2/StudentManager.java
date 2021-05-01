package day3Hw2;

public class StudentManager {
	  public void register(Student student) {
	    	 System.out.println(student.firstName+" "+student.lastName+" derse kayıt oldu.");
	     }
	 
     public void grade(Student student) {
    	 System.out.println(student.firstName+" "+student.lastName+" ders notu "+student.grade);
     }
}

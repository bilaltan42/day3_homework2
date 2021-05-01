package day3Hw2;



public class UserManager {
	 public void logIn(users user) {
  	   System.out.println(user.firstName+" "+user.lastName +" giriþ baþaralý.");
     }
	 public void addMultiple(users[] users) {
  	   for(users user : users) {
  		   logIn(user);
  	   }
     }
}

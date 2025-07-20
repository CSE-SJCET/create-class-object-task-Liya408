     // TODO: Create a class called Student with name, rollNumber, and grade
class Student{
     String name;
     int rollNumber;
     char grade;

    // TODO: Create a method to display student details
     public void displayDetails(){
          System.out.println("Student Details:");
          System.out.println("Name:"+name);
          System.out.println("Roll Number:"+rollNumber);
          System.out.println("Grade:"+grade);
     }
}
public class Main {
      public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
           Student student1=new Student();
           student1.name="Liya";
           student1.rollNumber=52;
           student1.grade='A';
           student1.displayDetails();
    }
}

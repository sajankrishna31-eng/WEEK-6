import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Sajan");
        Course course = new Course("CSE101", "Object Oriented Programming");

        student.displayDetails();
        System.out.println();
        course.displayDetails();
    }
}

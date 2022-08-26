package EX11_05;
import java.util.ArrayList;
public class CourseTest {
    public static void main (String [] args){
        Course c = new Course ("Java programming for Beginner"); 
        ArrayList students = c.getStudent();
        c.addStudent("Esraa");
        c.addStudent("Eslam");
        c.addStudent("Zienab");
        c.addStudent("Mohamed");
        c.addStudent("Mahmoud");
        c.addStudent("Abd Elrahman");
        c.addStudent("Kamal"); 
        System.out.println("The CourseName IS " + c.getCourseName());
        System.out.println("The Number of students is " + c.getNumberOfStudent());
        System.out.println("Names of students in course :");
        System.out.println(students);
        System.out.println();
        c.dropStudent("Mahmoud");
        c.dropStudent("Mahmoud");
        c.dropStudent("Abd Elrahman");
        c.dropStudent("Kamal");
        System.out.println("The Number of students has become " + c.getNumberOfStudent());
        System.out.println("Names of students in course after modificathion :");
        System.out.println(students);
        System.out.println();
    }
}

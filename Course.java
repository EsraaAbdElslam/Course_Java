package EX11_05;
import java.util.ArrayList;
public class Course {    
    private String courseName;
    private ArrayList Student;
    private int numberOfStudent;
    public Course(String courseName){
        this.courseName = courseName;
        Student = new ArrayList();
        numberOfStudent = 0;               
    }
    public String getCourseName(){
        return courseName;
    }
    public void addStudent(String student){
        Student.add(student);
//        numberOfStudent++;
    }
    public void dropStudent(String student){
        Student.remove(student);
//        numberOfStudent--;
    }
    public ArrayList getStudent(){
        return Student;
    }
    public int getNumberOfStudent(){
        return numberOfStudent = Student.size();
    } 
}

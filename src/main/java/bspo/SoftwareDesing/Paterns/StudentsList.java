package bspo.SoftwareDesing.Paterns;

import java.util.ArrayList;

public class StudentsList {
    public ArrayList<Student> students;
    public StudentsList(){
        students = new ArrayList<>();
    }
    public void add(Student student){
        students.add(student);
    }
}

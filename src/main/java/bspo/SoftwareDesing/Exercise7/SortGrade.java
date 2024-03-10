package bspo.SoftwareDesing.Exercise7;

import java.util.ArrayList;
import java.util.Collections;

public class SortGrade implements ISorter {
    @Override
    public void sorter(ArrayList<Student> students) {
        //Collections.sort(students, (s1, s2) -> Double.compare(s1.grade, s2.grade));

        for (Student student : students) {
            System.out.println(student.name + " - " + student.grade);
        }
    }
}

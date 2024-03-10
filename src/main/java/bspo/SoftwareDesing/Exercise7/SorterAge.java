package bspo.SoftwareDesing.Exercise7;

import java.util.ArrayList;
import java.util.Collections;

public class SorterAge implements ISorter {

    @Override
    public void sorter(ArrayList<Student> students) {
        //Collections.sort(students, (s1, s2) -> Integer.compare(s1.age, s2.age));

        for (Student student : students) {
            System.out.println(student.name + " - " + student.age);
        }

    }
}

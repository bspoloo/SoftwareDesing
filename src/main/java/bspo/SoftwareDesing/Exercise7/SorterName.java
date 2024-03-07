package bspo.SoftwareDesing.Exercise7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SorterName implements ISorter {

    @Override
    public void sorter(ArrayList<Student> students) {
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

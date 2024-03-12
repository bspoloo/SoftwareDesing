package bspo.SoftwareDesing.PaternsFactoryAndSingleton.Sorters;

import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Comparers.IComparer;
import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Student;
import java.util.ArrayList;

public class Sorter implements ISorter {
    ArrayList<IComparer> comparers;

    public Sorter(ArrayList<IComparer> comparers) {
        this.comparers = comparers;
    }

    @Override
    public void sorterByFields(ArrayList<Student> students) {

        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {

                for (IComparer comparer : comparers) {

                    if (comparer.compare(students.get(j), students.get(j + 1)) > 0) {
                        Student temp = students.get(j);
                        students.set(j, students.get(j + 1));
                        students.set(j + 1, temp);
                    }

                }
            }
        }
    }
}

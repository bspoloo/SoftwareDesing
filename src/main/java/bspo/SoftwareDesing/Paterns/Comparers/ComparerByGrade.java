package bspo.SoftwareDesing.Paterns.Comparers;

import bspo.SoftwareDesing.Paterns.Student;

public class ComparerByGrade implements IComparer{
    @Override
    public int compare(Student student1, Student student2) {
//        System.out.println("Comparer By Grade");
        Integer grade1 = (int) student1.getGrade();
        Integer grade2 = (int) student2.getGrade();

        return grade1.compareTo(grade2);
    }
}

package bspo.SoftwareDesing.PaternsFactoryAndSingleton.Comparers;

import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Student;

public class ComparerByName implements IComparer{
    @Override
    public int compare(Student student1, Student student2) {
//        System.out.println("Comparer By name");
        return student1.getName().compareTo(student2.getName());
    }
}

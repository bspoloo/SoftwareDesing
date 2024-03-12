package bspo.SoftwareDesing.PaternsFactoryAndSingleton.Comparers;

import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Student;

public class NullComparer implements IComparer{
    @Override
    public int compare(Student student1, Student student2) {
        System.out.println("This comparer not implemented yet");
        return 0;
    }
}

package bspo.SoftwareDesing.PaternsFactoryAndSingleton.Comparers;
import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Student;

public class ComparerByAge implements IComparer{
    @Override
    public int compare(Student student1, Student student2) {
//        System.out.println("Comparer By Age");
        Integer age1 = student1.getAge();
        Integer age2 = student2.getAge();

        return age1.compareTo(age2);
    }

}

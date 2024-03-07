package bspo.SoftwareDesing.Exercise7;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    String name;
    int age;
    double grade;
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

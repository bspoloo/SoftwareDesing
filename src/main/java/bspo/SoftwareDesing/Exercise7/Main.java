package bspo.SoftwareDesing.Exercise7;

import bspo.SoftwareDesing.Exercise7.Commands.CommandExecutorFactory;
import bspo.SoftwareDesing.Exercise7.Commands.ICommandExecutor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Escoja su orden");
        Scanner s = new Scanner(System.in);
        ISorter sorter = null;
        String cmd = s.nextLine();

        ICommandExecutor<String> executor = CommandExecutorFactory.<String>get();
        createStudents();

        switch (cmd) {
            case "Nombres":
                sorter = new SorterName();
                System.out.println("Por Nombres");
            case "Edades":
                sorter = new SorterAge();
                System.out.println("Por Edades");

            case "grado":
                sorter = new SortGrade();
                System.out.println("Por Grados");

        }

        while (true) {
            cmd = s.nextLine();
            executor.execute(cmd, sorter);
        }

    }

    public static void createStudents() {
        Student student1 = new Student("Brayan", 21, 9.7);
        Student student2 = new Student("Osmar", 22, 8.9);
        Student student3 = new Student("Juan", 34, 7.7);
        Student student4 = new Student("Paco", 21, 3.45);
        Student student5 = new Student("Elias", 9, 5.6);
        Student student6 = new Student("Carlos", 65, 5.77);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
    }
}

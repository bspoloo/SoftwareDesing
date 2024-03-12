package bspo.SoftwareDesing.PaternsFactoryAndSingleton;


import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Comparers.IComparer;
import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Sorters.ISorter;
import bspo.SoftwareDesing.PaternsFactoryAndSingleton.Sorters.Sorter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static StudentsList studentsList = new StudentsList();

    public static void main(String[] args) {
        readStudents();
        CompareFactoryMethod factoryMethod = CompareFactoryMethod.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the command to sorter the students: ");
        String command = scanner.nextLine();

        ArrayList<String> commands = commandToList(command);
        ArrayList<IComparer>comparers = factoryMethod.createListCompares(commands);

        ISorter sorter = new Sorter(comparers);
        //We send the list that we want to order
        sorter.sorterByFields(studentsList.students);

        //Use the sort students list for print
        printList(studentsList.students);

    }
    public static void readStudents() {
        studentsList.add(new Student("Elias", 9, 5.6));
        studentsList.add(new Student("Osmar", 22, 8.9));
        studentsList.add(new Student("Juan", 34, 7.7));
        studentsList.add(new Student("Paco", 21, 3.45));
        studentsList.add(new Student("Brayan", 21, 9.7));
        studentsList.add(new Student("Carlos", 65, 5.77));
        studentsList.add(new Student("María", 28, 6.8));
        studentsList.add(new Student("Laura", 19, 8.2));
        studentsList.add(new Student("Roberto", 31, 7.3));
        studentsList.add(new Student("Ana", 20, 9.5));
        studentsList.add(new Student("Alejandro", 25, 7.0));
        studentsList.add(new Student("Isabel", 18, 8.9));
        studentsList.add(new Student("Miguel", 30, 6.5));
        studentsList.add(new Student("Sara", 22, 9.8));
        studentsList.add(new Student("Diego", 27, 7.2));
        studentsList.add(new Student("Luisa", 24, 8.1));
        studentsList.add(new Student("Javier", 32, 6.9));
        studentsList.add(new Student("Paula", 29, 8.5));
        studentsList.add(new Student("Gonzalo", 26, 7.8));
        studentsList.add(new Student("Elena", 23, 9.0));
    }
    //this function convert the commands to array and then add to list the commands,
    public static ArrayList<String> commandToList(String commandsUser){

        ArrayList<String>commandsComparer = new ArrayList<>();
        String[] commands = commandsUser.split(" ");

        for (String command : commands) {
            commandsComparer.add(command);
        }
        return commandsComparer;
    }
    public static void printList(ArrayList<Student> students) {
        for (Student student : students){
            System.out.println(student.getName()+", "+student.getAge()+" ,"+student.getGrade());
        }
    }
}

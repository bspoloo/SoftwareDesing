package bspo.SoftwareDesing.Paterns;

import bspo.SoftwareDesing.Paterns.Comparers.*;

import java.util.ArrayList;

public class CompareFactoryMethod {

    //this class implemented the Singleton pattern design
    private static CompareFactoryMethod instance;
    private CompareFactoryMethod() {}
    static ArrayList<IComparer> compareMethodList = new ArrayList<>();

    public static CompareFactoryMethod getInstance() {
        if (instance == null) {
            instance = new CompareFactoryMethod();
        }
        return instance;
    }
    public ArrayList<IComparer> createListCompares(ArrayList<String> commands) {
        for (String command : commands) {
            addComparerMethods(command);
        }
        return compareMethodList;
    }

    static void addComparerMethods(String comparerID) {

        switch (comparerID.toLowerCase()) {
            case "name":
                compareMethodList.add(new ComparerByName());
                break;
            case "age":
                compareMethodList.add(new ComparerByAge());
                break;
            case "grade":
                compareMethodList.add(new ComparerByGrade());
                break;
            default:
                System.out.println("This command not exist");
                break;
        }
    }
}

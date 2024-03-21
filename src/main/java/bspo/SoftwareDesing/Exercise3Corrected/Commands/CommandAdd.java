package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.ItemObjects;
import bspo.SoftwareDesing.Exercise3Corrected.Page;
import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;


import java.util.Scanner;

public class CommandAdd<T> implements ICommand<T> {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void execute(IPaginator paginator) {


        readItems(paginator);

    }
    private void readItems(IPaginator paginator){

        System.out.println("Enter the limit for each Item: ");
        int numberItem = Integer.parseInt(scanner.nextLine());
        // pages building
        Page page1 = new Page(numberItem);
        Page page2 = new Page(numberItem);
        Page page3 = new Page(numberItem);
        Page page4 = new Page(numberItem);

        //adding the Items to each page
        page1.add(new ItemObjects(1,"Item 1 of page 1", 56));
        page1.add(new ItemObjects(2,"Item 2 of page 1", 56));
        page1.add(new ItemObjects(3,"Item 3 of page 1", 56));
        page1.add(new ItemObjects(3,"Item 3 of page 1", 56));

        page2.add(new ItemObjects(4,"Item 1 of page 2", 77));
        page2.add(new ItemObjects(5,"Item 2 of page 2", 77));
        page2.add(new ItemObjects(6,"Item 3 of page 2", 77));

        page3.add(new ItemObjects(7,"Item 1 of page 3", 88));
        page3.add(new ItemObjects(8,"Item 2 of page 3", 88));
        page3.add(new ItemObjects(9,"Item 3 of page 3", 88));

        page4.add(new ItemObjects(10,"Item 1 of page 4", 99));
        page4.add(new ItemObjects(11,"Item 2 of page 4", 99));
        page4.add(new ItemObjects(12,"Item 3 of page 4", 99));

        //adding each page to Pagination
        paginator.add(page1);
        paginator.add(page2);
        paginator.add(page3);
        paginator.add(page4);

    }
}

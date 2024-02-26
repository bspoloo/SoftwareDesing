package bspo.SoftwareDesing.Exercise3;

import java.lang.reflect.Member;
import java.util.LinkedList;
import java.util.Scanner;

public class BookRun implements IRunner{
    Book pagination;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("I'm a new book");
        System.out.println("################################################");

        pagination = new Book();

        // pages building
        Page page1 = new Page(3);
        Page page2 = new Page(3);
        Page page3 = new Page(3);
        Page page4 = new Page(3);

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
        pagination.pageList.add(page1);
        pagination.pageList.add(page2);
        pagination.pageList.add(page3);
        pagination.pageList.add(page4);

        menu();

    }

    @Override
    public void menu() {
        System.out.println("#######################################");

        System.out.println("A.- First");
        System.out.println("B.- Last");
        System.out.println("C.- Next");
        System.out.println("D.- Prev");
        System.out.println("E.- Go to");
        System.out.println("F.- Exit");

        System.out.println("#######################################");

        String userInput = scanner.nextLine();
        setOption(userInput);
    }

    @Override
    public void setOption(String option) {
        switch (option){
            case "A":
                Page first = pagination.first();
                if (isNull(first)){
                    System.out.println("The book is Empty...");
                    menu();
                }
                first.print();
                menu();
            case "B":

                Page last = pagination.last();

                if (isNull(last)){
                    System.out.println("The book is Empty...");
                    menu();
                }

                last.print();
                menu();
            case "C":
                Page next = pagination.next();

                if (isNull(next)){
                    System.out.println("There are no more pages before the last page...");
                    menu();
                }

                next.print();
                menu();
                break;
            case "D":
                Page prev = pagination.prev();

                if (isNull(prev)){
                    System.out.println("There are no more pages after the first page...");
                    menu();
                }

                prev.print();
                menu();
                break;
            case "E":
                System.out.println("Enter the position: ");
                int userInput = Integer.parseInt(scanner.nextLine());

                Page goTo = pagination.goTo(userInput);

                if (isNull(goTo)){
                    System.out.println("That's page don't exist...");
                    menu();
                }

                goTo.print();
                menu();
                break;
            case "F":
                pagination.exit();
                return;
            default:
                System.out.println("That's option not exist: ");
                menu();
                break;
        }
    }

    /**
     * Verifies if a Page object is null.
     *
     * @param page The Page object to be checked for null.
     * @return true if the Page object is null, false otherwise.
     */
    private boolean isNull(Page page) {
        return page == null;
    }

}

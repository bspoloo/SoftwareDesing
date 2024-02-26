package bspo.SoftwareDesing.Exercise3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Page Class
 *
 * Represents a page within a paginated list of items.
 */
public class Page {

    Scanner scanner = new Scanner(System.in);
    /**
     * List of items on the page.
     */
    LinkedList<ItemObjects> listItem = new LinkedList<>();

    /**
     * Maximum size of the page.
     */
    private int size;

    /**
     * Current count of items on the page.
     */
    private int count;

    /**
     * Constructs a Page object with the specified size.
     *
     * @param size The maximum size of the page.
     */
    public Page(int size) {
        this.size = size;
    }

    /**
     * Adds an item to the page if there is space available.
     * Displays a message if the page is full.
     *
     * @param item The ItemObjects to be added to the page.
     */
    public void add(ItemObjects item) {
        if (count == size) {
            System.out.println("List is full");
        } else {
            count++;
            listItem.add(item);
            System.out.println("Item "+item.getName()+" was added correctly...");
        }
    }

    /**
     * Prints the details of items on the page.
     */
    public void print() {
        Iterator<ItemObjects> iterator = listItem.iterator();

        while (iterator.hasNext()) {
            ItemObjects current = iterator.next();
            System.out.println("Id Item: " + current.getId() + ", Name Item: " + current.getName() + ", Price Item: " + current.getPrice());
        }
    }

    /**
     * Sets the size of the page.
     *
     * @param size The new size for the page.
     */
    public void setSize(int size) {
        this.size = size;
    }
    public int menu(){
        System.out.println("###############");
        System.out.println("# A.- Add     #");
        System.out.println("# B.- Exit    #");
        System.out.println("###############");

        String userInput = scanner.nextLine();

        if (userInput.equals("A")){
            System.out.println("Enter the new Item please");
            System.out.println("Enter the ID of Item");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the Name of Item");
            String name = scanner.nextLine();


            System.out.println("Enter the Price of Item");
            int price = Integer.parseInt(scanner.nextLine());

            ItemObjects newItem = new ItemObjects(id, name, price);

            add(newItem);

            return 0;

        } else if (userInput.equals("B")) {
            return 0;
        }
        return 0;
    }

}


package bspo.SoftwareDesing.Exercise3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Page Class
 *
 * Represents a page within a paginated list of items.
 */
public class Page {

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
}


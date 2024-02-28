package bspo.SoftwareDesing.Exercise3Corrected;

/**
 * Interface IPagination
 *
 * This interface defines methods for list pagination.
 * It implements basic operations for navigating through pages,
 * allowing users to navigate the list in a structured manner.
 */
public interface IPagination<T> {

    /**
     * Displays the first page of the list.
     * @return Page object representing the first page.
     */
    T first();

    /**
     * Displays the last page of the list.
     * @return Page object representing the last page.
     */
    T last();

    /**
     * Displays the next page of the list.
     * @return Page object representing the next page.
     */
    T next();

    /**
     * Displays the previous page of the list.
     * @return Page object representing the previous page.
     */
    T prev();

    /**
     * Displays the specified page of the list.
     * @param id Page number to navigate to.
     * @return Page object representing the specified page.
     */
    T goTo(int id);

    /**
     * Exits the program, terminating the application.
     */
    void exit();
}


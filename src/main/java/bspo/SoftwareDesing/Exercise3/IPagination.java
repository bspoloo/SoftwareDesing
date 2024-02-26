package bspo.SoftwareDesing.Exercise3;

/**
 * Interface IPagination
 *
 * This interface defines methods for list pagination.
 * It implements basic operations for navigating through pages,
 * allowing users to navigate the list in a structured manner.
 */
public interface IPagination {

    /**
     * Displays the first page of the list.
     * @return Page object representing the first page.
     */
    Page first();

    /**
     * Displays the last page of the list.
     * @return Page object representing the last page.
     */
    Page last();

    /**
     * Displays the next page of the list.
     * @return Page object representing the next page.
     */
    Page next();

    /**
     * Displays the previous page of the list.
     * @return Page object representing the previous page.
     */
    Page prev();

    /**
     * Displays the specified page of the list.
     * @param id Page number to navigate to.
     * @return Page object representing the specified page.
     */
    Page goTo(int id);

    /**
     * Exits the program, terminating the application.
     */
    void exit();
}


import bspo.SoftwareDesing.Exercise3.Book;
import bspo.SoftwareDesing.Exercise3.ItemObjects;
import bspo.SoftwareDesing.Exercise3.Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for Pagination Functionality in the Book Class
 */
public class PaginationTest {

    /**
     * Test for retrieving the first page in the list.
     */
    @Test
    public void firstPageTest() {

        // Building the new Book
        Book pagination = new Book();

        // Pages building
        Page page1 = new Page(3);
        Page page2 = new Page(3);
        Page page3 = new Page(3);
        Page page4 = new Page(3);

        // Add the item list to each page
        page1.add(new ItemObjects(1, "Item 1 of page 1", 56));
        page1.add(new ItemObjects(2, "Item 2 of page 1", 56));
        page1.add(new ItemObjects(3, "Item 3 of page 1", 56));

        page2.add(new ItemObjects(4, "Item 1 of page 2", 77));
        page2.add(new ItemObjects(5, "Item 2 of page 2", 77));
        page2.add(new ItemObjects(6, "Item 3 of page 2", 77));

        page3.add(new ItemObjects(7, "Item 1 of page 3", 88));
        page3.add(new ItemObjects(8, "Item 2 of page 3", 88));
        page3.add(new ItemObjects(9, "Item 3 of page 3", 88));

        page4.add(new ItemObjects(10, "Item 1 of page 4", 99));
        page4.add(new ItemObjects(11, "Item 2 of page 4", 99));
        page4.add(new ItemObjects(12, "Item 3 of page 4", 99));

        // Add each page to book
        pagination.pageList.add(page1);
        pagination.pageList.add(page2);
        pagination.pageList.add(page3);
        pagination.pageList.add(page4);

        // Doing the test for the first page in the list
        Assertions.assertEquals(pagination.first(), page1);
    }

    /**
     * Test for retrieving the last page in the list.
     */
    @Test
    public void lastPageTest() {

        // Building the new Book
        Book pagination = new Book();

        // Pages building
        Page page1 = new Page(3);
        Page page2 = new Page(3);
        Page page3 = new Page(3);
        Page page4 = new Page(3);

        // Add the item list to each page
        page1.add(new ItemObjects(1, "Item 1 of page 1", 56));
        page1.add(new ItemObjects(2, "Item 2 of page 1", 56));
        page1.add(new ItemObjects(3, "Item 3 of page 1", 56));

        page2.add(new ItemObjects(4, "Item 1 of page 2", 77));
        page2.add(new ItemObjects(5, "Item 2 of page 2", 77));
        page2.add(new ItemObjects(6, "Item 3 of page 2", 77));

        page3.add(new ItemObjects(7, "Item 1 of page 3", 88));
        page3.add(new ItemObjects(8, "Item 2 of page 3", 88));
        page3.add(new ItemObjects(9, "Item 3 of page 3", 88));

        page4.add(new ItemObjects(10, "Item 1 of page 4", 99));
        page4.add(new ItemObjects(11, "Item 2 of page 4", 99));
        page4.add(new ItemObjects(12, "Item 3 of page 4", 99));

        // Add each page to book
        pagination.pageList.add(page1);
        pagination.pageList.add(page2);
        pagination.pageList.add(page3);
        pagination.pageList.add(page4);

        // Doing the test for the last page in the list
        Assertions.assertEquals(pagination.last(), page4);
    }

    /**
     * Test for navigating to a specific page in the list.
     */
    @Test
    public void goToPageTest() {

        // Building the new Book
        Book pagination = new Book();

        // Pages building
        Page page1 = new Page(3);
        Page page2 = new Page(3);
        Page page3 = new Page(3);
        Page page4 = new Page(3);

        // Add the item list to each page
        page1.add(new ItemObjects(1, "Item 1 of page 1", 56));
        page1.add(new ItemObjects(2, "Item 2 of page 1", 56));
        page1.add(new ItemObjects(3, "Item 3 of page 1", 56));

        page2.add(new ItemObjects(4, "Item 1 of page 2", 77));
        page2.add(new ItemObjects(5, "Item 2 of page 2", 77));
        page2.add(new ItemObjects(6, "Item 3 of page 2", 77));

        page3.add(new ItemObjects(7, "Item 1 of page 3", 88));
        page3.add(new ItemObjects(8, "Item 2 of page 3", 88));
        page3.add(new ItemObjects(9, "Item 3 of page 3", 88));

        page4.add(new ItemObjects(10, "Item 1 of page 4", 99));
        page4.add(new ItemObjects(11, "Item 2 of page 4", 99));
        page4.add(new ItemObjects(12, "Item 3 of page 4", 99));

        // Add each page to book
        pagination.pageList.add(page1);
        pagination.pageList.add(page2);
        pagination.pageList.add(page3);
        pagination.pageList.add(page4);
        // Doing the test for navigating to the third page in the list
        Assertions.assertEquals(pagination.goTo(3), page3);
    }
}


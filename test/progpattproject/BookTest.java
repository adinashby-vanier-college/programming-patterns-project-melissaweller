
package progpattproject;

import java.time.LocalDate;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2034977
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetSN() {
        System.out.println("getSN");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        String expResult = "258";
        String result = instance.getSN();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSN() {
        System.out.println("setSN");
        String SN = "123456";
        Book instance = new Book ("1", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setSN(SN);
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        String expResult = "Unix";
        String result = instance.getTitle();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "App Dev";
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setTitle(title);
    }

    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        String expResult = "Jonathan";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Carmela";
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setAuthor(author);
    }

    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        String expResult = "Vanier";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String publisher = "Dawson";
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setPublisher(publisher);
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        double expResult = 25.14;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 99.58;
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setPrice(price);
    }

    @Test
    public void testGetQte() {
        System.out.println("getQte");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        int expResult = 5;
        int result = instance.getQte();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQte() {
        System.out.println("setQte");
        int qte = 10;
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setQte(qte);
    }

    @Test
    public void testGetIssuedQte() {
        System.out.println("getIssuedQte");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        int expResult = 2;
        int result = instance.getIssuedQte();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIssuedQte() {
        System.out.println("setIssuedQte");
        int issuedQte = 0;
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setIssuedQte(issuedQte);
    }

    @Test
    public void testGetDateOfPurchase() {
        System.out.println("getDateOfPurchase");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        LocalDate expResult = LocalDate.now();
        LocalDate result = instance.getDateOfPurchase();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateOfPurchase() {
        System.out.println("setDateOfPurchase");
        LocalDate DateOfPurchase = LocalDate.now();
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        instance.setDateOfPurchase(DateOfPurchase);
    }

    @Test
    public void testAddBook() throws Exception {
        System.out.println("addBook");
        Book book = new Book ("741", "Test", "Marco", "Dawson", 12.99, 2, 0, LocalDate.now());
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        boolean expResult = false;
        boolean result = instance.addBook(book);
        assertEquals(expResult, result);
    }

    @Test
    public void testIssueBook() throws Exception {
        System.out.println("issueBook");
        Book book = new Book ("741", "Test", "Marco", "Dawson", 12.99, 2, 0, LocalDate.now());
        Student s = new Student(1, "Test", "5148523695");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        boolean expResult = true;
        boolean result = instance.issueBook(book, s);
        assertEquals(expResult, result);
    }

    @Test
    public void testReturnBook() throws Exception {
        System.out.println("returnBook");
        Book book = new Book ("741", "Test", "Marco", "Dawson", 12.99, 2, 0, LocalDate.now());
        Student s = new Student(1, "Test", "5148523695");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        boolean expResult = true;
        boolean result = instance.returnBook(book, s);
        assertEquals(expResult, result);
    }

    @Test
    public void testViewCatalog() {
        System.out.println("viewCatalog");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        Map<String, String> expResult = instance.viewCatalog();
        Map<String, String> result = instance.viewCatalog();
        assertEquals(expResult, result);
    }

    @Test
    public void testViewIssuedBooks() {
        System.out.println("viewIssuedBooks");
        Book instance = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        Map<String, String> expResult = instance.viewIssuedBooks();
        Map<String, String> result = instance.viewIssuedBooks();
        assertEquals(expResult, result);
    }
}

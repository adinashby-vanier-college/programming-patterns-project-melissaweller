
package progpattproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
public class StudentTest {
    
    public StudentTest() {
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
    public void testGetStId() {
        System.out.println("getStId");
        Student instance = new Student(123, "Marco", "5148521475");
        int expResult = 123;
        int result = instance.getStId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStId() {
        System.out.println("setStId");
        int stId = 0;
        Student instance = new Student(123, "Marco", "5148521475");
        instance.setStId(stId);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student(123, "Marco", "5148521475");
        String expResult = "Marco";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jon";
        Student instance = new Student(123, "Marco", "5148521475");
        instance.setName(name);
    }

    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        Student instance = new Student(123, "Marco", "5148521475");
        String expResult = "5148521475";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String contactNumber = "5148521478";
        Student instance = new Student(123, "Marco", "5148521475");
        instance.setContactNumber(contactNumber);
    }

    @Test
    public void testSearchBookByTitle() throws Exception {
        System.out.println("searchBookByTitle");
        String title = "";
        Student instance = new Student(123, "Marco", "5148521475");
        List<Book> expResult = new ArrayList<>();
        List<Book> result = instance.searchBookByTitle(title);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchBookByName() throws Exception {
        System.out.println("searchBookByName");
        String name = "";
        Student instance = new Student(123, "Marco", "5148521475");
        List<Book> expResult = new ArrayList<>();
        List<Book> result = instance.searchBookByName(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchBookByPublisher() throws Exception {
        System.out.println("searchBookByPublisher");
        String publisher = "";
        Student instance = new Student(123, "Marco", "5148521475");
        List<Book> expResult = new ArrayList<>();
        List<Book> result = instance.searchBookByPublisher(publisher);
        assertEquals(expResult, result);
    }

    @Test
    public void testBorrow() throws Exception {
        System.out.println("borrow");
        Book book = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        Student instance = new Student(123, "Marco", "5148521475");
        boolean expResult = false;
        boolean result = instance.borrow(book);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsReturn() throws Exception {
        System.out.println("isReturn");
        Book book = new Book ("258", "Unix", "Jonathan", "Vanier", 25.14, 5, 2, LocalDate.now());
        Student instance = new Student(123, "Marco", "5148521475");
        boolean expResult = true;
        boolean result = instance.isReturn(book);
        assertEquals(expResult, result);
    }

    @Test
    public void testViewCatalog() {
        System.out.println("viewCatalog");
        Student instance = new Student(123, "Marco", "5148521475");
        Map<String, String> expResult = instance.viewCatalog();
        Map<String, String> result = instance.viewCatalog();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddStudent() throws Exception {
        System.out.println("addStudent");
        Student student = new Student(456, "Marco", "5148521475");
        Student instance = new Student(123, "Marco", "5148521475");
        boolean expResult = false;
        boolean result = instance.addStudent(student);
        assertEquals(expResult, result);
    }
    
}

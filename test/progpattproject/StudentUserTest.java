
package progpattproject;

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
public class StudentUserTest {
    
    public StudentUserTest() {
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
    public void testGetPermission() {
        System.out.println("getPermission");
        StudentUser instance = null;
        String expResult = "";
        String result = instance.getPermission();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateForm() {
        System.out.println("createForm");
        StudentUser instance = null;
        instance.createForm();
    }

    @Test
    public void testHideForm() {
        System.out.println("hideForm");
        StudentUser instance = null;
        instance.hideForm();
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        StudentUser instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
}

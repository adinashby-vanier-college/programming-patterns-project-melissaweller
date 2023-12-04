
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
public class UserFactoryTest {
    
    public UserFactoryTest() {
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
    public void testGetUser() throws Exception {
        System.out.println("GetUser");
        String user = "Student";
        int id = 1;
        UserFactory instance = new UserFactory();
        User expResult = instance.GetUser(user, id);
        User result = instance.GetUser(user, id);
        assertEquals(expResult, result);
    }
    
}

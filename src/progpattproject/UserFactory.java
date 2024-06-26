
package progpattproject;

/**
 *
 * @author melis
 */
public class UserFactory {

    public User GetUser(String user, int id) throws Exception {
        switch (user) {
            case "Student" : {
                return new StudentUser(id);
            }
            case "Librarian": {
                return new LibrarianUser();
            }
            default: throw new Exception();
        }
    }
}


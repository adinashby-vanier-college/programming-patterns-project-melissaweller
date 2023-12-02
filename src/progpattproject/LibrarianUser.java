
package progpattproject;

/**
 *
 * @author melis
 */
public class LibrarianUser implements User {
    
    LibrarianForm form;
    
    public LibrarianUser() {
        form = new LibrarianForm();
    }   

    public String getPermission() {
        return "librarian";
    }

    public void createForm() {
        form.setVisible(true);
    }   

    public void hideForm() {
        form.setVisible(false);
    }

    public int getId() {
        return -1;
    }
}

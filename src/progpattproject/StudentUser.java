
package progpattproject;

/**
 *
 * @author melis
 */
public class StudentUser implements User {
    
    StudentForm form;
    int id;
    
    public StudentUser(int id) {
        form = new StudentForm();
        this.id = id;
    }
    
    public String getPermission() {
        return "student";
    }

    public void createForm() {
        form.setVisible(true);
    }

    public void hideForm() {
        form.setVisible(false);
    }

    public int getId() {
        return id;
    }
}

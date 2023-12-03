package progpattproject;

import java.sql.Connection;

/**
 * @author adinashby 
 *
 */
public class Project {

    /** 
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {
        PickUser pickForm = new PickUser();
 
        ViewController viewController = new ViewController(pickForm);
        LibraryController libraryController = new LibraryController();
        UserFactory fac = new UserFactory();
        Controller controller;
        controller = Controller.getInstance(libraryController, viewController, fac);

        pickForm.setVisible(true);
    }

    /**
     * Please refer to the README file for question(s) description
     */
}

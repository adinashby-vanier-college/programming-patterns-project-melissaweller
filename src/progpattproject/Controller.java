package progpattproject;

/**
 *
 * @author melis
 */
public class Controller {

    LibraryController libraryCon;
    ViewController viewCon;
    UserFactory fac;
    public static Controller controller;

    private Controller() {
    }

    public Controller(LibraryController libCon, ViewController viCon, UserFactory fac) {
        this.libraryCon = libCon;
        this.viewCon = viCon;
        this.fac = fac;
    }

    public static Controller getInstance() {
        if (controller == null) {
            System.out.println();
            controller = new Controller();
        }
        return controller;
    }

    public static Controller getInstance(LibraryController libCon, ViewController viCon, UserFactory fac) {
        if (controller == null) {
            controller = new Controller(libCon, viCon, fac);
        }
        return controller;
    }

    public LibraryController getLibCon() {
        return libraryCon;
    }

    public void setLibCon(LibraryController libCon) {
        this.libraryCon = libCon;
    }

    public ViewController getViCon() {
        return viewCon;
    }

    public void setViCon(ViewController viCon) {
        this.viewCon = viCon;
    }

    public UserFactory getFac() {
        return fac;
    }

    public void setFac(UserFactory fac) {
        this.fac = fac;
    }

}

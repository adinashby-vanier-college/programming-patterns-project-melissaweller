
package progpattproject;

/**
 *
 * @author melis
 */
public class ViewController {
    PickUser pForm;
    StudentUser stuUser;
    LibrarianUser libUser;

    public ViewController(PickUser pForm) {
        this.pForm = pForm;
    }

//    public void showPForm() {
//        pForm.setVisible(true);
//    }
//    
//    public void hidePForm() {
//        pForm.setVisible(false);
//    }
    
    public StudentUser getStuUser(){
        return stuUser;
    }
    
     public LibrarianUser getLibUser(){
        return libUser;
    }
    
    public void setStuUser(StudentUser stuUser) {
        this.stuUser = stuUser;
    }
    
    public void setLibUser(LibrarianUser libUser) {
        this.libUser = libUser;
    }
}

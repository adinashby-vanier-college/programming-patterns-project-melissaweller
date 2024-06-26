
package progpattproject;

import java.sql.*;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author melis
 */
public class Book {
    Connection con = DatabaseConnection.getConnection();
    String SN;
    String title;
    String author;
    String publisher;
    double price; 
    int qte;
    int issuedQte;
    LocalDate DateOfPurchase;
    
     public Book(String SN, String title, String author, String publisher, double price, int qte, int issuedQte, LocalDate DateOfPurchase) {
        this.SN = SN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.qte = qte;
        this.issuedQte = issuedQte;
        this.DateOfPurchase = DateOfPurchase;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getIssuedQte() {
        return issuedQte;
    }

    public void setIssuedQte(int issuedQte) {
        this.issuedQte = issuedQte;
    }

    public LocalDate getDateOfPurchase() {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate DateOfPurchase) {
        this.DateOfPurchase = DateOfPurchase;
    }
    
    public boolean addBook(Book book) throws SQLException {
        String query = "insert into Books(SN, Title, Author, Publisher, Price, Quantity, Issued, addedDate) VALUES('" + book.SN + "','" + book.title 
                + "','" + book.author + "','" + book.publisher + "','" + book.price + "','" + book.qte 
                + "','" + book.issuedQte + "','" + book.DateOfPurchase.toString() + "')";
        
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.err.println("Got an exception!"); 
        }
        return false;
    }

    public boolean issueBook(Book book, Student s) throws SQLException {
        String query = "Insert into IssuedBooks(SN, StId, StName, StudentContact, IssueDate) VALUES('" + book.SN + "','" + 
                s.stId + "','" + s.name + "','" + s.contactNumber + "','" + 
                LocalDate.now().toString() + "')";
        
        String query2 = "Update Books set Quantity = Quantity - 1, Issued = Issued + 1 where SN = " + book.SN; 
        
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            stmt.executeUpdate(query2);
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.err.println("Got an exception!"); 
        }
        return false;
    }

    public boolean returnBook(Book book, Student s) throws SQLException {
        String query = "Update Books set Quantity = Quantity + 1, Issued = Issued - 1 where SN = " + book.SN;
        String query2 = "DELETE FROM IssuedBooks WHERE SN = '" + book.SN + "'AND StId = '" + s.stId + "'";
        
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            stmt.executeUpdate(query2);
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.err.println("Got an exception!"); 
        }
        return false;
    }

    public static Map<String, String> viewCatalog() {
        String query = "select * from Books";
        Map<String, String> books = new TreeMap<>();
        Connection tempcon = DatabaseConnection.getConnection();
        
        try (Statement stmt = tempcon.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String key = rs.getString("Title");
                String value = " Title: " + rs.getString("Title");
                value += " - Author: " + rs.getString("Author");
                value += " - Publisher: " + rs.getString("Publisher");
                value += " - Price: " + rs.getString("Price");
                value += " - Quantity: " + rs.getString("Quantity");
                value += " - Issued: " + rs.getString("Issued");
                value += " - Added Date: " + rs.getString("addedDate");
                books.put(key, value);
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error");
            System.out.println(e);
        }
        return books;
    }

    public static Map<String, String> viewIssuedBooks() {
        String query = "select * from IssuedBooks";
        Map<String, String> books = new TreeMap<>();
        
        Connection tempcon = DatabaseConnection.getConnection();
        
        try (Statement stmt = tempcon.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {  
                String key = rs.getString("SN");
                String value = " Student ID: " + rs.getString("StId");
                value += " - Student Name: " + rs.getString("StName");
                value += " - Phone Number: " + rs.getString("StudentContact");
                value += " - Issue Date: " + rs.getString("IssueDate");
                books.put(key, value);
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error");
            System.out.println(e);
        }
        return books;
    }
}


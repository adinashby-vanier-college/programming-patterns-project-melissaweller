
package progpattproject;

import java.sql.*;

/**
 *
 * @author melis
 */
class DatabaseConnection {
    private static Connection con = null;

    private DatabaseConnection() {
    }

    static Connection getConnection() {
        if(con == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:Library.db");
                return con;
            } 
            catch(ClassNotFoundException | SQLException e) {
                return null;
            }
        }
        return con;
    }
}

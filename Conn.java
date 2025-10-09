
package online.banking.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebankingsystem", "jyoshitha", "Vsj@1808");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


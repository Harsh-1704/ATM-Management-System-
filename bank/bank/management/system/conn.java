package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Database@121");
            this.s = this.c.createStatement();
        } catch (Exception var2) {
            Exception e = var2;
            System.out.println(e);
        }

    }
}
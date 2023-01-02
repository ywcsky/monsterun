package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTemple {
    String oracle = "oracle.jdbc.driver.OracleDriver", url = "jdbc:oracle:thin:@localhost:1521:xe", user = "STUDENT",pass = "STUDENT";
    public PreparedStatement jdbc(String sql){
        try {
            Class.forName(oracle);
            Connection conn = DriverManager.getConnection(url,user,pass);
            PreparedStatement stmt = conn.prepareStatement(sql);
            return stmt;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailListReaderDDBB {

    public static ArrayList<String> read () throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection c = DriverManager.getConnection("jdbc:sqlite:KATADB");
        Statement stmt = c.createStatement();

        ArrayList<String> mailList = new ArrayList<>();
        ResultSet rs = stmt.executeQuery("SELECT MAIL FROM MAILS");
        
        while(rs.next()){
            mailList.add(rs.getString("MAIL"));
        }
        
        rs.close();
        stmt.close();
        c.close();
        return mailList;
    }
}

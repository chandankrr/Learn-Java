// don't forget to include external library of ojdbc form oracle folder

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "chandan";
        String password = "898587";

        try {
            // step1: load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded");

            // step2: create  the connection object
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established\n");

            // TODO All work related to this connection

            // step3: create the statement object
            Statement stmt = con.createStatement();

            // step4: execute query
            ResultSet rs = stmt.executeQuery("select * from managers");

            System.out.println("ID" + " | " + "FirstName" + " | " + "LastName" + " | " + "City" + " | " +
                    "Department");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) +
                        " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
            }

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        } catch (SQLException e) {
            System.out.println("Connection not established");
        }
    }
}
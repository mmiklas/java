package hidden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=YourDatabaseName;user=YourUsername;password=YourPassword;trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement()) {

            String SQL = "SELECT EmployeeID, FirstName, LastName, Age FROM Employees";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("EmployeeID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                int age = rs.getInt("Age");

                System.out.println("EmployeeID: " + id + ", FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

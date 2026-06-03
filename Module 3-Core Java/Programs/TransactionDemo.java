import java.sql.*;

public class TransactionDemo {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "password");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                    "UPDATE accounts SET balance=balance-1000 WHERE id=1");

            stmt.executeUpdate(
                    "UPDATE accounts SET balance=balance+1000 WHERE id=2");

            con.commit();

            System.out.println("Transaction Successful");

        } catch(Exception e) {
            System.out.println("Transaction Failed");
        }
    }
}

/*
Sample Output:
Transaction Successful
*/
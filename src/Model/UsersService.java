package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class UsersService {
    public static void selectAll(List<Users> targetList, DatabaseConnection database) {
        PreparedStatement statement = database.newStatement("SELECT userID, userFirstName, userLastName, password FROM Table ORDER BY userID");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Users(results.getInt("userID"), results.getString("userFirstName"), results.getString("userLastName"), results.getString("password")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static Users selectById(int id, DatabaseConnection database) {
        Users result = null;

        PreparedStatement statement = database.newStatement("SELECT  usersID, userFirstName, userLastName, password FROM Users WHERE usersID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Users(results.getInt("usersID"), results.getString("userFirstName"), results.getString("userLastName"), results.getString("password"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void save(Users users, DatabaseConnection database) {
        Users existingItem = null;
        if (users.getId() != 0) existingItem = selectById(users.getId(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Table (a, b, c) VALUES (?, ?, ?))");
                statement.setString(1, users.getA());
                statement.setString(2, users.getB());
                statement.setString(3, users.getC());
                database.executeUpdate(statement);
            }
            else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET a = ?, b = ?, c = ? WHERE id = ?");
                statement.setString(1, users.getA());
                statement.setString(2, users.getB());
                statement.setString(3, users.getC());
                statement.setInt(4, users.getId());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }// insert & update

    public static void deleteById(int id, DatabaseConnection database) {
        PreparedStatement statement = database.newStatement("DELETE FROM Table WHERE id = ?");

        try {
            if (statement != null) {
                statement.setInt(1, id);
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database deletion error: " + resultsException.getMessage());
        }
    }
}

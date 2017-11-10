package Model;

public class UsersService {
    public static void selectAll(List<Console> targetList, DatabaseConnection database) { };
    public static Console selectById(int id, DatabaseConnection database) { };
    public static void save(Console console, DatabaseConnection database) { };	// insert & update
    public static void deleteById(int id, DatabaseConnection database) { };
}

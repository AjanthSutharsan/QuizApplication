package Model;

import java.util.List;

public class QuizService {
    public static void selectAll(List<Quiz> targetList, DatabaseConnection database) { };
    public static Quiz selectById(int id, DatabaseConnection database) { };
    public static void save(Quiz quiz, DatabaseConnection database) { };	// insert & update
    public static void deleteById(int id, DatabaseConnection database) { };
}

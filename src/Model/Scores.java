package Model;

public class Scores {
    private static int scoreID;
    private static int userID;
    private static int quizID;
    private static int score;
    public Scores(int userID, int scoreID, int quizID, int score) {
        this.userID = userID;
        this.scoreID = scoreID;
        this.quizID = quizID;
    }
}

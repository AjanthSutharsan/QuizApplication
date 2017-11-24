package Model;

public class Question {
    private static int questionID;
    private static String question;
    private static String correctAnswer;
    private static String incorrectAnswer1;
    private static String incorrectAnswer2;
    private static String incorrectAnswer3;
    private static String quizID;
    public Question(int questionID, String question, String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3) {
        this.questionID = questionID;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswer1 = incorrectAnswer1;
        this.incorrectAnswer2 = incorrectAnswer2;
        this.incorrectAnswer3 = incorrectAnswer3;
    }
}

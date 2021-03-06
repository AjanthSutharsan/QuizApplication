package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Main extends Application {
    private static TextField usernameText;
    private static TextField passwordText;
    @Override
    public void start(Stage stage) throws Exception{
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));


        stage.setTitle("Quiz Application");
        stage.setScene(new Scene(grid, 1024, 768));


        Label usernameLabel = new Label("Enter your ID"); //defines the text within the label
        GridPane.setConstraints(usernameLabel, 12, 11);
        grid.getChildren().add(usernameLabel);

        usernameText = new TextField();
        GridPane.setConstraints(usernameText, 12, 12, 10, 1);
        usernameText.setPrefWidth(220);
        usernameText.setPromptText("ID e.g. 12345");
        grid.getChildren().add(usernameText);

        Label passwordLabel = new Label("Enter your password"); //defines the text within the label
        GridPane.setConstraints(passwordLabel, 12, 14);
        grid.getChildren().add(passwordLabel);

        passwordText = new TextField();
        GridPane.setConstraints(passwordText, 12, 15, 10, 1);
        passwordText.setPrefWidth(220);
        passwordText.setPromptText("Password here");
        grid.getChildren().add(passwordText);

        Button loginButton = new Button();
        loginButton.setText("Log in");
        loginButton.setOnAction((ActionEvent ae) -> loginPlaceholder());
        GridPane.setConstraints(loginButton, 12, 17);
        grid.getChildren().add(loginButton);

        stage.show();

    }
    public static void loginPlaceholder() {
        new Alert(Alert.AlertType.INFORMATION, "This is a placeholder in order for the login button to actually do something").showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}













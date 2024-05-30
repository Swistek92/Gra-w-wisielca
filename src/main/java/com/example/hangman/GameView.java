package com.example.hangman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GameView extends Application {
    private GameController gameController;

    @Override
    public void start(Stage primaryStage) {
        WordRepository wordRepository = new WordRepository();
        gameController = new GameController(wordRepository);

        primaryStage.setTitle("Hangman Game");

        Label hiddenWordLabel = new Label(gameController.getHiddenWord());
        Label attemptsLabel = new Label("Attempts left: " + gameController.getAttemptsLeft());

        TextField guessField = new TextField();
        guessField.setPromptText("Enter a letter");

        Button guessButton = new Button("Guess");
        guessButton.setOnAction(event -> {
            String guessText = guessField.getText().trim().toLowerCase();
            if (guessText.length() == 1) {
                char guessedLetter = guessText.charAt(0);
                gameController.guessLetter(guessedLetter);
                hiddenWordLabel.setText(gameController.getHiddenWord());
                attemptsLabel.setText("Attempts left: " + gameController.getAttemptsLeft());
                guessField.clear();

                if (gameController.isGameOver()) {
                    String message = gameController.isWin() ? "You win!" : "You lose! The word was: " + gameController.getHiddenWord();
                    hiddenWordLabel.setText(message);
                    guessButton.setDisable(true);
                }
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.add(hiddenWordLabel, 0, 0);
        gridPane.add(attemptsLabel, 0, 1);
        gridPane.add(guessField, 0, 2);
        gridPane.add(guessButton, 1, 2);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

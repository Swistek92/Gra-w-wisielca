package com.example.hangman;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameView gameView = new GameView();
        gameView.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

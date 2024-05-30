package com.example.hangman;

import java.util.HashSet;
import java.util.Set;

public class GameController {
    private Word currentWord;
    private StringBuilder hiddenWord;
    private int attemptsLeft;
    private Set<Character> guessedLetters;

    public GameController(WordRepository wordRepository) {
        this.currentWord = wordRepository.getRandomWord();
        this.hiddenWord = new StringBuilder("_".repeat(currentWord.getWord().length()));
        this.attemptsLeft = 6;
        this.guessedLetters = new HashSet<>();
    }

    public String getHiddenWord() {
        return hiddenWord.toString();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public boolean guessLetter(char letter) {
        if (guessedLetters.contains(letter)) {
            return false;
        }

        guessedLetters.add(letter);
        boolean isCorrect = false;

        for (int i = 0; i < currentWord.getWord().length(); i++) {
            if (currentWord.getWord().charAt(i) == letter) {
                hiddenWord.setCharAt(i, letter);
                isCorrect = true;
            }
        }

        if (!isCorrect) {
            attemptsLeft--;
        }

        return isCorrect;
    }

    public boolean isGameOver() {
        return attemptsLeft <= 0 || hiddenWord.toString().equals(currentWord.getWord());
    }

    public boolean isWin() {
        return hiddenWord.toString().equals(currentWord.getWord());
    }
}

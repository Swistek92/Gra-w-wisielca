package com.example.hangman;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordRepository {
    private List<Word> words = Arrays.asList(
            new Word("apple"), new Word("banana"), new Word("cherry"),
            new Word("date"), new Word("fig"), new Word("grape"),
            new Word("lemon"), new Word("mango"), new Word("peach"),
            new Word("plum")
    );

    public Word getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}

# Gra w Wisielca

## Spis Treści
- [Opis Projektu](#opis-projektu)
- [Funkcjonalności](#funkcjonalności)
- [Instrukcje Obsługi](#instrukcje-obsługi)
- [Struktura Projektu](#struktura-projektu)
- [Przykładowe Dane Wejściowe](#przykładowe-dane-wejściowe)

## Opis Projektu
Gra w wisielca to klasyczna gra polegająca na zgadywaniu liter, które składają się na ukryte słowo. Gracz ma ograniczoną liczbę prób na odgadnięcie całego słowa. W projekcie zaimplementowano grę z użyciem JavaFX, co umożliwia interaktywne granie w środowisku graficznym.

## Funkcjonalności
- **Losowanie słowa z bazy danych**: Wybieranie losowego słowa z predefiniowanej listy słów.
- **Zgadywanie liter**: Umożliwia użytkownikowi zgadywanie liter w ukrytym słowie.
- **Wyświetlanie ukrytego słowa**: Pokazuje bieżący stan zgadywanego słowa.
- **Liczba pozostałych prób**: Informuje użytkownika o liczbie pozostałych prób.
- **Komunikaty o wygranej lub przegranej**: Wyświetla odpowiednie komunikaty w zależności od wyniku gry.

## Instrukcje Obsługi

### Wymagania
- Java 11 lub nowsza
- JavaFX

### Kompilacja i Uruchomienie

1. **Klonowanie repozytorium**
    ```bash
    git clone https://github.com/username/hangman.git
    cd hangman
    ```

2. **Kompilacja projektu**
    ```bash
    javac -d out --module-path /path/to/javafx-sdk-11/lib --add-modules javafx.controls,javafx.fxml src/main/java/module-info.java src/main/java/com/example/hangman/*.java
    ```

3. **Uruchomienie aplikacji**
    ```bash
    java --module-path /path/to/javafx-sdk-11/lib --add-modules javafx.controls,javafx.fxml -cp out com.example.hangman.Main
    ```

### Używanie aplikacji
1. Po uruchomieniu aplikacji, w głównym oknie pojawi się ukryte słowo i liczba pozostałych prób.
2. Wprowadź literę w polu tekstowym i kliknij przycisk "Guess", aby zgadnąć literę.
3. Aplikacja poinformuje Cię, czy zgadłeś poprawnie oraz zaktualizuje ukryte słowo i liczbę pozostałych prób.
4. Gra kończy się, gdy zgadniesz całe słowo lub stracisz wszystkie próby.

## Struktura Projektu
hangman/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
│ │ │ │ ├── example/
│ │ │ │ │ ├── hangman/
│ │ │ │ │ │ ├── Main.java
│ │ │ │ │ │ ├── GameController.java
│ │ │ │ │ │ ├── GameView.java
│ │ │ │ │ │ ├── Word.java
│ │ │ │ │ │ ├── WordRepository.java
│ │ │ ├── module-info.java
│ ├── resources/
│ └── test/
│ ├── java/
│ └── resources/
├── .gitignore
├── README.md
├── build.gradle
└── settings.gradle




## Przykładowe Dane Wejściowe
Ponieważ gra losuje słowa z predefiniowanej bazy, przykładowe dane wejściowe obejmują listę słów zawartych w `WordRepository.java`:
```java
private List<Word> words = Arrays.asList(
    new Word("apple"), new Word("banana"), new Word("cherry"),
    new Word("date"), new Word("fig"), new Word("grape"),
    new Word("lemon"), new Word("mango"), new Word("peach"),
    new Word("plum")
);




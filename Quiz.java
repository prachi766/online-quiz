// File: Quiz.java

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz {
    private final List<Question> questions;
    private int score;
    private final Scanner scanner;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the quiz, loops through questions, and displays the final result.
     */
    public void start() {
        // Loop through each question
        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("\n--------------------------------");
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.prompt);

            // Display the options
            for (int j = 0; j < currentQuestion.options.length; j++) {
                System.out.println("  " + (j + 1) + ". " + currentQuestion.options[j]);
            }

            int userAnswer = getUserAnswer(currentQuestion.options.length);

            // Check if the answer is correct
            if (userAnswer == currentQuestion.correctAnswerIndex + 1) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer was: " + (currentQuestion.correctAnswerIndex + 1) + ". " + currentQuestion.options[currentQuestion.correctAnswerIndex]);
            }
        }
        displayResults();
    }

    /**
     * Prompts the user for their answer and validates the input.
     * @param numOptions The number of available options for the current question.
     * @return The user's validated choice (1-based index).
     */
    private int getUserAnswer(int numOptions) {
        int userAnswer = -1;
        while (userAnswer < 1 || userAnswer > numOptions) {
            System.out.print("\nEnter your choice (1-" + numOptions + "): ");
            try {
                userAnswer = scanner.nextInt();
                if (userAnswer < 1 || userAnswer > numOptions) {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + numOptions + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        return userAnswer;
    }

    /**
     * Displays the final score and percentage.
     */
    private void displayResults() {
        System.out.println("\n==============================");
        System.out.println("        QUIZ COMPLETE!        ");
        System.out.println("==============================");
        System.out.println("Your final score is: " + score + " out of " + questions.size());

        double percentage = ((double) score / questions.size()) * 100;
        System.out.printf("Your score: %.2f%%\n", percentage);

        if (percentage == 100) {
            System.out.println("Excellent work! 🌟");
        } else if (percentage >= 75) {
            System.out.println("Good job! 👍");
        } else if (percentage >= 50) {
            System.out.println("Not bad, but you can do better. 🙂");
        } else {
            System.out.println("Better luck next time. Keep practicing! 📚");
        }
        System.out.println("==============================");
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
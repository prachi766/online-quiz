// File: Main.java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~ Welcome to the Java Console Quiz! ~~~");

        // Create a list to hold the questions
        List<Question> questions = new ArrayList<>();

        // Add questions to the list
        // Note: The last parameter is the 0-based index of the correct answer.
        questions.add(new Question(
            "What is the output of `System.out.println(1 / 2);` in Java?",
            new String[]{"0.5", "0", "1", "Compilation Error"},
            1 // "0" because of integer division
        ));

        questions.add(new Question(
            "Which keyword is used to create an object in Java?",
            new String[]{"new", "create", "object", "instance"},
            0 // "new"
        ));

        questions.add(new Question(
            "Which of the following is NOT a primitive data type in Java?",
            new String[]{"int", "boolean", "String", "char"},
            2 // "String" is an object
        ));
        
        questions.add(new Question(
            "What is the main purpose of the `static` keyword in Java?",
            new String[]{"To make a variable constant", "To allow a method/variable to be accessed without creating an instance of the class", "To make a method final", "To handle exceptions"},
            1 // To allow access without an instance
        ));

        questions.add(new Question(
            "In Java, which loop is guaranteed to execute at least once?",
            new String[]{"for loop", "while loop", "if statement", "do-while loop"},
            3 // "do-while loop"
        ));


        // Create a new Quiz instance and start it
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
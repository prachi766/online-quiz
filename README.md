This is a simple Java console program that lets you play a quiz with multiple questions.
I built it step by step to keep it clean, modular, and easy to use.
I broke the project into three parts:
1. Question.java → a class that stores each quiz question, its options, and the correct answer.
2. Quiz.java → manages the list of questions, shows them to the user, and keeps track of the score.
3. Main.java → the entry point of the program. It creates the quiz, starts it, and shows the results.

The program asks questions one by one, lets you answer, and then shows your final score at the end.

How to Run:
1.Save all three files (Question.java, Quiz.java, Main.java) in the same folder.
2.Open a terminal/command prompt in that folder.
3.Compile all files together:
javac Question.java Quiz.java Main.java
4.Run the program:
java Main

Features:
-Stores questions, options, and answers in a Question class
-Runs the quiz with multiple questions
-Lets the user input answers via console

Keeps track of score

Displays the final score after the quiz ends

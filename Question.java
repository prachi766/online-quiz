// File: Question.java

public class Question {
    String prompt;
    String[] options;
    int correctAnswerIndex;

    /**
     * Constructor for the Question class.
     * @param prompt The question text.
     * @param options An array of strings representing the choices.
     * @param correctAnswerIndex The 0-based index of the correct answer in the options array.
     */
    public Question(String prompt, String[] options, int correctAnswerIndex) {
        this.prompt = prompt;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
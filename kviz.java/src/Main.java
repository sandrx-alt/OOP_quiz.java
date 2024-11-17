import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

public void display() {
    System.out.println(questionText);
    for (String option : options) {
        System.out.println(option);
    }
}

public boolean checkAnswer(char answer) {
    return answer == correctAnswer;
   }
}

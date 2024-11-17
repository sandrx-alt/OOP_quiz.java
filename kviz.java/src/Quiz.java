import java.util.Scanner;

class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.display();
            System.out.println("Your answer: ");
            char answer = scanner.next().charAt(0);
            if (question.checkAnswer(answer)) {
                score++;
            }
        }

        System.out.println("You scored " + score + " out of " + questions.length);
        scanner.close();
    }
}



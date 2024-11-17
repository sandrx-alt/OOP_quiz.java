public class QuizApp {
        public static void main(String[] args) {
            Question[] questions = {
                    new Question(
                            "What is capital city of France?",
                            new String[]{"a) London", "b) Paris", "c) Rome"},
                            'b'
                    ),
                    new Question(
                            "What is the color of sky?",
                            new String[]{"a) Blue", "b) Green", "c) Red"},
                            'a'
                    ),
                    new Question(
                            "What is capital city of Slovakia?",
                            new String[]{"a) Kezmarok", "b) Bratislava", "c) Presov"},
                                    'b'
                    )
            };

            Quiz quiz = new Quiz(questions);
            quiz.start();
        }
    }

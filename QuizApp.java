import java.util.*;

class Question {
    String questionText;
    List<String> options;
    int correctOption;

    Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Step 1: Add questions
        quiz.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            Arrays.asList("super", "extends", "implements", "inherits"),
            2
        ));

        quiz.add(new Question(
            "Which of these is not a Java primitive type?",
            Arrays.asList("int", "float", "boolean", "string"),
            4
        ));

        quiz.add(new Question(
            "Which method is the entry point of any Java program?",
            Arrays.asList("start()", "main()", "run()", "execute()"),
            2
        ));

        quiz.add(new Question(
            "Which of the following is used to handle exceptions in Java?",
            Arrays.asList("try-catch", "do-while", "for-each", "if-else"),
            1
        ));

        // Step 2: Initialize score
        int score = 0;

        // Step 3: Loop through questions
        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);

            for (int j = 0; j < q.options.size(); j++) {
                System.out.println((j + 1) + ". " + q.options.get(j));
            }

            System.out.print("Enter your answer (1-" + q.options.size() + "): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: " + q.options.get(q.correctOption - 1));
            }
        }

        // Step 4: Final result
        System.out.println("\n🎯 Your final score: " + score + "/" + quiz.size());
        if (score == quiz.size()) {
            System.out.println("Excellent! 💪");
        } else if (score >= quiz.size() / 2) {
            System.out.println("Good job! ");
        } else {
            System.out.println("Keep practicing! 💡");
        }

        sc.close();
    }
}
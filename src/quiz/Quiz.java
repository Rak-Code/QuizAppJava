package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score;

    public Quiz() {
       
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        while (index < questions.size()) {
            Question q = questions.get(index);
            System.out.println("\n" + (index + 1) + ". " + q.getQuestionText());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your choice (1-4"+"): ");
            int userChoice = scanner.nextInt();

            if (userChoice == q.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + options[q.getCorrectOption() - 1]);
            }

            index++;
        }

        System.out.println("\nQuiz Over! Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}


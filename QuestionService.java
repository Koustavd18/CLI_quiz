import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Wadu ___", "fak", "thak", "hek", "check",
                "hek");
        questions[1] = new Question(2, "R6 __", "Biege", "Ditch", "Snitch", "Siege",
                "Siege");
        questions[2] = new Question(3, "Hello from the", "other side", "house", "Banngkok", "heaven",
                "other side");
        questions[3] = new Question(4, "Wadu ___", "fak", "thak", "hek", "check",
                "hek");
        questions[4] = new Question(5, "Wadu ___", "fak", "thak", "hek", "check",
                "hek");

        // for (int i = 0; i < questions.length; i++) {
        // questions[i] = new Question(i + 1, "WADU", "fak", "thak", "hek", "check",
        // "hek");
        // }
    }

    public void displayQuestions() {
        int i = 0;
        int score = 0;
        for (Question q : questions) {
            System.out.println("Question:" + q.getQuestion());

            System.out.println("Option:" + q.getOpt1());
            System.out.println("Option:" + q.getOpt2());
            System.out.println("Option:" + q.getOpt3());
            System.out.println("Option:" + q.getOpt4());

            Scanner s = new Scanner(System.in);
            selection[i] = s.nextLine();

            if (selection[i].equals(q.getAnswer())) {
                System.out.println("Correct Answer");
                score++;
            } else {
                System.out.println("Wrong!" + q.getAnswer());
                System.out.println(selection[i] == q.getAnswer());
            }

            i++;

        }

        for (String s : selection) {
            System.out.println("Your answers are:" + s);
        }

        System.out.println("SCORE: " + score);
    }
}
import java.util.*;
import java. util.Scanner;
public class QuizQuestion {
    private static final Map<String, Quiz> quizzes = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Enter a command:(create,take,view,,exit)");
            String command = scanner.nextLine();
            switch (command) {
                case "create":
                    createQuiz(scanner);
                    break;
                case "take":
                    takeQuiz(scanner);
                    break;
                case "view":
                    viewQuiz(scanner);
                    break;
                case "exit":
                    break label;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

    private static void createQuiz(Scanner scanner) {
        System.out.println("Enter the name of quiz:");
        String quizName = scanner.nextLine();
        Quiz quiz = new Quiz(quizName);
        System.out.println("Enter the number of questions:");
        int numQuestions = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Enter the question:");
            String question = scanner.nextLine();
            System.out.println("Enter the number of choices:");
            int numChoices = Integer.parseInt(scanner.nextLine());
            List<String> choices = new ArrayList<>();
            for (int j = 0; j < numChoices; j++) {
                System.out.println("Enter choice" + (j + 1) + ":");
                String choice = scanner.nextLine();
                choices.add(choice);

            }
            System.out.println("Enter the index of the correct answer:");
            int correctChoice = Integer.parseInt(scanner.nextLine()) - 1;
            quiz.add(new Question(question, choices, correctChoice));
        }

        quizzes.put(quizName, quiz);
        System.out.println("quiz created.");
    }

    private static void takeQuiz(Scanner scanner) {
        System.out.println("Enter the name of quiz:");
        String quizName = scanner.nextLine();
        Quiz quiz = quizzes.get(quizName);
        if (quiz == null) {
            System.out.println("Quiz not found");
            return;
        }
        int score = 0;
        for (int i = 0; i < quiz.getNumQuestions(); i++) {
                Question question = quiz.getQuestion(i);
                System.out.println("Question" + (i + 1) + ":" + question.getQuestion());
                List<String> choices = question.getChoices();
                for (int j = 0; j < choices.size(); j++) {
                    System.out.println((j + 1) + ":" + choices.get(j));
                }
                System.out.println("Enter your answer:");
                int userAnswer = Integer.parseInt(scanner.nextLine()) - 1;
                if (userAnswer == question.getCorrectChoices()) {
                    System.out.println("Correct!");
                    score++;

                } else {
                    System.out.println("Incorrect.the correct answer is " + (question.getCorrectChoices() + 1) + ".");
                }
            }
            System.out.println("your Score is  " + score + "out of" + quiz.getNumQuestions() + ".");

    }

    private static void viewQuiz(Scanner scanner) {
        System.out.println("Enter the name of quiz:");
        String quizName = scanner.nextLine();
        Quiz quiz = quizzes.get(quizName);
        if (quiz == null) {
            System.out.println("Quiz not found.");
            return;

        }
        System.out.println("Quiz:" + quiz.getName());
        for (int i= 0; i < quiz.getNumQuestions(); i++) {
            Question question = quiz.getQuestion(i);
            System.out.println("Question" + (i + 1) + ":" + question.getQuestion());
            List<String> choices = question.getChoices();
            for (int j = 0; j < choices.size(); j++) {
                System.out.println((j + 1) + ":" + choices.get(j));
            }
            System.out.println("Answer:" + (question.getCorrectChoices() + 1));
        }

    }

    static class Quiz {
        private final String name;
        private final List<Question> questions = new ArrayList<>();

        public Quiz(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void add(Question question) {
            questions.add(question);
        }

        public Question getQuestion(int index) {
            return questions.get(index);
        }

        public int getNumQuestions() {
            return questions.size();


        }
    }

    static class Question {
        private final String question;
        private final List<String> choices;
        private final int correctChoice;

        public Question(String question, List<String> choices, int correctChoice) {
            this.question = question;
            this.choices = choices;
            this.correctChoice = correctChoice;

        }

        public String getQuestion() {
            return question;
        }

        public List<String> getChoices() {
            return choices;
        }

        public int getCorrectChoices() {
            return correctChoice;
        }


    }
}

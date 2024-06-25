package com.mycompany.labexer5b;

import java.util.Scanner;

public class LabExer5B {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] questions = {
                "What is the primary role of an initiator agent like Breach or Sova in a team composition?",
                "Which agent is known for their ability to control and manipulate enemy movement with gravity wells?",
                "When should you consider rotating to another bombsite during a round",
                "Which map features teleporters that agents can use to quickly move between different areas?",
                "What is the main purpose of a “bait” strategy in Valorant?",
                "Which agent has the ability to create a large smokescreen to obscure vision?",
                "What is the total defuse time of the spike?",
                "Which agent’s ultimate is called ‘Annihilation’?",
                "What is the gun with the fastest fire rate in Valorant?",
                "When was Valorant officially released?"};
            String[][] choices = {
                {"A. To rush towards the enemy", "B. To distract enemies and force them to reveal their positions", "C. To hide and wait for enemies to pass by"},
                {"A. Viper", "B. Omen", "C. Killjoy"},
                {"A. Only if the bomb is planted", "B. As soon as the round starts", "C. When the enemies have a strong defensive position"},
                {"A. Bind", "B. Split", "C. Haven"},
                {"A. To rush towards the enemy", "B. To distract enemies and force them to reveal their position", "C. To hide and wait for enemies to pass by"},
                {"A. Brimstone", "B. Sage", "C. Sova"},
                {"A. 5 Seconds", "B. 7 Seconds", "C. 10 seconds"},
                {"A. Phoenix", "B. Reyna", "C. KAY/O"},
                {"A. Phantom", "B. Vandal", "C. Odin"},
                {"A. June 2020", "B. July 2020", "C. August 2020"}};
            String[] correctAnswers = {"B", "A", "C", "A", "B", "A", "B", "C", "C", "A"};
            int score = 0;
            System.out.println("Welcome to the Quiz!");
            System.out.println("");
            System.out.println("Please answer the following questions: ");
            try {
                for (int i = 0; i < questions.length; i++) {
                    System.out.println("Question " + (i + 1) + ": " + questions[i]);
                    for (String choice : choices[i]) {
                        System.out.println(choice);
                    }
                    System.out.print("Enter your answer: ");
                    String answer = scanner.nextLine().toUpperCase();
                    if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C")) {
                        throw new IllegalArguementException("Invalid letter! Please choose A, B, or C.");
                    }
                    if (!answer.equals(correctAnswers[i])) {
                        System.out.println("Incorrect answer. Please try again.");
                    } else {
                        score++;
                    }
                }
                System.out.println("");
                System.out.println("Congratulations! ");
                System.out.println("Your score is: " + score + "/" + questions.length);
            } catch (IllegalArguementException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("You can answer again.");
            } catch (Exception e) {;
                System.out.println("Invalid input!");
                System.out.println("You can answer again.");
            }
        }
    }

    private static class IllegalArguementException extends Exception {

        public IllegalArguementException(String invalid_letter_Please_choose_A_B_or_C) {
        }
    }
}

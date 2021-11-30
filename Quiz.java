import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        String Q1 = "Who is the best character in Pokemon?\n" 
        + "(A) James\n(B) Jessie\n(C) Meowth\n(D) All of the Above\n";

        String Q2 = "Who is the main Pokemon of Team Rocket besides Meowth?\n"
        + "(A) Beldum\n(B) Wobbuffet\n(C) Pikachu\n(D) Starmie(shiny)\n";

        String Q3 = "James 5th Pokemon is...\n" + "(A) Weezing\n(B) Cacnea\n(C) Carnivine\n(D) Luigi\n";

        String Q4 = "Jessie's 10th Pokemon is...\n" + "(A) Seviper\n(B) Arbok\n(C) Wobbuffet\n(D) Gourgeist\n";

        String Q5 = "What is the acronym for ROCKET in Team Rocket?\n" 
        + "(A) Real Over Confident Killers Evildoers Troublemakers\n(B) Red Otter Creeper Keeper Excellent Team\n(C) Raid On City, Knock Out, Evil Tusks\n(D) Recumbents Of Chattanooga Knoxville & East Tennessee\n";

        Questions [] question = {
            new Questions(Q1, "D"),
            new Questions(Q2, "B"),
            new Questions(Q3, "B"),
            new Questions(Q4, "D"),
            new Questions(Q5, "C"),
        };
        testTime(question);
    }

    public static void testTime(Questions [] question) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < question.length; i++) {
            System.out.println(question[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(question[i].answer)) {
                score++;
            }
        }System.out.println("You have gotten " + score + "/" + question.length);
    }
}
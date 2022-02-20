import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        // Rock Paper Scissor game
        // 0 --> Rock
        // 1 --> Paper
        // 2 --> Scissor

        System.out.print("Enter --> 0 for rock || 1 for paper || 2 for scissor: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        System.out.println("Computer Entered: " + computerInput);

        if (userInput == computerInput)
            System.out.println("\nDraw!");
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) 
            System.out.println("\nYou win!");
        else
            System.out.println("\nComputer win!");

        input.close();
    }
}
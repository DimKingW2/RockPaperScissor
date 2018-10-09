import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] arg) {
        Scanner input;
        String computer = "";
        String player;
        int compPoints;
        int playPoints;
        String answer;

        input = new Scanner(System.in);


        do {
            System.out.println("This is rock paper scissors! Please pick R for rock S for scissor or P for paper. (Plays to 21 points, 3 for win, 1 for tie.)");
            compPoints = 0;
            playPoints = 0;
            do {
                String[] arr= {"r","p","s"};
                Random r = new Random();
                int randomNumber = r.nextInt(arr.length);
                computer =(arr[randomNumber]);
                System.out.println("Please pick R for rock, P for paper, or S for scissor.");
                player = input.next().toLowerCase();
                while ((!player.equals("r")) && (!player.equals("s")) && (!player.equals("p"))) {
                    System.out.println("Please only type R, S, or P.");
                    player = input.next().toLowerCase();
                }
                System.out.println("Computer played " + computer + "!");
                if (player.equals(computer)) {
                    System.out.println("It is a tie");
                    compPoints = compPoints + 1;
                    playPoints = playPoints + 1;
                } else if ((player.equals("r")) && (computer.equals("s")) || (player.equals("s")) && (computer.equals("p")) || (player.equals("p")) && (computer.equals("r"))) {
                    System.out.println("You win!");
                    playPoints = playPoints + 3;
                } else {
                    System.out.println("You loose!");
                    compPoints = compPoints + 3;
                }
                System.out.println("The score is " + playPoints + " to " + compPoints);

            } while ((compPoints < 21) && (playPoints < 21));
            if (compPoints >= 21){
                System.out.println("Computer wins!");
            }
            if (playPoints >= 21){
                System.out.println("You win!");
            }
            System.out.println("Would you like to play again?(only type yes or no)");
            answer = input.next();

        }while(answer.equals("yes"));






    }
}

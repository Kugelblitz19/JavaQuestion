package loop;

import java.util.Scanner;

public class GuessingGames {
    public static void guessingNoGame(){
        Scanner sc =new Scanner(System.in);
        int number=1 + (int)(100*Math.random());
        int k=6;
        int guess, i;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 5 trials.");
        for( i=0;i<k;i++){
            System.out.println(
                    "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != k - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != k - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == k) {
            System.out.println(
                    "You have exhausted"
                            + " K trials.");

            System.out.println(
                    "The number was " + number);
        }
    }

    // Driver Code
    public static void
    main(String arg[])
    {

        // Function Call
        guessingNoGame();
    }
        }



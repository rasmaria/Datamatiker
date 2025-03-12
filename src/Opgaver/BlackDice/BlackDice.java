package Opgaver.BlackDice;

import java.util.Scanner;
import java.util.Random;

public class BlackDice {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            boolean playAgain = true;

            //WELCOME AND QUESTION ABOUT RULES
            System.out.println("Hello and welcome to a game of Black Jack with dices!\n" +
                    "\nIf you want to read the rules before starting the game please type 'y'. If not just press ENTER.");
            String rules = scanner.nextLine();

            //GAME RULES IF THEY WISH
            if (rules.equals("y")) {
                System.out.println("\nThe object of the game is to get closer to 21 than the computer without going over 21" +
                        "\nYou can throw the two dices as many times as you wish, however if your total sum from your dice throws exceeds 21\n" +
                        "it is called a “bust” and the computer wins.\n" +
                        "If you get 21 precisely it's called a BLACK JACK and you win the game!! \n");

            } else {
            }


            //GAME LOOP TO PLAY AGAIN
            while (playAgain) {
                int randomDice = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                int randomDiceMachine = random.nextInt(6) + 1 + random.nextInt(6) + 1;


                //NAME INPUT
                System.out.println("Please enter your name and press ENTER to throw the first pair of dices:");
                String name = scanner.nextLine();

                //FIRST DICE THROW
                System.out.println("\nGreat job " + name + "! You start out with throwing " + randomDice + ".");
                String throwAgainQuestion = "";

                //WHILE LOOP MED DICE THROWS
                while (randomDice < 21) {
                    System.out.println("Do you wish to throw again? \n" +
                            "If yes, type 'y' and press ENTER. If no, type 'n'. and press ENTER");
                    throwAgainQuestion = scanner.nextLine();

                    if (throwAgainQuestion.equalsIgnoreCase("y")) {
                        randomDice += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                        System.out.println("You rolled again and your new sum is: " + randomDice + "!");
                    } else if (throwAgainQuestion.equalsIgnoreCase("N")) {
                        System.out.println("You've decided to stop! Your final total is: " + randomDice + "\n\nNow let's see what the machine gets...");
                        playAgain = false;
                    } else {
                        System.out.println("Oh no! Wrong input - try again 😜");
                    }
                }

                //IF PLAYER DECIDES TO STOP = MACHINE THROWS DICE

                if (!playAgain) {
                    while (randomDiceMachine < 16) {
                        randomDiceMachine += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                    }
                    System.out.println("\nThe machine has rolled it's final roll and the result is = " + randomDiceMachine);
                    System.out.println();
                }

                //RESULTS / OUTPUT

                if (randomDice == 21) {
                    System.out.println("BLACK JACK!\nCongratulations! You won over the machine!🤩");
                } else if (randomDiceMachine == 21) {
                    System.out.println("MACHINE GOT BLACK JACK! \nOh no! The machine wins!😪");
                } else if (21 < randomDiceMachine) {
                    System.out.println("Machine got more than 21! YOU WIN 😎");
                } else if (randomDice > 21) {
                    System.out.println("Oh no! You got " + randomDice + " and therefore exceed 21! The machine wins 🤯");
                } else if (randomDice < 21 && randomDiceMachine < 21 && randomDiceMachine > randomDice) {
                    System.out.println("Oh no! The machine wins because the machine is closer to 21 😪");
                } else if (randomDiceMachine < randomDice && randomDice < 21 && randomDiceMachine < 21) {
                    System.out.println("YAY! You win because you are closer than the machine to 21 🤩🤩🤩");
                } else {
                    System.out.println("It's a draw! Play again to find a winner 😎");
                }

                //PLAY AGAIN MENU

                System.out.println("\nDo you wish to play again?");
                System.out.println("If yes, type 'y' and press ENTER. Else, press ENTER");
                String newGame = scanner.nextLine();

                if (newGame.equalsIgnoreCase("y")) {
                    playAgain = true;
                } else {
                    System.out.println("Goodbye 🫡");
                    playAgain = false;
                }
            }
        }
    }

